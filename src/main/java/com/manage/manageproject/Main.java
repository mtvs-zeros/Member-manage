package com.manage.manageproject;

import com.manage.Logic.IdCheck;
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
//        Main.members.add(new Member("qlqlzbxkzl", "1234", "01022614492", "qlqlzbxkzl@naver.com", "이현석"));
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
            idCheck.Check(id);

            // 비밀번호 체크 관련 로직

            // 폰 넘버 체크 관련 로직

            // 이메일 체크 관련 로직

            // 닉네임 체크 관련 로직

            members.add(new Member(id, pw, phoneNumber, email, nickname));
//            System.out.println(members);
            req.setAttribute("id", id); //"id" 속성을 새로 설정, id(dsa)

            RequestDispatcher rd = req.getRequestDispatcher("/result");
            rd.forward(req,resp);

        }catch (ServletException e){
            System.out.println("오류 발생!!!");
            resp.sendError(500,"중복된 값이 존재합니다!!");
        }catch (IllegalArgumentException e){
            System.out.println("오류 발생!!!");
            resp.sendError(400,"입력된 값의 길이가 짧습니다!!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("오류 발생");
            resp.sendError(305, "입력된 값의 길이가 너무 깁니다!!");
        }catch (ArithmeticException e){
            System.out.println("오류 발생");
            resp.sendError(505, "공백이나 특수문자는 입력할 수 없습니다!!");
        } catch (NoSuchFieldException e) {
            System.out.println("오류 발생!!");
            resp.sendError(405, "값이 입력되지 않았습니다.");
        }

    }


}
