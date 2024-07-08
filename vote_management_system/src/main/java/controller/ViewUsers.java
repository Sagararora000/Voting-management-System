package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity_classes.UserModel;
import model.dao.UserDao;

@WebServlet("/view_users")
public class ViewUsers extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao udao = new UserDao();
		UserModel umodel = new UserModel();
		List<UserModel> users = udao.viewAll();
	
		req.setAttribute("userDetails", users);
//		}
		
		RequestDispatcher success = req.getRequestDispatcher("viewDetails.jsp");
		if(users != null) {
			
			success.forward(req, resp);
		}
		
//		if(udao.add()) {
//			success.forward(req, resp);
//		}
		
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
}
