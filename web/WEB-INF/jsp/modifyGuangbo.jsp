<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/12
  Time: 23:19
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
    <title>更新页面</title>
</head>
<body>
更新内容：
<form action="guangbo/updateGuangbo" method="post">
    <table>
        <thead>
        <tr>
            <th>编号</th>
            <th>文章名</th>
            <th>作者ID</th>
            <th>作者</th>
            <th>时长</th>
            <th>浏览量</th>
            <th>评分</th>
        </tr>
        </thead>
        <s:iterator value="#request.guangbosId" status="guangbosId">
            <tr>
                <td><input type="text" value=" <s:property value="gb_id"/>" name="guangbo.gb_id"/></td>
                <td><input type="text" value=" <s:property value="articalname"/>" name="guangbo.articalname"/></td>
                <td><input type="text" value=" <s:property value="userid"/>" name="guangbo.userid"/></td>
                <td><input type="text" value=" <s:property value="username"/>" name="guangbo.username"/></td>
                <td><input type="text" value=" <s:property value="timelong"/>" name="guangbo.timelong"/></td>
                <td><input type="text" value=" <s:property value="liulan_number"/>" name="guangbo.liulan_number"/></td>
                <td><input type="text" value=" <s:property value="pingfen"/>" name="guangbo.pingfen"/></td>
            </tr>
        </s:iterator>
    </table>
    <input type="submit" value="提交"/>
</form>
</body>
</html>