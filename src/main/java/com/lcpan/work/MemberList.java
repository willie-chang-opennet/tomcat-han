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
import java.util.ArrayList;

@WebServlet("/MemberList")
public class MemberList extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public static final String user="WT";
    public static final String password="1234";
    public static final String url="jdbc:sqlserver://localhost:1433;databaseName=hololive";
    Connection conn;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String memberid = request.getParameter("memberid");

        ArrayList<HoloBean> holoBeans = new ArrayList<>();
        // select all
        HoloBean holoBean1 = new HoloBean();
        holoBean1.setMemberid("1");
        holoBean1.setMembername("name");
        holoBean1.setMemberpicture("/steal.jpg");
        holoBeans.add(holoBean1);

        HoloBean holoBean2 = new HoloBean();
        holoBean2.setMemberid("2");
        holoBean2.setMembername("name2");
        holoBean2.setMemberpicture("/steal.jpg");
        holoBeans.add(holoBean2);

        System.out.println("test----");
        request.setAttribute("holoBeans", holoBeans);
        request.getRequestDispatcher("/MemberList.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
