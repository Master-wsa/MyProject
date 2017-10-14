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
	            	$("#headClass5").attr("class","service_on");
	            }     
	        }
	        $(function(){
	        	$("#main").css({
	        		"max-height": "1000px"
	        	})
	        	$("body").css({
	        		"background-color":"#0163a0"
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
            <form action="" method="" class="main_form">
                <!--必填项-->
                <div class="text_info clearfix"><span>业务账号ID：</span></div>
                <div class="input_info"><input type="text" value="${buss.ser_id}" readonly class="readonly" /></div>
                <div class="text_info clearfix"><span>账务账号ID：</span></div>
                <div class="input_info"><input type="text" value="${buss.acc.acc_id}" readonly class="readonly" /></div>
                <div class="text_info clearfix"><span>客户姓名：</span></div>
                <div class="input_info"><input type="text" readonly class="readonly" value="${buss.acc.acc_name}" /></div>
                <div class="text_info clearfix"><span>身份证号码：</span></div>
                <div class="input_info"><input type="text" readonly class="readonly" value="${buss.acc.acc_idc}" /></div>
                <div class="text_info clearfix"><span>服务器 IP：</span></div>
                <div class="input_info"><input type="text" value="${buss.ser_ip}" readonly class="readonly" /></div>
                <div class="text_info clearfix"><span>OS 账号：</span></div>
                <div class="input_info"><input type="text" value="${buss.ser_os}" readonly class="readonly" /></div>
                <div class="text_info clearfix"><span>状态：</span></div>
                <div class="input_info">
                    <select disabled>
                        <option <c:if test="${buss.ser_state==1}">selected</c:if>>开通</option>
                        <option <c:if test="${buss.ser_state==0}">selected</c:if>>暂停</option>
                        <option <c:if test="${buss.ser_state==2}">selected</c:if>>删除</option>
                    </select>                        
                </div>
                <div class="text_info clearfix"><span>开通时间：</span></div>
                <div class="input_info"><input type="text" readonly value="${buss.ser_ctime}"  class="readonly" /></div>
                <div class="text_info clearfix"><span>资费 ID：</span></div>
                <div class="input_info"><input type="text" value="${buss.fee.fee_id}"   class="readonly" readonly /></div>
                <div class="text_info clearfix"><span>资费名称：</span></div>
                <div class="input_info"><input type="text" readonly value="${buss.fee.fee_name}"   class="width200 readonly" /></div>
                <div class="text_info clearfix"><span>资费说明：</span></div>
                <div class="input_info_high">
                    <textarea class="width300 height70 readonly" readonly>${buss.fee.fee_des}</textarea>
                </div>  
                <!--操作按钮-->
                <div class="button_info clearfix">
                    <%-- <input type="button" value="返回" class="btn_save" onclick="location.href='${pageContext.request.contextPath}/service/getByPageCondition.do';" /> --%>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='${pageContext.request.contextPath}/service/getByPageCondition.do';" >&nbsp;&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;</button>
                </div>
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>
