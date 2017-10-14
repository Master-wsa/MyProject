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
	        document.onreadystatechange = function () {  
	            if(document.readyState=="complete") {
	            	$("#headClass4").attr("class","account_on");
	            }     
	        } 
            //保存成功的提示信息
            function showResult() {
                showResultDiv(true);
                window.setTimeout("showResultDiv(false);", 3000);
            }
            function showResultDiv(flag) {
                //var divResult = document.getElementById("save_result_info");
                if (flag)
                    $("#save_result_info").show();
                else
                    $("#save_result_info").hide();
            }
            //显示修改密码的信息项
            function showPwd(chkObj) {
                if (chkObj.checked){
                    $("#divPwds").show();
                }else{
                    $("#divPwds").hide();
                    $("#oldpsw").val("");
                    $("#newpsw1").val("");
                    $("#newpsw2").val("");
                    $("#checkpsw").removeClass()
					$("#checkpsw").html("")
					$("#checkoldpsw").removeClass()
					$("#checkoldpsw").html("")
					$("#checkrepsw").removeClass()
					$("#checkrepsw").html("")
                }
            }
	          //自动填充生日
	         function showBrith(){
	         	var sf = $("#cardid").val();
	         	var brith = sf.substring(6,10)+"-"+sf.substring(10,12)+"-"+sf.substring(12,14);
	         	$("#brithday").text(brith);
	         	$("#brithday").val(brith);
	         }
	       //保存结果的提示
	        function showResult() {
	         	var temp = '${requestScope.msg}';
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
	        	showBrith();
		     })
		     
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
					$("#checkname").html("20长度以内的汉字、字母和数字的组合")
					return false;
				}else{
					$("#checkname").removeClass()
					$("#checkname").addClass("validate_msg_long success");
					$("#checkname").html("&nbsp")
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
	       		var reg = /^[a-zA-Z0-9\u4e00-\u9fa5]{2,50}$/
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
		      //验证旧密码
		   	function checkoldpsw(){
		   		var oldpsw=$("#oldpsw").val()
		   		var oldpsw2=$("#oldpsw2").val()
		   		if(oldpsw!=oldpsw2){
		   			$("#checkoldpsw").removeClass()
		   			$("#checkoldpsw").addClass("validate_msg_long error_msg");
					$("#checkoldpsw").html("与原密码不符")
					return false;
		   		}else{
		   			$("#checkoldpsw").removeClass()
		   			$("#checkoldpsw").addClass("validate_msg_long success");
					$("#checkoldpsw").html("&nbsp")
					return true;
		   		}
		   		
		   	}
		    //密码验证
	         function checknewpsw() {
				var reg = /^\w{3,30}$/
				var psw = $("#newpsw1").val()
				if(psw!=""){
					if(reg.test(psw)==false){
						$("#checkpsw").removeClass()
						$("#checkpsw").addClass("validate_msg_long error_msg");
						$("#checkpsw").html("30长度以内的字母、数字和下划线的组合")
						return false;
					}else{
						$("#checkpsw").removeClass()
			   			$("#checkpsw").addClass("validate_msg_long success");
						$("#checkpsw").html("&nbsp")
						return true;
					}
				}else{
					$("#checkpsw").removeClass()
					$("#checkpsw").html("")
					return true;
				}
			}
		       //重复密码验证
	      	function checkrepsw() {
	      		var psw = $("#newpsw1").val()
				var repsw = $("#newpsw2").val()
				if(psw!=repsw){
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
		    function changepsw(){
		    	var oldpsw=$("#oldpsw").val()
		    	var psw = $("#newpsw1").val()
				var repsw = $("#newpsw2").val()
				if($("#chkModiPwd").is(':checked')){
					return checkoldpsw()&&checknewpsw()&& checkrepsw()
				}
				/* if(oldpsw!=""&&psw!=""&&repsw!=""){
					
				} */
				else{
				/* 	$("#oldpsw").val("")
					$("#newpsw1").val("")
					$("#newpsw2").val("") */
					return true;
				}	
		    }		    
		   	function checkForm() {
		   		return checkname()&&checkinidc()&&checkemail()&&checkaddr()&&checkpost()&&checkqq()&&changepsw()&&checkphone();
			}
		   	$(function(){
		   		$("#main").css({
		   		    "max-height": "800px"
		   		})
		   		$("body").css({
	        		"background-color":"#0163a0"
	        	})
		   		$("#operate_result_info").css({
		   		    "top": "350px"

		   		})
		   		$(".change_pwd").css({
		   			"width":"320px"
		   		})
	   			$("#btn_save").click(function(){
	   				if(checkForm()){
		   				$.post({
		   					url:'${pageContext.request.contextPath}/account/changAccount.do',
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
            <div id="save_result_info" class="save_success">修改成功！</div>
            <div id="operate_result_info" class="operate_success">修改成功！</div>
            <form action="${pageContext.request.contextPath }/account/changAccount.do" id="myform" method="post" class="main_form" onsubmit="return checkForm();">
                    <!--必填项-->
                    <div class="text_info clearfix"><span>账务账号ID：</span></div>
                    <div class="input_info">
                        <input type="text" name="acc_id" value="${account.acc_id}" readonly class="readonly width200" />
                    </div>
                    <div class="text_info clearfix"><span>姓名：</span></div>
                    <div class="input_info">
                        <input type="text" name="acc_name" value="${account.acc_name}" id="acc_name" class="width200" onblur="checkname()" />
                        <span class="required" id="tipname">*</span>
                        <div class="" id="checkname"></div>
                    </div>
                   <div class="text_info clearfix"><span>性别：</span></div>
	               	<div class="input_info fee_type">
                        <input type="radio" name="radSex" value="0" id="male"
                        <c:if test="${account.acc_sex==0 }"> checked="checked"  </c:if>/>
                        <label for="male">男</label>
                        <input type="radio" name="radSex" value="1" id="female" 
                        <c:if test="${account.acc_sex==1 }"> checked="checked"  </c:if>/>
                        <label for="female">女</label>
                    </div> 
					<div class="text_info clearfix" ><span>身份证：</span></div>
                    <div class="input_info">
                        <input type="text" id="cardid"  value="${account.acc_idc}" readonly class="readonly width200" onchange="showBrith()"/>
                    </div>
                    <div class="text_info clearfix"><span>登录账号：</span></div>
                    <div class="input_info">
                        <input type="text" value="${account.acc_login}" readonly class="readonly width200"  />                        
                        <div class="change_pwd">
                            <input id="chkModiPwd" type="checkbox" onclick="showPwd(this);" />
                            <label for="chkModiPwd">修改密码</label>
                        </div>
                    </div>
                    <!--修改密码部分-->
                    <div id="divPwds">
                        <div class="text_info clearfix"><span>旧密码：</span></div>
                        <div class="input_info">
                            <input type="password" name="oldpsw" id="oldpsw" class="width200" onblur="checkoldpsw()" />
                            <span class="required" id="tipoldpsw"></span>
                            <div class="" id="checkoldpsw"></div>
                        </div>
                        <div class="text_info clearfix"><span>新密码：</span></div>
                        <div class="input_info">
                            <input type="password" name="newpsw1" id="newpsw1" class="width200" onblur="checknewpsw()" />
                            <span class="required" id="tippsw"></span>
                            <div class="" id="checkpsw"></div>
                        </div>
                        <div class="text_info clearfix"><span>重复新密码：</span></div>
                        <div class="input_info">
                            <input type="password"  name="newpsw2" id="newpsw2" class="width200" onblur="checkrepsw()" />
                            <span class="required" id="tiprepsw"></span>
                            <div class="" id="checkrepsw"></div>
                        </div>   
                    </div>                   
                    <div class="text_info clearfix"><span>电话：</span></div>
                    <div class="input_info">
                        <input type="text"  name="acc_tel" id="acc_tel" class="width200" value="${account.acc_tel}" onblur="checkphone()"/>
                        <span class="required" id="tiptel">*</span>
                        <div class="" id="checktel"></div>
                    </div>
                    <div class="text_info clearfix"><span>生日：</span></div>
                    <div class="input_info">
                        <input type="text" id="brithday" name="brith"  readonly class="readonly width200"  value="${account.acc_birth}"  />
                    </div>
                    <div class="text_info clearfix"><span>推荐人身份证号码：</span></div>
                    <div class="input_info">
                        <input type="text" value="${account.acc_inidc}" name="acc_inidc" class="width200" id="acc_inidc" onblur="checkinidc()"/>
                        <div class="" id="checkinidc"></div>
                    </div>
                    <div class="text_info clearfix"><span>Email：</span></div>
                    <div class="input_info">
                        <input type="text"  name="acc_email" value="${account.acc_email}" class="width200" id="acc_email" onblur="checkemail()"/>
                        <div class="" id="checkemail"></div>
                    </div> 
                    <div class="text_info clearfix"><span>职业：</span></div>
                    <div class="input_info">
                        <select name="acc_job">
                            <option <c:if test="${account.acc_job=='干部'}">selected="selected"</c:if>>干部</option>
                            <option <c:if test="${account.acc_job=='学生'}">selected="selected"</c:if>>学生</option>
                            <option <c:if test="${account.acc_job=='技术人员'}">selected="selected"</c:if>>技术人员</option>
                            <option <c:if test="${account.acc_job=='其他'}">selected="selected"</c:if>>其他</option>
                        </select>                        
                    </div>
                    
                    <div class="text_info clearfix"><span>邮编：</span></div>
                    <div class="input_info">
                        <input type="text" value="${account.acc_post }" id="acc_post" name="acc_post" class="width200" onblur="checkpost()"/>
                        <div class="" id="checkpost"></div>
                    </div> 
                    <div class="text_info clearfix"><span>QQ：</span></div>
                    <div class="input_info">
                        <input type="text" value="${account.qq }" id="qq" onblur="checkqq()" class="width200" name="qq"/>
                        <div class="" id="checkqq"></div>
                    </div>                
                    <div class="text_info clearfix"><span>通信地址：</span></div>
                    <div class="input_info">
                        <input type="text" class="width350" value="${account.acc_addr }" id="acc_addr" name="acc_addr" onblur="checkaddr()"/>
                       	<div class="" id="checkaddr"></div>
                    </div> 
                    <!--操作按钮-->
                    <div class="button_info clearfix">
                        <%-- <input type="submit" value="保存" class="btn_save" />
                        <input type="button" value="取消" class="btn_save" onclick="location.href='${pageContext.request.contextPath}/account/getAllAccount.do'" /> --%>
                        <button type="button" id="btn_save"  class="btn btn-primary" style="height:36px;width:100px;font-size:18px">&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button>
                    	<button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='${pageContext.request.contextPath}/account/getAllAccount.do'" >&nbsp;&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;</button>
                    </div>
                   <input id="oldpsw2" value="${account.acc_psw}" type="hidden"> 
                </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>