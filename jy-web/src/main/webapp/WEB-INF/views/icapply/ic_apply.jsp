<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script type="text/javascript" src="../../js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="../../js/jquery-2.1.1.min.js"></script>
<html>
<title>IC卡申请流程</title>
<script type="text/javascript">

<%
	////////////////////////////////////请求参数//////////////////////////////////////
	
	//商户订单号，商户网站订单系统中唯一订单号，必填
	String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
	
	//订单名称，必填
	String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
	
	//付款金额，必填
	String total_fee = new String(request.getParameter("WIDtotal_fee").getBytes("ISO-8859-1"),"UTF-8");
	
	//商品描述，可空
	String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	
	//把请求参数打包成数组
	Map<String, String> sParaTemp = new HashMap<String, String>();
	sParaTemp.put("service", AlipayConfig.service);
	sParaTemp.put("partner", AlipayConfig.partner);
	sParaTemp.put("seller_id", AlipayConfig.seller_id);
	sParaTemp.put("_input_charset", AlipayConfig.input_charset);
	sParaTemp.put("payment_type", AlipayConfig.payment_type);
	sParaTemp.put("notify_url", AlipayConfig.notify_url);
	sParaTemp.put("return_url", AlipayConfig.return_url);
	sParaTemp.put("anti_phishing_key", AlipayConfig.anti_phishing_key);
	sParaTemp.put("exter_invoke_ip", AlipayConfig.exter_invoke_ip);
	sParaTemp.put("out_trade_no", out_trade_no);
	sParaTemp.put("subject", subject);
	sParaTemp.put("total_fee", total_fee);
	sParaTemp.put("body", body);
	//其他业务参数根据在线开发文档，添加参数.文档地址:https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.O9yorI&treeId=62&articleId=103740&docType=1
	//如sParaTemp.put("参数名","参数值");
	
	//建立请求
	String sHtmlText = AlipaySubmit.buildRequest(sParaTemp,"get","确认");
	out.println(sHtmlText);
%>

$.fn.serializeObject = function()    
{    
   var o = {};    
   var a = this.serializeArray();    
   $.each(a, function() {    
       if (o[this.name]) {    
           if (!o[this.name].push) {    
               o[this.name] = [o[this.name]];    
           }    
           o[this.name].push(this.value || '');    
       } else {    
           o[this.name] = this.value || '';    
       }    
   });    
   return o;    
};  
  
function onClik(){
	// String id, String sysadminid, String userrealname, Integer age, String phone,
	// String cardnumber, String cellid, String buildingid, String roomid, Integer applicanttype,
	// Integer applynumber, String vehicleids
	if($("#userrealname").val()==null || $("#userrealname").val()==""){
		alert("姓名不能为空，请填写姓名");
		return ;
	}
	if($("#age").val()==null || $("#age").val()=="" || $("#age").val()=="undefined"){
		alert("年龄不能为空，请填写年龄");
		return ;
	}
	if($("#phone").val()==null || $("#phone").val()==""){
		alert("手机号不能为空，请填写手机号");
		return ;
	}
	if($("#cardnumber").val()==null || $("#cardnumber").val()==""){
		alert("身份证号不能为空，请填写身份证号");
		return ;
	}
	if($("#cellid").val()==null || $("#cellid").val()==""){
		alert("小区不能为空，请选择小区");
		return ;
	}
	if($("#buildingid").val()==null || $("#buildingid").val().indexOf("请选择楼栋")!=-1){
		alert("楼栋不能为空，请选择楼栋");
		return ;
	}
	if($("#roomid").val()==null || $("#roomid").val().indexOf("请选择住宅")!=-1){
		alert("房间不能为空，请选择房间");
		return ;
	}
	if($("#vehicle").val()==null || $("#vehicle").val()==""){
		alert("车辆信息不能为空，请填写车辆信息");
		return ;
	}
	var jsonuserinfo = $('#form').serializeObject();
	$("#form").submit();
} 

function getBuildingByCellId(){
	var obj = document.getElementById("cellid");
	var cellId = obj.options[obj.selectedIndex].value;
	var cellName = obj.options[obj.selectedIndex].text;
	if(cellName.indexOf("请选择小区")!=-1){
		$("#buildingid option").remove();
		$("#buildingid").append("<option>--------------请选择楼栋--------------</option>"); 
		$("#roomid option").remove();
		$("#roomid").append("<option>--------------请选择住宅--------------</option>"); 
	}else{
		$.ajax({
			type : 'POST',
			url : "/world-web/v2/icApply/getBuildingInfoByCellId.html",
			dataType : "json",
			data : {
				"cellid" : cellId
			},
			success : function(data) {
				$("#buildingid option").remove();
				$.each(data.object,function(idx,item){ 
					//为Select追加一个Option(下拉项)
					$("#buildingid").append("<option value='"+item.id+"'>"+item.buildingname+"</option>");
					
					getRoomByBuildingId();
				})
			},
		});
	}
}

