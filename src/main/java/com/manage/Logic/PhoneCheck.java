package com.manage.Logic;

import java.util.regex.Pattern;

public class PhoneCheck {
    public boolean isPhone(String phoneNumber) {
        return Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", phoneNumber);
    }

}
