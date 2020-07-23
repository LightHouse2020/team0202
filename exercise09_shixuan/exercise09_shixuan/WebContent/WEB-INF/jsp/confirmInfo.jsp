<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%--meta标签区域--%>
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache, must-revalidate">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="robots" content="all">

<%--标题区域--%>
<title>请确认以下信息</title>

<%--资源引入区域--%>
</head>
<body>
    <form action="<%=request.getContextPath() %>/homepage"  method="post" >
    <%
       request.getSession().setAttribute("userName","shixuan");
       String userName = (String)request.getSession().getAttribute("userName");

       request.getSession().setAttribute("userAge","");
       Integer userAge = (Integer)request.getSession().getAttribute("userAge");

       request.getSession().setAttribute("userAgender","");
       String userAgener = (String)request.getSession().getAttribute("userAgener");

       request.getSession().setAttribute("userAddr","");
       String userAddr = (String)request.getSession().getAttribute("userAddr");

       request.getSession().setAttribute("userHobby","");
       String userHobby = (String)request.getSession().getAttribute("userHobby");
    %>



    <p>
   请登录您的详细信息!
    <p>姓名:</p><input name="">
    <p>年龄:</p><input age="">
    <p>性别:</p><input agender="">
    <p>住址:</p><input address="">

    <p>爱好:</p><input type="checkbox" >登山
    <input type="checkbox"/>游泳
    <input type="checkbox"/>看书
    <input type="checkbox"/>听音乐
    <br>
    <br>
    <br>
    <p><input type="submit"  value="提交"  ></p>

    </form>
    <%--页脚区域--%>
</body>
</html>