function getRoomByBuildingId() {
	var obj = document.getElementById("buildingid");
	var buildingId = obj.options[obj.selectedIndex].value;
	var buildingName = obj.options[obj.selectedIndex].text;
	$.ajax({
		type : 'POST',
		url : "/world-web/v2/icApply/getRoomInfoBybuildingId.html",
		dataType : "json",
		data : {
			"buildingId" : buildingId
		},
		success : function(data) {
			$("#roomid option").remove();
			$.each(data.object,function(idx,item){    
				//为Select追加一个Option(下拉项)
				$("#roomid").append("<option value='"+item.id+"'>"+item.roomname+"</option>"); 
			})
		},
	});
}

function changeApplyNumber(obj){
	var applynumber = $("#applynumber").val();
	var clone_tr = $("#vehicleids_tr_0").prop("outerHTML");
	$(".vehicleids_tr_0").remove();
	for (var i = 0; i < applynumber; i++) {
		$(obj).parent().parent().after(clone_tr);
	}
	var vehicle="";
	$(".vehicleids_tr_0").each(function(index,item){
		if(vehicle==null || vehicle==""){
			vehicle = $(this).find("option:selected").val()+$(this).find("input").val()
		}else{
			vehicle = vehicle +"|"+ $(this).find("option:selected").val()+$(this).find("input").val()
		}
	});
	$("#vehicle_hid").val(vehicle);
}
</script>
<body>
	<form id="form" action="/WEB-INF/views/icapply/alipayapi.jsp" method="post">
		<table style="margin: 10px; font: 100%;">
			<tr>
				<td>姓 名：</td>
				<td><input type="text" style="width: 90%" id="userrealname" name="userrealname" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,'')";this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,''/></td>
			</tr>
			<tr>
				<td>年 龄：</td>
				<td><input type="text" style="width: 90%" id="age" name="age" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,'')";this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,''/></td>
			</tr>
			<tr>
				<td>手 机 号：</td>
				<td><input type="text" style="width: 90%" id="phone" name="phone" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,'')";this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,''/></td>
			</tr>
			<tr>
				<td>身份证号：</td>
				<td><input type="text" style="width: 90%" id="cardnumber" name="cardnumber" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,'')";this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,''/></td>
			</tr>
			<tr>
				<td>小 区：</td>
				<td>
					<input type="hidden" value="e6a8243a15584775a68e93e6220de8da" id="sysadminid" name="sysadminid"/>
<!-- 					<select style="width: 90%" id="cellid"> -->
<%-- 						<option value="${cellInfo.id}">${cellInfo.cellname}</option> --%>
<!-- 					</select> -->
					<select style="width: 90%" id="cellid" name="cellid" onchange="getBuildingByCellId()">
						<option value="请选择小区" selected="selected">--------------请选择小区--------------</option>
						<option value="05afdfc1155845c48d99ed3f7218cd33">天上，人间李木子喵喵</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>楼 栋：</td>
				<td >
					<select id="buildingid" name="buildingid" style="width: 90%" onchange="getRoomByBuildingId()">
<%-- 						<c:forEach items="${buildingInfos }" var="buildingInfo"> --%>
<%-- 							<option value="${buildingInfo.id }">${buildingInfo.buildingname }</option> --%>
<%-- 						</c:forEach> --%>
						<option value="请选择楼栋" selected="selected">--------------请选择楼栋--------------</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>房间名称：</td>
				<td>
					<select style="width: 90%" id="roomid" name="roomid">
						<option value="请选择住宅" selected="selected">--------------请选择住宅--------------</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>我是：</td>
				<td>
					<input type="radio" name="applicanttype" value="0" checked="checked" />业主 
					<input type="radio" name="applicanttype" value="1" />租户
					<input type="radio" name="applicanttype" value="2" />其他 
					<input type="radio" name="applicanttype" value="3" />业主亲属</td>
			</tr>
			<tr>
				<td>申请张数：</td>
				<td>
					<select style="width: 20%" id="applynumber" name="applynumber" onchange="changeApplyNumber(this)">
						<option value="1" >1</option>
						<option value="2" >2</option>
						<option value="3" >3</option>
						<option value="4" >4</option>
						<option value="5" >5</option>
					</select>
				</td>
			</tr>
			<input type="hidden" id="vehicle_hid" name="vehicleids" />
			<tr id="vehicleids_tr_0" class="vehicleids_tr_0">
				<td rowspan="1">车牌号：</td>
				<td id="vehicleids_td">
					<select style="width: 20%" >
						<option>粤</option>
						<option>川</option>
						<option>湘</option>
					</select> 
					<input type="text" style="width: 60%" id="vehicle" name="vehicle" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,'')";this.value=this.value.replace(/[^\u4e00-\u9fa5\w]/g,'' />
				</td>
			</tr>
<!-- 			<tr id="vehicleids_clone"></tr> -->
			<tr>
				<td>需支付</td>
				<td style="color: red; font: normal 200% Helvetica, Arial, sans-serif;">500</td>
			</tr>
			<tr><td></td></tr>
			<tr>
				<td colspan="2" align="center">
					<div style="background-color: #5599FF; border-radius: 10px; width: 40%; margin-top: 20px">
						<a href="javascript:void(0)" onclick="onClik()" style="font-size: 150%; color: #FFFFFF">申请</a>
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>