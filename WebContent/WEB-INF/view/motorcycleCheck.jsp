<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>あなたの適性オートバイ</title>
</head>
<body>
<h2>あなたにぴったりなオートバイを診断いたします。</h2>
<img src ="images/drugstar.jpeg" alt="TWの写真。" title="TW ヤマハ">
<form action="/motorcycleapp/mcyclecheck" method="post">
どのようなタイプのオートバイをお探しですか?<br>

<input type ="radio" name ="type" value="0"> 免許をとるのに時間はなるべく使いたくない。<br>
<input type ="radio" name ="type" value="1"> 警察には捕まりたくない。<br>
<input type ="radio" name ="type" value="2"> 自転車の変わりに使う。高速にも使いたい。<br>
<input type ="radio" name ="type" value="3"> 面倒な操作はしたくない。でも大きなバイクがいいな。<br>
<input type ="radio" name ="type" value="4"> 普段街乗り。たまには遠出したい。<br>
<input type ="radio" name ="type" value="5"> 一生乗れるバイクを探している。<br>
<input type ="radio" name ="type" value="6"> 渋い大型バイクに乗りたい。<br>
<input type ="radio" name ="type" value="7">スピード狂だ。<br>
<input type ="radio" name ="type" value="8"> 道路を支配したい。。<br>
<input type ="submit" value="送信"> <br>
</form>


</body>
</html>