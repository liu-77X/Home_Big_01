<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/11
  Time: 15:23
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

    <title>用户列表</title>
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
<a href='<%=basePath %>user/toAddUser'>新增用户</a>&nbsp;&nbsp;
<a href='<%=basePath %>artical/articalList'>文章列表</a>&nbsp;&nbsp;
<a href='<%=basePath %>guangbo/guangboList'>广播剧列表</a>
<table>
    <thead>
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>状态</th>
        <th>文章数</th>
        <th>广播剧数</th>
        <th>粉丝数</th>
        <th>黑名单</th>
        <th style="width: 300px">操作</th>
    </tr>
    </thead>
    <s:iterator value="#request.users" status="user">
        <tr>
            <td><s:property value="userid"/></td>
            <td><s:property value="username"/></td>
            <td><s:property value="zhuangtai"/></td>
            <td><s:property value="artical_number"/></td>
            <td><s:property value="guangbo_number"/></td>
            <td><s:property value="fans_number"/></td>
            <td><s:property value="black_number_table"/></td>
            <td><a href='<%=basePath %>user/selectUserId?user.userid=<s:property value="userid"/>'>更新</a>&nbsp;&nbsp;<a href='<%=basePath %>user/delUser?user.userid=<s:property value="userid"/>'>删除</a>&nbsp;&nbsp;<a href='<%=basePath %>user/userArtical?user.userid=<s:property value="userid"/>'>文章详细信息</a>&nbsp;&nbsp;<a href='<%=basePath %>user/userGuangbo?user.userid=<s:property value="userid"/>'>广播剧详细信息</a></td>
        </tr>
    </s:iterator>

</table>

</body>
</html>