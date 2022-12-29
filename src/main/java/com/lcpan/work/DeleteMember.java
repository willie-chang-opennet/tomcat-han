package com.lcpan.work;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/DeleteMember")
public class DeleteMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String user="WT";
	public static final String password="1234";
	public static final String url="jdbc:sqlserver://localhost:1433;databaseName=hololive";
	Connection conn;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String memberid = request.getParameter("memberid");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,user,password);
			PreparedStatement stmt = conn.prepareStatement("DELETE from dbo.member where memberid = ?");
			stmt.setString(1, memberid);
			int resultSet = stmt.executeUpdate();
			if(resultSet != 0) {
				request.getRequestDispatcher("src/main/webapp/work12m/DeleteMember.jsp").forward(request,response);
			}else {
				request.getRequestDispatcher("src/main/webapp/work12m/DeleteMemberFail.jsp").forward(request,response);
			}
			stmt.close();
	
		}
		catch (Exception e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
			return;
	}

 }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
