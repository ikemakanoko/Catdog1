package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Catdog;

@WebServlet("/resultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Catdog> catdogList = new ArrayList<>();
		
		//Tableの中身の取得
		String id = request.getParameter("id");
		String animal = request.getParameter("animal");
		
		//idが1ならねこ、2ならいぬ
		//選んだ番号でDBからデータ取得
		Catdog catdog = new Catdog();
		catdogList.add(catdog);
		
		//次の画面に遷移
		request.getRequestDispatcher("/WEB-INF/view/result.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
