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
        <style type="text/css">
        	
        </style>
        <script language="javascript" type="text/javascript">
	        document.onreadystatechange = function () {      
	            if(document.readyState=="complete") {
	            	$("#headClass4").attr("class","account_on");
	            }     
	        } 
	         //显示选填的信息项
	         function showOptionalInfo(imgObj) {
	        	 var path = '${pageContext.request.contextPath }';
	             if ($("#optionalInfo").attr("class")=="hide") {
	            	 $("#optionalInfo").attr("class","show");
	                 imgObj.src = path+"/images/hide.png";
	             }
	             else {
	            	 $("#optionalInfo").attr("class","hide");
	                 imgObj.src = path+"/images/show.png";
	             }
	         }
	         //自动填充生日
	         function showBrith(){
	         	var sf = $("#acc_idc").val();
	         	var brith = sf.substring(6,10)+"-"+sf.substring(10,12)+"-"+sf.substring(12,14);
	         	$("#brithday").text(brith);
	         	$("#brithday").val(brith);
	         }
	         
	         
		     //电话号码验证
		    function checkphone(){
				var reg = /^1\d{10}$/
				var phone = $("#acc_tel").val()
				if(reg.test(phone)==false){
					$("#tip").html("*")
					$("#checktel").removeClass()
					$("#checktel").addClass("validate_msg_long error_msg");
					$("#checktel").html("请输入正确的电话号码格式")
					return false;
				}else{
					$("#checktel").removeClass()
					$("#checktel").addClass("validate_msg_long success");
					$("#checktel").html("&nbsp")
					return true;
				}
			} 
		         //姓名验证
	         function checkname() {
				var reg = /^[\u4e00-\u9fa5A-Za-z0-9]{2,20}$/
				var name = $("#acc_name").val()
				if(reg.test(name)==false){
					$("#tipname").html("*")
					$("#checkname").removeClass()
					$("#checkname").addClass("validate_msg_long error_msg");
					$("#checkname").html("姓名为20长度以内的汉字、字母和数字的组合")
					return false;
				}else{
					$("#checkname").removeClass()
					$("#checkname").addClass("validate_msg_long success");
					$("#checkname").html("&nbsp")
					return true;
				}		         	
			}
		       //身份证验证
	         function checkidc() {
				var reg = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/
				var idc = $("#acc_idc").val()
				var n = false;
				if(reg.test(idc)==false){
					$("#tipidc").html("*")
					$("#checkidc").removeClass()
					$("#checkidc").addClass("validate_msg_long error_msg");
					$("#checkidc").html("请输入合法的身份证号码格式")
					return false;
				}else{ 
					$.ajax({
       	 				url:'${pageContext.request.contextPath }/account/getAccountByidc.do',
       	 				type:'post',
       	 				data:$("#myform").serialize(),
       	 				async: false,
       	 				success:function(result){
       	 					var flag = result
       	 					if(flag==1){
	       	 					$("#tipidc").html("*")
	       	 					$("#checkidc").removeClass()
	       						$("#checkidc").addClass("validate_msg_long error_msg");
	       						$("#checkidc").html("该身份证已存在")
	       						n = false;
       	 					}else if(flag==0){
	       	 					$("#checkidc").removeClass()
	       						$("#checkidc").addClass("validate_msg_long success");
	       						$("#checkidc").html("&nbsp")
	       						n=true;
       	 					}
       	 				}
       	 			})					
       	 			return n;
				}		         	
			}
		       //登录账号验证
	         function checklogin() {
				var reg = /^\w{3,15}$/
				var login = $("#acc_login").val()
				var n = false;
				if(reg.test(login)==false){
					$("#tiplogin").html("*")
					$("#checklogin").removeClass()
					$("#checklogin").addClass("validate_msg_long error_msg");
					$("#checklogin").html("15长度以内的字母、数字和下划线的组合")
					return false;
				}else{
					$.ajax({
       	 				url:'${pageContext.request.contextPath }/account/getAccountByLogin.do',
       	 				type:'post',
       	 				data:$("#myform").serialize(),
       	 				async: false,
       	 				success:function(result){
       	 					var flag = result
       	 					if(flag==1){
	       	 					$("#tiplogin").html("*")
	       	 					$("#checklogin").removeClass()
	       						$("#checklogin").addClass("validate_msg_long error_msg");
	       						$("#checklogin").html("该用户名已存在")
	       						n = false;
       	 					}else if(flag==0){
	       	 					$("#checklogin").removeClass()
	       						$("#checklogin").addClass("validate_msg_long success");
	       						$("#checklogin").html("&nbsp")
	       						n=true;
       	 					}
       	 				}
       	 			})					
       	 			return n;
				}		         	
			}
		       //密码验证
	         function checkpsw() {
				var reg = /^\w{3,30}$/
				var psw = $("#acc_psw").val()
				if(reg.test(psw)==false){
					$("#tippsw").html("*")
					$("#checkpsw").removeClass()
					$("#checkpsw").addClass("validate_msg_long error_msg");
					$("#checkpsw").html("请输入30长度以内的字母、数字和下划线的组合")
					return false;
				}else{
					$("#checkpsw").removeClass()
					$("#checkpsw").addClass("validate_msg_long success");
					$("#checkpsw").html("&nbsp")
					return true;
				}		         	
			}
		       //重复密码验证
	      	function checkrepsw() {
	      		var psw = $("#acc_psw").val()
				var repsw = $("#acc_psw2").val()
				if(psw!=repsw){
					$("#tiprepsw").html("*")
					$("#checkrepsw").removeClass()
					$("#checkrepsw").addClass("validate_msg_long error_msg");
					$("#checkrepsw").html("两次密码不一致")
					return false;
				}else{
					$("#checkrepsw").removeClass()
					$("#checkrepsw").addClass("validate_msg_long success");
					$("#checkrepsw").html("&nbsp")
					return true;
				}	      		
			}
		       //推荐人身份证号验证
	       	function checkinidc() {
	       		var reg = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/
				var inidc = $("#acc_inidc").val()
				if(inidc!=""){
					if(reg.test(inidc)==false){
						$("#checkinidc").removeClass()
						$("#checkinidc").addClass("validate_msg_long error_msg");
						$("#checkinidc").html("请输入合法的身份证号码格式")
						return false;
					}else{
						$("#checkinidc").removeClass()
						$("#checkinidc").addClass("validate_msg_long success");
						$("#checkinidc").html("&nbsp")
						return true;
					}
				}else{
					$("#checkinidc").removeClass()
					$("#checkinidc").html("")
					return true;
				}
			}
		      //邮箱验证
	       	function checkemail() {
	       		var reg = /^\w+@\w+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$/
				var email = $("#acc_email").val()
				if(email!=""){
					if(reg.test(email)==false){
						$("#checkemail").removeClass()
						$("#checkemail").addClass("validate_msg_long error_msg");
						$("#checkemail").html("50长度以内，合法的 Email 格式")
						return false;
					}else{
						$("#checkemail").removeClass()
						$("#checkemail").addClass("validate_msg_long success");
						$("#checkemail").html("&nbsp")
						return true;
					}
				}else{
					$("#checkemail").removeClass()
					$("#checkemail").html("")
					return true;
				}
			}
		      //地址验证
	       	function checkaddr() {
	       		var reg = /^[a-zA-Z0-9\u4e00-\u9fa5]{0,70}$/
				var addr = $("#acc_addr").val()
				if(addr!=""){
					if(reg.test(addr)==false){
						$("#checkaddr").removeClass()
						$("#checkaddr").addClass("validate_msg_tiny error_msg");
						$("#checkaddr").html("50长度以内的字符")
						return false;
					}else{
						$("#checkaddr").removeClass()
						$("#checkaddr").addClass("validate_msg_tiny success");
						$("#checkaddr").html("&nbsp")
						return true;
					}
				}else{
					$("#checkaddr").removeClass()
					$("#checkaddr").html("")
					return true;
				}
			}
		      //邮编验证
	       	function checkpost() {
	       		var reg =  /^[1-9][0-9]{5}$/
				var post = $("#acc_post").val()
				if(post!=""){
					if(reg.test(post)==false){
						$("#checkpost").removeClass()
						$("#checkpost").addClass("validate_msg_long error_msg");
						$("#checkpost").html("请输入正确格式的邮编")
						return false;
					}else{
						$("#checkpost").removeClass()
						$("#checkpost").addClass("validate_msg_long success");
						$("#checkpost").html("&nbsp")
						return true;
					}
				}else{
					$("#checkpost").removeClass()
					$("#checkpost").html("")
					return true;
				}
			}
		      //qq验证
	       	function checkqq() {
	       		var reg =  /^[1-9][0-9]{4,12}$/
				var qq = $("#qq").val()
				if(qq!=""){
					if(reg.test(qq)==false){
						$("#checkqq").removeClass()
						$("#checkqq").addClass("validate_msg_long error_msg");
						$("#checkqq").html("请输入5位到13位数字的QQ号码")
						return false;
					}else{
						$("#checkqq").removeClass()
						$("#checkqq").addClass("validate_msg_long success");
						$("#checkqq").html("&nbsp")
						return true;
					}
				}else{
					$("#checkqq").removeClass()
					$("#checkqq").html("")
					return true;
				}
			}
		   	function checkForm() {
		   		return checkname()&&checkidc()&&checklogin()&&checkpsw()&&checkrepsw()&&checkphone()&&checkinidc()&&checkemail()&&checkaddr()&&checkpost()&&checkqq();
			}
		   	$(function(){
		   		$("#main").css({
		   		    "max-height": "800px"
		   		})
		   		$("body").css({
	        		"background-color":"#0163a0"
	        	})
		   		$("#operate_result_info").css({
		   		    "top": "355px"
		   		})
	   			$("#btn_save").click(function(){
	   				if(checkForm()){
		   				$.post({
		   					url:'${pageContext.request.contextPath}/account/addAccount.do',
		   					data:$("#myform").serialize(),
		   					success:function(data){
		   	 					var flag = data
		   	 					if(flag==1){ 	 						
		   	 						$("#operate_result_info").show().delay(1000).hide(300);
		   	 						window.setTimeout(function(){location.href ="${pageContext.request.contextPath}/account/getAllAccount.do"}, 1500);
		   	 					}else if(flag==2){
		       	 					$("#operate_result_info").show();
		   	 						window.setTimeout("$('#operate_result_info').hide();", 1500);
		   	 					}
		   	 				}
		   				})
	   					
	   				}
	   			})	
	   		})
        </script>
    </head>
    <body>
        <!--Logo区域开始-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--导航区域开始-->
        <%@include file="/WEB-INF/view/include/menu.jsp" %>
        <!--主要区域开始-->
        <div id="main">       
            <!--保存成功或者失败的提示消息-->     
            <div id="save_result_info" class="save_success">新建账务账号成功！</div>
            <div id="operate_result_info" class="operate_success">新建账务账号成功！</div>
            <form action="${pageContext.request.contextPath }/account/addAccount.do" method="post" id="myform" class="main_form" onsubmit="return checkForm(); ">
                <!--必填项-->
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input type="text" name="acc_name" class="width200" id="acc_name" onblur="checkname()"/>
                    <span class="required" id="tipname">*</span>
                    <div class="" id="checkname"></div>
                </div>
                <div class="text_info clearfix"><span>身份证：</span></div>
                <div class="input_info">
                    <input type="text" id="acc_idc" class="width200" name="acc_idc" onblur="checkidc()" onchange="showBrith()"/>
                    <span class="required" id="tipidc">*</span>
                    <div class="" id="checkidc"></div>
                </div>
                <div class="text_info clearfix"><span>性别：</span></div>
                <div class="input_info fee_type">
                    <input type="radio" name="acc_sex" checked="checked" id="male" value="1" />
                    <label for="male">男</label>
                    <input type="radio" name="acc_sex"  id="female" value="0" />
                    <label for="female">女</label>
                </div> 
                <div class="text_info clearfix"><span>登录账号：</span></div>
                <div class="input_info">
                    <input type="text" name="acc_login" class="width200" id="acc_login" onblur="checklogin()" />
                   	<span class="required" id="tiplogin">*</span>
                    <div class="" id="checklogin"></div>
                </div>
                <div class="text_info clearfix"><span>密码：</span></div>
                <div class="input_info">
                    <input type="password"  name="acc_psw" class="width200" id="acc_psw" onblur="checkpsw()" />
                    <span class="required" id="tippsw">*</span>
                    <div class="" id="checkpsw"></div>
                </div>
                <div class="text_info clearfix"><span>重复密码：</span></div>
                <div class="input_info">
                    <input type="password" name="acc_psw2" class="width200" id="acc_psw2" onblur="checkrepsw()" />
                   	<span class="required" id="tiprepsw">*</span>
                    <div class="" id="checkrepsw"></div>
                </div>     
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input type="text"  id="acc_tel" class="width200" name="acc_tel" onblur="checkphone()" />
                    <span id="tip" class="required">*</span>
                  	<div id="checktel" class=""></div>
                </div>                
                <!--可选项-->
              <%--   <div class="text_info clearfix"><span>可选项：</span></div>
                <div class="input_info">
                    <img src="${pageContext.request.contextPath }/images/show.png" alt="展开" onclick="showOptionalInfo(this);" />
                </div> --%>
              <!--   <div id="optionalInfo" class="hide"> -->
              		<div class="text_info clearfix"><span>生日：</span></div>
                    <div class="input_info">
                        <input type="text" name="acc_birth" class="width200" id="brithday" readonly class="readonly" />
                    </div>
                    <div class="text_info clearfix"><span>推荐人身份证号码：</span></div>
                    <div class="input_info">
                        <input type="text" name="acc_inidc" class="width200" id="acc_inidc" onblur="checkinidc()"/>
                       	<div class="" id="checkinidc"></div>
                    </div>
                    <div class="text_info clearfix"><span>Email：</span></div>
                    <div class="input_info">
                        <input type="text"  name="acc_email" class="width200" id="acc_email" onblur="checkemail()"/>
                       	<div class="" id="checkemail"></div>
                    </div> 
                    <div class="text_info clearfix"><span>职业：</span></div>
                    <div class="input_info">
                        <select name="acc_job">
                            <option value="干部">干部</option>
                            <option value="学生">学生</option>
                            <option value="技术人员">技术人员</option>
                            <option value="其他">其他</option>
                        </select>                        
                    </div>
                    
                    <div class="text_info clearfix"><span>邮编：</span></div>
                    <div class="input_info">
                        <input type="text" name="acc_post" class="width200" id="acc_post" onblur="checkpost()"/>
                        <div class="" id="checkpost"></div>
                    </div> 
                    <div class="text_info clearfix"><span>QQ：</span></div>
                    <div class="input_info">
                        <input type="text" name="qq" class="width200" id="qq" onblur="checkqq()"/>
                        <div class="" id="checkqq"></div>
                    </div>                
                    <div class="text_info clearfix"><span>通信地址：</span></div>
                    <div class="input_info">
                        <input type="text" class="width350" name="acc_addr" id="acc_addr" onblur="checkaddr()"/>
                        <div class="" id="checkaddr"></div>
                    </div> 
               <!--  </div> -->
                <!--操作按钮-->
                <div class="button_info clearfix">
                    <%-- <input type="submit" value="保存" class="btn_save" />
                    <input type="button" value="取消" class="btn_save" onclick="location.href='${pageContext.request.contextPath}/account/getAllAccount.do'" /> --%>
                    <button type="button" id="btn_save" class="btn btn-primary" style="height:36px;width:100px;font-size:18px">&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='${pageContext.request.contextPath}/account/getAllAccount.do'" >&nbsp;&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;</button>
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>