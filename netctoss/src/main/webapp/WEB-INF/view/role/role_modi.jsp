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
            /* //保存成功的提示消息
	         function showResult() {
	         	var temp = '${success}';
	         	if(temp!=""){
	         		showResultDiv(temp);
	         	}           
	             window.setTimeout("closeResultDiv()", 1000);
	         }
	         function showResultDiv(flag) {
	             //var divResult = document.getElementById("save_result_info");
	             if (flag){
	            	 $("#save_result_info").show();
	            	 $("#save_result_info").append("修改成功！");
	            	 $("#save_result_info").attr("class","save_success");
	             }else{
	            	 $("#save_result_info").show();
	            	 $("#save_result_info").append("请按要求填写后才能提交！");
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
	        	$("#rol_name").blur(function(){
	        		var value = $("#rol_name").val();
	        		var regs = /^[0-9a-zA-Z\u4e00-\u9fa5]{1,20}$/;
	        		if(!regs.test(value)&&$("#nameWarn").length<=0){
	        			$("#nameSucc").remove();
	        			$("#nameTest").after("<div class='validate_msg_medium error_msg' id='nameWarn'>不能为空，且为20长度的字母、数字和汉字的组合</div>");
	        			return false;
	        		}
	        		$.post({
	       				 url:'${pageContext.request.contextPath}/role/validate.do',
	       				 data:{
	       					 'rol_name':$("#rol_name").val(),
	       					 'rolName':$("#rolName").val(),
	       				 },
	       				 traditional:true,
	       				 success:function(result){
	       					 if(result=="yes"||result=="yyy"){
	       						 $("#nameWarn").remove();
	       						 if($("#nameSucc").length<=0){
	       							 $("#nameTest").after("<div class='validate_msg_long success' id='nameSucc'></div>");
		      						 $("#nameSucc").html("&nbsp")
	       						 }
	       					 }else if($("#nameWarn").length<=0){
	       						 $("#nameSucc").remove();
	       						 $("#nameTest").after("<div class='validate_msg_medium error_msg' id='nameWarn'>对不起，该角色已存在！</div>");
	       					 }
	       				 }
	       			})
	        	})
	        	$("#rol_name").focus(function(){
	        		 $("#nameSucc").remove();
		    		 $("#nameWarn").remove();
		    	})
		    	$("input[name='juridt']").click(function(){
	    			$("#powerWarn").remove();
	    		})
		      })
	    	  function sub(){
        		 if($("#nameWarn").length<=0&&$("#rol_name").val()!=""){
        			 var i = 0;
		       		 $('input[name="juridt"]:checked').each(function(){
		       			 i ++;
		       		 })
		       		 if(i > 0){
		       			$.post({
		       				 url:'${pageContext.request.contextPath}/role/validate.do',
		       				 data:{
		       					 'rol_name':$("#rol_name").val(),
		       					 'rolName':$("#rolName").val(),
		       				 },
		       				 traditional:true,
		       				 success:function(result){
		       					 if(result=="yes"||result=="yyy"){
		       						 $("#save_result_info").text("修改成功！");
	                                 $("#save_result_info").attr("class","save_success");
	                				 $("#save_result_info").show().delay(1000).hide(300);
	        						 setTimeout('subInput()', 1400);
		       					 }else if($("#nameWarn").length<=0){
		       						 $("#nameSucc").remove();
		       						 $("#nameTest").after("<div class='validate_msg_medium error_msg' id='nameWarn'>对不起，该角色已存在！</div>");
		       					 }
		       				 }
		       			})
		       		 }else if($("#powerWarn").length<=0){
		       			 $("#powerTest").after("<div class='validate_msg_tiny error_msg' id='powerWarn'>至少选择一个权限</div>");
		       		 }
        		 }else if($("#nameWarn").length<=0){
        			 $("#nameSucc").remove();
     	       		 $("#nameTest").after("<div class='validate_msg_medium error_msg' id='nameWarn'>不能为空，且为20长度的字母、数字和汉字的组合</div>");
    	       	 }
        		 var i = 0;
        		 $('input[name="juridt"]:checked').each(function(){
	       			 i ++;
	       		 })
	       		 if(i > 0){
	       			 $("#powerWarn").remove();
	       		 }
	          }
	         
	         //表单数据提交
		     function subInput(){
		    	 $("#myform").submit();
		     }
	        
	         document.onreadystatechange = function () {      
	             if(document.readyState=="complete") {
	             	$("#headClass1").attr("class","role_on");
	             }     
	         } 
        </script>
    </head>
    <body onload="showResult()">
        <!--Logo区域开始-->
       <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--Logo区域结束-->
        <!--导航区域开始-->
       <%@include file="/WEB-INF/view/include/menu.jsp"%>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">           
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info"></div>
            <form action="${pageContext.request.contextPath }/role/updateRole.do" id="myform" method="post" class="main_form">
            	<input type="hidden" name="rol_id" value="${role.rol_id}" />
                <div class="text_info clearfix"><span>角色名称：</span></div>
                <div class="input_info">
                    <input id="rol_name" name="rol_name" type="text" class="width200" value="${role.rol_name}" />
                    <span class="required" id="nameTest">*</span>
                </div>
                <input type="text" hidden />
                <input type="hidden" id="rolName" value="${role.rol_name}"/>          
                <div class="text_info clearfix"><span>设置权限：</span></div>
                <div class="input_info_high">
                    <div class="input_info_scroll">
                        <ul>
                       		<li><input name="juridt" value="1" type="checkbox" ${jur1}/>角色管理</li>
                            <li><input name="juridt" value="2" type="checkbox" ${jur2}/>管理员管理</li>
                            <li><input name="juridt" value="3" type="checkbox" ${jur3}/>资费管理</li>
                            <li><input name="juridt" value="4" type="checkbox" ${jur4}/>账务账号</li>
                            <li><input name="juridt" value="5" type="checkbox" ${jur5}/>业务账号</li>
                            <li><input name="juridt" value="6" type="checkbox" ${jur6}/>账单</li>
                            <li><input name="juridt" value="7" type="checkbox" ${jur7}/>报表</li>
                            <li><input name="juridt" value="8" type="checkbox" ${jur8}/>个人信息</li>
                            <li><input name="juridt" value="9" type="checkbox" ${jur9}/>修改密码</li>
                        </ul>
                    </div>
                    <span class="required" id="powerTest">*</span>
                </div>
                <div class="button_info clearfix">
                    <!-- <input type="button" value="保存" class="btn_save" onclick="sub()"/>
                    <input type="button" value="取消" class="btn_save" onclick="location.href='../role/selectAllRole.do'"/> -->
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="sub()" >&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='../role/selectAllRole.do'" >&nbsp;&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;</button>
                </div>
            </form> 
        </div>
        <!--主要区域结束-->
        <div id="footer">
            
        </div>
    </body>
</html>
