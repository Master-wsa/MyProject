<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
        <title></title>
        <%@include file="/WEB-INF/view/include/css.jsp" %>
        <style type="text/css">
        	#null{text-align: center;}
        	ul li{  font-size:2em; text-align:center; font-family:'BebasNeueRegular', Arial, Helvetica, sans-serif; } 
		</style>
        <script language="javascript" type="text/javascript">
        	$(function(){
        		$(".bt").css({
        			"padding":"3px 12px"
        		})
        		/* $(".tx").css({
        			"height":"29px"
        		}) */
        		showResult();
        	})
        	function showResult(){
        		var result = $("#yn").val()
        		if(result==1){
        			$("#operate_result_info").html("开通账务账号成功")
        			$("#operate_result_info").show().delay(1500).hide(300);
        			/* window.setTimeout(function(){$("#operate_result_info").delay(1000).hide()}, 1500); */
        		}else if(result==2){
        			$("#operate_result_info").html("删除账务账号成功")
        			$("#operate_result_info").show().delay(1500).hide(300);
        			/* window.setTimeout(function(){$("#operate_result_info").delay(1000).hide()}, 1500); */
        		}else if(result==3){
        			$("#operate_result_info").html("暂停账务账号成功")
        			$("#operate_result_info").show().delay(1500).hide(300);
        		/* 	window.setTimeout(function(){$("#operate_result_info").delay(1000).hide()}, 1500); */
        		}else if(result==4){
        			$("#operate_result_info").removeClass()
        			$("#operate_result_info").addClass("save_fail");
        			$("#operate_result_info").html("该账务账号下已有业务开通,不能删除")
        			$("#operate_result_info").show().delay(1500).hide(300);
        			/* window.setTimeout(function(){$("#operate_result_info").delay(1000).hide()}, 1500); */
        		}
        		
        	}
	        document.onreadystatechange = function () {      
	            if(document.readyState=="complete") {
	            	$("#headClass4").attr("class","account_on");
	            }     
	        } 
            function curPage(curPage){
            	location.href="${pageContext.request.contextPath}/account/getAccountByCondition.do?acc_idc=${acc_idc}&acc_name=${acc_name}&acc_login=${acc_login}&acc_state=${acc_state}&curPage="+curPage;
            }
        	//删除
            function deleteAccount(id,curPage) {
                var r = window.confirm("确定要删除此账务账号吗？");
                if(r){
                	 $("#mymsg").attr("name","id");
            		 $("#mymsg").val(id);
            		 $("#mysta").val("2");
            		 $("#myform").attr("action","${pageContext.request.contextPath}/account/changeAccountState.do?acc_idc=${acc_idc}&acc_name=${acc_name}&acc_login=${acc_login}&acc_state=${acc_state}&curPage="+curPage);
            		 $("#myform").submit();
                }
            }
            //开通或暂停
            function setState(state,id,curPage) {
                if(state.className=="btn_start"){
                	 var r = window.confirm("确定要开通此账号吗？");
                	 if(r){
                		 $("#mymsg").attr("name","id");
                		 $("#mymsg").val(id);
                		 $("#mysta").val("1");
                		 $("#myform").attr("action","${pageContext.request.contextPath}/account/changeAccountState.do?acc_idc=${acc_idc}&acc_name=${acc_name}&acc_login=${acc_login}&acc_state=${acc_state}&curPage="+curPage);
                		 $("#myform").submit(); 
                	 }
                }
                if(state.className=="btn_pause"){
               	 var r = window.confirm("确定要暂停此账号吗？");
               	 if(r){
               		 $("#mymsg").attr("name","id");
	           		 $("#mymsg").val(id);
	           		 $("#mysta").val("0");
	           		 $("#myform").attr("action","${pageContext.request.contextPath}/account/changeAccountState.do?acc_idc=${acc_idc}&acc_name=${acc_name}&acc_login=${acc_login}&acc_state=${acc_state}&curPage="+curPage);
	           		 $("#myform").submit(); 
               	 }
               	}
            }
            //搜索功能
            function search(){
            	$("#myform").attr("action","${pageContext.request.contextPath}/account/getAccountByCondition.do");
            	$("#myform").submit(); 
            }
        </script>
    </head>
    <body>
        <!--Logo区域开始-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--导航区域开始-->
        <%@include file="/WEB-INF/view/include/menu.jsp" %>
        <!--主要区域开始-->
        <div id="main">
       	 	<div id="save_result_info" class="save_success"></div>
            <div id="operate_result_info" class="operate_success"></div>
            <form id="myform" action="" method="post">
                <!--查询-->
                <div class="search_add">                        
                    <div>身份证：<input type="text"  class="tx text_search " value="${acc_idc }" name="acc_idc"/></div>                            
                    <div>姓名：<input type="text" class="tx width70 text_search" value="${acc_name }" name="acc_name" /></div>
                    <div>登录名：<input type="text"   class="tx text_search" value="${acc_login }" name="acc_login"/></div>
                    <div>
                       	 状态：
                        <select class="select_search tx" name="acc_state">
                            <option value="-1">全部</option>
                            <option value="1" <c:if test="${acc_state==1 }">selected="selected" </c:if> >开通</option>
                            <option value="0" <c:if test="${acc_state==0 }">selected="selected" </c:if> >暂停</option>
                            <option value="2" <c:if test="${acc_state==2 }">selected="selected" </c:if> >删除</option>
                        </select>
                    </div>
                   <div>
                  <!--  <button type="button" class="bt btn btn-primary" onclick="search()" >搜索</button> -->
                   <button type="button" class="btn btn-primary btn-xs" onclick="search()" >&nbsp;&nbsp;搜&nbsp;&nbsp;索&nbsp;&nbsp;</button>
                   </div>
                 <!--  <div> <input type="button" value="搜索" class="btn_search" onclick="search()" /></div> -->
                    <%-- <button type="button" class="bt btn btn-primary"  onclick="location.href='${pageContext.request.contextPath}/account/addAccJsp.do';"  >增加</button> --%>
                  <%--   <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/account/addAccJsp.do';" /> --%>
                 	<button type="button" class="btn btn-primary btn-xs " style="height:25px;width:80px" onclick="location.href='${pageContext.request.contextPath}/account/addAccJsp.do';" >&nbsp;&nbsp;&nbsp;&nbsp;增&nbsp;&nbsp;加&nbsp;&nbsp;&nbsp;&nbsp;</button>
                </div>  
                <!--删除等的操作提示-->
                <div id="operate_result_info"></div>   
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
                    <tr>
                        <th width="50">账号ID</th>
                        <th width="120">姓名</th>
                        <th class="width150">身份证</th>
                        <th width="100">登录名</th>
                        <th width="50">状态</th>
                        <th class="width100">创建日期</th>
                        <th class="width150">上次登录时间</th>                                                        
                        <th class="width200"></th>
                    </tr>
                   	<c:forEach items="${accountlist}" var="act">
                   		 <tr>
	                        <td >${act.acc_id }</td>
	                        <td ><a href="${pageContext.request.contextPath}/account/detailAccount.do?acc_id=${act.acc_id}">${act.acc_name }</a></td>
	                        <td >${act.acc_idc }</td>
	                        <td >${act.acc_login }</td>
	                       	<c:choose>
	                       		<c:when test="${act.acc_state==0 }">
	                       			<td >暂停</td>
	                       		</c:when>
	                       		<c:when test="${act.acc_state==1 }">
	                       			<td >开通</td>
	                       		</c:when>
	                       		<c:when test="${act.acc_state==2 }">
	                       			<td >删除</td>
	                       		</c:when>
	                       	</c:choose>
	                        <td >${fn:substring(act.acc_stime, 0, 10)} </td>
	                        <td >${fn:substring(act.acc_initime, 0, 19)} <c:if test="${act.acc_initime==null }">—</c:if> </td>                            
	                        <td class="td_modi">
	                       		<c:choose>
	                           		<c:when test="${act.acc_state==0 }">
	                           			 <input type="button" value="开通" class="btn_start" onclick="setState(this,${act.acc_id},${curPage });" />
	                            		<input type="button" value="修改" class="btn_modify" onclick="location.href='${pageContext.request.contextPath}/account/modiAccount.do?acc_id=${act.acc_id }';" />
	                            		<input type="button" value="删除" class="btn_delete" onclick="deleteAccount(${act.acc_id },${curPage });" />
	                           		</c:when>
	                           		<c:when test="${act.acc_state==1 }">
	                           			<input type="button" value="暂停" class="btn_pause" onclick="setState(this,${act.acc_id},${curPage });" />
	                            		<input type="button" value="修改" class="btn_modify" onclick="location.href='${pageContext.request.contextPath}/account/modiAccount.do?acc_id=${act.acc_id }';" />
	                            		<input type="button" value="删除" class="btn_delete" onclick="deleteAccount(${act.acc_id },${curPage });" />
	                           		</c:when>
	                           		<c:when test="${act.acc_state==2 }">—
	                           		</c:when>
	                           	</c:choose>	                           
	                        </td>
                    	</tr> 
                    	
                   	</c:forEach>  
                </table>
               <c:if test="${fn:length(accountlist)==0}">
           			<div id="null">
           				<ul>
           					<li> &nbsp;  </li>
           					<li>很抱歉，没有找到符合条件的账务账号！</li>
           				</ul>
           			</div>
                </c:if>
                </div> 
				<!--分页-->
                <div id="pages">
                	<c:if test="${curPage!=1}">
	                    <a href="#" onclick="curPage(1)">首页</a>
	        	        <a href="#" <c:if test="${curPage!=1}">onclick="curPage(${curPage-1})"</c:if> >上一页</a>
					</c:if>
					<c:if test="${curPage==count&&count>=3}">
        	        	<a href="#"  onclick="curPage(${curPage-2})">${curPage-2 }</a>
                    </c:if>
        	        <c:if test="${curPage-1>0}">
        	        	<a href="#"  onclick="curPage(${curPage-1})">${curPage-1 }</a>
                    </c:if>
                    <c:if test="${fn:length(accountlist)!=0}">
                    	<a href="#" class="current_page" onclick="curPage(${curPage})">${curPage }</a>
                   	</c:if>
                    <c:if test="${curPage+1<=count}">
                    	<a href="#" onclick="curPage(${curPage+1})">${curPage+1}</a>
                    </c:if>
                    <c:if test="${curPage==1&&count>=3 }">
                    	<a href="#" onclick="curPage(${curPage+2})">${curPage+2}</a>
                    </c:if>
                    
                    <%-- <c:forEach var="cur" begin="1" end="${ count}">
                    	<a href="#" <c:if test="${cur==curPage}">class="current_page"</c:if>onclick="curPage(${cur})" >${cur}</a>
                    </c:forEach> --%>
                    <c:if test="${curPage!=count}">
	                    <a href="#" <c:if test="${curPage!=count}">onclick="curPage(${curPage+1})"</c:if> >下一页</a>
	                    <a href="#" onclick="curPage(${count})">末页</a>
                	</c:if>
                	<c:if test="${fn:length(accountlist)!=0}">
                		<span>&nbsp;&nbsp;&nbsp;&nbsp;第${curPage}页/共${count }页</span>
                		<span>&nbsp;&nbsp;&nbsp;&nbsp;共${all }条记录</span>
                	</c:if>
                </div>   
                <input id="mymsg" type="hidden">
                <input id="mysta" name="sta" type="hidden">     
                <input id="yn" value="${yn}" type="hidden"> 
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
            
        </div>
    </body>
</html>