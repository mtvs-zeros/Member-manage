<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
    <style>
        form{
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="password"] {
            width: 300px;
            padding: 5px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            padding: 5px 15px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        input[type="submit"][value="회원가입"] {
            background-color: dodgerblue;
            color: white;
        }
    </style>
</head>
<body>
<h1 align="center">회원가입</h1>
<form action="main" method="post">
    <label>아이디</label>
    <input type="text" name="id" placeholder="아이디를 입력해주세요">
    <input type="submit" value="아이디 확인"> <br>
    <label>비밀번호</label>
    <input type="password" name="pw" placeholder="비밀번호를 입력해주세요">
    <input type="submit" value="비밀번호 확인"> <br>
    <label>전화번호</label>
    <input type="text" name="phoneNumber" placeholder="010-xxxx-xxxx 형식으로 입력해주세요">
    <input type="submit" value="전화번호 확인"> <br>
    <label>이메일</label>
    <input type="text" name="email" placeholder="이메일을 입력해주세요">
    <input type="submit" value="이메일 확인"> <br>
    <label>닉네임</label>
    <input type="text" name="nickname" placeholder="닉네임을 입력해주세요">
    <input type="submit" value="닉네임 확인"> <br>
    <input type="submit" value="회원가입">
</form>
</body>
</html>
