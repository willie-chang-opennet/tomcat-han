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
import java.sql.Statement;

@WebServlet("/UpdateMember")
public class UpdateMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String user="WT";
	public static final String password="1234";
	public static final String url="jdbc:sqlserver://localhost:1433;databaseName=hololive";
	Connection conn;
	Statement stmt;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String memberid = request.getParameter("memberid");
		String memberpicture = request.getParameter("memberpicture");
		String membername = request.getParameter("membername");
		String memberdata = request.getParameter("memberdata");
		String memberfrom = request.getParameter("memberfrom");

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,user,password);
			PreparedStatement stmt = conn.prepareStatement("UPDATE dbo.member SET memberpicture = ?,membername = ?,memberdata = ?,memberfrom = ? WHERE memberid = ?");
	        stmt.setString(1, memberpicture);
	        stmt.setString(2, membername);
	        stmt.setString(3, memberdata);
	        stmt.setString(4, memberfrom);
	        stmt.setString(5, memberid);
	        stmt.executeUpdate();
	        if(memberid != "" && memberid.length()>0) {
				request.getRequestDispatcher("src/main/webapp/work12m/UpdateMember.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("src/main/webapp/work12m/UpdateMemberFail.jsp").forward(request,response);
			}
			stmt.close();	
			}
		catch (Exception e) {
			System.err.print("存取資料庫時發生例外: " + e);
			e.printStackTrace();
			return;
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
