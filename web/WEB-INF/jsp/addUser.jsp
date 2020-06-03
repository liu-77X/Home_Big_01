<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/11
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>添加用户</title>
    <style type="text/css">
        body{
            margin-left: 300pt;
            text-align: center;
        }
        form{
            background-color: blanchedalmond;
            padding-top: 40px;
            padding-bottom: 40px;
            border: 2px solid blue;
            width: 300px;
        }
    </style>
</head>

<body>

<form action="<%=basePath %>user/addUser" method="post">

    <input type="text" name="user.userid" placeholder="编号"/><br /><br />
    <input type="text" name="user.username" placeholder="用户名"/><br /><br />
    <input type="text" name="user.userpassword" placeholder="密码"/><br /><br />
    <input type="text" name="user.zhuangtai" placeholder="状态"/><br /><br />
    <input type="text" name="user.artical_number" placeholder="文章数"/><br /><br />
    <input type="text" name="user.guangbo_number" placeholder="广播剧作品数"/><br /><br />
    <input type="text" name="user.fans_number" placeholder="粉丝数"/><br /><br />
    <input type="text" name="user.black_number_table" placeholder="黑名单"/><br /><br />
    <input type="submit" value="提交" />
</form>
</body>
</html>