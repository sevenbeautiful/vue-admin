
<%@page import="dao.UserDAO"%>
<%@page contentType="text/html;charset=UTF-8"  %>

<html>
    <head>
        <title></title>
    </head>
    <body>

        <%
            request.setCharacterEncoding("UTF-8");
            String userId = request.getParameter("userId");
            String password = request.getParameter("password");
        %>


        <%      UserDAO userDAO = new UserDAO();
            boolean flag = userDAO.findByIDAndPassword(
                    userId, password);

            if (flag) {
             
                session.setAttribute("userId", userId);
                session.setAttribute("pw", password);

                response.sendRedirect("admin/index.jsp");
            } else {
                response.sendRedirect("login.jsp?loginerror=error");
                 
            }


        %>
    </body>
</html>