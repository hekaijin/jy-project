<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>

</head>
<body>
	<form name="form" action="<%=basePath%>login/loginCellOwner.html"
		method="post">
		<table width="300">
			<tr>
				<td colspan="2">登录窗口</td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" size="10"></td>
				<td><input type="text" name="password" size="10"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit" value="登录">
					<a href="register.do?method=init">注册新用户</td>
			</tr>
		</table>
	</form>
</body>
</html>