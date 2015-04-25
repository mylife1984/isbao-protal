<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@include file="../../common/taglib.jsp" %>
<html>
<head>
    <title>主页</title>
    <%@include file="../../common/meta.jsp" %>
</head>
<body>

<div class="login-container animated fadeInDown">
    <div class="loginbox bg-white">
        <div class="loginbox-title">用户登录</div>
        <div class="loginbox-textbox">
            <input type="text" class="form-control" placeholder="用户名"/>
        </div>
        <div class="loginbox-textbox">
            <input type="text" class="form-control" placeholder="密码"/>
        </div>
        <div class="loginbox-forgot">
            <a href="">忘记密码?</a>
        </div>
        <div class="loginbox-submit">
            <input type="button" class="btn btn-primary btn-block" value="Login">
        </div>
    </div>
    <div class="logobox">
    </div>
</div>


<%@include file="../../common/footer.jsp" %>
</body>
</html>
