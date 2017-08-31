package com.hsd.action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 下载excel 模板
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/downlode")
public class DownlodeController {
	
	
	/**
	 * 文件下载（下载excel模板）
	 * 
	 * @param fileName
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/downloadExportModel", method = { RequestMethod.GET, RequestMethod.POST })
	public String downloadExportModel(@RequestParam("fileName") String fileName, HttpServletRequest request,
			HttpServletResponse response) {
		if (fileName != null) {
			String realPath = request.getSession().getServletContext().getRealPath("WEB-INF/ExceltemplateFile/");
			File file = new File(realPath, fileName);
			if (file.exists()) {
				response.setContentType("application/force-download");// 设置强制下载不打开

				if ("projectIncomeImportModel.xlsx".equals(fileName)) {
					fileName = "项目收入导入模板.xlsx";
				}
				 

				response.addHeader("Content-Disposition", "attachment;fileName=" + processFileName(request, fileName));// 设置文件名
				byte[] buffer = new byte[1024];
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				try {
					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					OutputStream os = response.getOutputStream();
					int i = bis.read(buffer);
					while (i != -1) {
						os.write(buffer, 0, i);
						i = bis.read(buffer);
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (bis != null) {
						try {
							bis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (fis != null) {
						try {
							fis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @Title: processFileName
	 * 
	 * @Description: ie,chrom,firfox下处理文件名显示乱码
	 */
	public static String processFileName(HttpServletRequest request, String fileNames) {
		String codedfilename = null;
		try {
			String agent = request.getHeader("USER-AGENT");
			if (null != agent && -1 != agent.indexOf("MSIE") || null != agent && -1 != agent.indexOf("Trident")) {// ie

				String name = java.net.URLEncoder.encode(fileNames, "UTF8");

				codedfilename = name;
			} else if (null != agent && -1 != agent.indexOf("Mozilla")) {// 火狐,chrome等

				codedfilename = new String(fileNames.getBytes("UTF-8"), "iso-8859-1");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return codedfilename;
	}

}
