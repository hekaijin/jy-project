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
<title>注册</title>

</head>
<body>
	<form action="<%=basePath%>login/registerAdmin.html" method="post">
		<table border="0" cellspacing="0">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" /></td>
			</tr>

			<tr>
				<td>密码：</td>
				<td><input type="text" name="password" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" name="Submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>