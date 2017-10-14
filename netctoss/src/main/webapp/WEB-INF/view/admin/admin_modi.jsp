<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <%@include file="/WEB-INF/view/include/css.jsp" %>
        <script language="javascript" type="text/javascript">
         /*    //保存成功的提示消息
         function showResult() {
         	var temp = '${requestScope.msg}';
         	if(temp!=""){
         		showResultDiv(temp);
         	}           
             window.setTimeout("closeResultDiv()", 1000);
         }
         function showResultDiv(flag) {
             if (flag){
            	 $("#save_result_info").show();
            	 $("#save_result_info").append("修改成功！");
            	 $("#save_result_info").attr("class","save_success");
             }else{
            	 $("#save_result_info").show();
            	 $("#save_result_info").append("修改失败！");
            	 $("#save_result_info").attr("class","save_fail");
             }
         }
         function closeResultDiv(){
         	$("#save_result_info").hide();
         }
         $(function(){
        	if('${requestScope.msg}'!=null){
        		showResult()
        	}
	     }) */
	     $(function(){
	    	 $("#adm_name").blur(function(){
	    		 var value = $("#adm_name").val();
	        	 var regs = /^[0-9a-zA-Z\u4e00-\u9fa5]{1,20}$/;
	        	 if(!regs.test(value)&&$("#nameWarn").length<=0){
	        		$("#nameSucc").remove();
	         	 	$("#nameTest").after("<div class='validate_msg_long error_msg' id='nameWarn'>20长度以内的汉字、字母、数字的组合(不能含有空格)</div>");
	         	 }else{
	         		$("#nameWarn").remove();
	         		$("#nameTest").after("<div class='validate_msg_long success' id='nameSucc'></div>");
					$("#nameSucc").html("&nbsp");
	         	 }
	    	 });
	    	 $("#adm_name").focus(function(){
	    		 $("#nameWarn").remove();
	    		 $("#nameSucc").remove();
	    	 })
	    	 $("#adm_tel").blur(function(){
	    		 var value = $("#adm_tel").val();
	    		 var regs = /^[1-9][0-9]{10}$/;
	    		 if(!regs.test(value)&&$("#telWarn").length<=0){
	    			 $("#telSucc").remove();
	    			 $("#telTest").after("<div class='validate_msg_long error_msg' id='telWarn'>正确的电话号码格式：手机或固话</div>");
	    		 }else{
	    			 $("#telWarn").remove();
		         	 $("#telTest").after("<div class='validate_msg_long success' id='telSucc'></div>");
					 $("#telSucc").html("&nbsp");
	    		 }
	    	 })
	    	 $("#adm_tel").focus(function(){
	    		 $("#telWarn").remove();
	    		 $("#telSucc").remove();
	    	 })
	    	 $("#adm_email").blur(function(){
	    		 var value = $("#adm_email").val();
	    		 var regs = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+$/;
	    		 if(!regs.test(value)&&$("#emailWarn").length<=0){
	    			 $("#emailSucc").remove();
	    			 $("#emailTest").after("<div class='validate_msg_medium error_msg' id='emailWarn'>50长度以内，正确的 email 格式</div>");
	    		 }else{
	    			 $("#emailWarn").remove();
		         	 $("#emailTest").after("<div class='validate_msg_long success' id='emailSucc'></div>");
					 $("#emailSucc").html("&nbsp");
	    		 }
	    	 })
	    	 $("#adm_email").focus(function(){
	    		 $("#emailWarn").remove();
	    	 })
	    	 $("input[name='roleInfo']").click(function(){
	    		$("#roleWarn").remove();
	    	 })
	     })
	     function sub(){
        	 $(function(){
        		 if($("#nameWarn").length<=0&&$("#telWarn").length<=0&&$("#emailWarn").length<=0&&$("#adm_name").val()!=""&&$("#adm_tel").val()!=""&&$("#adm_email").val()!=""){
        			 var i = 0;
        			 $('input[name="roleInfo"]:checked').each(function(){
        				 i ++;
             		 })
        			 if(i > 0){
        				 $("#save_result_info").text("修改成功！");
                         $("#save_result_info").attr("class","save_success");
         				 $("#save_result_info").show().delay(1000).hide(300);
 						 setTimeout('subInput()', 1400);
        			 }else if($("#roleWarn").length<=0){
        				 $("#roleSucc").remove();
        				 $("#roleTest").after("<div class='validate_msg_tiny error_msg' id='roleWarn'>至少选择一个</div>");
        			 }
        		 }else{
        			 var i = 0;
        			 $('input[name="roleInfo"]:checked').each(function(){
        				 i ++;
             		 })
             		 if(i > 0){
        			 	$("#roleWarn").remove();
             		 }
        		 }
        	 })
         }
         
         //表单数据提交
	     function subInput(){
	    	 $("#myform").submit();
	     }
       
         document.onreadystatechange = function () {      
             if(document.readyState=="complete") {
             	$("#headClass2").attr("class","admin_on");
             }     
         } 
        </script>
    </head>
    <body>
        <!--Logo区域-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--导航区域开始-->
        <%@include file="/WEB-INF/view/include/menu.jsp" %>   
        <div id="main">            
            <div id="save_result_info"></div>
            <form action="${pageContext.request.contextPath }/admin/updateInfoByAdmin.do" id="myform" method="get" class="main_form">
                    <input type="hidden" name="adm_id" value="${admin_id.adm_id}"/>
                    <div class="text_info clearfix"><span>姓名：</span></div>
                    <div class="input_info">
                        <input id="adm_name" name="adm_name" type="text" value="${admin_id.adm_name}"/>
                        <span class="required" id="nameTest">*</span>
                    </div>
                    <div class="text_info clearfix"><span>管理员账号：</span></div>
                    <div class="input_info"><input type="text" readonly="readonly" name="adm_login" class="readonly" value="${admin_id.adm_login}"  /></div>
                    <div class="text_info clearfix"><span>电话：</span></div>
                    <div class="input_info">
                        <input id="adm_tel" name="adm_tel" type="text" value="${admin_id.adm_tel}"/>
                        <span class="required" id="telTest">*</span>
                    </div>
                    <div class="text_info clearfix"><span>Email：</span></div>
                    <div class="input_info">
                        <input id="adm_email" name="adm_email" type="text" class="width200" value="${admin_id.adm_email}"/>
                        <span class="required" id="emailTest">*</span>
                    </div>
                    <div class="text_info clearfix"><span>角色：</span></div>
                    <div class="input_info_high">
                        <div class="input_info_scroll">
                            <ul>
                            	<c:forEach items="${allRole}" var="role">
                       				<li><input type="checkbox" value="${role.rol_id}" 
	                       			<c:forEach items="${admin_id.lr}" var="lr">
	                       				<c:if test="${role.rol_id==lr.rol_id}">checked="checked"</c:if>
	                       			</c:forEach>
                       				name="roleInfo"/>${role.rol_name}
                       				</li>
                        		</c:forEach>
                            </ul>
                        </div>
                        <span class="required" id="roleTest">*</span>
                    </div>
                    <div class="button_info clearfix">
                        <!-- <input type="button" value="保存" class="btn_save" onclick="sub()" />
                        <input type="button" value="取消" class="btn_save" onclick="location.href='../admin/adminAllAdmins.do'"/> -->
                        <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="sub()" >&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='../admin/adminAllAdmins.do'" >&nbsp;&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;</button>
                    </div>
                </form>  
        </div>
        <div id="footer">
           
        </div>
    </body>
</html>
