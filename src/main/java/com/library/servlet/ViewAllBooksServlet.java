package com.library.servlet;

import com.library.entity.Book;
import com.library.dao.BookDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewAllBooks")
public class ViewAllBooksServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        BookDAO dao = new BookDAO();
        List<Book> books = dao.getAllBooks();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>All Books</title></head><body>");
        out.println("<h2>All Books</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th></tr>");

        for (Book b : books) {
            out.println("<tr>");
            out.println("<td>" + b.getId() + "</td>");
            out.println("<td>" + b.getTitle() + "</td>");
            out.println("<td>" + b.getAuthor() + "</td>");
            out.println("<td>" + b.getPrice() + "</td>");
            out.println("</tr>");
        }
        out.println("</table><br>");
        out.println("<a href='index.jsp'>Back</a>");
        out.println("</body></html>");
    }
}