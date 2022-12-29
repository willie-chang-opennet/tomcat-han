package com.lcpan.work;

import com.lcpan.bean.HoloBean;

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

@WebServlet("/GetMember")
public class GetMember extends HttpServlet {
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
			PreparedStatement stmt = conn.prepareStatement("SELECT * from dbo.member where memberid = ?");
			stmt.setString(1, memberid);
			ResultSet rs = stmt.executeQuery();
			HoloBean holo = new HoloBean();
			if(rs.next()) {
				holo.setMemberid(rs.getString("memberid"));
				holo.setMembername(rs.getString("membername"));
				holo.setMemberpicture(rs.getString("memberpicture"));
				holo.setMemberdata(rs.getString("memberdata"));
				holo.setMemberfrom(rs.getString("memberfrom"));
				request.setAttribute("holo", holo);
				request.getRequestDispatcher("/Member.jsp").forward(request,response);
			}else {
				request.getRequestDispatcher("/GetMemberFail.jsp").forward(request, response);
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
