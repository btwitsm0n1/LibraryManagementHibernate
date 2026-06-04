package com.library.servlet;

import com.library.dao.BookDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        BookDAO dao = new BookDAO();
        dao.deleteBook(id);

        response.setContentType("text/html");
        response.getWriter().println("<h3>Book deleted successfully!</h3>");
        response.getWriter().println("<a href='index.jsp'>Go Back</a>");
    }
}