package com.manage.Logic;

public class PwCheck {
    public String check(String pw) throws IllegalArgumentException,ArrayIndexOutOfBoundsException {
        //-  5 ~ 20자 이내로 작성되도록 할 것
        if (!(pw.length()>=5)) {
            throw new IllegalArgumentException();
        }
        if (!(pw.length()<=20)) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // 사용자가 입력한 비밀번호의 길이를 호출하는 것
        System.out.println(pw.length());

        return pw;
    }
}