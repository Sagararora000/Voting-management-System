package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDao;

@WebServlet("/addUpdate_voter")
public class AddUpdate_voter extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao udao = new UserDao();
		int id = Integer.parseInt(req.getParameter("voter_id"));
		String name = req.getParameter("voter_name");
		String address = req.getParameter("voter_address");
		int age = Integer.parseInt(req.getParameter("voter_age"));
		String gender = req.getParameter("voter_gender");
		String f_name = req.getParameter("voter_father");
		String m_name = req.getParameter("voter_mother");
		
		RequestDispatcher success = req.getRequestDispatcher("view_users");
		if(udao.addUpdateVoter(id,name,address,age,gender,f_name,m_name)){
			success.forward(req, resp);
		}
		
		
		
	}
}
