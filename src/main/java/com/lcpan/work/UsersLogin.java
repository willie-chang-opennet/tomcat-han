package com.lcpan.work;

import com.lcpan.bean.UsersBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/UsersLogin")
public class UsersLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String user="WT";
	public static final String password="1234";
	public static final String url="jdbc:sqlserver://localhost:1433;databaseName=hololive";
	Connection conn;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usersname = request.getParameter("usersname");
		String userspassword = request.getParameter("userspassword");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,user,password);
			PreparedStatement stmt = conn.prepareStatement("SELECT * from dbo.users where usersname = ? AND userspassword=?");
			stmt.setString(1, usersname);
			stmt.setString(2, userspassword);
			ResultSet rs = stmt.executeQuery();
			UsersBean users = new UsersBean();
			if(rs.next()) {
				users.setUsersname(rs.getString("usersname"));
				users.setUserspassword(rs.getString("userspassword"));
				request.setAttribute("users", users);
				request.getRequestDispatcher("src/main/webapp/work12m/UsersLogin.jsp").forward(request,response);
			}else {
				request.getRequestDispatcher("src/main/webapp/work12m/UsersLoginFail.jsp").forward(request,response);
			}
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			return;
	}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
