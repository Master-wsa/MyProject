<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
       	<%@include file="../include/css.jsp" %>
        <script language="javascript" type="text/javascript">
        $(function(){
        	$("#rolname").blur(function(){
        		var value = $("#rolname").val();
        		var regs = /^[0-9a-zA-Z\u4e00-\u9fa5]{1,20}$/;
        		if(!regs.test(value)&&$("#nameWarn").length<=0){
        			$("#nameSucc").remove();
        			$("#nameTest").after("<div class='validate_msg_medium error_msg' id='nameWarn'>不能为空，且为20长度的字母、数字和汉字的组合</div>");
        			return false;
        		}
        		$.post({
      				 url:'${pageContext.request.contextPath}/role/validate.do',
      				 data:{
      					 'rol_name':$("#rolname").val(),
      					 'rolName':'-1',
      				 },
      				 traditional:true,
      				 success:function(result){
      					 if(result=="yes"){
      						 $("#nameWarn").remove();
     						 $("#nameTest").after("<div class='validate_msg_long success' id='nameSucc'></div>");
      						 $("#nameSucc").html("&nbsp")
      					 }else if($("#nameWarn").length<=0){
      						 $("#nameSucc").remove();
      						 $("#nameTest").after("<div class='validate_msg_medium error_msg' id='nameWarn'>对不起，该角色已存在！</div>");
      					 }
      				 }
      			 })
        	})
        	$("#rolname").focus(function(){
        		$("#nameSucc").remove();
	    		$("#nameWarn").remove();
	    	})
	    	$("input[name='jur']").click(function(){
	    		$("#powerWarn").remove();
	    	})
        })
    	function sub(){
	       	if($("#nameWarn").length<=0&&$("#rolname").val()!=""){
	       		 var i = 0;
	       		 $('input[name="jur"]:checked').each(function(){
	       			 i ++;
	       		 })
	       		 if(i > 0){
	       			 $.post({
	       				 url:'${pageContext.request.contextPath}/role/validate.do',
	       				 data:{
	       					 'rol_name':$("#rolname").val(),
	       					 'rolName':'-1',
	       				 },
	       				 traditional:true,
	       				 success:function(result){
	       					 if(result=="yes"){
	       						 $("#save_result_info").text("添加成功！");
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
    <body >
        <!--Logo区域开始-->
        <%@include file="../include/header.jsp" %>
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <%@include file="../include/menu.jsp" %>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info"></div>
            <form action="${pageContext.request.contextPath}/role/addRole.do" id="myform" method="post" class="main_form">
                <div class="text_info clearfix"><span>角色名称：</span></div>
                <div class="input_info">
                    <input id="rolname" name="rol_name" type="text" class="width200"/>
                    <span class="required" id="nameTest">*</span>
                </div>     
                <input type="text" hidden />               
                <div class="text_info clearfix"><span>设置权限：</span></div>
                <div class="input_info_high">
                    <div class="input_info_scroll">
                        <ul>
                            <li><input type="checkbox" name="jur" value="1"/>角色管理</li>
                            <li><input type="checkbox" name="jur" value="2"/>管理员管理</li>
                            <li><input type="checkbox" name="jur" value="3"/>资费管理</li>
                            <li><input type="checkbox" name="jur" value="4"/>账务账号</li>
                            <li><input type="checkbox" name="jur" value="5"/>业务账号</li>
                            <li><input type="checkbox" name="jur" value="6"/>账单</li>
                            <li><input type="checkbox" name="jur" value="7"/>报表</li>
                            <li><input type="checkbox" name="jur" value="8"/>个人信息</li>
                            <li><input type="checkbox" name="jur" value="9"/>修改密码</li>
                        </ul>
                    </div>
                    <span class="required" id="powerTest">*</span>
                </div>
                <div class="button_info clearfix">
                    <!-- <input type="button" value="保存" class="btn_save" onclick="sub()" />
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
