<%-- 
    Document   : dangnhap
    Created on : Mar 4, 2021, 1:56:58 AM
    Author     : HIEU19
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="shortcut icon" type="image/png" href="favicon/iconlogo.png"/>
        <link rel="stylesheet" href="css/css.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
    <body>
        
        <section class="left">
            <h1 style="font-size: 80px">Login</h1><br/><br/>
            <form action="login" method="POST">
                <input class="input-group mb-3" type="text" name="username" placeholder="User name"><br/>
                <input class="input-group mb-3" type="password" name="password" id="pass" placeholder="Password">

                <input type="checkbox" onclick="myFunction()">Show password<br/>
                <input type="checkbox" name="remember" value="1">Remember password<br/><br/>
                
                <c:if test="${requestScope.mess != null}">
                    <a href="#" onclick="alert();"></a>  
                </c:if>
                    
                <input type="submit" value="Login" style="width: 100px; display: inline-block">
            </form><br/>
            <a href="signup" style="text-decoration: none">Don't have account? Create one</a><br/><br/>
            <br/><br/><br/>
            <div style="text-align: center">build with <i class="fa fa-heart" style="font-size:48px;color:red"></i> by HieuNQ</div>
            <div style="text-align: center">Student of FPT university</div>
        </section>
        <section class="right">
            <img id="img1" src="img/download.png" >
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </body>
    <script>
                    function myFunction() {
                        var x = document.getElementById("pass");
                        if (x.type === "password") {
                            x.type = "text";
                        } else {
                            x.type = "password";
                        }
                    }

                    function alert() {
                        alert("sai sai sai");
                    }
    </script>
</html>
