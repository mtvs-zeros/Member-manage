package com.manage.manageproject;

import com.manage.Logic.IdCheck;
import com.manage.Logic.PhoneCheck;
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
            // 아이디 체크 관련 로직
            IdCheck idCheck = new IdCheck();
            idCheck.Check();

            // 비밀번호 체크 관련 로직

            // 폰 넘버 체크 관련 로직
            PhoneCheck phoneCheck = new PhoneCheck();
            if (!(phoneCheck.isPhone(phoneNumber))) {
                throw new IllegalArgumentException("010-xxxx-xxxx 형식으로 입력해주세요");
            }

            // 이메일 체크 관련 로직

            // 닉네임 체크 관련 로직

            members.add(new Member(id, pw, phoneNumber, email, nickname));
            req.setAttribute("id", id);

            RequestDispatcher rd = req.getRequestDispatcher("/result");
            rd.forward(req,resp);

        }catch (ServletException e){

        }

    }


}
