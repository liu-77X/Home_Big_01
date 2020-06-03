<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/12
  Time: 14:02
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
    <title>更新文章</title>
</head>
<body>
更新内容：
<form action="artical/updateArtical" method="post">
    <table>
        <thead>
        <tr>
            <th>文章名称</th>
            <th>字数</th>
            <th>类别</th>
            <th>浏览量</th>
            <th>评分</th>
            <th>作者ID</th>
            <th>作者</th>
        </tr>
        </thead>
        <s:iterator value="#request.articalId" status="articalId">
            <tr>
                <td><input type="text" value=" <s:property value="articalname"/>" name="artical.articalname"/></td>
                <td><input type="text" value=" <s:property value="word_number"/>" name="artical.word_number"/></td>
                <td><input type="text" value=" <s:property value="leibie"/>" name="artical.leibie"/></td>
                <td><input type="text" value=" <s:property value="liulan_number"/>" name="artical.liulan_number"/></td>
                <td><input type="text" value=" <s:property value="pingfen"/>" name="artical.pingfen"/></td>
                <td><input type="text" value=" <s:property value="userid"/>" name="artical.userid"/></td>
                <td><input type="text" value=" <s:property value="username"/>" name="artical.username"/></td>
            </tr>
        </s:iterator>
    </table>
    <input type="submit" value="提交"/>
</form>
</body>
</html>