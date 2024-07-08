package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDao;

@WebServlet("/login")
public class AdminValidation extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = resp.getWriter();
		UserDao udao = new UserDao();
//		pw.println("hello");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		RequestDispatcher success = req.getRequestDispatcher("view_user.jsp");
		RequestDispatcher failure = req.getRequestDispatcher("LoginPage.jsp");
		if(udao.AdminValidate(name,password)) {
			System.out.println("but it's working");
			success.forward(req, resp);
		}
		else {
//			pw.println("sorry some error");
			failure.forward(req, resp);
		}
		
	}
}
