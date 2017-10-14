<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
       	<%@include file="/WEB-INF/view/include/css.jsp" %>
        <script language="javascript" type="text/javascript">
            //提交修改
            function modi(id){
            	$("#myform").attr("action","${pageContext.request.contextPath }/role/toUpdateRole.do?upd_id="+id);
            	$("#myform").submit();
            }
            //删除角色
            function deleteRole(id){
            	var r = window.confirm("确定要删除该角色吗？");
            	if(r==1){
	            	$.post({
	            		url:'${pageContext.request.contextPath }/role/deleteRole.do',
	            		data:{
	            			'del_id':id,
	            		},
	            		traditional:true,
	            		success:function(result){
	            			if(result==1){
	            				$("#role"+id).css("background-color","blue");
	            				$("#role"+id).hide(1000);
	            			}else if(result==2){
	            				$("#operate_result_info").text("对不起！该角色正在使用，不能删除！");
	                            $("#operate_result_info").attr("class","operate_fail");
	            				$("#operate_result_info").show().delay(1200).hide(500);
	            			}else if(result==0){
	                            $("#operate_result_info").text("删除失败！");
	                            $("#operate_result_info").attr("class","operate_fail");
	            				$("#operate_result_info").show().delay(1200).hide(500);
	                		}
	            		}
	            	})
            	}
            }
            //删除提示消息
         /*  function showResult() {
                if("${requestScope.msg}"!=""){
                	showResultDiv("${requestScope.msg}");
                }
                window.setTimeout("closeResultDiv()", 1000);
            }  */
           /* function showResult() {
           		var temp = "${success}";
           		if("true".equals(temp)){
		            window.location.reload();
           		} else{
		            alert("删除失败！");
                }          
               /*  window.setTimeout("closeResultDiv()", 1000); */
           /*  function showResultDiv(flag) {
                //var divResult = document.getElementById("operate_result_info");
                if (flag){
                    $("#operate_result_info").show();
                    $("#operate_result_info").text("删除成功！");
                    $("#operate_result_info").attr("class","operate_success");
                }else{
                	$("#operate_result_info").show();
                    $("#operate_result_info").text("删除失败！");
                    $("#operate_result_info").attr("class","operate_fail");
                }
            } */
           /*  function closeResultDiv(){
            	$("#operate_result_info").hide();
            } */
            /* $(function(){
            	showResult();
            }) */
            document.onreadystatechange = function () {      
               if(document.readyState=="complete") {
               	   $("#headClass1").attr("class","role_on");
               }     
            } 
        </script>
    </head>
    <body>
        <!--Logo区域开始-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <%@include file="/WEB-INF/view/include/menu.jsp" %>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">
        	<div id="operate_result_info" ></div>
            <form id="myform" action="" method="post">
                <!--查询-->
                <div class="search_add">
                    <%-- <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/role/toAddRole.do';"/> --%>
                    <button type="button" class="btn btn-primary btn-xs " style="height:25px;width:80px" onclick="location.href='${pageContext.request.contextPath}/role/toAddRole.do';" >&nbsp;&nbsp;&nbsp;&nbsp;增&nbsp;&nbsp;加&nbsp;&nbsp;&nbsp;&nbsp;</button>
                </div>     
                <!--数据区域：用表格展示数据-->     
                <div id="data">                      
                    <table id="datalist">
                        <tr>                            
                            <th>角色 ID</th>
                            <th>角色名称</th>
                            <th class="width600">拥有的权限</th>
                            <th class="td_modi"></th>
                        </tr>                      
                        <c:forEach items="${l_all_role}" var="role">
                        	<tr id="role${role.rol_id}">
                        		<td>${role.rol_id}</td>
                            	<td>${role.rol_name}</td>
                            	<td>${role.powers}</td>
                            	<c:if test="${role.rol_id!=1}">
	                            	<td>
	                                	<input type="button" value="修改" class="btn_modify" onclick="modi(${role.rol_id})" />
	                                	<input type="button" value="删除" class="btn_delete" onclick="deleteRole(${role.rol_id})" />
	                           		</td>
                           		</c:if>
                           		<c:if test="${role.rol_id==1}"><td>—</td></c:if>
                        	</tr>
                        </c:forEach>
                        <input id="selrole"  type="hidden" name="hid">
                    </table>
                </div> 
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>
