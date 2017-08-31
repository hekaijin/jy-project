<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("path", path);
	request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="email=no">
<link href="${path }/css/layout.css" rel="stylesheet" type="text/css">
<link href="${path }/css/common01.css" rel="stylesheet" type="text/css">
<link href="${path }/css/download.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${path }/js/jquery.min.js"></script>
<script type="text/javascript" src="${path }/js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="${path }/js/jquery-2.1.1.min.js"></script>
</head>
<body>
	<div class="by_background">
		<img src="${path }/image/download2.png" alt="">
	</div>
	<div class="pop_by">
		<img src="${path }/image/arrow3.png" alt="">
		<p>点击右上角</p>
		<p style="top: 80px; font-size: 20px;">“在浏览器打开下载或复制链接到浏览器中下载”</p>
	</div>
	<script type="text/javascript">
		$(function() {
			$('.by_background img').click(function(event) {
				var ua = navigator.userAgent.toLowerCase();
				var u = navigator.userAgent, app = navigator.appVersion;
				var isWeixin = ua.indexOf('micromessenger') != -1;
				var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
				if (isWeixin) {
					$('.pop_by').show();
					//document.body.innerHTML = '<div class="page_msg"><div class="inner"><span class="msg_icon_wrp"><i class="icon80_smile"></i></span><div class="msg_content" style="font-size: 500%">请在浏览器打开链接</div></div></div>';
				} else {
					if(!isiOS){
						window.location.href = "http://app.gdjywy.com:8888/group1/M00/00/00/wKgBuletbX-ALDpMAAFnoxBJNKw596.apk";
					}
				}
			});
			$('.pop_by').click(function(event) {
				$(this).hide();
			});
		})
		function qcalert() {
			var ua = navigator.userAgent.toLowerCase();
			var isWeixin = ua.indexOf('micromessenger') != -1;
			var u = navigator.userAgent, app = navigator.appVersion;
			var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Linux') > -1; //android终端或者uc浏览器
			var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
			if (isWeixin) {
				// 		document.head.innerHTML = '<title>抱歉，出错了</title><meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=0"><link rel="stylesheet" type="text/css" href="https://res.wx.qq.com/connect/zh_CN/htmledition/style/wap_err1a9853.css">';
				document.body.innerHTML = '<div class="page_msg"><div class="inner"><span class="msg_icon_wrp"><i class="icon80_smile"></i></span><div class="msg_content" style="font-size: 500%">请在浏览器打开链接</div></div></div>';
			} else {
				window.location.href = "http://app.gdjywy.com:8888/group1/M00/00/00/wKgBuletbX-ALDpMAAFnoxBJNKw596.apk";
			}
		}
	</script>
</body>
</html>