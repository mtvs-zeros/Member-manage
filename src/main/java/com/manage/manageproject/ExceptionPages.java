package com.manage.manageproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exception")
public class ExceptionPages extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg = req.getAttribute("jakarta.servlet.error.message").toString();

        System.out.println("msg = " + msg);

        StringBuilder errorPage = new StringBuilder();
        errorPage.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h1 align=\"center\">\n")
                .append(msg)
                .append("</h1>\n")
                .append("<div style=\"text-align: center;\">\n")
                .append("<a href=\"http://localhost:8080/\" align=\"center\">회원가입 페이지로...</a>\n")
                .append("</div>\n")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.write(errorPage.toString());

        out.flush();
        out.close();

    }
}
