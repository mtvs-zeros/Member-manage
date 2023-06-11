package com.manage.manageproject;

import com.manage.Logic.*;
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
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String nickname = req.getParameter("nickname");


        try {
            // 아이디 체크 관련 로직
            IdCheck idCheck = new IdCheck();
            idCheck.Check(id);

            // 비밀번호 체크 관련 로직
            PwCheck pwCheck = new PwCheck();
            pwCheck.check(pw);

            // 폰 넘버 체크 관련 로직
            PhoneCheck phoneCheck = new PhoneCheck();
            phoneCheck.isPhone(phoneNumber);

            // 이메일 체크 관련 로직
            EmailCheck emailCheck = new EmailCheck();
            emailCheck.Check(email);

            // 닉네임 체크 관련 로직
            NickNameCheck nickNameCheck = new NickNameCheck();
            nickNameCheck.NickCheck(nickname);

            members.add(new Member(id, pw, phoneNumber, email, nickname));
            req.setAttribute("id", id);

            RequestDispatcher rd = req.getRequestDispatcher("/result");
            rd.forward(req,resp);

        }catch (ServletException e){
            resp.sendError(500,"중복된 값이 존재합니다!!");
        }catch (IllegalArgumentException e){
            resp.sendError(400,"입력된 값의 길이가 짧습니다!!");
        }catch (ArrayIndexOutOfBoundsException e){
            resp.sendError(305, "입력된 값의 길이가 너무 깁니다!!");
        }catch (ArithmeticException e){
            resp.sendError(505, "공백이나 특수문자는 입력할 수 없습니다!!");
        } catch (NoSuchFieldException e) {
            resp.sendError(405, "값이 입력되지 않았습니다.");
        }

    }


}
