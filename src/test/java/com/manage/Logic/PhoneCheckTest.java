package com.manage.Logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneCheckTest {

    private PhoneCheck phoneCheck;

    @BeforeEach
    public void setUp() {
        this.phoneCheck = new PhoneCheck();
    }

    @DisplayName("올바른 형식의 폰번호를 입력 시 true를 반환하는지")
    @Test
    void testisPhone1() {

        //given
        String phone = "010-1234-5678";
        //when
        boolean result = phoneCheck.isPhone(phone);
        //then
        Assertions.assertEquals(true, result);
    }

    @DisplayName("올바르지 않은 형식의 폰번호를 입력 시 false를 반환하는지")
    @Test
    void testisPhone2() {

        String phone = "01012345678";
        boolean result = phoneCheck.isPhone(phone);
        Assertions.assertEquals(false, result);
    }

}