<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri= "/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to login</title>
</head>
<body>
  <center>
      <s:form action="login" method="post">
          <s:textfield name="name" lable="用户名"></s:textfield>
          <s:password name="password" lable="密码"></s:password>
          <s:textfield name="type" lable="用户类型"></s:textfield>
          <s:submit>提交</s:submit>
      </s:form>
  </center>
</body>
</html>