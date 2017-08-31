<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- <title>后台中心-财务管理-收费标准设置</title> -->

	<jsp:include page="../../publicpage/cssandjs.jsp"></jsp:include>
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
		a{
			cursor:pointer;
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

		.col-sm-2 {
			width: 24.667%;
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
			margin-left: 15px;
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
			top: 17px;
			right: 1%;

		}
		#importButton{
			position: absolute;
			/* left: 410px; */
			right: 4%;

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
		<div class="col-md-12 graphs" style="padding-bottom: 0em;">
			<ol class="breadcrumb">
				<li><a href="#">Home</a></li>
				<li>工资管理</li>
				<li>工资规则设置</li>
			</ol>

			<div class="down">
				<%-- 					<a id="down" href="${basePath}statements/downloadExportModel.html?fileName=unitImportModel.xlsx" class="btn btn-primary" type="button">下载单元导入模板</a> --%>
			</div>
			<form id="form1" action="" class="form-horizontal">
				<div class="panel panel-default">
					<!-- 					<div class="panel-heading"> -->
					<!-- 						<h3 class="panel-title"> -->
					<!-- 							操作、查询 -->
					<!-- 						</h3> -->
					<!-- 					</div> -->

					<div class="panel-body" style="height: 65px;">

						<div class="btn-toolbar" role="toolbar">
							<div class="btn-group" style="width: 135px;">
								<button type="button" class="btn btn-default" onclick="insertChargeStandard();"><span class="glyphicon glyphicon-plus"></span>新增</button>
								<%--<button type="button" class="btn btn-default" onclick="edits();"><span class="glyphicon glyphicon-pencil"></span>修改</button>--%>
								<button type="button" class="btn btn-default" onclick="batchDel();"><span class="glyphicon glyphicon-remove"></span>删除</button>
								<div style="float: right;width: 100px;">
								</div>

								<div>
									<div class="row1">
										<!-- 				 <div class="form-group">  -->
										<div class="col-xs-4" style="left: 430px;position: relative;bottom: 34px;">

												<c:if test="${permission!=null}">
												<c:choose>
													<c:when test="${permission== 'yes'}">
														<div class="input-group">
															<input type="text" class="form-control1" placeholder="查询全部部门" style="height:34px;width: 250px;"  id="fieldName" name="fieldName" />
															<div class="input-group-btn">
																<button type="button" id="findselect" class="btn btn-default dropdown-toggle" onclick="putValue('a');" data-toggle="dropdown">
																	选择查询的部门
																	<span class="caret"></span>
																</button>

																<ul class="dropdown-menu pull-right" id="etypeUl"  style="overflow: scroll;height: 350px;">
																	<li><a href="#">功能</a></li>
																	<li><a href="#">另一个功能</a></li>
																	<li><a href="#">其他</a></li>
																	<li class="divider"></li>
																	<li><a href="#">分离的链接</a></li>
																</ul>
															</div>

															<button id="queryButton" type="button" style="position: absolute;float: right;bottom: 0px;left: 102%;" class="btn btn-default"><span class="glyphicon glyphicon-search"></span>&nbsp;查询</button>
														</div>
													</c:when>
													<c:when test="${permission== 'no'}">
														<div class="input-group">
															<input type="text" class="form-control1" disabled="disabled" placeholder="只能查询自己所在部门" style="height:34px;width: 300px;"  id="fieldName" name="fieldName" />
															<div class="input-group-btn">
																<button type="button" id="findselect" disabled="disabled" class="btn btn-default dropdown-toggle" onclick="putValue('a');" data-toggle="dropdown">
																	查询自己所在部门
																	<span class="caret"></span>
																</button>

																<ul class="dropdown-menu pull-right" id="etypeUl"  style="overflow: scroll;height: 350px;">
																	<li><a href="#">功能</a></li>
																	<li><a href="#">另一个功能</a></li>
																	<li><a href="#">其他</a></li>
																	<li class="divider"></li>
																	<li><a href="#">分离的链接</a></li>
																</ul>
															</div>
															<button id="queryButton" type="button" style="position: absolute;float: right;bottom: 0px;left: 102%;"  disabled="disabled" class="btn btn-default"><span class="glyphicon glyphicon-search"></span>&nbsp;查询</button>
														</div>

													</c:when>
													<c:otherwise>

													</c:otherwise>
												</c:choose>
											</c:if>
										</div>

									</div>

								</div>
							</div>
						<div class="row">
								<div class="col-lg-1" style="width: 155px">
									<div class="col-sm-1">
										<input type="text" class="form-control1" placeholder="输入员工姓名" style="height:34px;width: 150px;"/>
									</div>
								</div>
								<div class="col-lg-1">
									<div class="col-sm-1">
										<select id="salaryRule" class="form-control1" style="height:34px;width: 120px;">
											<option>选择规则类型</option>
											<option>部门</option>
											<option>个人</option>
										</select>
									</div>
								</div>

						</div>
					</div>
					</div>
				</div>
			</form>
		</div>
		<div style="overflow: auto; width: 100%;">
			<table id="table" class="table table-striped table-hover text-center" width="auto"
				   style="white-space: nowrap;">
				<thead class="table-h">
				<tr>
					<!-- 							<button class="btn btn-default" id="reverse" name="reverse"><span class="glyphicon glyphicon-check"></span>勾选</button> -->
					<th style="width: 1%;"><span id="reverse" style="cursor:pointer;" class="glyphicon glyphicon-check"></span></th>
					<th style="width: 9%;">员工编号</th>
					<th style="width: 9%;">员工姓名</th>
					<th style="width: 9%;">所属部门</th>
					<th style="width: 9%;">规则名称</th>
					<th style="width: 9%;">应工作天数</th>
					<th style="width: 9%;">实工作天数</th>
					<th style="width: 9%;">基本工资</th>
					<th style="width: 9%;">绩效工资</th>
					<th style="width: 9%;">其他福利</th>
					<th style="width: 9%;">积分</th>
					<th style="width: 9%;">操作</th>
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

<div class="mask">
	<div class="mid">
		<div class="top">
			<span id="titlename">修改红线</span>
			<span id="close"><img src="${basePath}images/quit.png" alt="关闭"/></span>
		</div>
		<div class="bottom">
			<div class="graphs" style="padding-top: 0 !important;background-color: #fff !important;">
				<div class="xs">
					<div class="tab-content">
						<div class="tab-pane active" id="horizontal-form">
							<form id="form2" class="form-horizontal" action="" method="post" onsubmit="return sub();">

								<c:if test="${permission!=null}">
									<c:choose>
										<c:when test="${permission== 'yes'}">
											<div class="form-group mb-n2">
												<label for="FieldID" disabled="disabled" class="col-sm-2 control-label label-input-lg" style="padding-right: 0px;">部门</label>
												<div class="col-sm-8">
													<select type="text" disabled="disabled" id="FieldID" name="fieldid" class="form-control1 input-lg" id="largeinput2" placeholder="">
													</select>
												</div>
											</div>
										</c:when>
										<c:when test="${permission== 'no'}">
											<div class="form-group mb-n2">
												<label for="FieldID" disabled="disabled" class="col-sm-2 control-label label-input-lg" style="padding-right: 0px;">部门</label>
												<div class="col-sm-8">
													<select type="text" disabled="disabled" id="FieldID" name="fieldid" class="form-control1 input-lg" id="largeinput2" placeholder="">
													</select>
												</div>
											</div>

										</c:when>
									</c:choose>
								</c:if>
								<div class="form-group mb-n2">
									<label for="expensesreimbursementredline" class="col-sm-2 control-label" style="padding-right: 0px;">综合报销成本</label>
									<div class="col-sm-8">
										<input id="id" name="redlineid" type="hidden" value=""/>
										<input type="text" id="expensesreimbursementredline" name="expensesreimbursementredline" onkeyup="value=value.replace(/[^\d\.]/g,'')" class="form-control1" id="focusedinput" placeholder="">
									</div>
								</div>

								<%--<div class="form-group mb-n2">--%>
								<%--<label for="borrowredline" class="col-sm-2 control-label" style="padding-right: 0px;">借支单红线</label>--%>
								<%--<div class="col-sm-8">--%>
								<%--<input type="text" id="borrowredline" name="borrowredline" onkeyup="value=value.replace(/[^\d\.]/g,'')" class="form-control1" id="focusedinput" placeholder="">--%>
								<%--</div>--%>
								<%--</div>--%>
								<%----%>
								<%--<div class="form-group mb-n2">--%>
								<%--<label for="applyredline" class="col-sm-2 control-label" style="padding-right: 0px;">申请单红线</label>--%>
								<%--<div class="col-sm-8">--%>
								<%--<input type="text" id="applyredline" name="applyredline" onkeyup="value=value.replace(/[^\d\.]/g,'')" class="form-control1" id="focusedinput" placeholder="">--%>
								<%--</div>--%>
								<%--</div>--%>

								<div class="form-group mb-n2">
									<label for="subscribeRedLine" class="col-sm-2 control-label" style="padding-right: 0px;">申购单红线</label>
									<div class="col-sm-8">
										<input type="text" id="subscribeRedLine" name="subscribeRedLine" onkeyup="value=value.replace(/[^\d\.]/g,'')" class="form-control1" id="focusedinput" placeholder="">
									</div>
								</div>

								<div class="form-group mb-n2">
									<label for="predictIncome" class="col-sm-2 control-label" style="padding-right: 0px;">预计物业管理费收入</label>
									<div class="col-sm-8">
										<input type="text" id="predictIncome" name="predictIncome" onkeyup="value=value.replace(/[^\d\.]/g,'')" class="form-control1" id="focusedinput" placeholder="">
									</div>
								</div>

								<%--<div class="form-group mb-n2">--%>
								<%--<label for="staydate" class="col-sm-2 control-label" style="padding-right: 0px;">时间</label>--%>
								<%--<div class="col-sm-8">--%>
								<%--<div class="input-prepend input-group">--%>
								<%--<span class="add-on input-group-addon">--%>
								<%--<i class="glyphicon glyphicon-calendar fa fa-calendar"></i>--%>
								<%--</span>--%>
								<%--<input type="text" readonly style="width: 100%" name="createdate" id="staydate" class="form-control1" />--%>
								<%--</div>--%>
								<%--</div>--%>
								<%--</div>--%>


								<div id="remarkdiv" class="form-group mb-n2">
									<label for="remark" class="col-sm-2 control-label" style="padding-right: 0px;">备注</label>
									<div class="col-sm-8">
										<textarea type="text" id="remark" name="remark" class="form-control1" id="focusedinput" style="height: 60px;"></textarea>
									</div>
								</div>


								<div class="panel-footer" style="background-color: #fff;border-top:none;">
									<div class="row" style="margin-left: 120px;">
										<div class="col-sm-8 col-sm-offset-2" >
											<input id="submitBtn" type="submit" class="btn-success btn" type="text" readonly="readonly" value="提交" style="height: 32px;line-height: 10px;width: 60px;"/>
											<span/>
											<!--                                             <input class="btn-default btn" id="resert" type="text" readonly="readonly" style="width: 60px;" onclick="edits('1')" value="重置"/> -->
											<input class="btn-default btn"  type="text" readonly="readonly" id="close2" style="width: 60px;" value="取消"/>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>

</body>
<script>

    function sub(){
        $("#FieldID").removeAttr("disabled");
        if( $("#expensesreimbursementredline").val()!="" &&
            $("#borrowredline").val()!="" &&
            $("#applyredline").val()!="" &&
            $("#predictIncome").val()!="" &&
            $("#subscribeRedLine").val()!=""
        ){
            var msg = "确定要提交吗？";
            if (confirm(msg)==true){
                // jquery 表单提交
                $("#form2").ajaxSubmit(function(data) {
                    alert(data.result);
                    buildTable(1,1,"","","");
                    $(".mask").fadeOut(800);
                });

                return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
            }else{
                return false;
            }
        }else{
            alert("请填写完整的信息!");
            return false;
        }
    }
    //修改收费标准
    function edits(id){
        $("#form2").attr("action", "${basePath}redLine/editRedLine.html");
        $("#resert").css('display','inline-block');
        $("#titlename").text("修改红线");
        $("#FieldID").attr("disabled","disabled");

        $.ajax({
            type:"POST",
            url:"${basePath}redLine/getRedLineList.html",
            data:{
                'page' : 1,
                'fieldName' : "",
                'id':id
            },
            async:false,
            dataType:"json",
            success: function(datas){

                if (datas.list.length > 0 ) {
                    $(datas.list).each(function(index){//重新生成

                        $("#id").val(this.redlineid);
                        $("#expensesreimbursementredline").val(this.expensesreimbursementredline);
                        $("#borrowredline").val(this.borrowredline);
                        $("#applyredline").val(this.applyredline);
                        $("#predictIncome").val(this.predictIncome);
                        $("#subscribeRedLine").val(this.subscribeRedLine);
                        $("#FieldID").val(this.fieldid);
                        $("#remark").val(this.remark);
//            		$("#staydate").val(this.createdate);
                        //时间控件
                        //$('#staydate').daterangepicker({startDate:this.staydate,singleDatePicker: true }, function(start, end, label) {

                        //})
                        var fieldids=this.fieldid;
                        //拼接option和设置下拉框选择指定值
                        $.post("${basePath}redLine/getFieldIdAndName.html",function(datas){
                            $("#FieldID").empty();
                            if (datas.length > 0 ) {
                                $(datas).each(function(index){//重新生成
                                    if(fieldids==this.fieldid){
                                        $("#FieldID").append('<option value="'+this.fieldid+'" selected="selected">'+this.name+'</option>');

                                    }else{
                                        $("#FieldID").append('<option value="'+this.fieldid+'">'+this.name+'</option>');
                                    }
                                })
                            }

                        })


                    })
                }

            }
        })
        $(".daterangepicker").css("z-index","9999")
        $(".mask").fadeIn(800);
//     $(".mask").css("display","block")
    }


    //新增红线
    function insertChargeStandard(){
        $("#form2").attr("action", "${basePath}redLine/insertRedLine.html");
        $("#resert").css("display","none");
        $("#titlename").text("新增红线");
//    	$("#remarkdiv").css('display','block');
        $("#FieldID").removeAttr("disabled");
        var fname="";
        var  findselect=$("#findselect").text();
        if("选择查询的部门"!=$.trim(findselect)){
            fname=$("#fname").text();
        }
        $("#redlineid").val("");
        $("#expensesreimbursementredline").val("");
        $("#borrowredline").val("");
        $("#applyredline").val("");
        $("#predictIncome").val("");
        $("#subscribeRedLine").val("");
        $("#fieldid").val("");
        $("#remark").val("");

        $.post("${basePath}redLine/getFieldIdAndName.html",function(datas){
            $("#FieldID").empty();
            if (datas.length > 0 ) {
                $(datas).each(function(index){//重新生成
                    if(fname==this.name){
                        $("#FieldID").append('<option value="'+this.fieldid+'" selected="selected">'+this.name+'</option>');

                    }else{
                        $("#FieldID").append('<option value="'+this.fieldid+'">'+this.name+'</option>');
                    }
                })
            }

        })

        $(".mask").fadeIn(800);

    }



    //批量删除
    function batchDel(){
        var msg = "确定要删除所勾选的吗？";
        var select=$(".checked").find("input").val();
        if(typeof(select) == "undefined"){
            alert("请先勾选要删除选项!");
            return false;
        }
        if (confirm(msg)==true){
            var priv_ids=[];
            $(".checked").each(function(){    // 遍历每一个class为checked的复选框，其中选中的执行函数
                priv_ids.push($.trim($(this).find("input").val()));    // 将选中的值的子节点input的value添加到数组priv_ids中
            });

            $.post("${basePath}redLine/delRedLine.html",{'ids':priv_ids},function(data){
                alert(data.result);
                window.location.reload();//刷新当前页面.
            });

        }else{
            return false;
        }

    }




    //jquery 动态为ul添加li
    function putValue(flag){
        $("#etypeUl").empty();
        $.ajax({
            url:"${basePath}redLine/getFieldIdAndName.html",
            type:"post",
            datatype:"json",
            success:function(data){
                var result=data;
                $("#etypeUl").append(" <li><a onclick='selectAll();' href='#'>查询全部</a></li>");
                for(var i = 0; i<result.length; i++){
                    var taget = result[i];
                    $("#etypeUl").append(" <li value="+taget.fieldid+"><a onclick='getValueByselect1(this.text);' href='#'>"+taget.name+"</a></li>");
                }

            }
        });


    }
    function selectAll() {
        $("#fieldName").val("");
        buildTable(1,1,"","","");
    }

    function getValueByselect1(text){
        $("#fieldName").val(text);
    }
    var fieldName=$("#fieldName").val();
    var currentpage = 1;
    var PAGESIZE = 10;
    var options = {
        currentPage : 1, //当前页数
        totalPages : 10, //总页数，这里只是暂时的，后头会根据查出来的条件进行更改
        size : "normal",
        alignment : "center",
        itemTexts : function(type, page, current) {
            switch (type) {
                case "first":
                    return "第一页";
                case "prev":
                    return "前一页";
                case "next":
                    return "后一页";
                case "last":
                    return "最后页";
                case "page":
                    return page;
            }
        },
        onPageClicked : function(e, originalEvent, type, page) { //页码点击事件
            switch (type) {
                case "prev":
                    currentpage = page + 1;
                    break;
                case "next":
                    currentpage = page - 1;
                    break;
            }
            buildTable(page, currentpage,fieldName,userName,rulesName);//默认每页最多10条
        }
    }

    //生成表格
    function buildTable(page,currentpage,fieldName,userName,rulesName) {//page（起始页码）,buildingName（每页记录数）,currentpage（当前页）
        var url = "${basePath}artificial/getWageCalculationList.html"; //请求的网址
        var reqParams = {
            'page' : page,
            'fieldName' : fieldName,
            'userName' : userName,
            'rulesName' : rulesName,
            'id':""
        };//请求数据
        $(function() {
            $.ajax({
                type : "POST",
                url : url,
                data : reqParams,
                async : false,
                dataType : "json",
                success : function(data) {
                    if (data.list.length > 0) {
                        // options.totalPages = data.pages;
                        var newoptions = {
                            currentPage : currentpage, //当前页数
                            totalPages : data.totalPage == 0 ? 1
                                : data.totalPage, //总页数
                            size : "normal",
                            alignment : "center",
                            itemTexts : function(type, page,
                                                 current) {
                                switch (type) {
                                    case "first":
                                        return "第一页";
                                    case "prev":
                                        return "前一页";
                                    case "next":
                                        return "后一页";
                                    case "last":
                                        return "最后页";
                                    case "page":
                                        return page;
                                }
                            },
                            onPageClicked : function(e,originalEvent, type, page) { //页码点击事件
                                var fieldName=$("#fieldName").val();

                                var currentpage;
                                switch (type) {
                                    case "prev":
                                        currentpage = page + 1;
                                        break;
                                    case "next":
                                        currentpage = page - 1;
                                        break;
                                }

                                buildTable(page,currentpage,fieldName,userName,rulesName);//默认每页最多10条

                            }
                        }
                        $('#bottomTab').bootstrapPaginator("setOptions", newoptions); //重新设置总页面数目
                        //                            var locaPath=$('#path').val();
                        $("#datum").empty();//清空表格内容

                        if (data.list.length > 0) {
                            $(data.list).each(function(index) {//重新生成
                                var tr = $("<tr></tr>");
// 								var td1 = $('<td>'+ (index*1+1)+ '</td>');
                                var td1=$('<td><div class="checkboxs" name="sport" value="basketball"><ins><input type="checkbox" style="display:none;" id="check" name="check_id" value="'+this.id+'"/></ins><span></span></div></td>');
                                var td2 = $('<td id="fname">'+ ((this.code == null) ? '': this.code)+ '</td>');
                                var td22 = $('<td>'+ ((this.name == null) ? '': this.name)+ '</td>');
								var td3 = $('<td>'+ ((this.fieldname == null) ? '': this.fieldname)+ '</td>');
								var td4 = $('<td>'+ ((this.rulesname == null) ? '': this.rulesname)+ '</td>');
                                var td41 = $('<td>'+ ((this.shouldworkdays == null) ? '': this.shouldworkdays)+ '</td>');
                                var td42 = $('<td>'+ ((this.realityworkdays == null) ? '': this.realityworkdays)+ '</td>');
                                var td5 = $('<td>'+ ((this.basepay == null) ? '': this.basepay)+ '</td>');
                                var td6 = $('<td>'+ ((this.performancepay == null) ? '': this.performancepay)+ '</td>');
                                var td7 = $('<td>'+ ((this.otherwelfare == null) ? '': this.otherwelfare)+ '</td>');
                                var td8 = $('<td>'+ ((this.integral == null) ? '': this.integral)+ '</td>');
                                var td77 = $('<td><a  name="'+this.redlineid+'" onclick="edits(this.name);"><span class="glyphicon glyphicon-pencil"></span>修改</a>' +
                                    '<span style="position: relative;padding-right: 10px;"/><a  id="'+this.redlineid+'"  name="'+this.redlineid+'" onclick="viewDetails(this.name);"><span class="glyphicon glyphicon-th-list"></span>详情</a></td>');
                                tr.append(td1);
                                tr.append(td2);
                                tr.append(td22);
								tr.append(td3);
								tr.append(td4);
                                tr.append(td41);
                                tr.append(td42);
                                tr.append(td5);
                                tr.append(td6);
                                tr.append(td7);
                                tr.append(td8);
                                tr.append(td77);
//
                                //再将tr添加到表格内
                                $("#datum").append(tr);
                                $("#close,#close2").click(function(){
                                    $(".mask").fadeOut(800);
//							                                     $(".mask").css("display","none")
                                })
                                $("#close3,#close4").click(function(){
                                    $(".mask2").fadeOut(800);
//							                                     $(".mask").css("display","none")
                                })
                            });


                        } else {
                            $("#datum").append('<tr><th colspan ="12"><center>查询无数据</center></th></tr>');
                        }
                    } else {
                        $("#datum").empty();//清空表格内容
                        $("#datum").append('<tr><th colspan ="12"><center>查询无数据</center></th></tr>');
//								alert("没有今日数据，请插入数据");
                    }

//							console.log(this.picture);
                },
                error : function(e) {
                    alert("查询失败:" + e.message);
                    $("#datum").empty();//清空表格内容
                    $("#datum").append('<tr><th colspan ="12"><center>查询无数据</center></th></tr>');
                }
            });

        });
    }



    //渲染完就执行
    $(function() {

        //生成底部分页栏
        $('#bottomTab').bootstrapPaginator(options);

        buildTable(1,1,"","","");//默认空白查全部

        $("#queryButton").bind("click",function(){
            var fieldName=$("#fieldName").val();

            buildTable(1,1,fieldName,userName,rulesName);
        });


        $("#reverse").click(function(){
            $("#reverse").removeClass("glyphicon glyphicon-check")
            var classname=$("ins")[0].className;
            if(classname=="checked"){
                $("ins").removeClass("checked")
                $("#reverse").addClass("glyphicon glyphicon-check");
            }else {
                $("ins").addClass("checked");
                $("#reverse").addClass("glyphicon glyphicon-share")

            }
        })

    });


    function viewDetails(redlineid) {

//		layer.msg("我是你")
        //在这里面输入任何合法的js语句
        var redid=redlineid;
        $.ajax({
            url:"${basePath}redLine/getRedLineRecordList.html",
            data:{'redid':redid},
            type:"post",
            dataType:"json",
            beforeSend:function(){
                layer.msg('正在查询修改记录，请稍后。');
            },
            success:function(result){
                $("#datum2").empty();
                if (result.length > 0) {
                    $(result).each(function(index) {//重新生成
                        var tr = $("<tr></tr>");
                        var td1 = $('<td>'+ ((this.expensesreimbursementredline == null) ? '': this.expensesreimbursementredline)+ '</td>');
                        var td2 = $('<td>'+ ((this.subscribeRedLine == null) ? '': this.subscribeRedLine)+ '</td>');
                        var td3 = $('<td>'+ ((this.predictIncome == null) ? '': this.predictIncome)+ '</td>');
                        var td4 = $('<td>'+ ((this.username == null) ? '': this.username)+ '</td>');
                        var td5 = $('<td>'+ ((this.createdate == null) ? '': this.createdate.substring(0,this.createdate.length-2))+ '</td>');
                        var td6 = $('<td>'+ ((this.remark == null) ? '': this.remark)+ '</td>');
                        tr.append(td1);
                        tr.append(td2);
                        tr.append(td3);
                        tr.append(td4);
                        tr.append(td5);
                        tr.append(td6);

                        //再将tr添加到表格内
                        $("#datum2").append(tr);

                    });


                } else {
                    $("#datum2").append('<tr><th colspan ="12"><center>无修改记录</center></th></tr>');
                }



                //在这里面输入任何合法的js语句
                layer.open({
                    type: 1 //Page层类型
                    ,area: ['60%', '300px']
                    ,title: '修改记录'
                    ,shade: 0.6 //遮罩透明度
                    ,maxmin: true //允许全屏最小化
                    ,anim: 1 //0-6的动画形式，-1不开启
                    ,content: $("#info").html()
                });
            },
            error:function(e){
                console.log(e,e.message);
                layer.msg("服务器错误！");
            }


        });

    }

</script>


<div id='info' style = "display : none">
	<div style="overflow: auto; width: 100%;">
		<table id="table" class="table table-striped table-hover text-center" width="auto"
			   style="white-space: nowrap;">
			<thead class="table-h">
			<tr>
				<th style="width: 13%;">综合报销成本</th>
				<th style="width: 13%;">申购单红线</th>
				<th style="width: 13%;">预计物业管理费收入</th>
				<th style="width: 13%;">创建人</th>
				<th style="width: 13%;">修改时间</th>
				<th>备注</th>
			</tr>
			</thead>
			<tbody id="datum2">

			</tbody>
		</table>
		<%--<p style="float: right;">注意!当前显示不超过10条修改记录，点击<a  style="cursor:pointer;text-decoration:none;" >查看更多~</a></p>--%>
	</div>
</div>


</html>