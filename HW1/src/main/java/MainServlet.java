
import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

public class MainServlet extends HttpServlet {

    private final static String  name = "ostapik";
    private final static String  pass = "12345";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String login = request.getParameter("username");
        String password = request.getParameter("password");;
     if(login.equals(name) && password.equals(pass)){
         out.println("<h1>Heloo!!!</h1>");
      }
      else{
         out.println("<h1>BAD LOGIN OR PASSWORD!!!</h1>");
     }
    }





}