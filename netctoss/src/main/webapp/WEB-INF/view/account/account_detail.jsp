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
        <script type="text/javascript">
	        document.onreadystatechange = function () {      
	            if(document.readyState=="complete") {
	            	$("#headClass4").attr("class","account_on");
	            }     
	        } 
	        $(function(){
	        	$("#main").css({
	        		"max-height": "970px"
	        	})
	        	$("body").css({
	        		"background-color":"#0163a0"
	        	})
	        })
        //自动填充生日
/*         function showBrith(){
        	var sf = "${requestScope.selAccount.sf}";
        	var brith = sf.substring(6,10)+"-"+sf.substring(10,12)+"-"+sf.substring(12,14);
        	$("#brithday").text(brith);
         	$("#brithday").val(brith);
        } */
        </script>
    </head>
    <body >
        <!--Logo区域开始-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--导航区域开始-->
        <%@include file="/WEB-INF/view/include/menu.jsp" %>
        <!--主要区域开始-->
        <div id="main">            
            <form action="" method="" class="main_form">
                <!--必填项-->
                <div class="text_info clearfix"><span>账务账号ID：</span></div>
                <div class="input_info"><input type="text" value="${account.acc_id} " readonly class="readonly width200" /></div>
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info"><input type="text" value="${account.acc_name}" readonly class="readonly width200" /></div>
                <div class="text_info clearfix"><span>身份证：</span></div>
                <div class="input_info">
                    <input type="text" value="${account.acc_idc}" readonly class="readonly width200" />
                </div>
                <div class="text_info clearfix"><span>登录账号：</span></div>
                <div class="input_info">
                    <input type="text" value="${account.acc_login}" readonly class="readonly width200" />
                </div>                   
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input type="text" class="readonly width200" readonly value="${account.acc_tel}" />
                </div>
                <div class="text_info clearfix"><span>推荐人身份证号码：</span></div>
                <div class="input_info"><input type="text" readonly class="readonly width200" value="${account.acc_inidc}" /></div>
                <div class="text_info clearfix"><span>状态：</span></div>
                <div class="input_info">
                    <select disabled>
                        <c:choose>
                        	<c:when test="${account.acc_state==1}">
                        		<option>开通</option>
                        	</c:when>
                        	<c:when test="${account.acc_state==0}">
                        		<option>暂停</option>
                        	</c:when>
                        	<c:when test="${account.acc_state==2}">
                        		<option>删除</option>
                        	</c:when>
                        </c:choose> 
                    </select>                        
                </div>                    
                <div class="text_info clearfix"><span>开通/暂停/删除时间：</span></div>
                <div class="input_info"><input type="text" readonly class="readonly width200" value="${fn:substring(account.acc_ctime, 0, 19)}" /></div>

                <div class="text_info clearfix"><span>上次登录时间：</span></div>
                <div class="input_info"><input type="text" readonly class="readonly width200" value="${fn:substring(account.acc_initime, 0, 19)}" /></div>
                <div class="text_info clearfix"><span>上次登录IP：</span></div>
                <div class="input_info"><input type="text" readonly class="readonly width200" value="${account.acc_inip }" /></div>
                <!--可选项数据-->
                <div class="text_info clearfix"><span>生日：</span></div>
                <div class="input_info">
                    <input type="text" readonly class="readonly width200" id="brithday"  value="${account.acc_birth}" />
                </div>
                <div class="text_info clearfix"><span>Email：</span></div>
                <div class="input_info">
                    <input type="text" readonly class="readonly width200" value="${account.acc_email}" />
                </div> 
                <div class="text_info clearfix"><span>职业：</span></div>
                <div class="input_info">
                    <select disabled>
                        <option>${account.acc_job}</option>
                    </select>                        
                </div>
                <div class="text_info clearfix"><span>性别：</span></div>
                <div class="input_info fee_type">
                    <input type="radio" name="radSex" id="male" disabled 
                    	<c:if test="${account.acc_sex==0 }"> checked="checked"  </c:if>>
                    <label for="male">男</label>
                    <input type="radio" name="radSex" id="female" disabled
                    	<c:if test="${account.acc_sex==1 }"> checked="checked"  </c:if>> 
                    <label for="female">女</label>
                </div>
                <div class="text_info clearfix"><span>邮编：</span></div>
                <div class="input_info"><input type="text" class="readonly width200" readonly value="${account.acc_post }" /></div> 
                <div class="text_info clearfix"><span>QQ：</span></div>
                <div class="input_info"><input type="text" class="readonly width200" readonly value="${account.qq }" /></div>                
                <div class="text_info clearfix"><span>通信地址：</span></div>
                <div class="input_info"><input type="text" class="width350 readonly" readonly value="${account.acc_addr }" /></div> 
                <!--操作按钮-->
                <div class="button_info clearfix">
                   <%--  <input type="button" value="返回" class="btn_save" onclick="location.href='${pageContext.request.contextPath}/account/getAccountByCondition.do'" /> --%>
                	<button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='${pageContext.request.contextPath}/account/getAccountByCondition.do'" >&nbsp;&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;</button>
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>