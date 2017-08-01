package servletPack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet1
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public IndexServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String uName=request.getParameter("username");
		String pass=request.getParameter("password");
		try{
			if(uName==null && pass==null){
				RequestDispatcher view = request.getRequestDispatcher("HelloWorld.html");
				view.forward(request, response);
			}else{
				if(uName.equals("admin") && pass.equals("admin123")){
					RequestDispatcher view = request.getRequestDispatcher("HomePage.html");
					view.forward(request, response);
				}else{
					RequestDispatcher view = request.getRequestDispatcher("LoginError.html");
					view.forward(request, response);
				}
			}
		}catch(Exception e){
			RequestDispatcher view = request.getRequestDispatcher("LoginError.html");
			view.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
