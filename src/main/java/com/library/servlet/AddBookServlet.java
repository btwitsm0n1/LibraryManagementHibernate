package com.library.servlet;

import com.library.entity.Book;
import com.library.dao.BookDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        Book book = new Book(title, author, price);
        BookDAO dao = new BookDAO();
        dao.addBook(book);

        response.setContentType("text/html");
        response.getWriter().println("<h3>Book added successfully!</h3>");
        response.getWriter().println("<a href='index.jsp'>Go Back</a>");
    }
}