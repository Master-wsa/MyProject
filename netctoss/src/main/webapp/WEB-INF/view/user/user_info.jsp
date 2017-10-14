<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <%@include file="/WEB-INF/view/include/css.jsp" %>
        <script language="javascript" type="text/javascript">
        	var nametest = true;
        	var phonetest = true;
        	var mailtest = true;
	        document.onreadystatechange = function () {      
	            if(document.readyState=="complete") {
	            	$("#headClass8").attr("class","information_on");
	            }     
	        } 
        	$(function(){
        		$("#adm_name").change(function(){
            		var reg = /^[\u4e00-\u9fa5A-Za-z0-9]{1,20}$/
               		var name = $("#adm_name").val();
               		if(!reg.test(name)){
               			$("#namefeet").hide();
               			$("#nameDiv").show();
               			nametest = false;
               		}else{
               			$("#nameDiv").hide();
               			$("#namefeet").show();
               			nametest = true;
               		}
               	})
               	$("#adm_tel").change(function(){
        		var reg = /^((0\d{10})|(1[3584]\d{9}))$/
           		var phone = $("#adm_tel").val();
           		if(!reg.test(phone)&&phone!=''){
           			$("#phonefeet").hide();
           			$("#phoneDiv").show();
           			phonetest = false;
           		}else{
           			$("#phoneDiv").hide();
           			$("#phonefeet").show();
           			phonetest = true;
           		}
           	})
           	$("#adm_mail").change(function(){
        		var reg =  /^\w+@\w+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$/
           		var mail = $("#adm_mail").val();
           		if(!reg.test(mail)&&mail!=''){
           			$("#mailfeet").hide();
           			$("#mailDiv").show();
           			mailtest = false;
           		}else{
           			$("#mailDiv").hide();
           			$("#mailfeet").show();
           			mailtest = true;
           		}
           	})
        		$("#nameDiv").hide();
        		$("#mailDiv").hide();
        		$("#phoneDiv").hide();
        		$("#namefeet").hide();
        		$("#phonefeet").hide();
        		$("#mailfeet").hide();
        		$("#save_result_info").hide();
        		var a = '';
        		<c:forEach var="role" items="${adm.lr}"> 
                	a=a+'${role.rol_name}  ';
				</c:forEach>
				$("#role").val(a);
   	            $("#sub").click(function(){
   	            	if(phonetest&&mailtest&&nametest&&$("#adm_name").val()!=''){
   	            		$.post({
   	   	            		url : "${pageContext.request.contextPath}/admin/updateAdminInfo.do",
   	   	            		data : $("#myform").serialize(),
   	   	            		success : function(result){
   	   	            			if(result){
   	   	            				$("#username").html($("#adm_name").val());
   		            				$("#save_result_info").attr("class","save_success");
   		            				$("#save_result_info").html("修改成功！");
   		            				$("#save_result_info").show();
   		            				$("#save_result_info").delay(3000).hide(0);
   		            			}else{
   		            				$("#save_result_info").attr("class","save_fail");
   		            				$("#save_result_info").html("修改失败！");
   		            				$("#save_result_info").show();
   		            				$("#save_result_info").delay(3000).hide(0);	
   		            			}
   	   	            		}
   	   	            	})
   	            	}else{
   	            		/* $("#save_result_info").attr("class","save_fail");
           				$("#save_result_info").html("输入有误！");
           				$("#save_result_info").show();
           				$("#save_result_info").delay(3000).hide(0);	 */
   	            		if(!mailtest){
   	            			$("#mailDiv").show();
   	            		}
   	            		if(!phonetest){
   	            			$("#phoneDiv").show();
   	            		}
   	            		if(!nametest){
   	            			$("#nameDiv").show();
   	            		}
   	            	}
   	            })
        	})
        	function cancel(){
        		$("#adm_name").val("${sessionScope.adm.adm_name}");
        		$("#adm_tel").val("${sessionScope.adm.adm_tel}");
        		$("#adm_email").val("${sessionScope.adm.adm_email}");
        		$("#nameDiv").hide();
        		$("#mailDiv").hide();
        		$("#phoneDiv").hide();
        		$("#namefeet").hide();
        		$("#phonefeet").hide();
        		$("#mailfeet").hide();
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
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info"></div>
           <%--  <div id="save_result_info" class="${requestScope.msgcss}" style="display:${requestScope.msgdisplay}">${requestScope.msg }</div> --%>
            <form id="myform" class="main_form">
                <div class="text_info clearfix"><span>管理员账号：</span></div>
                <div class="input_info"><input name="adm_login" type="text" readonly="readonly" class="readonly width250" value="${sessionScope.adm.adm_login }" /></div>
                <div class="text_info clearfix"><span>角色：</span></div>
                <div class="input_info">
                    <input id="role" type="text" readonly="readonly" class="readonly width250"  />
                </div>
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input id="adm_name" class="width250" name="adm_name" type="text" value="${sessionScope.adm.adm_name}" />
                    <span class="required">*</span>
                    <div class="validate_msg_medium success" id="namefeet"  style="display:none;">&nbsp;</div>
                    <div id="nameDiv" class="validate_msg_medium error_msg">20长度以内的汉字、字母的组合</div>
                </div>
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input id="adm_tel" name="adm_tel" type="text" class="width250" value="${sessionScope.adm.adm_tel}" />
                    <div class="validate_msg_medium success" id="phonefeet"  style="display:none;">&nbsp;</div>
                    <div id="phoneDiv" class="validate_msg_medium error_msg">电话号码格式：手机或固话</div>
                </div>
                <div class="text_info clearfix"><span>Email：</span></div>
                <div class="input_info">
                    <input id="adm_mail" name="adm_email" type="text" class="width250" value="${sessionScope.adm.adm_email }" />
                    <div class="validate_msg_medium success" id="mailfeet"  style="display:none;width:">&nbsp;</div>
                    <div id="mailDiv" class="validate_msg_medium error_msg">50长度以内，符合 email 格式</div>
                </div>
                <div class="text_info clearfix"><span>创建时间：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly width250" value="${fn:substring(sessionScope.adm.adm_date, 0, 19)}"/></div>
                <div class="button_info clearfix">
                    <%-- <input id="sub" type="button" value="保存" class="btn_save"  />
                    <input type="button" value="取消" class="btn_save" onclick="location.href='${pageContext.request.contextPath}/role/rediectIndex.do'" /> --%>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" id="sub" >&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="cancel()" >&nbsp;&nbsp;取&nbsp;&nbsp;消&nbsp;&nbsp;</button>
                </div>
                <input type="hidden" name="adm_id" value="${sessionScope.adm.adm_id}" >
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>
