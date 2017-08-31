<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("path", path);
	request.setAttribute("basePath", basePath);
%>    
 <!-- Bootstrap Core CSS -->
<link href="${basePath}css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="${basePath}css/style.css" rel='stylesheet' type='text/css' />
<link href="${basePath}css/font-awesome.css" rel="stylesheet"> 
<link href="${basePath}css/hsdkj-checkbox.css" rel="stylesheet"> 
<!-- 引入jQuery UI的css文件 -->
<link href="${basePath}css/jquery-ui.css" />
<!-- <link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'/> -->
<!-- Nav CSS -->
<link href="${basePath}css/custom.css" rel="stylesheet">
<!-- Bootstrap Core JavaScript -->
<link href="${basePath}css/bootstrapValidator.css" rel="stylesheet" />
<link rel="stylesheet" href="${basePath}css/jquery-ui.min.css">
<script src="${basePath}js/jquery-2.1.4.js"></script>
<script src="${basePath}js/bootstrapValidator.min.js"></script>
<script src="${basePath}js/jquery-ui.min.js"></script>
<link rel="stylesheet" href="${basePath}css/style.css">
<!-- Graph CSS -->
<link href="${basePath}css/lines.css" rel='stylesheet' type='text/css' /> 
<link href="${basePath}css/loading.css" rel='stylesheet' type='text/css' /> 

<!-- 计算器css -->
<link rel="stylesheet" type="text/css" href="${basePath}css/calculator.css" />

<!-- Graph JavaScript -->
<script src="${basePath}js/d3.v3.js"></script>
<script src="${basePath}js/rickshaw.js"></script>
<script src="${basePath}js/metisMenu.min.js"></script>
<script src="${basePath}js/custom.js"></script>
<script src="${basePath}js/jquery.form.js"></script>


<script src="${basePath}js/hsdkj-checkbox.js"></script>



<!-- checkbox和radio的样式和js -->
<%-- <link href="${basePath}css/checkboxAndradio.css" rel='stylesheet' type='text/css' />   --%>
<%-- <script src="${basePath}js/checkboxAndradio.js"></script> --%>

<!-- begin日期插件 -->
<link href="${basePath}css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" media="all" href="${basePath}css/daterangepicker-bs3.css" />
<script type="text/javascript" src="${basePath}js/moment.js"></script>
<script type="text/javascript" src="${basePath}js/daterangepicker.js"></script>
<!-- end日期插件 -->

<!-- 图片异步上传js -->
<script type="text/javascript" src="${basePath}js/ajaxfileupload.js"></script>

<script src="${basePath}js/bootstrap.min.js"></script>
<script src="${basePath}js/bootstrap-paginator.min.js"></script> 
<script type="text/javascript" src="${basePath}js/jQuery.print.js"></script> 
<script type="text/javascript" src="${basePath}js/jquery.table2excel.min.js"></script> 

<!-- 将table全部数据转json数据 -->
<script type="text/javascript" src="${basePath}js/jquery.tabletojson.js"></script> 

<!-- 获取光标，在textarea文本域的光标处输入文字 -->
<script type="text/javascript" src="${basePath}js/textarea-curfos.js"></script>


<script  src="${basePath}/js/layer/layer.js"></script>
  
