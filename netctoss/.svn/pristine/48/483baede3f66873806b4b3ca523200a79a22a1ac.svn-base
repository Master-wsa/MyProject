<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
       	<%@include file="../include/css.jsp" %>
     	<style type="text/css">
     		#null{text-align: center;}
      		ul li{  font-size:2em; text-align:center; font-family:'BebasNeueRegular', Arial, Helvetica, sans-serif; } 
		</style>
        <script language="javascript" type="text/javascript">
        
            //显示角色详细信息
            function showDetail(flag, a) {
                var detailDiv = a.parentNode.getElementsByTagName("div")[0];
                if (flag) {
                    detailDiv.style.display = "block";
                }
                else
                    detailDiv.style.display = "none";
            }
            //删除
            function deleteAdmin(id) {
            	var r = window.confirm("确定要删除该管理员吗？");
            	if(r==1){
	                $.post({
	                	url:'${pageContext.request.contextPath}/admin/deleteAdmin.do',
	                	data:{
	                		'adm_id':id,
	                	},
	                	traditional:true,
	                	success:function(result){
	                		if(result > 0){
	                			$("#delete"+id).css("background-color","blue");
	                			$("#delete"+id).hide(1000);
	                			setTimeout('select()', 1000);
	                		}else if(result==0){
	                			$("#operate_result_info").text("删除失败！");
	                            $("#operate_result_info").attr("class","operate_fail");
	            				$("#operate_result_info").show().delay(1000).hide(500);
	                		}else if(result==-1){
	                			$("#operate_result_info").text("对不起！当前用户不能被删除！");
	                            $("#operate_result_info").attr("class","operate_fail");
	            				$("#operate_result_info").show().delay(1000).hide(500);
	                		}
	                	}
	                })
            	}
            }
            
            //删除后再查询数据
            function select(){
            //	window.location.href="${pageContext.request.contextPath}/admin/selectAdminsByCondition.do?currentPage="+${currentPage};
            	$("#myform").attr("action","${pageContext.request.contextPath}/admin/selectAdminsByCondition.do");
            	$("#myform").submit();
            }
            
            //修改
            function modifyAdmin(id) {
                $("#id").val(id);
                $("#myform").submit();
            }
            //全选
            function selectAdmins() {
                if($("#check").is(":checked")){
                	$(":checkbox").prop("checked",true);
                }else{
                	$(":checkbox").prop("checked",false);
                }
            }
            
            //提示消息
            function showResult() {
                if('${requestScope.msg}'!=""){
                	showResultDiv('${requestScope.msg}');
                }
                window.setTimeout("closeResultDiv()", 1000);
            }
            function showResultDiv(flag) {
                //var divResult = document.getElementById("operate_result_info");
                if (flag){
                    $("operate_result_info").show();
                    $("operate_result_info").text("${requestScope.msginfo}");
                    $("operate_result_info").attr("class","operate_success");
                }else{
                	 $("operate_result_info").show();
                     $("operate_result_info").text("${requestScope.msginfo}");
                     $("operate_result_info").attr("class","operate_fail");
                }
            }
            //重置密码
            $(function(){
            	$("#reset").click(function(){
            		var chk_value = new Array();
            		$('input[name="selected"]:checked').each(function(){
            			chk_value.push($(this).val());
            		})
            		if(chk_value.length==0){
            			alert("请至少选择一条数据！");
            		}else{
	            		var warn = window.confirm("确定要重置管理员的密码吗？");
	            		if(warn){
	            			$.post({
	            				url:'${pageContext.request.contextPath}/admin/updateResetPsw.do',
	            				data:{
	            					"chk_value":chk_value,
	            				},
	            				traditional:true,
	            				success:function(data){
	            					if(data==2){
	            						$("#operate_result_info").text("重置成功！");
	                                    $("#operate_result_info").attr("class","operate_success");
	                    				$("#operate_result_info").show().delay(1000).hide(300);
	            						setTimeout('delayer()', 1400);
	            					}else if(data==1){
	            						$("#operate_result_info").text("重置成功！");
	                                    $("#operate_result_info").attr("class","operate_success");
	                    				$("#operate_result_info").show().delay(1000).hide(300);
	            					}else{
	            						$("#operate_result_info").text("重置失败！");
	                                    $("#operate_result_info").attr("class","operate_fail");
	                    				$("#operate_result_info").show().delay(1000).hide(300);
	            					}
	            					$("[name='selected']").removeAttr("checked");
	            					$("#check").removeAttr("checked");
	            				}
	            			})
	            		}
            		}
            	})
            })
            
            //退出登录
            function delayer(){
            	window.location.href="${pageContext.request.contextPath}/admin/exit.do";
            }
            
            function closeResultDiv(){
            	$("#operate_result_info").hide();
            }
          	//按钮查询
            function sub(){
            	$("#myform").attr("action","${pageContext.request.contextPath}/admin/selectAdminsByCondition.do?currentPage=1");
            	$("#myform").submit();
            }
          	//回车条件查询
            $(function(){
            	$("#rrole").keypress(function(event){
	    			var keyCode = (event.keyCode?event.keyCode:event.which);
	    			if(keyCode==13){
	    				sub();
	    			}
	    		})
            })
            //分页显示信息
            function curPage(o){
            	var totlePage = ${totlePage};
            	$(function(){
            		if(o>=1&&o<=totlePage){
                		$("#myform").attr("action","${pageContext.request.contextPath}/admin/selectAdminsByCondition.do?currentPage="+o);
            			$("#myform").submit();
                	}
            	})
            }
            $(function(){
            	$("#now").removeClass();
            })
            $(function(){
            	showResult();
            })
            document.onreadystatechange = function () {      
	            if(document.readyState=="complete") {
	            	$("#headClass2").attr("class","admin_on");
	            }     
        	} 
        </script>       
    </head>
    <body>
        <!--Logo区域开始-->
       <%@include file="../include/header.jsp" %>
        <%-- <jsp:include page="../include/header.jsp"></jsp:include> --%>
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <%@include file="../include/menu.jsp" %>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">
        	<div id="operate_result_info" ></div>
            <form id="myform" action="${pageContext.request.contextPath}/admin/modifyAdmin.do" method="post">
                <!--查询-->
                <div class="search_add">
                    <div>
                       	 模块：
                        <select id="selModules" name="power_sel" class="select_search">
                        	<option value="-1">全部</option>
                        	<c:forEach items="${listP}" var="power">
                            	<option value="${power.pow_id}" 
                            		<c:if test="${power.pow_id==powerId}">selected="selected"</c:if>
                            	>${power.pow_name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div>角色：
                    <%-- <input type="text" name="rol_name" id="rrole" <c:if test="${rolName!=''&&rolName!=null}">value="${rolName}"</c:if> class="text_search width200" /> --%>
                    	<select id="rrole" name="rol_id" class="select_search">
                        	<option value="-1">全部</option>
                        	<c:forEach items="${listR}" var="role">
                            	<option value="${role.rol_id}" 
                            		<c:if test="${role.rol_id==rolId}">selected="selected"</c:if>
                            	>${role.rol_name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div>
                    	<!-- <input type="button" value="搜索" class="btn_search" onclick="sub()"/> -->
                    	<button type="button" class="btn btn-primary btn-xs" onclick="sub()" >&nbsp;&nbsp;搜&nbsp;&nbsp;索&nbsp;&nbsp;</button>
                    </div>
                    <!-- <input type="button" value="密码重置" class="btn_add" id="reset"/>
                    <input type="button" value="增加" class="btn_add" onclick="location.href='../role/selectAllRolesToAdmin.do';" /> -->
                    <button type="button" class="btn btn-primary btn-xs " style="height:25px;width:80px" id="reset" >&nbsp;&nbsp;密码重置&nbsp;&nbsp;</button>
                    <button type="button" class="btn btn-primary btn-xs " style="height:25px;width:80px" onclick="location.href='../role/selectAllRolesToAdmin.do';" >&nbsp;&nbsp;&nbsp;&nbsp;增&nbsp;&nbsp;加&nbsp;&nbsp;&nbsp;&nbsp;</button>
                </div>
                <!--删除和密码重置的操作提示-->
                <div id="operate_result_info" class="operate_fail">
                    <img src="../images/close.png" onclick="this.parentNode.style.display='none';" />
                    <span></span><!--密码重置失败！数据并发错误。-->
                </div> 
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
                        <tr>
                            <th class="th_select_all">
                                <input id="check" type="checkbox" onclick="selectAdmins();" />
                                <span>全选</span>
                            </th>
                            <th>管理员ID</th>
                            <th>姓名</th>
                            <th>登录名</th>
                            <th>电话</th>
                            <th>电子邮件</th>
                            <th>授权日期</th>
                            <th class="width100">拥有角色</th>
                            <th></th>
                        </tr>                      
                       <c:forEach items="${listA}" var="admin">
	                       	<tr id="delete${admin.adm_id}">
	                            <td><input name="selected" type="checkbox" value="${admin.adm_id}" /></td>
	                            <td>${admin.adm_id}</td>
	                            <td>${admin.adm_name}</td>
	                            <td>${admin.adm_login}</td>
	                            <td>${admin.adm_tel}</td>
	                            <td>${admin.adm_email}</td>
	                            <td>${fn:substring(admin.adm_date,0,19)}</td>
	                            <td>
	                                <a class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);">${admin.lr[0].rol_name}</a>
	                                <!--浮动的详细信息-->
	                                <div class="detail_info">
	                                	<c:forEach items="${admin.lr}" var="role">
	                                    	${role.rol_name}
	                                    </c:forEach>
	                                </div>
	                            </td>
	                            <c:if test="${admin.adm_id!=adminId && admin.adm_id!=1}">
		                            <td class="td_modi">
		                                <input type="button" value="修改" class="btn_modify" onclick="modifyAdmin(${admin.adm_id})" />
		                                <input type="button" value="删除" class="btn_delete" onclick="deleteAdmin(${admin.adm_id})" />
		                            </td>
	                            </c:if>
	                            <c:if test="${admin.adm_id==adminId || admin.adm_id==1}">
	                            	<td class="td_modi">—</td>
	                            </c:if>
	                        </tr>
                       </c:forEach>
                    </table>
                    <input id="id" type="hidden" name="id">
                    <input type="hidden" name="currentPage" value="${currentPage}"/>
                    <c:if test="${fn:length(listA)==0}">
	           			<div id="null">
	           				<ul>
	           					<li> &nbsp;  </li>
	           					<li>很抱歉，没有找到符合条件的管理员！</li>
	           				</ul>
	           			</div>
                	</c:if>
                </div>
                <!--分页-->
                <c:if test="${fn:length(listA)!=0}">
                <div id="pages">
                	<c:if test="${currentPage!=1}">
                		<a onclick="curPage(1)">首页</a>
        	        </c:if>
                	<c:if test="${currentPage>1}">
        	        	<a onclick="curPage(${currentPage-1})" >上一页</a>
        	        </c:if>
        	        
        	        <c:if test="${totlePage==1}">
	                	<c:if test="${currentPage==1}">
	                    	<a class="current_page" onclick="curPage(${currentPage})">${currentPage}</a>
	                    </c:if>
	                </c:if>
	                <c:if test="${totlePage==2}">
	                	<c:if test="${currentPage==1}">
	                    	<a class="current_page" onclick="curPage(${currentPage})">${currentPage}</a>
							<a onclick="curPage(${currentPage+1})">${currentPage+1}</a>
	                    </c:if>
	                    <c:if test="${currentPage==2}">
							<a onclick="curPage(${currentPage-1})">${currentPage-1}</a>
	                    	<a class="current_page" onclick="curPage(${currentPage})">${currentPage}</a>
	                    </c:if>
	                </c:if>
                	<c:if test="${totlePage>=3}">
	        	        <c:if test="${currentPage==1}">
	                    	<a class="current_page" onclick="curPage(${currentPage})">${currentPage}</a>
							<a onclick="curPage(${currentPage+1})">${currentPage+1}</a>
							<a onclick="curPage(${currentPage+2})">${currentPage+2}</a>
	                    </c:if>
	                    <c:if test="${currentPage>1&&currentPage<totlePage}">
							<a onclick="curPage(${currentPage-1})">${currentPage-1}</a>
	                    	<a class="current_page" onclick="curPage(${currentPage})">${currentPage}</a>
							<a onclick="curPage(${currentPage+1})">${currentPage+1}</a>
	                    </c:if>
	                    <c:if test="${currentPage==totlePage}">
	                    	<a onclick="curPage(${currentPage-2})">${currentPage-2}</a>
							<a onclick="curPage(${currentPage-1})">${currentPage-1}</a>
	                    	<a class="current_page" onclick="curPage(${currentPage})">${currentPage}</a>
	                    </c:if>
	                </c:if>
	                
                    <c:if test="${currentPage<totlePage}">
	                    <a onclick="curPage(${currentPage+1})" >下一页</a>
                    </c:if>
                    <c:if test="${currentPage!=totlePage}">
                    	<a onclick="curPage(${totlePage})">末页</a>
                    </c:if>&nbsp;
                    <span>第${currentPage}页/共${totlePage}页</span>&nbsp;
                    <span>共${totalRecord}条记录</span>
                </div>
                </c:if>
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>
