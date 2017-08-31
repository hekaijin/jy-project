<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>《我的家园》平台挑战赛</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
     <link href="../css/inger.css" rel="stylesheet">
  </head>
  <body>
  <div class="container">
   <h3 class="text-center">《我的家园》平台挑战赛</h3>
   <h5 class="text-center"> 比赛时间 2017.3.23-6.22晚上24点</h5>
	 <h6 class="text-center"> </h6>
  </div>
  <div class="container table-responsive">
 <table class="table table-striped">
	<thead>
		<tr>
			<th>名称</th>
			<c:forEach items="${matchList}" var="match" varStatus="status">
			<th> ${match.name }</th>
			</c:forEach>
		</tr>
	</thead>
	<tbody>
	
		<tr>
		<td>今日积分</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td><c:if test="${match.jf>0 }"> ${match.jf }</c:if>
      <c:if test="${match.jf==0 }"><img alt="" src="../image/9.gif"></c:if>
      <c:if test="${match.jf>0&&match.jf<=50 }"><img alt="" src="../image/2.gif"></c:if>
      <c:if test="${match.jf>50&&match.jf<=150 }"><img alt="" src="../image/15.gif"></c:if>
       <c:if test="${match.jf>150&&match.jf<=250 }"><img alt="" src="../image/14.gif"></c:if>
       <c:if test="${match.jf>250}"><img alt="" src="../image/13.gif"></c:if></td>
				</c:forEach>
		</tr>
		<tr>
		<td>累积积分</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.ljf }分</td>
			</c:forEach>
		</tr>
		<tr>
		<td>今日缴费</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.jfcount } 人</td>
			</c:forEach>
		</tr>
		
		<tr>
		<td>累积缴费</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td>  ${match.ljjfcount } 人</td>
			</c:forEach>
		</tr>
		
		<tr>
		<td>今日注册</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.zccount }人 </td>
			</c:forEach>
		</tr>
		
		<tr>
		<td>累积注册</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.ljzccount } 人</td>
			</c:forEach>
		</tr>
		<tr>
		<td>今日充值</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.czcount } 人</td>
			</c:forEach>
		</tr>
		<tr>
		<td>累积充值</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.ljczcount }人</td>
			</c:forEach>
		</tr>
		<tr>
		<td>今日水费</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.sfcount } 人</td>
			</c:forEach>
		</tr>
		<tr>
		<td>累积水费</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.ljsfcount }人</td>
		</c:forEach>	
		</tr>
		<tr>
		<td>缴押金</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td> ${match.yjcount } 人</td>
			</c:forEach>
		</tr>
		<tr>
		<td>累积押金</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td>  ${match.ljyjcount } 人</td>
			</c:forEach>
		</tr>
		<tr>
		<td>总人数</td>
		<c:forEach items="${matchList}" var="match" varStatus="status">
			<td>  ${match.total } 人</td>
		</c:forEach>	
		</tr>

	</tbody>
</table>
 
 
 
 
  </div>
   </div>
     <script src="../js/jquery.min.js"></script>
   <script src="../js/bootstrap.min.js"></script> 
    
    <script type="text/javascript">
 $(function(){
   function show(){
   var mydate = new Date();
   var str = "" + mydate.getFullYear() + "年";
   str += (mydate.getMonth()+1) + "月";
   str += mydate.getDate() + "日";
   return str;
  }
   $("h6").html('统计时间：' + show()); 
  
 });
</script>
  </body>
</html>