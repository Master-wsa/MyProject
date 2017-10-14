<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/bootstrap.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<title></title>
<script type="text/javascript">
		$(function(){
 	     	$("#input-b9").change(function(){
 	     		var form = new FormData($("#form")[0]);
 	     		$.post({
 	     			url:'${pageContext.request.contextPath}/admin/testImage.do',
 	     			data:form,
 	     			processData:false,
 	     			contentType:false,
 	     			traditional:true,
 	     			success:function(result){
 	     				if(result!="yes"&&$("#imageWarn").length<=0){
 	     					$("#imageSucc").remove();
 	     					$("#input-b9").after("<div class='validate_msg_medium error_msg' id='imageWarn'>对不起，图片大小不能超过400*400px！</div>");
 	     				}
 	     				else if(result=="yes"){
 	     					$("#imageWarn").remove();
     						$("#input-b9").after("<div class='validate_msg_long success' id='imageSucc'></div>");
    						$("#imageSucc").html("&nbsp");
 	     				}
 	     			}
 	     		})
 	     	})
 	     	$("#save").click(function(){
 	     		if($("#imageWarn").length<=0){
  	     			$("#form").submit();
 	     		}
 	     		else{
 	     			$("#imageWarn").remove();
 	     			$("#imageSucc").remove();
 	     			$("#input-b9").after("<div class='validate_msg_medium error_msg' id='imageWarn'>请按要求添加图片！</div>");
 	     		}
 	     	})
 	     })
</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/admin/getImg.do?adm_id=${adm.adm_id}" id="form" method="post" enctype="multipart/form-data">
		<div id="header"> 
	          <span data-toggle="modal" data-target="#exampleModal"><img src="${pageContext.request.contextPath }/${adm.adm_img}" class="img-circle" style="width: 40px;height: 40px;" /></span> 
	          	当前用户:<b style="color: red" id="username" >${adm.adm_name}</b>
	          <a href="${pageContext.request.contextPath}/admin/exit.do">[退出]</a>            
		</div>
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" >
  			<div class="modal-dialog modal-lg" role="document">
    			<div class="modal-content" st>
      				<div class="modal-header">
        				<h5 class="modal-title" id="exampleModalLabel">上传头像</h5>
        				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
          					<span aria-hidden="true">&times;</span>
        				</button>
      				</div>
      				<div class="modal-body">
        				<label for="input-b9">请选择一张图片</label>
        				<div class="file-loading">
          					<input id="input-b9" name="input-b9[]" multiple type="file">
        				</div>
        				<div id="kartik-file-errors"></div>
      				</div>
      				<div class="modal-footer">
				        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
				        <button type="button" class="btn btn-primary" title="来点我啊" id="save">保存</button>
      				</div>
    			</div>
  			</div>
		</div>
	</form>
</body>
</html>