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
	      //切换资费类型
			  $(document).ready(function(){
				  if('${fee.fee_type}'=='0'){
					 	$("#dur1").hide();
						$("#dur2").hide();
						$("#bas1").show();
						$("#bas2").show();
						$("#unit1").hide();
						$("#unit2").hide();
				   	}
					if('${fee.fee_type}'=='1'){
						$("#dur1").show();
				   		$("#dur2").show();
				   		$("#bas1").show();
				   		$("#bas2").show();
				   		$("#unit1").show();
				   		$("#unit2").show();
				   	}
					if('${fee.fee_type}'=='2'){
						$("#dur1").hide();
				   		$("#dur2").hide();
				   		$("#bas1").hide();
				   		$("#bas2").hide();
				   		$("#unit1").show();
				   		$("#unit2").show();
					}
				if("${requestScope.msg}"!=''){
		       		showResultDiv("${requestScope.msg}")
		       		window.setTimeout("closeResultDiv()", 1000);
		       	} 
			 })
			/* function month(){
				$("#dur1").hide();
				$("#dur2").hide();
				$("#bas1").show();
				$("#bas2").show();
				$("#unit1").hide();
				$("#unit2").hide();
			}
			function combo(){
				$("#dur1").show();
		   		$("#dur2").show();
		   		$("#bas1").show();
		   		$("#bas2").show();
		   		$("#unit1").show();
		   		$("#unit2").show();
			}
			function time(){
				$("#dur1").hide();
		   		$("#dur2").hide();
		   		$("#bas1").hide();
		   		$("#bas2").hide();
		   		$("#unit1").show();
		   		$("#unit2").show();
			} */
			document.onreadystatechange = function () {      
	            if(document.readyState=="complete") {
	            	$("#headClass3").attr("class","fee_on");
	            }     
	        } 
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
                <div class="text_info clearfix"><span>资费ID：</span></div>
                <div class="input_info"><input type="text" class="readonly" readonly value="${fee.fee_id }" /></div>
                <div class="text_info clearfix"><span>资费名称：</span></div>
                <div class="input_info"><input type="text" class="readonly" readonly value="${fee.fee_name }"/></div>
                <div class="text_info clearfix"><span>资费状态：</span></div>
                <div class="input_info">
                    <select class="readonly" disabled>
                        <c:choose>
                        	<c:when test="${fee.fee_state==1 }">
                        		<option >开通</option>
                        	</c:when>
                        	<c:when test="${fee.fee_state==0 }">
                        		<option>暂停</option>
                        	</c:when>
                        	<c:when test="${fee.fee_state==2 }">
                        		<option>删除</option>
                        	</c:when>
                        </c:choose>
                    </select>                        
                </div>
                <div class="text_info clearfix"><span>资费类型：</span></div>
                <div class="input_info fee_type">
                	<c:choose>
                		<c:when test="${fee.fee_type==0 }">
                			<input type="radio" checked="checked" name="radFeeType" id="month" disabled="disabled" />
                    		<label for="monthly">包月</label>
                		</c:when>
                		<c:when test="${fee.fee_type!=0 }">
                			<input type="radio"  name="radFeeType" id="month" disabled="disabled" />
                    		<label for="monthly">包月</label>
                		</c:when>
				    </c:choose>
                	<c:choose>
                		<c:when test="${fee.fee_type==1 }">
                			<input type="radio" checked="checked" name="radFeeType" id="combo" disabled="disabled" />
                    		<label for="monthly">套餐</label>
                		</c:when>
                		<c:when test="${fee.fee_type!=1 }">
                			<input type="radio"  name="radFeeType" id="combo" disabled="disabled" />
                    		<label for="monthly">套餐</label>
                		</c:when>
                	</c:choose>
                	<c:choose>
                		<c:when test="${fee.fee_type==2 }">
                			<input type="radio" checked="checked" name="radFeeType" id="time" disabled="disabled" />
                    		<label for="monthly">计时</label>
                		</c:when>
                		<c:when test="${fee.fee_type!=2 }">
                			<input type="radio"  name="radFeeType" id="time" disabled="disabled" />
                    		<label for="monthly">计时</label>
                		</c:when>
                	</c:choose>
                </div>
                <div class="text_info clearfix" id="dur1"><span>基本时长：</span></div>
                <div class="input_info" id="dur2">
                    <input type="text" class="readonly" readonly value="${fee.fee_time }"  />
                    <span>小时</span>
                </div>
                <div class="text_info clearfix" id="bas1"><span>基本费用：</span></div>
                <div class="input_info" id="bas2">
                    <input type="text"  class="readonly" readonly value="${fee.fee_bfee }" />
                    <span>元</span>
                </div>
                <div class="text_info clearfix" id="unit1"><span>单位费用：</span></div>
                <div class="input_info" id="unit2">
                    <input type="text"  class="readonly" readonly value="${fee.fee_ufee }" />
                    <span>元/小时</span>
                </div>
                <div class="text_info clearfix"><span>创建时间：</span></div>
                <div class="input_info"><input type="text"  class="readonly" readonly value="${fee.fee_ctime }" /></div>      
                <div class="text_info clearfix"><span>启动时间：</span></div>
                <div class="input_info"><input type="text"  class="readonly" readonly value="${fee.fee_stime }" /></div>      
                <div class="text_info clearfix"><span>资费说明：</span></div>
                <div class="input_info_high">
                    <textarea class="width300 height70 readonly" readonly>${fee.fee_des }</textarea>
                </div>                    
                <div class="button_info clearfix">
                    <%-- <input type="button" value="返回" class="btn_save" onclick="location.href='${pageContext.request.contextPath}/fee/getAllFee.do'" /> --%>
                    <button type="button" class="btn btn-primary" style="height:36px;width:100px;font-size:18px" onclick="location.href='${pageContext.request.contextPath}/fee/getAllFee.do'" >&nbsp;&nbsp;取&nbsp;&nbsp;消&nbsp;&nbsp;</button>
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
           
        </div>
    </body>
</html>