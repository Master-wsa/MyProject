<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <%@include file="/WEB-INF/view/include/css.jsp" %>
        <style type="text/css">
        	#null{text-align: center;}
        	ul li{  font-size:2em; text-align:center; font-family:'BebasNeueRegular', Arial, Helvetica, sans-serif; } 
		</style>
        <script language="javascript" type="text/javascript">
	        document.onreadystatechange = function () {      
	            if(document.readyState=="complete") {
	            	$("#headClass6").attr("class","bill_on");
	            }     
	        } 
        	function page(curPage){  
        		$("#curPage").val(curPage);
        		$("#myform").submit();        		 
        	}
        	function sub(){
        		$("#searchon").val("1");
        		$("#myform").submit();
        	}
            //写入下拉框中的年份和月份
            function initialYearAndMonth() {
                //写入最近3年
                var yearObj = document.getElementById("selYears");
                var year = (new Date()).getFullYear();
                for (var i = 0; i <= 2; i++) {
                    var opObj = new Option(year - i, year - i);
                    yearObj.options[i] = opObj;
                    if(yearObj.options[i].value=='${sessionScope.year}'){
                    	yearObj.options[i].selected=true;
                    } 
                }
                //写入 12 月
                var monthObj = document.getElementById("selMonths");
                var opObj = new Option("全部", -1);
                monthObj.options[0] = opObj;
                for (var i = 1; i <= 12; i++) {
                    var opObj = new Option(i, i);
                    monthObj.options[i] = opObj;
                    if(monthObj.options[i].value=='${sessionScope.month}'){
                    	monthObj.options[i].selected=true;
                    } 
                }
            }
        </script>
    </head>
    <body onload="initialYearAndMonth();">
        <!--Logo区域开始-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--导航区域开始-->
       	<%@include file="/WEB-INF/view/include/menu.jsp" %>
        <!--主要区域开始-->
        <div id="main">
            <form id="myform" action="${pageContext.request.contextPath}/bill/searchBill.do" method="post">
                <!--查询-->
                <div class="search_add">                        
                    <div>身份证：<input name="acc_idc" type="text"  class="text_search" value="${sessionScope.bill.acc.acc_idc}" /></div>
                   <%--  <c:if test="${searchBill.acc.acc_id!=0}">
                    	<div>账务账号：<input name="acc_id" type="text" class="width100 text_search" value="${sessionScope.bill.acc.acc_id}" /></div>
                    </c:if>
                    <c:if test="${searchBill.acc.acc_id==0}"> --%>
                    	<div>账务账号：<input name="acc_id" type="text" class="width100 text_search" value="${sessionScope.bill.acc.acc_ids}" /></div> 
                    <%-- </c:if>  --%>                           
                    <div>姓名：<input name="acc_name" type="text" class="width70 text_search" value="${sessionScope.bill.acc.acc_name}" /></div>
                    <div>
                        <select name="year" class="select_search" id="selYears">
                        </select>
                       	 年
                        <select name="month" class="select_search" id="selMonths">
                        </select>
                       	 月
                    </div>
                    <div>
                    <!-- <input id="search" type="submit" value="搜索" class="btn_search" /> -->

                    <button id="search" type="button" class="btn btn-primary btn-xs" onclick="sub()">&nbsp;&nbsp;搜&nbsp;&nbsp;索&nbsp;&nbsp;</button>

                    </div>
                </div>  
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
                    <tr>
                        <th class="width50">账单ID</th>
                        <th class="width70">姓名</th>
                        <th class="width150">身份证</th>
                        <th class="width150">账务账号</th>
                        <th>费用</th>
                        <th class="width100">月份</th>
                        <th class="width100">支付方式</th>
                        <th class="width100">支付状态</th>                                                        
                        <th class="width50"></th>
                    </tr>
                    <c:forEach var="bill" items="${billList}" >
                    	<tr>
	                        <td>${bill.bil_id }</td>
	                        <td>${bill.acc.acc_name }</td>
	                        <td>${bill.acc.acc_idc }</td>
	                        <td>${bill.acc.acc_id }</td>
	                        <td>${bill.bil_fee }</td>
	                        <td>${fn:replace(fn:substring(bill.bil_time,0,7),'-','年')}月</td>
	                        <c:if test="${bill.bil_pstate==1 }">
	                        	<c:if test="${bill.bil_pway==0 }">
	                        		<td>现金</td>
	                        	</c:if>
	                        	<c:if test="${bill.bil_pway==1 }">
	                        		<td>银行卡</td>
	                        	</c:if>
	                        	<c:if test="${bill.bil_pway==2 }">
	                        		<td>其他</td>
	                        	</c:if>
	                        	<td>已支付</td>
	                        </c:if> 
	                        <c:if test="${bill.bil_pstate!=1 }">
	                        	<td>—</td>
	                        	<td>未支付</td>
	                        </c:if>                           
                        <td><a href="${pageContext.request.contextPath}/bill/itemList.do?acc_id=${bill.acc.acc_id }&time=${bill.bil_time }&bil_fee=${bill.bil_fee }&curPage=1" title="账单明细" >明细</a></td>
                    </tr>
                    </c:forEach>
                </table> 
                <c:if test="${fn:length(billList)==0}">
           			<div id="null">
           				<ul>
           					<li> &nbsp;  </li>
           					<li>很抱歉，没有找到符合条件的账单！</li>
           				</ul>
           			</div>
                </c:if>        
                </div>                    
                <!--分页-->
                <c:if test="${fn:length(billList)!=0}">
	                <div id="pages">
	        	        <%-- <c:if test="${curPage==1 }">
	        	        	<a>首页</a>
	        	        	<a>上一页</a>
	        	        </c:if> --%>
	        	         <c:if test="${curPage!=1 }">
	        	        	<a onclick="page(1)" >首页</a>
	        	        	<a onclick="page(${curPage-1 })" >上一页</a>
	        	        </c:if>
	        	        <c:if test="${curPage==count&&count>=3 }">
	        	        	<a onclick="page(${curPage-2 })" >${curPage-2 }</a>
	        	        </c:if>
	        	        <c:if test="${!curPage.equals('1')&&curPage!=1 }">
	        	        	<a onclick="page(${curPage-1 })" >${curPage-1 }</a>
	        	        </c:if>
	        	        <a class="current_page" onclick="page(${curPage })" >${curPage }</a> 
	        	        <c:if test="${!(curPage+'').equals(count+'') }">
	        	        	<a onclick="page(${curPage+1 })" >${curPage+1 }</a>
	        	        </c:if>
	        	        <c:if test="${curPage==1&&count>=3 }">
	        	        	<a onclick="page(${curPage+2 })" >${curPage+2 }</a>
	        	        </c:if>
	                   	<%-- <c:if test="${curPage==count }">
	                   		<a>下一页</a>
	                    	<a>末页</a>
	                   	</c:if> --%>
	                   	<c:if test="${curPage!=count }">
	                   		<a onclick="page(${curPage+1 })" >下一页</a>
	                    	<a onclick="page(${count})">末页</a>
	                   	</c:if>&nbsp;
	                    <span>第${curPage}页/共${count}页&nbsp;&nbsp;&nbsp;共${totalRecord}条记录</span>
	                </div>  
	            </c:if>
                <input id="curPage" name="curPage" value="1" type="hidden"/>  
                <c:if test="${searchon==''}">
                <input id="searchon" name="searchon" value="0" type="hidden"/>
                </c:if> 
                <c:if test="${searchon!=''}">
                <input id="searchon" name="searchon" value="${searchon}" type="hidden"/>
                </c:if>                  
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
        </div>
    </body>
</html>