package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import domain.Catdog;

@WebServlet("/resultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//DB接続、利用
		
		Connection con = null;
		InitialContext ctx;
		try {
			ctx = new InitialContext();
		DataSource ds = (DataSource) ctx
				.lookup("java:comp/env/jdbc/catdog_db");
		con = ds.getConnection();
		String sql = "SELECT * FROM catdog_db.catdog_table";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		System.out.println(rs);
		List<Catdog> catdogList = new ArrayList<>();
		while (rs.next()) {
			System.err.println("ok");
			
			Catdog catdog = new Catdog();
			//Integer idInteger = (Integer) rs.getObject("id");
			catdog.setId((Integer)rs.getObject("id"));
			//catdog.setId(rs.getInt("id"));
			catdog.setAnimal(rs.getString("animal"));
			catdogList.add(catdog);
		}
		request.setAttribute("catdogList", catdogList);
		//選んだ番号でDBからデータ取得
				String id = request.getParameter("id");
				String animal = request.getParameter("animal");
				
		} catch (Exception e) {
			throw new ServletException(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				throw new ServletException(e);
			}
		}//次の画面に遷移
		request.getRequestDispatcher("/WEB-INF/view/result.jsp")
				.forward(request, response);
	}

}
