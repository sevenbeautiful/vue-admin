<%-- 
    Document   : list
    Created on : 2014-10-30, 11:12:27
    Author     : Administrator
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dao.StudentDAO"%>
<%@page import="vo.Student"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
             <%
                StudentDAO sdao = new StudentDAO();
                ArrayList<Student> list = sdao.list();
                //多条记录用while循环
                for (Student s : list) {
            %>

            <tr>
                <td>
                    <%=s.getNo()%>
                </td>
                <td>
                    <%=s.getName()%>
                </td>
                <td>
                    <%=s.getAge()%>
                </td>

                <td>
                     <%=s.getBirthday()%>
                </td>
            
                <td>
                    <a href="<%=request.getContextPath()%>/UpdateServlet?no=<%=s.getNo()%>">更新</a>  
                </td>
                <td>
                    <a href="<%=request.getContextPath()%>/DeleteServlet?no=<%=s.getNo()%>">删除</a>
                </td>
            </tr>
            <%
            }
            %>
        </table>
    </body>
</html>
