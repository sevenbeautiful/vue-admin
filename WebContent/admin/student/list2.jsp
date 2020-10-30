<%-- 
    Document   : list
    Created on : 2014-10-30, 11:12:27
    Author     : Administrator
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dao.StudentDAO"%>
<%@page import="vo.Student"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function go(no){
                if(confirm("你确定要删除吗")){
                    window.location="delete.jsp?no="+no;
                }
            }
        </script>
    </head>
    <body>
        <a href="insert.jsp">添加学生</a> 
        <h1>学生数据</h1>
        <table border="1">
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>出生日期</th>
                <th colspan="2">操作</th>
            </tr>
             <c:forEach items="${studentList}" var="s">
            <tr>
            
                <td>
                    ${s.no }
                </td>
                <td>
                    ${s.name }
                </td>
                <td>
                   ${s.age }
                </td>

                <td>
                    ${s.birthday }
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/toUpdate?no=${s.no}">更新</a>  
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/DeleteServlet?no=${s.no}">删除</a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
