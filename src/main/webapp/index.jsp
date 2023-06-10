<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<h1>회원가입</h1>
<%--1. method는 대소문자 구분 필요없음(멘토님 확인완료)--%>
<%--2. post로 보내는게 좋음. 이유는 get 선택 시, querrystring으로 로그인이 가능하기 때문--%>
<%--3. --%>
<form action="main" method="post">
    <label>아이디 : </label>
    <input type="text" name="id" placeholder="아이디를 입력해주세요"> <br>
    <label>비밀번호 : </label>
    <input type="password" name="pw" placeholder="비밀번호를 입력해주세요"> <br>
    <label>전화번호 : </label>
    <input type="text" name="phoneNumber" placeholder="010-xxxx-xxxx 형식으로 입력해주세요"> <br>
    <label>이메일 : </label>
    <input type="text" name="email" placeholder="이메일을 입력해주세요"> <br>
    <label>닉네임 : </label>
    <input type="text" name="nickname" placeholder="닉네임을 입력해주세요"> <br>
    <input type="submit" value="회원가입">
<%--    </p>--%>
</form>

</body>
</html>