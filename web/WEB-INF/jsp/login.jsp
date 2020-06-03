<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/13
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>管理员登录</title>
    <style>
        body{
            text-align: center;
        }
        div{
            background-color: blanchedalmond;
            padding-top: 40px;
            border: 2px solid blue;
            width: 300px;
            height: 200px;
        }
    </style>
</head>
<body>
<div>
    <form action="<%=basePath%>/userLogin/login" method="post">
        <input type="text" name="name" placeholder="请输入管理员"/><br/><br/>
        <input type="text" name="pwd" placeholder="请输入密码"/><br/><br/>
        <input type="submit" value="登录"/>&nbsp;&nbsp;<input type="reset" value="重置"/>
    </form>
</div>
</body>
</html>