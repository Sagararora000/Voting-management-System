package controller;

import java.io.IOException;


import javax.persistence.Entity;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDao;

@WebServlet("/remove_users")
public class RemoveUser extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao udao = new UserDao();
		int id = Integer.parseInt(req.getParameter("user_id"));
		RequestDispatcher success = req.getRequestDispatcher("view_users");
		if(udao.remove(id)) {
			success.forward(req, resp);
		}
	}
}
