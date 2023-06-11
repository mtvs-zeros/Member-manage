package com.manage.manageproject;

import com.manage.Logic.IdCheck;
import com.manage.Logic.PwCheck;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/main")
public class Main extends HttpServlet {

    public static ArrayList<Member> members = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String pw = req.getParameter("pw");

        //전화번호를 String으로 저장하는 이유는 국가번호(ex)대한민국은 +82)가 붙을 경우가 있기 때문에 무조건 정수값이 들어오는게 아님.)
        String phoneNumber = req.getParameter("phoneNumber");

        String email = req.getParameter("email");
        String nickname = req.getParameter("nickname");


        try {
//            ArrayList<Member> members = new ArrayList<>();

            // 비밀번호 체크 관련 로직
            PwCheck pwCheck = new PwCheck();
            pwCheck.check(pw);

            members.add(new Member(id, pw, phoneNumber, email, nickname));
            req.setAttribute("pw", pw);

            RequestDispatcher rd = req.getRequestDispatcher("/result");
            rd.forward(req,resp);


        }catch (IllegalArgumentException e) {
            resp.sendError(400,"입력된 값의 길이가 짧습니다!!");
        }catch (ArrayIndexOutOfBoundsException e) {
            resp.sendError(305, "입력된 값의 길이가 너무 깁니다!!");

        }

    }


}