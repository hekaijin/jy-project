<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <title>后台中心-财务管理-收费标准设置</title> -->
<jsp:include page="../publicpage/cssandjs.jsp"></jsp:include>
<style>
html, body {
	height: 100%;
	background: #fff;
}

input:focus {
	outline: 0 !important
}

.table-h {
	background-color: #4f606b;
}

.table {
	white-space: nowrap;
}

/* #page-wrapper { */
/* 	background-color: #f2f4f8 !important; */
/* } */

.table thead tr th {
	text-align: center;
	font-size: 16px;
	color:white;
}

.table tbody tr td {
/* 	text-align: left; */
	text-align:center; 
}
select.input-lg {
	    height: 40px;
    line-height: 28px;
}
.table tbody tr th {
	text-align: left;
}

.table tbody tr td input {
	margin-right: 15px;
}

.table tbody tr td button {
	display: inline-block;
	margin-left: 20px;
}

h4 {
	margin-bottom: 1em;
}

.graphs {
	padding-top: 1em;
	background: #ffffff;
}

.sidebar {
	margin-top: 88px !important;
}


#bottomTab {
	display: block;
	text-align: center;
}

#bottomTab ul {
	display: inline-block;
}

#bottomTab ul li {
	list-style: none;
	float: left;
	margin-left: 10px;
}

label {
	text-align: center;
}

.search {
	padding-left: 0 !important;
	padding-right: 0 !important;
}

.row1 {
	display: inline-block;
	width: 30%;
/* 	margin-left: 56%; */
}

.col-sm-1 {
	width: 80px;
}

.form-control1 {
	width: 180px;
}

.input-prepend {
	margin-bottom: 0;
}

.imgBox img {
	width: 30px;
	height: 20px;
}

.imgBox img:hover {
	width: 420px;
	height: 560px;
	position: absolute;
	top: 25%;
	left: 50%;
}
/*.imgB{*/
/*width: 200px;*/
/*height: 200px;*/
/*}*/
ul li {
	list-style: none;
}
fieldset {
	padding: .35em .625em .75em;
	margin: 0 2px;
	border: 1px solid silver
}

legend {
/* 	padding: .5em; */
	border: 0;
	width: auto
}
.form-horizontal .form-group {
    margin-right: -15px;
    margin-left: 4px;
}
 
.mask1 {   
    width:100%;
    height:100%;
    position:fixed;
    top:0;
    left:0;
    background-color:#666;
    filter: Alpha(Opacity=80);
    -moz-opacity: 0.8;
    opacity: 0.8;
    z-index: 9998; /*这个数值比pop box小*/ 
    display: none;
}
#realm{
width:600px;
height:50px;
/* border:1px solid white; */
border-radius:5px;

background:white; 
position: absolute;
top: 50%;
left:35%;
/* opacity:0.5; -moz-opacity:0.5; */
z-index: 9999;
display: none;
}
#wai{
width:500px;
height:3px;
/* border:1px solid green;  */
border-radius:5px;

background: rgba(0,0,0,0.4);
position: absolute;
top: 50%;
left:8%;

}
#nei{
position: relative;
width:0px;
height:3px;
background:#00ba7d;
border-radius:5px;

/* background: rgba(0,0,0,0.4); */
 
}

#down{
    position: absolute;
    top: 19px;
    right: 1%;

}
#importButton{
position: absolute;
/* left: 410px; */
right: 15%;

}
#importButton2{
	position: absolute;
	/* left: 410px; */
	right:4%;

}
   
      
      .mask{
            width: 100%;
            height: 100%;
            background: rgba(0,0,0,0.4);
            position: absolute;
           top: -24px;
            z-index: 9998;
            /*opacity: .4;*/
display: none;
        }
        .mid{
            width: 600px;
            height: auto;
            background-color: #fff;
            position: absolute;
            top: 27%;
            left: 50%;
            margin:-130px 0 0 -305px;
        }

        form .form-group{
            margin: 0;
        }
        .form-group{
            background-color:#fff !important;
        }
        label{
            text-align: right;
            line-height: 40px;
        }
        .top{
            position: relative;
        }
        .top span img{
            display: inline-block;
            /*float: right;*/
            position: absolute;
            top: 23px;
            right: 30px;
        }
        .top span:first-child{
            text-align: center;
            line-height: 60px;
            display: inline-block;
            width: 100%;
            border-bottom: 1px solid #ccc;
        }
        .xs{
            padding-top: 0px !important;
        }
        .mid .form-control1 {
		width: 100%;
		}
	
	
