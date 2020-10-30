package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/admin/student/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setHeader("content-Type","text/html;charset=utf-8");
          request.setCharacterEncoding("UTF-8");
          String no = request.getParameter("no");
          String name = request.getParameter("name");
          String age = request.getParameter("age");
          int age1 = Integer.parseInt(age);
          String birthday = request.getParameter("birthday");
      
            PrintWriter out=response.getWriter();      
                
          StudentDAO studentDAO = new StudentDAO();
          boolean f=studentDAO.save(no, name, age1, birthday);
          if (f) {
              out.println("添加成功");
          } else {
              out.println("添加失败");
          }
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
