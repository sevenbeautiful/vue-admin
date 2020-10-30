<%-- 
    Document   : update
    Created on : 2012-9-21, 14:12:03
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page  import="dao.StudentDAO" %>
<%@page  import="vo.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page  import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>修改试题</h1>


        <form action="${pageContext.request.contextPath}/UpdateServlet" method="post">
           <table border="0">
            <tr>
                <td>学号</td>
                <td><input type="text" name="no" value="${student.no}"></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name" value="${student.name}"></td>
          </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age" value="${student.age}"></td>

            </tr>
            
            <tr>
                <td>出生日期</td>
                <td><input type="text" name="birthday" value="${student.birthday}"></td>
            </tr>
                <tr>
                    <td><input type="submit" value="更新"></td>
                </tr>
            </table>

        </form>



    </body>
</html>