</style>
</head>
<body>
<div id="mask" class="mask1"></div>
	<div id="wrapper">
			<!-- begin Navigation -->
<%-- 			<jsp:include page="../publicpage/menu.jsp"></jsp:include> --%>
			<!-- end Navigation -->
		<div id="page-wrapper" style="    position: inherit;margin: 0 0 0 0px;">
			<div class="col-md-12 graphs" style="padding-bottom: 1em;">
				<ol class="breadcrumb">
					<li><a href="#">Home</a></li>
					<li>统计</li>
					<li><a href="${basePath}projectIncome/toProjectIncomePage.html">收入查看</a></li>
					<li>收入导入</li>
				</ol>
				
				<div class="down">
					<a id="down" href="${basePath}downlode/downloadExportModel.html?fileName=projectIncomeImportModel.xlsx" class="btn btn-primary" type="button">下载收入导入模板</a>
				</div>
				<form id="form2" action="" class="form-horizontal">
				 	<fieldset  class="form-group col-lg-6">
						<legend>选择导入的数据源</legend>
							<input class="form-control1" id="lefile" name="upfile" type="file" style="display:none">  
						<div class="input-append"> 
							 ①<select type="text" id="FieldID" onclick="isHidden();" name="fieldid" class="form-control1 input-lg" id="largeinput2" placeholder="" style="height:34px;width: 280px;">
                             </select>
						    <input id="photoCover" disabled="disabled" class="form-control1" type="text" style="height:34px;width: 280px;">  
<!-- 						<a id="onego" disabled="disabled" class="btn btn-primary" onclick="$('input[id=lefile]').click();" style="height:34px;">①选择Excel数据源</a>  -->
						    <a id="onego" disabled="disabled" class="btn btn-primary" onclick="return false;" style="height:34px;">②选择Excel数据源</a> 
						    <button id="verifyButton" disabled="disabled" type="button" class="queryButton btn btn-primary" onclick="verifyData();" style="height:34px;">③验证数据</button> 
						</div>  
					</fieldset>
					 
				 	<fieldset  class="form-group col-lg-6">
						<legend>验证数据结果</legend>
							<label class="control-label" style="height:35px; line-height: 23px;">总数据量（<span id="total" style="color:#2eb7e4">0</span>）条</label> |
							<label class="control-label" style="height:35px; line-height: 23px;">有效数据（<span id="valid" style="color:#2fcb6a">0</span>）条</label> |
							<label class="control-label" style="height:35px; line-height: 23px;">错误数据（<span id="error" style="color:#e6685a">0</span>）条</label> 
							<button id="importButton" disabled="disabled" type="button" class="queryButton btn btn-primary" onclick="tableImportDatas();">④导入有效数据</button>
							<button id="importButton2" type="button" class="queryButton btn btn-primary" onclick="selectIncome();">⑤查看收入</button>
					</fieldset>
					</form>
				</div>
				
				
				
				<!-- loading -->
				<div class="modal fade" id="loading" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop='static'>
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <h4 class="modal-title" id="myModalLabel">温馨提示 :</h4>
				      </div>
				      <div class="modal-body">
				        <img style="margin-left: 30px" src="${basePath}images/loadingimg.gif"></br>
				        <a style="margin-left: 30px" >客官~~请骚等。。。</a>
				      </div>
				    </div>
				  </div>
				</div>
				<!-- loading -->
				<div style="overflow: auto; width: 98.8%;padding-left: 19px;">
					<table id="table" class="table table-striped table-hover text-center" width="auto"
						style="white-space: nowrap;">
						<thead class="table-h">
							<tr>
								<th>序号</th>
								<th>项目名称</th>
								<th>金额</th>
								<th>费用类型</th>
								<th>时间</th>
								 
							</tr>
						</thead>
						<tbody id="datum">

						</tbody>
					</table>
				</div>
				<!-- 底部分页按钮 -->
				<div align="center" id="bottomTab"></div>

	</div>
