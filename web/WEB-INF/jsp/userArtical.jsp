<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/13
  Time: 19:34
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

    <title>详细文章列表</title>
    <style type="text/css">
        body{
            margin-left: 200pt;
        }
        table,table tr th, table tr td
        {
            border: 1px solid grey
        }
    </style>
</head>
<body>
<a href='<%=basePath %>user/toAddArtical'>新增文章</a>
<table>
    <thead>
    <tr>
        <th>编号</th>
        <th>文章名称</th>
        <th>字数</th>
        <th>类别</th>
        <th>浏览量</th>
        <th>评分</th>
        <th>作者ID</th>
        <th>作者</th>
        <th>操作</th>
    </tr>
    </thead>
    <s:iterator value="#request.artical" status="artical">
        <tr>
            <td><s:property value="articalid"/></td>
            <td><s:property value="articalname"/></td>
            <td><s:property value="word_number"/></td>
            <td><s:property value="leibie"/></td>
            <td><s:property value="liulan_number"/></td>
            <td><s:property value="pingfen"/></td>
            <td><s:property value="userid"/></td>
            <td><s:property value="username"/></td>
            <td><a href='<%=basePath %>artical/selectArticalId?artical.articalid=<s:property value="articalid"/>'>更新<br /></a>&nbsp;<a href='<%=basePath %>artical/delArtical?artical.articalid=<s:property value="articalid"/>'>删除</a></td>
        </tr>
    </s:iterator>

</table>
</body>
</html>