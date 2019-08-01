package jp.co.systena.tigerscave.springtest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListForm extends HttpServlet{
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  response.setContentType("text/html; charset=Shift_JIS");
  response.setCharacterEncoding("Windows-31J");
  PrintWriter out = response.getWriter();
  out.println("<HTML>");
  out.println("<BODY>");
  String item1 = request.getParameter("num");

  out.println("<p>入力項目１：" + item1 + "</p>");
  out.println("</BODY>");
  out.println("</HTML>");

  }
}
