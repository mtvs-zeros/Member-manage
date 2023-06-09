package com.manage.manageproject;

public class Member {
    private String id;
    private String pw;
    private String phoneNumber;
    private String email;
    private String nickname;

    public Member(String id, String pw, String phoneNumber, String email, String nickname) {
        this.id = id;
        this.pw = pw;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }


}


