<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
       	<%@include file="../include/css.jsp" %>
        <script language="javascript" type="text/javascript">
	     //表单验证
	     $(function(){
	    	 $("#adm_name").blur(function(){
	    		 var value = $("#adm_name").val();
	        	 var regs = /^[0-9a-zA-Z\u4e00-\u9fa5]{1,20}$/;
	        	 if(!regs.test(value)&&$("#nameWarn").length<=0){
	        		$("#nameSucc").remove();
	         	 	$("#nameTest").after("<div class='validate_msg_medium error_msg' id='nameWarn'>20长度以内的汉字、字母、数字的组合(不能含有空格)</div>");
	         	 }else{
	         		$("#nameWarn").remove();
	         		$("#nameTest").after("<div class='validate_msg_long success' id='nameSucc'></div>");
					$("#nameSucc").html("&nbsp");
	         	 }
	    	 });
	    	 $("#adm_name").focus(function(){
	    		 $("#nameSucc").remove();
	    		 $("#nameWarn").remove();
	    	 })
	    	 $("#adm_login").blur(function(){
	    		 var value = $("#adm_login").val();
	    		 var regs = /^[0-9a-zA-Z_]{1,30}$/;
	    		 if(!regs.test(value)&&$("#loginWarn").length<=0){
	    			 $("#loginSucc").remove();
	    			 $("#loginTest").after("<div class='validate_msg_medium error_msg' id='loginWarn'>30长度以内的字母、数字和下划线的组合(不能含有空格)</div>");
	    			 return false;
	    		 }
	    		 $.post({
    				 url:'${pageContext.request.contextPath}/admin/selectAdminByAccount.do',
    				 data:{
    					 'adm_login':$("#adm_login").val(),
    				 },
    				 tradition:true,
    				 success:function(result){
    					 if(result=="yes"){
     						 $("#loginWarn").remove();
     						 $("#loginTest").after("<div class='validate_msg_long success' id='loginSucc'></div>");
     						 $("#loginSucc").html("&nbsp");
    					 }else if($("#loginWarn").length<=0){
    						 $("#loginSucc").remove();
    						 $("#loginTest").after("<div class='validate_msg_medium error_msg' id='loginWarn'>对不起，该账号已存在！</div>");
    					 }
    				 }
    			 })
	    	 })
	    	 $("#adm_login").focus(function(){
	    		 $("#loginSucc").remove();
	    		 $("#loginWarn").remove();
	    	 })
	    	 $("#adm_pwd").blur(function(){
	    		 var value = $("#adm_pwd").val();
	    		 var regs = /^[0-9a-zA-Z_]{6,30}$/;
	    		 if(!regs.test(value)&&$("#pwdWarn").length<=0){
	    			 $("#pwdSucc").remove();
	    			 $("#pwdTest").after("<div class='validate_msg_medium error_msg' id='pwdWarn'>请输入6-30个长度的字母、数字和下划线的组合</div>");
	    		 }else{
	    			 $("#pwdWarn").remove();
		         	 $("#pwdTest").after("<div class='validate_msg_long success' id='pwdSucc'></div>");
					 $("#pwdSucc").html("&nbsp");
	    		 }
	    	 })
	    	 $("#adm_pwd").focus(function(){
	    		 $("#pwdSucc").remove();
	    		 $("#pwdWarn").remove();
	    	 })
	    	 $("#repwd").blur(function(){
	    		 var value = $("#repwd").val();
	    		 if(value!=$("#adm_pwd").val()){
	    			 $("#repwdSucc").remove();
	    			 $("#repwdTest").after("<div class='validate_msg_medium error_msg' id='repwdWarn'>两次密码必须相同</div>");
	    		 }else{
	    			 $("#repwdWarn").remove();
		         	 $("#repwdTest").after("<div class='validate_msg_long success' id='repwdSucc'></div>");
					 $("#repwdSucc").html("&nbsp");
	    		 }
	    	 })
	    	 $("#repwd").focus(function(){
	    		 $("#repwdSucc").remove();
	    		 $("#repwdWarn").remove();
	    	 })
	    	 $("#adm_tel").blur(function(){
	    		 var value = $("#adm_tel").val();
	    		 var regs = /^[1-9][0-9]{10}$/;
	    		 if(!regs.test(value)&&$("#telWarn").length<=0){
	    			 $("#telSucc").remove();
	    			 $("#telTest").after("<div class='validate_msg_medium error_msg' id='telWarn'>请输入正确的电话号码格式：手机或固话</div>");
	    		 }else{
	    			 $("#telWarn").remove();
		         	 $("#telTest").after("<div class='validate_msg_long success' id='telSucc'></div>");
					 $("#telSucc").html("&nbsp");
	    		 }
	    	 })
	    	 $("#adm_tel").focus(function(){
	    		 $("#telSucc").remove();
	    		 $("#telWarn").remove();
	    	 })
	    	 $("#adm_email").blur(function(){
	    		 var value = $("#adm_email").val();
	    		 var regs = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+$/;
	    		 if(!regs.test(value)&&$("#emailWarn").length<=0){
	    			 $("#emailSucc").remove();
	    			 $("#emailTest").after("<div class='validate_msg_medium error_msg' id='emailWarn'>请输入正确的 email 格式</div>");
	    		 }else{
	    			 $("#emailWarn").remove();
		         	 $("#emailTest").after("<div class='validate_msg_long success' id='emailSucc'></div>");
					 $("#emailSucc").html("&nbsp");
	    		 }
	    	 })
	    	 $("#adm_email").focus(function(){
	    		 $("#emailSucc").remove();
	    		 $("#emailWarn").remove();
	    	 })
	    	 $("input[name='role']").click(function(){
	    		$("#roleWarn").remove();
	    	 })
	     })
	     $(function(){
	     	$("#file").change(function(){
	     		var form = new FormData($("#myform")[0]);
	     		$.post({
	     			url:'${pageContext.request.contextPath}/admin/testImage.do',
	     			data:form,
	     			async : false,
	     	        cache : false,
	     			processData:false,
	     			contentType:false,
	     			tradition:true,
	     			success:function(result){
	     				if(result!="yes"&&$("#imageWarn").length<=0){
	     					$("#imageSucc").remove();
	     					$("#fileTest").after("<div class='validate_msg_medium error_msg' id='imageWarn'>对不起，图片大小不能超过400*400px！</div>");
	     				}
	     				else if(result=="yes"){
	     					$("#imageWarn").remove();
	     					if($("#imageSucc").length<=0){
	     						$("#fileTest").after("<div class='validate_msg_long success' id='imageSucc'></div>");
	    						$("#imageSucc").html("&nbsp");
	     					}
	     				}else{
	     					$("#imageWarn").remove();
	     					if($("#imageSucc").length<=0){
	     						$("#fileTest").after("<div class='validate_msg_long success' id='imageSucc'></div>");
	    						$("#imageSucc").html("&nbsp");
	     					}
	     				}
	     			}
	     		})
	     	})
	     })
         function sub(){
	    	 if($("#nameWarn").length>0||$("#loginWarn").length>0||
        			 $("#imageWarn").length>0||$("#pwdWarn").length>0||
        			 $("#repwdWarn").length>0||$("#telWarn").length>0||
        			 $("#emailWarn").length>0){
	    		 return false;
	    	 }
	    	 if($("#adm_name").val()==""){
	    		 $("#nameWarn").remove();
	    		 $("#nameSucc").remove();
	    		 $("#nameTest").after("<div class='validate_msg_medium error_msg' id='nameWarn'>输入信息不能为空</div>");
	    		 return false;
	    	 }
	    	 if($("#adm_login").val()==""){
	    		 $("#loginWarn").remove();
	    		 $("#loginSucc").remove();
	    		 $("#loginTest").after("<div class='validate_msg_medium error_msg' id='loginWarn'>输入信息不能为空</div>");
	    		 return false;
	    	 }
	    	 if($("#adm_pwd").val()==""){
	    		 $("#pwdWarn").remove();
	    		 $("#pwdSucc").remove();
	    		 $("#pwdTest").after("<div class='validate_msg_medium error_msg' id='pwdWarn'>输入信息不能为空</div>");
	    		 return false;
	    	 }
	    	 if($("#adm_tel").val()==""){
	    		 $("#telWarn").remove();
	    		 $("#telSucc").remove();
	    		 $("#telTest").after("<div class='validate_msg_medium error_msg' id='telWarn'>输入信息不能为空</div>");
	    		 return false;
	    	 }
	    	 if($("#adm_email").val()==""){
	    		 $("#emailWarn").remove();
	    		 $("#emailSucc").remove();
	    		 $("#emailTest").after("<div class='validate_msg_medium error_msg' id='emailWarn'>输入信息不能为空</div>");
	    		 return false;
	    	 }
        	 if($("#nameWarn").length<=0&&$("#loginWarn").length<=0&&
        			 $("#imageWarn").length<=0&&$("#pwdWarn").length<=0&&
        			 $("#repwdWarn").length<=0&&$("#telWarn").length<=0&&
        			 $("#emailWarn").length<=0){
        		 var i = 0;
        		 $('input[name="role"]:checked').each(function(){
        			 i ++;
        		 })
        		 if(i > 0){
        			 $.post({
        				 url:'${pageContext.request.contextPath}/admin/selectAdminByAccount.do',
        				 data:{
        					 'adm_login':$("#adm_login").val(),
        				 },
        				 tradition:true,
        				 success:function(result){
        					 if(result=="yes"){
        						 $("#save_result_info").text("添加成功！");
                                 $("#save_result_info").attr("class","save_success");
                 				 $("#save_result_info").show().delay(1000).hide(300);
         						 setTimeout('subInput()', 1400);
        					 }else if($("#loginWarn").length<=0){
        						 $("#loginSucc").remove();
        						 $("#loginTest").after("<div class='validate_msg_medium error_msg' id='loginWarn'>对不起，该账号已存在！</div>");
        					 }
        				 }
        			 })
        			
        		 }else if($("#roleWarn").length<=0){
        			 $("#roleTest").after("<div class='validate_msg_tiny error_msg' id='roleWarn'>至少选择一个</div>");
        		 }
        	 }
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
        <!--Logo区域开始-->
        <%@include file="../include/header.jsp" %>
        <!--Logo区域结束-->
        <!--导航区域开始-->
       	<%@include file="../include/menu.jsp" %>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">            
            <div id="save_result_info"></div>
            <form action="${pageContext.request.contextPath}/admin/addAdmin.do" id="myform" method="post" enctype="multipart/form-data" class="main_form">
                    <div class="text_info clearfix"><span>姓名：</span></div>
                    <div class="input_info">
                        <input id="adm_name" name="adm_name" type="text" class="width200"/>
                      	<span class="required" id="nameTest">*</span>
                      	
                    </div>
                    <div class="text_info clearfix"><span>管理员账号：</span></div>
                    <div class="input_info">
                        <input id="adm_login" name="adm_login" type="text" class="width200" />
                        <span class="required" id="loginTest">*</span>
                        
                    </div>
                    <div class="text_info clearfix"><span>密码：</span></div>
                    <div class="input_info">
                        <input id="adm_pwd" name="adm_pwd" type="password" class="width200" />
                        <span class="required" id="pwdTest">*</span>
                    </div>
                    <div class="text_info clearfix"><span>重复密码：</span></div>
                    <div class="input_info">
                        <input  id="repwd" type="password" class="width200" />
                        <span class="required" id="repwdTest">*</span>
                    </div>      
					<div class="text_info clearfix"><span>上传头像</span></div>
                    <div class="input_info">
                        <input name="input-b9[]" type="file" id="file" class="width200" />
                        <span class="required" id="fileTest">*</span>
                        
                    </div>  
                    <div class="text_info clearfix"><span>电话：</span></div>
                    <div class="input_info">
                        <input id="adm_tel" name="adm_tel" type="text" class="width200"/>
                        <span class="required" id="telTest">*</span>
                    </div>
                    <div class="text_info clearfix"><span>Email：</span></div>
                    <div class="input_info">
                        <input id="adm_email" name="adm_email" type="text" class="width200"/>
                        <span class="required" id="emailTest">*</span>
                    </div>
                    <div class="text_info clearfix"><span>角色：</span></div>
                    <div class="input_info_high">
                        <div class="input_info_scroll">
                            <ul>
                            <c:forEach items="${allRole}" var="role">
                            	<li><input type="checkbox" name="role" value="${role.rol_id}"/>${role.rol_name}</li>
                            </c:forEach>
                            </ul>
                        </div>
                        <span class="required" id="roleTest">*</span>
                    </div>
                    <div class="button_info clearfix">
                        <!-- <input type="button" value="保存" class="btn_save" onclick="sub()"/>
                        <input type="button" value="取消" class="btn_save" onclick="location.href='../admin/adminAllAdmins.do'"/> -->
                        <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="sub()" >&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='../admin/adminAllAdmins.do'" >&nbsp;&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;</button>
                    </div>
                </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>