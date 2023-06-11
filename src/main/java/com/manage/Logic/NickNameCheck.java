package com.manage.Logic;

import com.manage.manageproject.Member;
import jakarta.servlet.ServletException;

import static com.manage.manageproject.Main.members;


public class NickNameCheck {

    public String NickCheck(String nickname) throws ServletException {

        for (Member member : members) {
            if(member.getNickname().equals(nickname)) {
                System.out.println("중복된 닉네임입니다.");
                throw new ServletException("중복된 닉네임입니다.");
            }
            System.out.println("사용가능한 닉네임");
        }

        return nickname;
    }
}
