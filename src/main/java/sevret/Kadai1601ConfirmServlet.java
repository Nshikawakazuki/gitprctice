package sevret;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Account2;

/**
 * Servlet implementation class KadaiConfirmServlet
 */
@WebServlet("/Kadai1601ConfirmServlet")
public class Kadai1601ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai1601ConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		String gender = request.getParameter("gender");
		String mail = request.getParameter("mail");
		String phone_number = request.getParameter("phone_number");
		String pw = request.getParameter("pw");
		
		int age = Integer.parseInt(ageStr);
		
		Account2 account2 = new Account2(-1, name, age, gender, mail, phone_number, null, pw, null);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("input_data", account2);
		
		String view = "WEB-INF/view/kadai1601confirm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
