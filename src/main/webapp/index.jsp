<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	alert("123");
    //点击提交按钮时，从服务端获取数据，然后在客户端显示
    $("#btn").click(function(){
        // 序列化表单的值
        $.ajax({
            url: "user/add",
            type: "post",
            dataType : "json",
            data : $("#userform").serialize(),
            // 回调函数，接受服务器端返回给客户端的值，即result值
            success : function(result){
            	alert(result.success);
            }  
        });
    });
});

</script>
</head>

<body>
<form id="userform" name="userform" action="" >
<table>
<tr>
<td>姓名</td>
<td><input type="text" id="userName" name="userName"/></td>
</tr>
<tr>
<td>年龄</td>
<td><input type="text" id="age" name="age"/></td>
</tr>
<tr>
<td><input id="btn" type="button" value="提 交 "/>
</td>
</tr>
</table>
</form>
</body>
</html>