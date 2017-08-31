<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("path", path);
	request.setAttribute("basePath", basePath);
%>     
        <nav class="top1 navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">后台中心</a>
            </div>
             <ul class="nav navbar-right">
				<c:if test="${adminSession!=null}"><i class="navbar-text" style="position: absolute;left: 82%;">欢迎&nbsp;&nbsp;<span class="glyphicon glyphicon-user"></span> ${adminSession}</i><a class="navbar-text" href="${basePath}financeBack/logOut.html"><span class="glyphicon glyphicon-log-out"></span>&nbsp;退出</a></c:if>	
			 </ul>
            <div class="navbar-default sidebar"role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu" >
                        <li>
                            <a href="${basePath}financeBack/gotoIndex.html"><i class="fa fa-dashboard fa-fw nav_icon"></i>首页</a>					
                        </li>
		<c:if test="${adminSession!=null}">                         
 				<c:if test="${adminSession=='gzzbAdmin'}">    
                         <li class="active">
                            <a href="#"><i class="fa fa-laptop nav_icon"></i>财务后台<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level" style="list-style: none;">
								<li class="active"  style="list-style: none;">        
									<a href="#"><i class="fa fa-table nav_icon"></i>财务报表<span class="fa arrow"></span></a>
									<ul >
										<li class="active" style="list-style: none;">
											<a class="active" href="${basePath}financeBack/siteStatementView.html">场地日报表</a>
										</li>
<!-- 	待开发									<li class="active" style="list-style: none;"> -->
<%-- 											<a class="active" href="${basePath}financeBack/siteMonthStatementView.html">场地月报表</a> --%>
<!-- 										</li> -->
									</ul>
								</li>
<!-- 								<li class="active"> -->
<!-- 									<a href="#"><i class="fa fa-table nav_icon"></i>场地月报表<span class="fa arrow"></span></a> -->
<!-- 									<ul> -->
<!-- 										<li class="active"> -->
<!-- 											<a  href="#">月报表详情</a> -->
<!-- 										</li> -->
<!-- 									</ul> -->
<!-- 								</li> -->


<!-- 	待开发								<li> -->
<!-- 									<a href="javascript:;"><i class="fa fa-flask nav_icon"></i>场地利润分析</a> -->
									
<!-- 								</li> -->
<!-- 								<li class="active"> -->
<!-- 									<a href="#"><i class="fa fa-check-square-o nav_icon"></i>报销审核<span class="fa arrow"></span></a> -->
<!-- 									<ul> -->
<!-- 										<li class="active" style="list-style: none;"> -->
<!-- 											<a  href="#">审批详情</a> -->
<!-- 										</li> -->
<!-- 									</ul> -->
<!-- 								</li> -->
<!-- 								<li> -->
<!-- 									<a href="#"><i class="fa fa-indent nav_icon"></i>计划任务</a> -->
									
<!-- 								</li> -->
 					

                            </ul>
                            <li>
								<a href="${basePath}commandCenter/toCommandCenterView.html"><i class="fa fa-sitemap fa-fw nav_icon"></i>指挥中心</a>
							</li>
							<li>
                           		 <a href="${basePath}LoginRecordController/toLoginRecordPage.html"><i class="fa fa-table nav_icon"></i>登录日志查看</a>
                       	    </li> 
						</c:if>
                     <c:if test="${adminSession!='gzzbAdmin'}">       
					    <li>
                            <a href="#"><i class="fa fa-check-square-o nav_icon"></i>部门财务收账<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="${basePath}statements/showDailyStatement.html">部门日报表查看</a>
                                </li>
                                <li>
                                    <a href="${basePath}statements/insertView.html">新增收费记录</a>
                                </li>
                            </ul>
                        </li>
                         <li>
                            <a href="#"><i class="fa fa-indent nav_icon"></i>服务费管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="${basePath}statements/showPropertyServicePage.html">物业服务费</a>
                                </li>
                                <li>
                                    <a href="${basePath}statements/showParkServicePage.html">停车服务费</a>
                                </li>
                                <li>
                                    <a href="${basePath}statements/showWaterElectricityPropertyServicePage.html">水电服务费</a>
                                </li>
                                <li>
                                    <a href="${basePath}statements/showPropertyServiceBillPage.html">物业水电服务费{账单|收据}</a>
                                </li>
                            </ul>
                        </li>
                        
                        
                         <li>
                            <a href="#"><i class="fa fa-sitemap fa-fw nav_icon"></i>家园管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="${basePath}worldManege/toInUnitPage.html">单元导入</a>
                                </li>
                                <li>
                                    <a href="${basePath}worldManege/toInOwnerPage.html">业主导入</a>
                                </li>
                                <li>
                                    <a href="${basePath}worldManege/toBuildingManagePage.html">楼宇管理</a>
                                </li>
                                <li>
                                    <a href="${basePath}worldManege/toRoomManagePage.html">住宅管理</a>
                                </li>
                                <li>
                                    <a href="${basePath}worldManege/toOwnerManagePage.html">业主管理</a>
                                </li>
                            </ul>
                        </li>
                      <li>
                          <a href="#"><i class="fa fa-laptop nav_icon"></i>财务管理<span class="fa arrow"></span></a>
                          <ul  class="nav nav-second-level">
                          		<li>
                                    <a href="${basePath}chargeStandard/toChargeStandardPage.html">收费标准设置</a>
                                </li>
                          		<li>
                                    <a href="${basePath}chargeStandard/toChargeStandardDetailPage.html">收费标准明细</a>
                                </li>
                          </ul>
                      </li>
                     </c:if>
                  </c:if> 
                  		 <li>
                            <a href="#"><i class="fa fa-envelope nav_icon"></i>投诉建议管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="${basePath}complainOrSuggest/toComplainSuggetPage.html">投诉或建议</a>
                                </li>
                            </ul>
                        </li>    
   
                    </ul>
                </div>
                
            </div>
           
        </nav>