<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <%@include file="include/css.jsp" %>
        <style type="text/css">
		body{
			 background:#202020;
			 font:bold 12px Arial, Helvetica, sans-serif;
			 margin:0;
			 padding:0;
			 min-width:960px;
			 color:#bbbbbb; 
		}
		
		a { 
			text-decoration:none; 
			color:#00c6ff;
		}
		
		h1 {
			font: 4em normal Arial, Helvetica, sans-serif;
			padding: 20px;	margin: 0;
			text-align:center;
		}
		
		h1 small{
			font: 0.2em normal  Arial, Helvetica, sans-serif;
			text-transform:uppercase; letter-spacing: 0.2em; line-height: 5em;
			display: block;
		}
		
		h2 {
		    font-weight:700;
		    color:#bbb;
		    font-size:20px;
		}
		
		h2, p {
			margin-bottom:10px;
		}
		
		@font-face {
		    font-family: 'BebasNeueRegular';
		    src: url('BebasNeue-webfont.eot');
		    src: url('BebasNeue-webfont.eot?#iefix') format('embedded-opentype'),
		         url('BebasNeue-webfont.woff') format('woff'),
		         url('BebasNeue-webfont.ttf') format('truetype'),
		         url('BebasNeue-webfont.svg#BebasNeueRegular') format('svg');
		    font-weight: normal;
		    font-style: normal;
		
		}
		
		.container {width: 960px; margin: 0 auto; overflow: hidden;}
		
		.clock {width:800px; margin:50px auto; color:#fff; }
		
		#Date { font-family:'BebasNeueRegular', Arial, Helvetica, sans-serif; font-size:36px; text-align:center; text-shadow:0 0 5px #00c6ff; }
		
		ul { width:800px; margin:0 auto; padding:0px; list-style:none; text-align:center; }
		ul li { display:inline; font-size:10em; text-align:center; font-family:'BebasNeueRegular', Arial, Helvetica, sans-serif; text-shadow:0 0 5px #00c6ff; }
		
		#point { position:relative; -moz-animation:mymove 1s ease infinite; -webkit-animation:mymove 1s ease infinite; padding-left:10px; padding-right:10px; }
		
		@-webkit-keyframes mymove 
		{
		0% {opacity:1.0; text-shadow:0 0 20px #00c6ff;}
		50% {opacity:0; text-shadow:none; }
		100% {opacity:1.0; text-shadow:0 0 20px #00c6ff; }	
		}
		
		
		@-moz-keyframes mymove 
		{
		0% {opacity:1.0; text-shadow:0 0 20px #00c6ff;}
		50% {opacity:0; text-shadow:none; }
		100% {opacity:1.0; text-shadow:0 0 20px #00c6ff; }	
		}
		
		</style>
		<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function() {
		// Create two variable with the names of the months and days in an array
		var monthNames = [ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" ]; 
		var dayNames= ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
		
		// Create a newDate() object
		var newDate = new Date();
		// Extract the current date from Date object
		newDate.setDate(newDate.getDate());
		// Output the day, date, month and year    
		$('#Date').html(dayNames[newDate.getDay()] + " " + newDate.getDate() + ' ' + monthNames[newDate.getMonth()] + ' ' + newDate.getFullYear());
		
		setInterval( function() {
			// Create a newDate() object and extract the seconds of the current time on the visitor's
			var seconds = new Date().getSeconds();
			// Add a leading zero to seconds value
			$("#sec").html(( seconds < 10 ? "0" : "" ) + seconds);
			},1000);
			
		setInterval( function() {
			// Create a newDate() object and extract the minutes of the current time on the visitor's
			var minutes = new Date().getMinutes();
			// Add a leading zero to the minutes value
			$("#min").html(( minutes < 10 ? "0" : "" ) + minutes);
		    },1000);
			
		setInterval( function() {
			// Create a newDate() object and extract the hours of the current time on the visitor's
			var hours = new Date().getHours();
			// Add a leading zero to the hours value
			$("#hours").html(( hours < 10 ? "0" : "" ) + hours);
		    }, 1000);
			
		}); 
		</script>
		    </head>
		    <body class="index">
		    	<div class="clock">
		<div id="Date"></div>
		
		<ul>
			<li id="hours"> </li>
		    <li id="point">:</li>
		    <li id="min"> </li>
		    <li id="point">:</li>
		    <li id="sec"> </li>
		</ul>
		</div>
    	
        <!--导航区域开始-->
        <div id="index_navi">
        <ul id="menu">
            <li><a href="${pageContext.request.contextPath}/role/rediectIndex.do" class="index_on"></a></li>
            <c:forEach items="${adm.lp}" var="power">
            	<li><a href="${pageContext.request.contextPath}${power.pow_url}" class="${power.pow_class}"></a></li>
            </c:forEach>
        </ul>
    </div>
    </body>
</html>