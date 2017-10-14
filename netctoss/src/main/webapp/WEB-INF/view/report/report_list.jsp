<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
   	<link href="${pageContext.request.contextPath}/jplot/jquery.jqplot.min.css" rel="stylesheet" />
   	<link href="${pageContext.request.contextPath}/jplot/jquery.jqplot.css" rel="stylesheet" />
	<script src="${pageContext.request.contextPath}/jplot/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/jquery.jqplot.min.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.barRenderer.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.pieRenderer.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.pointLabels.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.donutRenderer.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.dateAxisRenderer.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.canvasTextRenderer.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.canvasAxisTickRenderer.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.categoryAxisRenderer.js"></script>
	<script src="${pageContext.request.contextPath}/jplot/plugins/jqplot.cursor.js"></script>
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/jplot/global.css" />
	<link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/global_color.css" /> 
    	<style type="text/css">

			#curPage{
				 background: #FFF;
    			 border: #89bdd8 solid 1px;
   				 color: #067db5;
			}

		</style>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <script language="javascript" type="text/javascript">
        //表格测试
       /*  for() */
	      /*   $(document).ready(function(){
	        	  var t1 = $($(".summary").children("td").get(1)).attr("name");
              	  var t2 = $($(".summary").children("td").get(2)).attr("name");
              	  var t3 = $($(".summary").children("td").get(3)).attr("name");
		              var data = [
		             ['包月', t1], ['套餐', t2], ['按时', t3]
		             ];
		           $.jqplot('chart', [data], {
		                 seriesDefaults: {
		                    renderer: $.jqplot.PieRenderer,
		                  rendererOptions: {
		                        showDataLabels: true
		                    }
		                },
		               legend: {
		                   show: true,
		                   location: "e"
		               }
		           });
		       });  */ 
	/* 	$(".tr3").mouseover(function(){
			alert("111");
			$($(".tr3").children("div").get(0)).show();

		})
		$(".tr3").mouseout(function(){
			alert("222");
			$($(".tr3").children("div").get(0)).hide();

		}) */
		/* $(".tr3").mouseover(function (){  
			alert("111");
			$($(".tr3").children("div").get(0)).show();
        }).mouseout(function (){  
        	alert("222");
			$($(".tr3").children("div").get(0)).hide();
 
        });  */
        //表格的显示
        function showDetail1(flag) {
            /* $($(".summary").children("div").get(0)).show(); */
            	var line1 = [];
            	for(i=0;i<$(".sat").length;i++){
            	 var t=$(".sat").eq(i).children("td").eq(0).attr("name");
            	 var t1=Number($(".sat").eq(i).children("td").eq(4).attr("name"));
            	 var t2 =[t,t1];
            	 line1.push(t2);
            	 }
	            	if(line1.length>=4){ 
	            		$("#chart1").show();
	                    $(".table2").hide();
	                    $(".tp2").hide();
	            		$("#chart1").attr("style","width:900px;height:350px");
            					var plot1 = $.jqplot('chart1', [line1], {
	            	            	 title:{         // 标题属性
	            	                        text:'Unix 服务器IP与累积时长',// 标题文本
	            	                        show:true,              // 是否阴影
	            	                        fontFamily:'方正',  // 标题字体 
	            	                        fontSize:'14',            // 标题字体大小
	            	                        textAlign:'center',       // 标题对齐方式
	            	                        textColor:'#515151'    // 标题颜色（也可以写作属性color） 
	            	            	 },
	            	                    /* seriesDefaults:{
	            	                        renderer:$.jqplot.BarRenderer,
	            	                        pointLabels: {  // 显示数据点，依赖于jqplot.pointLabels.min.js文件
	            	                            show: true
	            	                        },
	            	                        showLabel:true
	            	                    }, */
	            	                    seriesDefaults:{
	            	                        renderer:$.jqplot.BarRenderer,
	            	                        pointLabels: {  // 显示数据点，依赖于jqplot.pointLabels.min.js文件
	            	                            show: true
	            	                        },
	            	                        rendererOptions: {
	            	                            barMargin: 25,
	            	                        },
	            	                        showLabel:true
	            	                      },
	            	                    
	            	                    axesDefaults:{  // 默认坐标轴属性  
	            	                        min:0,
	            	                        tickOptions:{
	            	                            showMark:false
	            	                        }
	            	                    },
	            	                    axes:{          // 具体坐标轴属性
	            	                        xaxis:{
	            	                            renderer: $.jqplot.CategoryAxisRenderer,
	            	                        },
	            	                        yaxis: {
	            	                        
	            	                        }
	            	                    },
	            	                });
	            	}else{
	            		$("#operate_result_info").text(" 对不起，因数据量太少无法生成图表!");
                        $("#operate_result_info").attr("class","operate_fail");
        				$("#operate_result_info").show().delay(1500).hide(500);
	            	}
            
        }
       /*  $("#xx11").click(function(){
        	alert(1111);
        	$("#chart1").empty();
        	$("#chart1").attr("style","width:0px;height:0px")
  	  }) */
   	  	function removeChart(){
        	$("#chart1").empty();
            $("#chart1").attr("style","width:0px;height:0px");
        	$("#chart1").hide();
        	$(".table2").show();
        	 $(".tp2").show();
        }

         function showDetail(flag, a) {
            /* $($(".summary").children("div").get(0)).show(); */
            $("#chart").show();
            $("#chart").attr("style","width:300px;height:235px");
            var idx = $(a).closest('tr').index();
            var idxx=60+(idx-1)*33+33;
            if(idx>4){
            var	idx1=60+(idx-1)*33-235-33;
            var idxxx ="width:300px;height:235px;margin-top:"+idx1+"px";
            }else{
            var idxxx ="width:300px;height:235px;margin-top:"+idxx+"px";}
            $("#chart").attr("style",idxxx);
            if (flag) {
                $(function (){
              	  var t1 = Number($(a).children("td").eq(1).attr("name"));
              	  var t2 = Number($(a).children("td").eq(2).attr("name"));
              	  var t3 = Number($(a).children("td").eq(3).attr("name"));
              	var data = [
  	             ['包月',t1], ['套餐',t2], ['按时',t3]
  	             ];
  	 
  	           $.jqplot('chart', [data], {
  	                 seriesDefaults: {
  	                    renderer: $.jqplot.PieRenderer,
  	                  	rendererOptions: {
  	                    showDataLabels: true,
  	                    shadow:true,       //为饼的每个部分的边框设置阴影，以突出其立体效果  
  	                    shadowOffset: 2,    //设置阴影区域偏移出饼的每部分边框的距离  
  	                    shadowDepth: 5,     // 设置阴影区域的深度  
  	                    shadowAlpha: 0.07   // 设置阴影区域的透明度  
  	                    }
  	                },
  	               legend: {
  	                   show: true,
  	                   location: "e"
  	               }
  	           });
  	       });
            }
            else{
            	$("#chart").empty();
            	 $("#chart").attr("style","width:0px;height:0px");}
        }
         
        ///////////
        document.onreadystatechange = function () {      
            if(document.readyState=="complete") {
            	$("#headClass7").attr("class","report_on");
            }     
        } 
        $(function(){   	
        		$("#tb1").click(function(){
            		$(".table1").show();
            		$(".tp1").show();
            		$("#tb1").attr("class","tab_on");
            		$(".table2").hide();
            		$(".tp2").hide();
            		$("#tb2").attr("class","tab_out");
            		$(".table3").hide();
            		$(".tp3").hide();
            		$("#tb3").attr("class","tab_out");
            		$("#chart1").empty();
                	$("#chart1").attr("style","width:0px;height:0px");
            		
            	})
            	$("#tb2").click(function(){
            		$(".table1").hide();
            		$(".tp1").hide();
            		$("#tb1").attr("class","tab_out");
            		$(".table2").show();
            		$(".tp2").show();
            		$("#tb2").attr("class","tab_on");
            		$(".table3").hide();
            		$(".tp3").hide();
            		$("#tb3").attr("class","tab_out");
            		
            	})
            	$("#tb3").click(function(){
            		$(".table1").hide();
            		$(".tp1").hide();
            		$("#tb1").attr("class","tab_out");
            		$(".table2").hide();
            		$(".tp2").hide();
            		$("#tb2").attr("class","tab_out");
            		$(".table3").show();
            		$(".tp3").show();
            		$("#tb3").attr("class","tab_on");
            		$("#chart1").empty();
                	$("#chart1").attr("style","width:0px;height:0px");
            	})
             	$(document).on("click",".pg",(function(){
             		var curPage= $(this).attr("name");
             		if(curPage<='${totalPage}'&&curPage>0){
             		$.ajax({
	          			url:"${pageContext.request.contextPath}/report/list.do",
	          			type:"POST",
	          			data:{"curPage":curPage},
	          			success:function(reportList){
                   
	          				$(".td1").remove();
	          			 	$(".tp1").empty(); 
	    	            	for(var i=0;i<reportList.length;i++){
	    	            		var acc_id=reportList[i].acc_id;
	    	            		var acc_login=reportList[i].acc_login;
	    	            		var acc_name=reportList[i].acc_name;
	    	            		var acc_idc=reportList[i].acc_idc;
	    	            		var acc_tel=reportList[i].acc_tel;
	    	            		var bil_time1=reportList[i].bil_time;
	    	            		var bil_time2=bil_time1.replace("-", "年");
	    	            		var bil_time = bil_time2.substring(0,7)+"月";
	    	            		var bil_alltime=reportList[i].bil_alltime;
	    	            		var text = '<tr><td class="td1">'+acc_id+'</td><td class="td1">'+acc_login+'</td><td class="td1">'+acc_name+'</td><td class="td1">'+acc_idc+'</td><td class="td1">'+acc_tel+'</td><td class="td1">'+bil_time+'</td><td class="td1">'+bil_alltime+'</td></tr>'
	    	            		$(".table1").append(text);
	    	            		/* if(curPage!='1'&&curPage!='$totalPage}'){
	    	            			var laPage = curPage-1;
	    	            			var nePage = laPage+2;
	    	            			var text1 ='<a  name="'+laPage+'"  class="pg">上一页</a><a name="'+laPage+'" class="pg">'+laPage+'</a><a name="'+curPage+'" class="pg">'+curPage+'</a><a name="'+nePage+'" class="pg">'+nePage+'</a><a  name="'+nePage+'"  class="pg">下一页</a>'	
	    	            			$(".tp1").append(text1);
	    	            		}
	    	            		if(curPage=='${totalPage}'){
	    	            			var laPage = curPage-2;
	    	            			var nePage = laPage-1;
	    	            			var text1 ='<a  name="'+laPage+'"  class="pg">上一页</a><a name="'+laPage+'" class="pg">'+laPage+'</a><a name="'+nePage+'" class="pg">'+nePage+'</a><a name="'+curPage+'" class="pg">'+curPage+'</a><a  name="'+curPage+'"  class="pg">下一页</a>'	
	    	            			$(".tp1").append(text1);
	    	            		} */
	    	            	}
	    	            	if(curPage=='1'&&'${totalPage}'>2){
    	            			
	    	            		var laPage = curPage-1;
    	            			var lP =  laPage+2
    	            			var nePage = laPage+3;
    	            			var text1 ='<a name="'+curPage+'" class="pg" id="curPage">'+curPage+'</a><a name="'+lP+'" class="pg">'+lP+'</a><a name="'+nePage+'" class="pg">'+nePage+'</a><a  name="2"  class="pg">下一页</a><a name="'+${totalPage}+'" class="pg">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage}页&nbsp;&nbsp;&nbsp;共${totalSize}条记录</span>'	
    	            			$(".tp1").append(text1);
    	            		}
	    	            	if(curPage=='2'&&'${totalPage}'>2){
    	            			var laPage = curPage-1;
    	            			var nePage = laPage+2;
    	            			var text1 ='<a name="1" class="pg">首页</a><a  name="'+laPage+'"  class="pg">上一页</a><a name="'+laPage+'" class="pg">'+laPage+'</a><a name="'+curPage+'" class="pg" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg">'+nePage+'</a><a  name="'+nePage+'"  class="pg">下一页</a><a name="'+${totalPage}+'" class="pg">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage}页&nbsp;&nbsp;&nbsp;共${totalSize}条记录</span>'
    	            			$(".tp1").append(text1);
    	            		}
	    	            	if(curPage=='${totalPage}'&&'${totalPage}'>2){
    	            			var laPage = curPage-2;
    	            			var nePage = curPage-1;
    	            			var text1 ='<a name="1" class="pg">首页</a><a  name="'+nePage+'"  class="pg">上一页</a><a name="'+laPage+'" class="pg">'+laPage+'</a><a name="'+nePage+'" class="pg">'+nePage+'</a><a name="'+curPage+'" class="pg" id="curPage">'+curPage+'</a><span>&nbsp;第'+curPage+'页/共${totalPage}页&nbsp;&nbsp;&nbsp;共${totalSize}条记录</span>'
    	            			$(".tp1").append(text1);
    	            		} 
	    	            	if(curPage!='1'&&curPage!='${totalPage}'&&curPage!='2'&&'${totalPage}'>2){
	    	            			var laPage = curPage-1;
	    	            			var nePage = laPage+2;
	    	            			var text1 ='<a name="1" class="pg">首页</a><a  name="'+laPage+'"  class="pg">上一页</a><a name="'+laPage+'" class="pg">'+laPage+'</a><a name="'+curPage+'" class="pg" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg">'+nePage+'</a><a  name="'+nePage+'"  class="pg">下一页</a><a name="'+${totalPage}+'" class="pg">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage}页&nbsp;&nbsp;&nbsp;共${totalSize}条记录</span>'	
	    	            			$(".tp1").append(text1);
	    	            	}
	    	            	if(curPage=='2'&&'${totalPage}'=='2'){
	            				 	var laPage=curPage-1;
	            				 	var nePage = laPage+2;
	            				 	var text1='<a name="1" class="pg">首页</a><a  name="'+laPage+'"  class="pg">上一页</a><a name="'+laPage+'" class="pg">'+laPage+'</a><a name="'+curPage+'" class="pg" id="curPage">'+curPage+'</a><a  name="'+nePage+'"  class="pg">下一页</a><a name="'+${totalPage}+'" class="pg">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage}页&nbsp;&nbsp;&nbsp;共${totalSize}条记录</span>'
	            					$(".tp1").append(text1);
	            			}
	            			if(curPage=='1'&&'${totalPage}'=='2'){
			    				 	var laPage=curPage-1;
			    				 	var nePage = laPage+2;
			    				 	var text1='<a name="'+curPage+'" class="pg" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg">'+nePage+'</a><a  name="'+nePage+'"  class="pg">下一页</a><a name="'+${totalPage}+'" class="pg">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage}页&nbsp;&nbsp;&nbsp;共${totalSize}条记录</span>'
			    					$(".tp1").append(text1);
    						}
             				if(curPage=='1'&&'${totalPage}'=='1'){
								 	var laPage=curPage-1;
								 	var nePage = laPage+2;
								 	var text1='<a name="'+curPage+'" class="pg" id="curPage">'+curPage+'</a>'
									$(".tp1").append(text1);
							}
	          			}
	        		}) 
       				 }
             	}))
             	$(document).on("click",".pg1",(function(){
             		var curPage= $(this).attr("name");
             		if(curPage<='${totalPage2}'&&curPage>0){
             		$.ajax({
	          			url:"${pageContext.request.contextPath}/report/list2.do",
	          			type:"POST",
	          			data:{"curPage":curPage},
	          			success:function(reportList){
	          				$(".td2").remove();
	          				$(".sat").remove();
	          				$(".tp2").empty();
	    	            	for(var i=0;i<reportList.length;i++){
	    	            		var ser_ip=reportList[i].ser_ip;
	    	            		var acc_login=reportList[i].acc_login;
	    	            		var acc_name=reportList[i].acc_name;
	    	            		var acc_idc=reportList[i].acc_idc;
	    	            		var sat=reportList[i].sat;
	    	            		var text = '<tr class="sat"><td class="td2" name="'+ser_ip+'">'+ser_ip+'</td><td class="td2" name="'+acc_login+'">'+acc_login+'</td><td class="td2" name="'+acc_name+'">'+acc_name+'</td><td class="td2" name="'+acc_idc+'">'+acc_idc+'</td><td class="td2" name="'+sat+'">'+sat+'</td>'
	    	            		$(".table2").append(text);
	    	            	}
	    	            	if(curPage=='1'&&'${totalPage2}'>2){
    	            			var laPage = curPage-1;
    	            			var lP =  laPage+2
    	            			var nePage = laPage+3;
    	            			var text1 ='<a name="'+curPage+'" class="pg1" id="curPage">'+curPage+'</a><a name="'+lP+'" class="pg1">'+lP+'</a><a name="'+nePage+'" class="pg1">'+nePage+'</a><a  name="2"  class="pg1">下一页</a><a name="'+${totalPage2}+'" class="pg1">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage2}页&nbsp;&nbsp;&nbsp;共${totalSize2}条记录</span><a  id="xx11" onmouseover="showDetail1(true);" onmouseout="showDetail1(false)"  style="color:RED;">图表</a>'	
    	            			$(".tp2").append(text1);
    	            		}
	    	            	if(curPage=='2'&&'${totalPage2}'>2){
    	            			var laPage = curPage-1;
    	            			var nePage = laPage+2;
    	            			var text1 ='<a name="1" class="pg1">首页</a><a  name="'+laPage+'"  class="pg1">上一页</a><a name="'+laPage+'" class="pg1">'+laPage+'</a><a name="'+curPage+'" class="pg1" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg1">'+nePage+'</a><a  name="'+nePage+'"  class="pg1">下一页</a><a name="'+${totalPage2}+'" class="pg1">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage2}页&nbsp;&nbsp;&nbsp;共${totalSize2}条记录</span><a  id="xx11" onmouseover="showDetail1(true);" onmouseout="showDetail1(false)"  style="color:RED;">图表</a>'	
    	            			$(".tp2").append(text1);
    	            		}
	    	            	if(curPage=='${totalPage2}'&&'${totalPage2}'>2){
    	            			var laPage = curPage-2;
    	            			var nePage = curPage-1;
    	            			var text1 ='<a name="1" class="pg1">首页</a><a  name="'+nePage+'"  class="pg1">上一页</a><a name="'+laPage+'" class="pg1">'+laPage+'</a><a name="'+nePage+'" class="pg1">'+nePage+'</a><a name="'+curPage+'" class="pg1" id="curPage">'+curPage+'</a><span>&nbsp;第'+curPage+'页/共${totalPage2}页&nbsp;&nbsp;&nbsp;共${totalSize2}条记录</span><a  id="xx11" onmouseover="showDetail1(true);" onmouseout="showDetail1(false)"  style="color:RED;">图表</a>'	
    	            			$(".tp2").append(text1);
    	            		} 
	    	            	if(curPage!='1'&&curPage!='${totalPage2}'&&curPage!='2'&&'${totalPage2}'>2){
	    	            			var laPage = curPage-1;
	    	            			var nePage = laPage+2;
	    	            			var text1 ='<a name="1" class="pg1">首页</a><a  name="'+laPage+'"  class="pg1">上一页</a><a name="'+laPage+'" class="pg1">'+laPage+'</a><a name="'+curPage+'" class="pg1" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg1">'+nePage+'</a><a  name="'+nePage+'"  class="pg1">下一页</a><a name="'+${totalPage2}+'" class="pg1">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage2}页&nbsp;&nbsp;&nbsp;共${totalSize2}条记录</span><a  id="xx11" onmouseover="showDetail1(true);" onmouseout="showDetail1(false)"  style="color:RED;">图表</a>'	
	    	            			$(".tp2").append(text1);
	    	            	}
	    	            	if(curPage=='2'&&'${totalPage2}'=='2'){
	            				 	var laPage=curPage-1;
	            				 	var nePage = laPage+2;
	            				 	var text1='<a name="1" class="pg1">首页</a><a  name="'+laPage+'"  class="pg1">上一页</a><a name="'+laPage+'" class="pg1">'+laPage+'</a><a name="'+curPage+'" class="pg1" id="curPage">'+curPage+'</a><span>&nbsp;第'+curPage+'页/共${totalPage2}页&nbsp;&nbsp;&nbsp;共${totalSize2}条记录</span><a  id="xx11" onmouseover="showDetail1(true);" onmouseout="showDetail1(false)"  style="color:RED;">图表</a>'
	            					$(".tp2").append(text1);
	            			}
	            			if(curPage=='1'&&'${totalPage2}'=='2'){
			    				 	var laPage=curPage-1;
			    				 	var nePage = laPage+2;
			    				 	var text1='<a name="'+curPage+'" class="pg1" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg1">'+nePage+'</a><a  name="'+nePage+'"  class="pg1">下一页</a><a name="'+${totalPage2}+'" class="pg1">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage2}页&nbsp;&nbsp;&nbsp;共${totalSize2}条记录</span><a  id="xx11" onmouseover="showDetail1(true);" onmouseout="showDetail1(false)"  style="color:RED;">图表</a>'
			    					$(".tp2").append(text1);
    						}
             				if(curPage=='1'&&'${totalPage2}'=='1'){
								 	var laPage=curPage-1;
								 	var nePage = laPage+2;
								 	var text1='<a name="'+curPage+'" class="pg1" id="curPage">'+curPage+'</a><span>&nbsp;第'+curPage+'页/共${totalPage2}页&nbsp;&nbsp;&nbsp;共${totalSize2}条记录</span><a  id="xx11" onmouseover="showDetail1(true);" onmouseout="showDetail1(false)"  style="color:RED;">图表</a>'
									$(".tp2").append(text1);
							}
	          			}
	        		})
             		}
             	}))
             	$(document).on("click",".pg2",(function(){
             		var curPage= $(this).attr("name");
             		if(curPage<='${totalPage3}'&&curPage>0){
	            	$.ajax({
	          			url:"${pageContext.request.contextPath}/report/list3.do",
	          			type:"POST",
	          			data:{"curPage":curPage},
	          			success:function(reportList){
	          				$(".td3").remove();
	          				$(".tp3").empty(); 
	          				$(".summary").remove();
	    	            	for(var i=0;i<reportList.length;i++){
	    	            		var ser_ip=reportList[i].ser_ip;
	    	            		var t0=reportList[i].t0;
	    	            		var t1=reportList[i].t1;
	    	            		var t2=reportList[i].t2;
	    	            		var text = '<tr class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);"><td class="td3">'+ser_ip+'</td><td  id="td3t0" name="'+t0+'" class="td3">'+t0+'</td><td  id="td3t1" name="'+t1+'" class="td3">'+t1+'</td><td   id="td3t2" name="'+t2+'" class="td3">'+t2+'</td><span>&nbsp;第'+curPage+'页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>'
	    	            		$(".table3").append(text);
	    	            	}
	    	            	if(curPage=='1'&&'${totalPage3}'>2){
    	            			var laPage = curPage-1;
    	            			var lP =  laPage+2
    	            			var nePage = laPage+3;
    	            			var text1 ='<a name="'+curPage+'" class="pg2" id="curPage">'+curPage+'</a><a name="'+lP+'" class="pg2">'+lP+'</a><a name="'+nePage+'" class="pg">'+nePage+'</a><a  name="2"  class="pg2">下一页</a><a name="'+${totalPage3}+'" class="pg2">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>'
    	            			$(".tp3").append(text1);
    	            		}
	    	            	if(curPage=='2'&&'${totalPage3}'>2){
    	            			var laPage = curPage-1;
    	            			var nePage = laPage+2;
    	            			var text1 ='<a name="1" class="pg2">首页</a><a  name="'+laPage+'"  class="pg2">上一页</a><a name="'+laPage+'" class="pg2">'+laPage+'</a><a name="'+curPage+'" class="pg2" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg2">'+nePage+'</a><a  name="'+nePage+'"  class="pg2">下一页</a><a name="'+${totalPage3}+'" class="pg2">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>'
    	            			$(".tp3").append(text1);
    	            		}
	    	            	if(curPage=='${totalPage3}'&&'${totalPage3}'>2){
    	            			var laPage = curPage-2;
    	            			var nePage = curPage-1;
    	            			var text1 ='<a name="1" class="pg2">首页</a><a  name="'+nePage+'"  class="pg2">上一页</a><a name="'+laPage+'" class="pg2">'+laPage+'</a><a name="'+nePage+'" class="pg2">'+nePage+'</a><a name="'+curPage+'" class="pg2" id="curPage">'+curPage+'</a><span>&nbsp;第'+curPage+'页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>'	
    	            			$(".tp3").append(text1);
    	            		} 
	    	            	if(curPage!='1'&&curPage!='${totalPage3}'&&curPage!='2'&&'${totalPage3}'>2){
	    	            			var laPage = curPage-1;
	    	            			var nePage = laPage+2;
	    	            			var text1 ='<a name="1" class="pg2">首页</a><a  name="'+laPage+'"  class="pg2">上一页</a><a name="'+laPage+'" class="pg2">'+laPage+'</a><a name="'+curPage+'" class="pg2" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg2">'+nePage+'</a><a  name="'+nePage+'"  class="pg2">下一页</a><a name="'+${totalPage3}+'" class="pg2">末页</a><span>&nbsp;第'+curPage+'页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>'	
	    	            			$(".tp3").append(text1);
	    	            	}
	    	            	if(curPage=='2'&&'${totalPage3}'=='2'){
	            				 	var laPage=curPage-1;
	            				 	var nePage = laPage+2;
	            				 	var text1='<a name="1" class="pg2">首页</a><a  name="'+laPage+'"  class="pg2">上一页</a><a name="'+laPage+'" class="pg2">'+laPage+'</a><a name="'+curPage+'" class="pg2" id="curPage">'+curPage+'</a><span>&nbsp;第'+curPage+'页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>'
	            					$(".tp3").append(text1);
	            			}
	            			if(curPage=='1'&&'${totalPage3}'=='2'){
			    				 	var laPage=curPage-1;
			    				 	var nePage = laPage+2;
			    				 	var text1='<a name="'+curPage+'" class="pg2" id="curPage">'+curPage+'</a><a name="'+nePage+'" class="pg2">'+nePage+'</a><a  name="'+nePage+'"  class="pg2">下一页</a><a name="'+${totalPage3}+'" class="pg2">末页<span>&nbsp;第'+curPage+'页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>'
			    					$(".tp3").append(text1);
    						}
             				if(curPage=='1'&&'${totalPage3}'=='1'){
								 	var laPage=curPage-1;
								 	var nePage = laPage+2;
								 	var text1='<a name="'+curPage+'" class="pg2" id="curPage">'+curPage+'</a><span>&nbsp;第'+curPage+'页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>'
									$(".tp3").append(text1);
							}
	          			}
	        		})
             		}
             	}))
            })
              $(document).ready(function(){
            	  $("#chart").hide(); 
            	  $("#chart1").hide(); 
   			 })
        </script>
    </head>
    <body>
          <!--Logo区域开始-->
        <%@include file="/WEB-INF/view/include/header.jsp" %>
        <!--导航区域开始-->
        <%@include file="/WEB-INF/view/include/menu.jsp" %>
        <!--主要区域开始-->        
        <div id="report_main">
        	<div class="tabs">
    	        <ul>
        	        <li><a  class="tab_on" title="每位客户每月的累计时长" id="tb1">客户使用时长</a></li>
                    <li><a  class="tab_out" title="每台服务器上累计时长最高的客户" id="tb2">时长排行榜</a></li>
                    <li><a  class="tab_out" title="每台服务器每种资费标准的使用次数" id="tb3">资费使用率</a></li>
                </ul>
            </div>            
            <div class="report_box">
                <!--数据区域：用表格展示数据-->
                <div id="report_data">
                    <table id="datalist" class="table1">
                        <tr>                            
                            <th class="width80">账号 ID</th>
                            <th class="width100">账务帐号</th>
                            <th class="width100">客户名称</th>
                            <th class="width200">身份证号码</th>
                            <th>电话</th>
                            <th class="width150">月份</th>
                            <th class="width150">累积时长</th>
                        </tr>
                        <c:forEach items="${report}" var="report">
                        <tr>
                        	<td class="td1">${report.acc_id}</td>
                            <td class="td1">${report.acc_login}</td>
                            <td class="td1">${report.acc_name}</td>
                            <td class="td1">${report.acc_idc}</td>
                            <td class="td1">${report.acc_tel}</td>
                            <td class="td1">${fn:replace(fn:substring(report.bil_time,0,7),'-','年')}月</td>
                            <td class="td1">${report.bil_alltime}</td>
                        </tr>
                        </c:forEach>                
                    </table>
                    <table id="datalist" class="table2" style="display:none;">
                        <tr>                            
                            <th class="width300">Unix 服务器IP</th>
                            <th class="width100">账务帐号</th>
                            <th class="width100">客户名称</th>
                            <th class="width200">身份证号码</th>
                            <th class="width150">累积时长</th>
                        </tr> 
                        <c:forEach items="${report1}" var="report">
                        <tr class="sat">                            
                            <td class="td2" name="${report.ser_ip}">${report.ser_ip}</td>
                            <td class="td2" name="${report.acc_login}">${report.acc_login}</td>
                            <td class="td2" name="${report.acc_name}">${report.acc_name}</td>
                            <td class="td2" name="${report.acc_idc}">${report.acc_idc}</td>
                            <td class="td2" name="${report.sat}">${report.sat}</td>
                        </tr>    
                        </c:forEach> 
                         <div id="chart1" style="width:925px;height:425px;" class="detail_info2" onclick="removeChart()"></div>                 
                    </table>
                    <table id="datalist" class="table3" style="display:none;">
                        <tr>   
                          <!-- class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);"    -->            
                           <!-- style="width:500px;height:300px;" --><!--  class="detail_info" -->
                            <th class="width300">Unix 服务器IP</th>
                            <th class="width213">包月</th>
                            <th class="width213">套餐</th>
                            <th class="width213">计时</th> 
                        </tr>
                        <c:forEach items="${report2}" var="report">
                        <tr  class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);">                             
                            <td class="td3" name="${report.ser_ip}">${report.ser_ip}</td>
                            <td class="td3" name="${report.t0}">${report.t0}</td>
                            <td class="td3" name="${report.t1}">${report.t1}</td>
                            <td class="td3" name="${report.t2}">${report.t2}</td>                          
                        </tr>      
                        </c:forEach>
                        <div id="chart"  float:right;" class="detail_info1"></div>                                              
                    </table>
                     <div id="operate_result_info" style="display: block;margin-top:160px;margin-left:170px;"></div>
                </div> 
                <!--分页-->
                <div id="pages" class="tp1">
               		<c:forEach var="item" varStatus="status" begin="1" end="${totalPage}">
               			<c:if test="${curPage==1&&status.index<4}"> 
								<a name="${status.index}" class="pg"
								<c:if test="${status.index==1}">
										 id="curPage"
									</c:if>
								>${status.index}</a>
						</c:if>
					</c:forEach>  
        	        <a name="${curPage+1}" class="pg">下一页</a>
        	        <a name="${totalPage}" class="pg">末页</a>
        	        <span>&nbsp;第${curPage}页/共${totalPage}页&nbsp;&nbsp;&nbsp;共${totalSize}条记录</span>
        	     
                </div>
                <div id="pages" class="tp2" style="display:none;">
                    <!-- <a href="#">1</a> -->
               		<c:forEach var="item" varStatus="status" begin="1" end="${totalPage2}">
               			 <c:if test="${curPage==1&&status.index<4}">
								<a name="${status.index}" class="pg1"
									<c:if test="${status.index==1}">
										 id="curPage"
									</c:if>
								>${status.index}</a>
						 </c:if>
					</c:forEach>  
        	        <a name="${curPage+1}" class="pg1">下一页</a>
        	        <a name="${totalPage2}" class="pg1">末页</a>
        	        <span>&nbsp;第${curPage}页/共${totalPage2}页&nbsp;&nbsp;&nbsp;共${totalSize2}条记录</span>
        	        <a  id="xx11" onmouseover="showDetail1(true);" onmouseout="showDetail1(false)" style="color:RED;">图表</a>
        	      	 
               </div>
               <div id="pages" class="tp3" style="display:none;">
               		<c:forEach var="item" varStatus="status" begin="1" end="${totalPage3}">
								<c:if test="${curPage==1&&status.index<4}">
								<a name="${status.index}" class="pg2"
									<c:if test="${status.index==1}">
										 id="curPage"
									</c:if>
								>${status.index}</a>
								</c:if>
					</c:forEach> 
        	        <a name="${curPage+1}" class="pg2">下一页</a>
        	         <a name="${totalPage3}" class="pg2">末页</a>
        	         <span>&nbsp;第${curPage}页/共${totalPage3}页&nbsp;&nbsp;&nbsp;共${totalSize3}条记录</span>
        	      	 
                </div>
            </div>
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
          
        </div>
    </body>
</html>