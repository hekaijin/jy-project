package com.hsd.action;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Position;

import com.hsd.entity.fundstatement.RedLine;
import com.hsd.util.ExportExcelUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import org.apache.log4j.Logger;

import com.hsd.admin.statements.dto.PageBean;
import com.hsd.entity.fundstatement.ProjectIncome;
import com.hsd.service.redline.ProjectIncomeService;
import com.hsd.util.ImportExcelUtil;
import com.hsd.vo.ProjectIncomeVo;

import net.sf.json.JSONArray;

/**
 * 项目收入
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/projectIncome")
public class ProjectIncomeController {

	Logger logger = Logger.getLogger(ProjectIncomeController.class);

	@RequestMapping(value = "/toProjectIncomePage", method = RequestMethod.GET)
	public String toProjectIncomePage() {
		return "/projectincomeimport/projectIncomepage";
	}
	
	
	@RequestMapping(value = "/toProjectIncomeImportPage", method = RequestMethod.GET)
	public String toProjectIncomeImportPage() {
		return "/projectincomeimport/projectIncomeImportPage";
	}

	@Autowired
	ProjectIncomeService projectIncomeService;

	/**
	 * 项目收入导入前Excel回显导html
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/projectIncomeUploadExcel", method = { RequestMethod.GET, RequestMethod.POST })
	public List<LinkedHashMap<String, Object>> projectIncomeUploadExcel(HttpServletRequest request,
			HttpServletResponse response,String fieldName) throws Exception {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		InputStream in = null;
		List<List<Object>> listob = null;
		MultipartFile file = multipartRequest.getFile("upfile");
		if (file.isEmpty()) {
			throw new Exception("文件不存在!");
		}
		in = file.getInputStream();
		listob = new ImportExcelUtil().getBankListByExcel2(in, file.getOriginalFilename());
		if (null == listob) {
			return null;
		}
		List<LinkedHashMap<String, Object>> list = new ArrayList<LinkedHashMap<String, Object>>();
		LinkedHashMap<String, Object> map = null;
		for (int i = 0; i < listob.size(); i++) {
			map = new LinkedHashMap<String, Object>();
			List<Object> lo = listob.get(i);
//			map.put("projectName", lo.get(0) + "");
			map.put("projectName", fieldName);
			map.put("money", lo.get(0) + "");
			map.put("genre", lo.get(1) + "");
			map.put("date", lo.get(2) + "");
			list.add(map);
		}

		return list;
	}

	/**
	 * 验证项目收入的数据（将前端页面的table数据封装好了的json数组转换json）
	 */
	@ResponseBody
	@RequestMapping(value = "/verifyDatas", method = RequestMethod.POST)
	public List<LinkedHashMap<String, Object>> verifyDatas(String ds, HttpServletRequest request) {

		// 解析传来的json数组封装到list
		List<LinkedHashMap<String, Object>> list = new ArrayList<LinkedHashMap<String, Object>>();
		LinkedHashMap<String, Object> map = null;
		JSONArray arr = JSONArray.fromObject(ds);
		for (int i = 0; i < arr.size(); i++) {
			map = new LinkedHashMap<String, Object>();
			net.sf.json.JSONObject temp = (net.sf.json.JSONObject) arr.get(i);
			map.put("projectName", temp.getString("项目名称"));
			map.put("money", temp.getString("金额"));
			map.put("genre", temp.getString("费用类型"));
			map.put("date", temp.getString("时间"));
			list.add(map);
		}

		list = removeDuplicateWithOrder(list);

		Iterator<LinkedHashMap<String, Object>> it = list.iterator();
		while (it.hasNext()) {
			LinkedHashMap<String, Object> lmp = it.next();
			int tempnum = 0;
			String projectName = lmp.get("projectName").toString();
			String money = lmp.get("money").toString();
			String genre = lmp.get("genre").toString();
			String date = lmp.get("date").toString();
			
			String fieldID=projectIncomeService.getFieldidByProjectName(projectName);
			if(null ==fieldID||fieldID.equals("")){
				it.remove();
			}
			tempnum = projectIncomeService.isExistByProjectIncome(fieldID, money, genre, date);
			if (tempnum > 0 || "".equals(projectName) || "".equals(money)) {
				it.remove();
			}
		}

		LinkedHashMap<String, Object> resultMap = new LinkedHashMap<String, Object>();
		resultMap.put("total", arr.size() <= 0 ? 0 : arr.size());
		resultMap.put("valid", list.size() <= 0 ? 0 : list.size());
		resultMap.put("error", arr.size() <= 0 ? 0 : arr.size() - list.size());
		list.add(resultMap);

		return list;
	}

	/**
	 * 获取项目收入的数据验证后的table数据导入到数据库
	 */
	@ResponseBody
	@RequestMapping(value = "/tableImportDatas", method = RequestMethod.POST)
	public String tableImportDatas(String ds,String fieldId, HttpServletRequest request) {

		String result = "success";

		if (null == ds || "[]".equals(ds)) {
			return "notdata";
		}

		// 解析传来的json数组封装到list
		List<LinkedHashMap<String, Object>> list = new ArrayList<LinkedHashMap<String, Object>>();
		LinkedHashMap<String, Object> map = null;
		JSONArray arr = JSONArray.fromObject(ds);
		for (int i = 0; i < arr.size(); i++) {
			map = new LinkedHashMap<String, Object>();
			net.sf.json.JSONObject temp = (net.sf.json.JSONObject) arr.get(i);
//			map.put("projectName", temp.getString("项目名称"));
			map.put("money", temp.getString("金额"));
			map.put("genre", temp.getString("费用类型"));
			map.put("date", temp.getString("时间"));
			list.add(map);
		}
		// list=removeDuplicateWithOrder(list);

		list = removeDuplicateWithOrder(list);
		ProjectIncome pivo = null;
		for (int i = 0; i < list.size(); i++) {

			// 新增楼宇
			pivo = new ProjectIncome();
			pivo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			
			
			//TODO  查詢fileID
//			String projectname=list.get(i).get("projectName").toString();
//			String fieldid=projectIncomeService.getFieldidByProjectName(projectname);
			pivo.setFieldid(fieldId);
			pivo.setMoney(Long.valueOf(list.get(i).get("money").toString()));
			pivo.setGenre(list.get(i).get("genre").toString());
			pivo.setDate(list.get(i).get("date").toString());
			pivo.setFlag(0);

			int j = projectIncomeService.insertprojectIncome(pivo);
			if (j == 1) {
				logger.info("导入了楼宇=============id：" + pivo.getId());
			} else {
				result = "error";
			}

		}

		return result;

	}

	// 删除ArrayList中重复元素，保持顺序
	public List removeDuplicateWithOrder(List list) {
		Set set = new HashSet();
		List newList = new ArrayList();
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Object element = iter.next();
			if (set.add(element))
				newList.add(element);
		}
		list.clear();
		list.addAll(newList);
		return list;
	}


	
	
	@RequestMapping(value="/getProjectIncomeList",method=RequestMethod.POST)
	@ResponseBody
	public PageBean<ProjectIncomeVo> getProjectIncomeList(String id,String fieldName,String date,Integer page){
		
		return projectIncomeService.getProjectIncomeLists(id,fieldName,date,page);
		 
	}


	/**
	 * 新增项目收入
	 *
	 */
	@RequestMapping(value = "/insertProjectIncome", method = { RequestMethod.POST })
	@ResponseBody
	public void insertProjectIncome(ProjectIncome pi, HttpServletRequest request, HttpServletResponse response) {
		String result = "{\"result\":\"新增项目收入成功\"}";
		try {
			pi.setId(UUID.randomUUID().toString().replaceAll("-",""));
			pi.setFlag(0);
			int i = projectIncomeService.saveProjectIncome(pi);
			PrintWriter out = null;
			response.setContentType("application/json");
			out = response.getWriter();
			if (i == 1) {
				out.write(result);
			}else{
				out.write("{\"result\":\"未能新增项目收入\"}");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * 编辑项目收入
	 * @param
	 * @param response
	 */
	@RequestMapping(value = "/editProjectIncome", method = { RequestMethod.POST })
	@ResponseBody
	public void editProjectIncome(ProjectIncome pi,HttpServletResponse response){
		String result = "{\"result\":\"修改项目收入成功\"}";
		try {
			int i=projectIncomeService.editProjectIncomeById(pi);
			PrintWriter out = null;
			response.setContentType("application/json");
			out = response.getWriter();
			if(i==1){
				out.write(result);
			}else {
				out.write("{\"result\":\"未能修改项目收入\"}");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}


	/**
	 * 批量红线
	 *
	 * @param ids
	 * @param response
	 */
	@RequestMapping(value = "/delProjectIncome", method = {RequestMethod.POST })
	public void delProjectIncome(@RequestParam(value = "ids[]") String[] ids, HttpServletResponse response) {
		String result = "{\"result\":\"删除红线成功\"}";
		for (int i = 0; i < ids.length; i++) {
			projectIncomeService.deleteProjectIncome(ids[i]);
		}

		PrintWriter out = null;
		response.setContentType("application/json");
		try {
			out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * 导出
	 *
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/ExportProjectIncomeDatas", method = { RequestMethod.GET, RequestMethod.POST })
	public String ExportProjectIncomeDatas(@Param("fieldName") String fieldName,
									 HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("UTF-8");
		List<ProjectIncomeVo> piList = null;

		if (fieldName != null) {
			fieldName = new String(fieldName.getBytes("ISO-8859-1"), "UTF-8");
		}


		piList = projectIncomeService.getProjectIncomeLists2(fieldName);
		if (piList == null) {
			return null;
		}

		OutputStream os = null;
		Workbook wb = null; // 工作薄

		try {

			// 导出Excel文件数据
			ExportExcelUtil util = new ExportExcelUtil();
			File file = util.getExcelDemoFile("/ExceltemplateFile/feeExportData.xlsx");
			String sheetName = "sheet1";
			wb = util.writeProjectIncomeExcel(file, sheetName, piList);

			String fileName = "项目收入导出数据.xlsx";
			response.setContentType("application/vnd.ms-excel");
			response.setHeader("Content-disposition", "attachment;filename=" + processFileName(request, fileName));
			os = response.getOutputStream();
			wb.write(os);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			os.flush();
			os.close();
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
