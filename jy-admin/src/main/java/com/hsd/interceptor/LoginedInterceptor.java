package com.hsd.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginedInterceptor implements HandlerInterceptor{


	/**
	 * 拦截前处理
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
			 //获取请求的URL  
	        String url = request.getRequestURI();  
	        //URL:user_login.jsp是公开的;这个是除了user_login.jsp是可以公开访问的，其它的URL都进行拦截控制  
	        if(url.indexOf("login.html")>=0||url.indexOf("gotoIndex.html")>=0 ||url.indexOf("insertComplainOrSuggest.html")>=0||url.indexOf("recordLoginInfo.html")>=0 ){  
	            return true;  
	        }
	        
			Object currentSession=request.getSession().getAttribute("adminSession");
			if(currentSession!=null){
					return true;
			}
		
		//不符合条件的，跳转到登录界面  
	     request.getRequestDispatcher("/index.jsp").forward(request, response); 
		return false;
	}

	/**
	 * 拦截后处理
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 全部完成后处理
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
