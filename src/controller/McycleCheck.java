package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Motorcycle;
import model.MotorcycleLogic;

/**
 * Servlet implementation class M
 */
@WebServlet("/mcyclecheck")
public class McycleCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//　１回目　jspへフォワード
		RequestDispatcher rd =request.getRequestDispatcher("/WEB-INF/view/motorcycleCheck.jsp");
		rd.forward(request,response);
		System.out.println("406");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//パラメータ取得する
		request.setCharacterEncoding("UTF-8");
		String type= request.getParameter("type");

	//入力をプロパティに設定。
		Motorcycle motorcycle=new Motorcycle();
		motorcycle.setType(type);
		System.out.println("408");

	//性格判断し実行し結果を設定。
		MotorcycleLogic motorCycleLogic =new MotorcycleLogic();
		motorCycleLogic.execute(motorcycle);

	//リクエストスコープに保存
		request.setAttribute("motorcycle", motorcycle);

	//2 回目jspにフォワード
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/motorcycleCheckResult.jsp");
		rd.forward(request, response);
		System.out.println("408");
	}
}
