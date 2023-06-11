package com.manage.Logic;

// 이메일과 관련된 로직
/*
     중복 체크
    - Member 클래스의 email 값을 반복문을 통해서 조회한다.
    - 조건문을 통해 중복된 값이 존재하면, `ServletException` 예외를 날려준다.
 */

import com.manage.manageproject.Main;
import jakarta.servlet.ServletException;

public class EmailCheck {

    public String Check(String email) throws ServletException, IllegalArgumentException{

        for(int i = 0; i < Main.members.size(); i++){
            String alist_email = Main.members.get(i).getEmail();
            if (alist_email.equals(email)){
                throw new ServletException();
            }
        }

        return email;
    }
}
