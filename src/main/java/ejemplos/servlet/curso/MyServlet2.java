package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/*
		request.setAttribute("nombreForm", request.getParameter("nombreForm"));

		request.getRequestDispatcher("/views/welcome.jsp").forward(request, response);
		*/

		String name = request.getParameter("nombreForm");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Bienvenido</title></head>");
		out.println("<body>");
		if (name != null && !name.trim().isEmpty()) {
			out.println("<h1>Bienvenid@, " + name + "!</h1>");
		} else {
			out.println("<h1>Bienvenid@, invitado!</h1>");
		}
		out.println("<a href=\"myServlet\">Volver al formulario</a>");
		out.println("</body>");
		out.println("</html>");


	}

}