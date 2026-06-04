package com.library.servlet;

import com.library.entity.Book;
import com.library.dao.BookDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchBookServlet")
public class SearchBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        BookDAO dao = new BookDAO();
        Book book = dao.getBookById(id);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (book != null) {
            out.println("<h3>Book Details</h3>");
            out.println("<p>ID: " + book.getId() + "</p>");
            out.println("<p>Title: " + book.getTitle() + "</p>");
            out.println("<p>Author: " + book.getAuthor() + "</p>");
            out.println("<p>Price: " + book.getPrice() + "</p>");
        } else {
            out.println("<h3>Book not found!</h3>");
        }
        out.println("<a href='index.jsp'>Back</a>");
    }
}