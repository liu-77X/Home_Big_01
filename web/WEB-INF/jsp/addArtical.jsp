<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/12
  Time: 14:16
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
    <title>添加文章</title>
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

<form action="<%=basePath %>artical/addArtical" method="post">

    <input type="text" name="artical.articalname" placeholder="文章名称"/><br /><br />
    <input type="text" name="artical.word_number" placeholder="字数"/><br /><br />
    <input type="text" name="artical.leibie" placeholder="类别"/><br /><br />
    <input type="text" name="artical.liulan_number" placeholder="浏览量"/><br /><br />
    <input type="text" name="artical.pingfen" placeholder="评分"/><br /><br />
    <input type="text" name="artical.userid" placeholder="作者ID"/><br /><br />
    <input type="text" name="artical.username" placeholder="作者"/><br /><br />
    <input type="submit" value="提交" />
</form>
</body>
</html>