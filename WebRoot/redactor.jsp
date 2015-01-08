<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="./common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>在线编辑器Redactor</title>
	<script src="${ctx }/js/jquery-1.11.2.min.js"></script>      
	<link rel="stylesheet" href="${ctx }/js/redactor/redactor.css" />
	<script src="${ctx }/js/redactor/redactor.js"></script>
	<script type="text/javascript">
	$(function(){
		$('#redactor_content').redactor({
			focus: true,
			imageGetJson:false,
			imageUpload: '${ctx}/testupload.shtml'
		});
	});
	</script>
    </script>  
</head>
<body>
	<textarea id="redactor_content" name="content">
	</textarea>
	
	<br/>
	<br/>
</body>
</html>