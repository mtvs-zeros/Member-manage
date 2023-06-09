package com.manage.manageproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/result")
public class Result extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = (String) req.getAttribute("id");

        System.out.println("id = " + id);

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")    //<h3 align="center">
                .append(id)
                .append("님 환영합니다. </h3>\n\n\n")
                .append("<div style=\"text-align: center;\">\n")
                .append("<a href=\"http://localhost:8080/\" align=\"center\">회원가입 페이지로...</a>\n")
                .append("</div>\n")
                .append("</body>\n")
                .append("<html>");

        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.print(responseText);

        out.flush();
        out.close();

    }
}
