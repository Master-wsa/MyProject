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
        <script type="text/javascript">
        document.onreadystatechange = function () {      
            if(document.readyState=="complete") {
            	$("#headClass9").attr("class","password_on");
            }     
        } 
        var one = false;
        var two = false;
        var three = false;
        $(function(){
        	$("#err3").hide();
    		$("#save_result_info").hide();
    		$("#oldPswDiv").hide();
    		$("#newPswDiv").hide();
    		$("#1feet").hide();
    		$("#2feet").hide();
    		$("#3feet").hide();
            $("#sub").click(function(){
				if(one&&two&&three&&$("#oldpsw").val()!=''&&$("#psw1").val()!=''&&$("#psw2").val()!=''){
					if($("#psw1").val()==$("#psw2").val()){
		            	$.post({
		            		url : "${pageContext.request.contextPath}/admin/updateAdminPsw.do",
		            		data : $("#myform").serialize(),
		            		success : function(result){
		            			if(result=='true'){
		            				$("#save_result_info").attr("class","save_success");
		            				$("#save_result_info").html("修改成功！");
		            				$("#save_result_info").show();
		            				setTimeout(function(){
		            					$(location).attr("href","${pageContext.request.contextPath}/admin/exit.do");
		            				},1500)
		            			}else{
		            				$("#save_result_info").attr("class","save_fail");
		            				$("#save_result_info").html("修改失败，原密码错误！");
		            				$("#save_result_info").show();
		            				$("#save_result_info").delay(3000).hide(0);
		            			}
		            		}
		            	})
	           		}else{
	           			$("#err3").show();
	           		}
            	}else{
    				if(!one){
    					$("#oldPswDiv").show();
    				}
    				if(!two){
    					$("#newPswDiv").show();
    				}
    				if(!three){
    					$("#err3").show();
    				}
            	}
            })
    	})
    	function checkOldPsw(){
        	var reg = /^\w{6,30}$/
        	var oldPsw = $("#oldpsw").val();
        	if(!reg.test(oldPsw)){
        		$("#1feet").hide();
        		$("#oldPswDiv").show();
        		one = false;
        	}else{
        		$("#oldPswDiv").hide();
        		$("#1feet").show();
        		one = true;
        	}
        }
        function checkNewPsw(){
        	checkPsw();
        	var reg = /^\w{6,30}$/
            var newPsw = $("#psw1").val();
            	if(!reg.test(newPsw)){
            		$("#2feet").hide();
            		$("#newPswDiv").show();
            		two = false;
            	}else{
            		$("#newPswDiv").hide();
            		$("#2feet").show();
            		two = true;
            	}
        }
        function checkPsw(){
        	if($("#psw1").val()!=$("#psw2").val()){
        		$("#3feet").hide();
        		$("#err3").show();
        		three = false;
        		
        	}else{
        		$("#err3").hide();
        		$("#3feet").show();
        		three = true;
        	}
        }
        function cancel(){
        	$("#err3").hide();
    		$("#save_result_info").hide();
    		$("#oldPswDiv").hide();
    		$("#newPswDiv").hide();
    		$("#1feet").hide();
    		$("#2feet").hide();
    		$("#3feet").hide();
    		$("#oldpsw").val('');
    		$("#psw1").val('');
    		$("#psw2").val('');
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
        <div id="main">      
            <!--保存操作后的提示信息：成功或者失败-->      
            <div id="save_result_info"></div>
            <form id="myform" class="main_form">
                <div class="text_info clearfix"><span>旧密码：</span></div>
                <div class="input_info">
                    <input id="oldpsw" name="oldpsw" type="password" class="width250"  onblur="checkOldPsw()" />
                    <span class="required">*</span>
                    <div class="validate_msg_medium success" id="1feet"  style="display:none;">&nbsp;</div>
                    <div id="oldPswDiv" class="validate_msg_medium error_msg">6-30长度以内的字母、数字和下划线的组合</div>
                </div>
                <div class="text_info clearfix"><span>新密码：</span></div>
                <div class="input_info">
                    <input id="psw1" name="newpsw1" type="password"  class="width250" onblur="checkNewPsw()" />
                    <span class="required">*</span>
                    <div class="validate_msg_medium success" id="2feet"  style="display:none;">&nbsp;</div>
                    <div id="newPswDiv" class="validate_msg_medium error_msg">6-30长度以内的字母、数字和下划线的组合</div>
                </div>
                <div class="text_info clearfix"><span>重复新密码：</span></div>
                <div class="input_info">
                    <input id="psw2" name="newpsw2" type="password" class="width250" onblur="checkPsw()"  />
                    <span class="required">*</span>
                    <div class="validate_msg_medium success" id="3feet"  style="display:none;">&nbsp;</div>
                    <div id="err3" class="validate_msg_medium error_msg">两次新密码必须相同</div>
                </div>
                <div class="button_info clearfix">
                   <%--  <input id="sub" type="button" value="保存" class="btn_save" />
                    <input type="button" value="取消" class="btn_save" onclick="location.href='${pageContext.request.contextPath}/role/rediectIndex.do'" /> --%>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" id="sub" >&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="cancel()" >&nbsp;&nbsp;取&nbsp;&nbsp;消&nbsp;&nbsp;</button>
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>