</div>
<div id="realm">
	<div id="wai">
	     <div id="nei"></div>
	</div><span id="precent" style="margin-left: 45%;"></span><br/>	 
</div>
</body>
</html>
<script>

	$('input[id=lefile]').change(function() {  
		
		$('#photoCover').val($(this).val());
		$("#datum").empty();//清空表格内容
		 var fileDir = $("#lefile").val();
		   var suffix = fileDir.substr(fileDir.lastIndexOf("."));  
		
		   if("" == fileDir){  
		       alert("请选择需要导入的Excel文件！");  
		       return false;  
		   }  
		   if(".xls" != suffix && ".xlsx" != suffix ){  
		       alert("请选择Excel格式的文件导入！");  
		       return false;  
		   }   	  
			$('#form2').ajaxSubmit({    
				               url:'${basePath}projectIncome/projectIncomeUploadExcel.html',  
				               dataType: 'text', 
// 				               beforeSend: function () {//请求之前显示加载动画
// //				                  $("#sk-folding").css("display","block"); 
// 				               		$('#loading').modal('show');
// 				                },
// 				                complete: function () {//响应完成后关闭动画
// //				                 	$("#sk-folding").css("display","none"); 
// 				                	$('#loading').modal('hide');
// 				                },
				               success: resutlMsg,  
				               error: errorMsg  
			}); 
			function resutlMsg(msg){  
				   buildTable(msg);
				   $("#verifyButton").attr('disabled',false); 
// 				   window.location.reload();//刷新当前页面.
			}  
			function errorMsg(){ 
				 alert("导入excel失败!原因:数字中存在中文字符或跟模板格式不匹配!");      
			} 
			
		});  
	

//生成表格
function buildTable(datas) {//page（起始页码）,buildingName（每页记录数）,currentpage（当前页）
	var data=eval(datas);//将数组转成json
	var projectName=$("#FieldID").find("option:selected").text();
	$("#datum").empty();//清空表格内容
	if (data.length > 0) {
		$(data).each(function(index) {//重新生成
		  if(data[index].projectName != null||data[index].money != null){
			var tr = $("<tr></tr>");
			var td = $('<td>'+ (index*1+1)+ '</td>');
			var td1 = $('<td>'+ ((projectName == null) ? '': projectName)+ '</td>');
			var td2 = $('<td>'+ ((data[index].money == null) ? '': data[index].money)+ '</td>');
			var td3 = $('<td>'+ ((data[index].genre == null) ? '': data[index].genre)+ '</td>');
			var td4 = $('<td>'+ ((data[index].date == null) ? '': data[index].date)+ '</td>');
			tr.append(td);
			tr.append(td1);
			tr.append(td2);
			tr.append(td3);
			tr.append(td4);
			//再将tr添加到表格内
			$("#datum").append(tr);
		  }
		});
								

	} else {
		$("#datum").append('<tr><th colspan ="12"><center>无数据</center></th></tr>');
	}

}

//验证数据
function verifyData2(){
	 var table = $('#table').tableToJSON(); // Convert the table into a javascript object
	 // 特别需要注意这里，需要现将json数组通过JSON.stringify()处理一下之后，才能作为我们需要的参数传过去
	 var jsonData=JSON.stringify(table);
	 $.post("${basePath}projectIncome/verifyDatas.html",{"ds":jsonData},function(result){
// 		 console.log(result);
		  buildTable(result);
		  $(result).each(function(index) {
			  $("#total").text(result[index].total);
			  $("#valid").text(result[index].valid);
			  $("#error").text(result[index].error);
		  })
		 
		  $("#verifyButton").attr('disabled',true);  
		  $("#importButton").attr('disabled',false); 
 
	 })
	
}







