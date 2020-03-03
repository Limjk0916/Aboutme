package eaxam;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodayServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm");
		LocalDateTime nowDateTime = LocalDateTime.now();
		out.println("<html>");
		out.println("<body>");
		out.println("<div style='font-size:30px; margin-top:30px; margin-left:50px'>");
		out.println("<a href = '/aboutme/index.html'>");
		out.println("<u>메인 화면</u>");
		out.println("</a>");
		out.println("</div>");
		out.println("<div style='text-align:center; font-size:80px; margin-top:15%;'>");
		out.println("현재시간 : " + nowDateTime.format(dateTimeFormatter));
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	
}