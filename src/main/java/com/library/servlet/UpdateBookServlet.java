package com.library.servlet;

import com.library.entity.Book;
import com.library.dao.BookDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        BookDAO dao = new BookDAO();
        Book book = dao.getBookById(id);
        if (book != null) {
            if (title != null && !title.isEmpty()) book.setTitle(title);
            if (author != null && !author.isEmpty()) book.setAuthor(author);
            if (price > 0) book.setPrice(price);
            dao.updateBook(book);
            response.getWriter().println("<h3>Book updated successfully!</h3>");
        } else {
            response.getWriter().println("<h3>Book not found!</h3>");
        }
        response.getWriter().println("<a href='index.jsp'>Go Back</a>");
    }
}