package com.hsd.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsd.admin.statements.dto.PageBean;
import com.hsd.entity.fundstatement.Field;
import com.hsd.entity.fundstatement.RedLine;
import com.hsd.service.field.FieldService;
import com.hsd.service.redline.RedLineService;
import com.hsd.vo.RedLineVo;

/**
 * 红线设置controller
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/redLine")
public class RedLineController {

	Logger logger = Logger.getLogger(RedLineController.class);

	@Autowired
	FieldService fieldService;
	@Autowired
	RedLineService redLineService;

	/**
	 * skip 成本红线页面
	 */
	@RequestMapping(value = "/toCostingRedLinePage", method = { RequestMethod.GET, RequestMethod.POST })
	public String toCostingRedLinePage(String userId,HttpServletRequest request) {

		userId="1754";
		request.getSession().setAttribute("userId", userId);
		
		String permission=redLineService.getPermission(userId);
		
		request.getSession().setAttribute("permission", permission);
		

		StringBuffer url=request.getRequestURL();
		String ip=request.getRemoteAddr();
		//String ip2=getServerIp();
		System.out.println("本地请求ip="+ip); try {
			InetAddress idda=InetAddress.getLocalHost();
			System.err.println("服务器="+idda);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		//System.out.println("服务器ip="+ip2);
		return "/redline/redLineList";
	}
	
	
 

	/**
	 * 获取项目
	 */
	@RequestMapping(value = "/getFieldIdAndName", method = RequestMethod.POST)
	@ResponseBody
	public List<Field> getFieldIdAndName() {

		return fieldService.getFieldIdAndNames();

	}

	/**
	 * 获取红线list
	 */
	@RequestMapping(value = "/getRedLineList", method = RequestMethod.POST)
	@ResponseBody
	public PageBean<RedLineVo> getRedLineList(HttpServletRequest request,String id, String fieldName, Integer page) {

		String permission=(String) request.getSession().getAttribute("permission");
		String userId=(String) request.getSession().getAttribute("userId");
//		userId="1754";
//		permission="yes";
		String filenames=redLineService.getFieldNameByUserId(userId);
		
		if(null!=permission&&"yes".equals(permission)){
			return redLineService.getRedLineByPage(id, fieldName, page);
			
		}else if(null!=permission&&"no".equals(permission)){
			
			return redLineService.getRedLineByPage(id, filenames, page);
		}
		
		return null;
		

	}

	/**
	 * 获取红线修改记录list
	 */
	@RequestMapping(value = "/getRedLineRecordList", method = RequestMethod.POST)
	@ResponseBody
	public List<RedLineVo> getRedLineRecordList(String redid) {

		return redLineService.getRedLineRecordByRedLineId(redid);
	}

	/**
	 * 新增红线
	 * 
	 */
	@RequestMapping(value = "/insertRedLine", method = { RequestMethod.POST })
	@ResponseBody
	public void insertRedLine(RedLine redLine, HttpServletRequest request, HttpServletResponse response) {
		String result = "{\"result\":\"新增红线成功\"}";
		try {
			String userId=(String) request.getSession().getAttribute("userId");
			redLine.setUserId(userId);
			int i = redLineService.saveRedLine(redLine);
			PrintWriter out = null;
			response.setContentType("application/json");
			out = response.getWriter();
			if (i == 1) {
				out.write(result);
			}else{
				out.write("{\"result\":\"未能新增红线\"}");
			}
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * 编辑红线
	 * @param response
	 */
	@RequestMapping(value = "/editRedLine", method = { RequestMethod.POST })
	@ResponseBody
	public void editRedLine(RedLine redLine,HttpServletResponse response,HttpServletRequest request){
		String result = "{\"result\":\"修改红线成功\"}";
		try {
			String userId=(String) request.getSession().getAttribute("userId");
			redLine.setUserId(userId);
			int i=redLineService.editRedLineById(redLine);
			PrintWriter out = null;
			response.setContentType("application/json");
			out = response.getWriter();
			if(i==1){
				out.write(result);
			}else {
				out.write("{\"result\":\"未能修改红线\"}");
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
	@RequestMapping(value = "/delRedLine", method = {RequestMethod.POST })
	public void delRedLine(@RequestParam(value = "ids[]") String[] ids, HttpServletResponse response) {
		String result = "{\"result\":\"删除红线成功\"}";
		for (int i = 0; i < ids.length; i++) {
			redLineService.deleteRedLine(ids[i]);
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

}