//验证数据
function verifyData(){
	//添加并显示遮罩层   
	 $("#mask").css("display","block");
	
	 $("#realm").css("display","block");
 var table = $('#table').tableToJSON(); // Convert the table into a javascript object
	 // 特别需要注意这里，需要现将json数组通过JSON.stringify()处理一下之后，才能作为我们需要的参数传过去
	 var jsonData=JSON.stringify(table);
    var xhr=new XMLHttpRequest();
    xhr.open('post','${basePath}projectIncome/verifyDatas.html',true);
    xhr.onreadystatechange=function (){
        if(this.readyState==4){
//             document.getElementById('precent').innerHTML=this.responseText;
			//接收成功返回的数据
			var result=JSON.parse(this.responseText);
            buildTable(result);
  		  	$(result).each(function(index) {
  			  $("#total").text(result[index].total);
  			  $("#valid").text(result[index].valid);
  			  $("#error").text(result[index].error);
  		 	 })
  		 	 $("#verifyButton").attr('disabled',true);  
  		 	 $("#importButton").attr('disabled',false); 
        }
    }
    xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    xhr.send("ds="+jsonData);
    xhr.upload.onprogress=function (ev){
        if(ev.lengthComputable){
            var precent=100 * ev.loaded/ev.total;
//             console.log(precent);
            document.getElementById('nei').style.width=precent+'%';
            document.getElementById('precent').innerHTML=Math.floor(precent)+'%';
            if(precent>=100){
	            $("#realm").css("display","none");
	            $("#mask").css("display","none");
            }
        }
    }
   
}
function  selectIncome() {
    window.location.href="${basePath}projectIncome/toProjectIncomePage.html";
}

//导入数据
function tableImportDatas(){
	var fieldId=$("#FieldID").val();
	//添加并显示遮罩层   
	$("#mask").css("display","block");
	$("#realm").css("display","block");
 var table = $('#table').tableToJSON(); // Convert the table into a javascript object
	// 特别需要注意这里，需要现将json数组通过JSON.stringify()处理一下之后，才能作为我们需要的参数传过去
	var jsonData=JSON.stringify(table);
    var xhr=new XMLHttpRequest();
    xhr.open('post','${basePath}projectIncome/tableImportDatas.html?fieldId='+fieldId,true);
    xhr.onreadystatechange=function (){
        if(this.readyState==4){
//             document.getElementById('precent').innerHTML=this.responseText;
			//接收成功返回的数据
			var result=this.responseText;
			 $("#verifyButton").attr('disabled',true);
			 $("#importButton").attr('disabled',true); 
			 $("#datum").empty();
			 if(result=="success"){
				 alert("数据导入成功!"); 
			 }else if(result=="error"){
				 alert("数据导入失败!");
			 }else if(result=="notdata"){
				 alert("没有数据可导入!");
			 }
        }
    }
    xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    xhr.send("ds="+jsonData);
    xhr.upload.onprogress=function (ev){
        if(ev.lengthComputable){
            var precent=100 * ev.loaded/ev.total;
//             console.log(precent);
            document.getElementById('nei').style.width=precent+'%';
            document.getElementById('precent').innerHTML=Math.floor(precent)+'%';
            if(precent>=100){
	            $("#realm").css("display","none");
	            $("#mask").css("display","none");
            }
        }
    }
   
}


 

$(function(){
	
	$.post("${basePath}redLine/getFieldIdAndName.html",function(datas){
		$("#FieldID").empty();
		   if (datas.length > 0 ) {
                $(datas).each(function(index){//重新生成
                	if(index==0){
						$("#FieldID").append('<option value="请选择" selected="selected">---------------请选择项目---------------</option>');
                		
                	}
					$("#FieldID").append('<option value="'+this.fieldid+'">'+this.name+'</option>');
                		
                })
            }
		
	})
})

function isHidden(){
	
	var select=$("#FieldID").val();
	if("请选择"==select){
		$("#onego").attr('disabled',true); 
		$("#verifyButton").attr('disabled',true); 
		$("#importButton").attr('disabled',true); 
		$('#onego').off("click");
		
	}else{
		$("#onego").attr('disabled',false); 
		$("#onego").bind("click", function(){
			$('input[id=lefile]').click();
		})
		
	}
}
 
</script>