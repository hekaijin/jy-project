<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("path", path);
	request.setAttribute("basePath", basePath);
	response.setHeader("Access-Control-Allow-Origin", "*");
	
%>
<html>
<head>
<title>后台中心登陆</title>
<link href="${basePath}css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<link href="${basePath}css/style.css" rel='stylesheet' type='text/css' />
<link href="${basePath}css/font-awesome.css" rel="stylesheet"> 
<script src="${basePath}js/jquery.min.js"></script>
<script src="${basePath}js/bootstrap.min.js"></script>
</head>
<script type="text/javascript">
function sub() {
	var username=$('#uname').val();
	var password=$('#pwd').val();
	
	$.ajax({
// 		url : "http://192.168.1.119:8080/world-web/v2/finance/login.html",
		url : "http://120.76.239.30:8080/v2/finance/login.html",
		type : 'POST',
		data : {
			"username" : username,
			"password" : password
		},// 你的formid
		dataType:"JSON",
		success : function(data) {
			if(data.code==0){//登陆成功
				$("#form1").submit();
			}else{
				$("#sp").html("<font color='red'>用户名或密码不正确</font>")
			}
		},
		error:function(){
			$("#form1").submit();
// 			$("#sp").html("未知错误")
		}
		
	});
	

	
}
//监听回车事件
$(document).keyup(function(event){
	  if(event.keyCode ==13){
	    sub();
	  }
	});
</script>
<body id="login">
	<div class="login-logo">
		<font color="gray"> 后台中心</font>
	</div>
	<h2 class="form-heading">请登录</h2>
	<div class="app-cam">
		<form id="form1" method="POST" action="${basePath}financeBack/gotoIndex.html">
			<span id="sp"></span>
			<input id="uname" name="username" type="text" class="text" value="" placeholder="请输入账号">
			<input id="pwd" name="password" type="password" value="" placeholder="请输入密码">
			<div class="submit">
			<input type="button" class="btn btn-large btn-primary btn-lg btn-block" onclick="sub()" value="登录">
			</div>
			
		</form>
	</div>
</body>
</html>