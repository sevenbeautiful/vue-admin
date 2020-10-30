<%-- 
    Document   : insert_do
    Created on : 2012-9-17, 19:33:41
    Author     : Administrator
--%>

<%@page import="dao.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

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
        StudentDAO dao = new StudentDAO();
        if(dao.update(no, name, age1, birthday)){
            
            out.println("修改成功");
        }else{
            out.println("修改失败");
        }
        %>
    </body>
</html>
