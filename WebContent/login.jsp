
<%@page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <title>登录页面</title>
    </head>
    <body >
    <center>
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <h1>欢迎使用简单学生管理系统1.0版</h1>
        <hr />
        <form  action ="check.jsp" method="post">
            用户名：<input type="text" name="userId" ><br />
            密&nbsp;&nbsp;码：<input type="password" name="password" ><br />
            <%
                String str = request.getParameter("loginerror");
                if (str != null) {
                    out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=red>用户名或密码错误</font>");
                }
            %>
            <br />
            <input type="submit"  value="登录">
        </form>
    </center>
    </body>




</html>