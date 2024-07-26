<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send Mail Page</title>
    <base href="${pageContext.request.contextPath}/" />
    <style>
        * {
            font-size: 20px;
        }

        input, textarea {
            width: 400px;
            padding: 8px 12px;
        }

        button {
            width: 120px;
            padding: 8px 12px;
            cursor: pointer;
        }
    </style>
</head>
<body>
${message}
<form action="mailer/send2" method="post">
    <p><input name="from" placeholder="From" value="${mailFrom}" readonly disabled /></p>
    <p><input name="to" placeholder="To" /></p>
    <p><input name="subject" placeholder="Subject" /></p>
    <p><textarea name="body" placeholder="Body" rows="3"></textarea></p>
    <button>Send</button>
</form>
</body>
</html>
