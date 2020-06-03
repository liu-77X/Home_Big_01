<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/5/11
  Time: 16:22
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
<form action="user/updateUser" method="post">
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
        </tr>
        </thead>
        <s:iterator value="#request.userId" status="userId">
            <tr>
                <td><input type="text" value=" <s:property value="userid"/>" name="user.userid"/></td>
                <td><input type="text" value=" <s:property value="username"/>" name="user.username"/></td>
                <td><input type="text" value=" <s:property value="zhuangtai"/>" name="user.zhuangtai"/></td>
                <td><input type="text" value=" <s:property value="artical_number"/>" name="user.artical_number"/></td>
                <td><input type="text" value=" <s:property value="guangbo_number"/>" name="user.guangbo_numner"/></td>
                <td><input type="text" value=" <s:property value="fans_number"/>" name="user.fans_number"/></td>
                <td><input type="text" value=" <s:property value="black_number_table"/>" name="user.black_number_table"/></td>
            </tr>
        </s:iterator>
    </table>
    <input type="submit" value="提交"/>
</form>
</body>
</html>