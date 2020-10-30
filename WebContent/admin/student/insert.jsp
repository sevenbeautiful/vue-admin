<%-- 
    Document   : insert
    Created on : 2010-9-20, 10:21:47
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>添加学生</h1>
        <form action="<%=request.getContextPath()%>/AddServlet" method="post">
        <table border="0">
            <tr>
                <td>学号</td>
                <td><input type="text" name="no"></td>

            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"></td>

            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age"></td>

            </tr>
            <tr>
                <td>出生日期</td>
                <td><input type="text" name="birthday"></td>

            </tr>
          
            


        </table>
            <input type="submit" value="添加">
        </form>
        
    </body>
</html>
