<%-- 
    Document   : delete
    Created on : 2015-11-30, 13:52:17
    Author     : Administrator
--%>

<%@page import="dao.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            String no = request.getParameter("no");

            StudentDAO studentDAO = new StudentDAO();
            if (studentDAO.delete(no)) {
                out.println("删除成功");
            } else {
                out.println("删除失败");
            }
        %>
    </body>
</html>
