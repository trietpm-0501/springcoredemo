<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <base href="${pageContext.request.contextPath}/" />
    <style>
        * {
            font-size: 20px;
        }

        .form-group {
            margin: 10px;
        }
    </style>
</head>
<body>
<form>
    <div class="form-group">
        <div>Username</div>
        <input name="username" value="${user.username}" />
    </div>
    <div class="form-group">
        <div>Password</div>
        <input name="password" value="${user.password}" />
    </div>
    <div class="form-group">
        <button>Login</button>
    </div>
</form>
</body>
</html>
