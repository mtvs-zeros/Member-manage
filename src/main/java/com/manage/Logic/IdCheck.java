package com.manage.Logic;

import com.manage.manageproject.Main;
import com.manage.manageproject.Member;
import jakarta.servlet.ServletException;

import java.util.ArrayList;

public class IdCheck {

    // 아이디에 관련된 로직
    public String Check(String id) throws ServletException,IllegalArgumentException {
        // Member 객체 안의 ID 값을 반복문을 통해서 조회한다. 조회 후 id값이 중복이 있는지 확인



        // 특수 문자 처리
        if (id.matches(".*[^a-zA-Z0-9].*")) {
            throw new ArithmeticException();
        }

        // 길이 확인하는 로직
        if (!(5<= id.length())) {
            throw new IllegalArgumentException();
        }
        if(!(id.length()<=12)){
            throw new ArrayIndexOutOfBoundsException();
        }


        // 중복 확인하는 로직
        for(int i =0; i<Main.members.size();i++){
            String alist_id = Main.members.get(i).getId();
            if (alist_id.equals(id)){
                throw new ServletException();
            }
        }



        return id;
    }
}
