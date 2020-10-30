<%-- 
    Document   : insert_do
    Created on : 2012-9-17, 19:33:41
    Author     : Administrator
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="dao.StudentDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            String no = request.getParameter("no");
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            int age1 = Integer.parseInt(age);
            String birthday = request.getParameter("birthday");
        %>

        <%            
            StudentDAO studentDAO = new StudentDAO();
            boolean f=studentDAO.save(no, name, age1, birthday);
            if (f) {
                out.println("添加成功");
            } else {
                out.println("添加失败");
            }
        %>


    </body>
</html>
