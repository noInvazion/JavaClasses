package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquaredServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		int num = (int) req.getAttribute("sum");
		int square = num * num;
		
		PrintWriter out = resp.getWriter();
		
		out.println("The square of the two numbers is equals to " + square);
	}
}
