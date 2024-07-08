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

@WebServlet("/add_users")
public class AddUsers extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = resp.getWriter();
		UserDao udao = new UserDao();
		int id = Integer.parseInt(req.getParameter("user_id"));
		int age = Integer.parseInt(req.getParameter("user_age"));
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		RequestDispatcher success = req.getRequestDispatcher("view_users");
		if(udao.add_users_method(id,age,name,password)) {
			success.forward(req, resp);
		}
	}
}
