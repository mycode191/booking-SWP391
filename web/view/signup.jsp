<%-- 
    Document   : login2
    Created on : Mar 25, 2021, 12:19:23 PM
    Author     : HIEU19
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="css/logincss/fonts/icomoon/style.css">
        
        <link rel="stylesheet" href="css/logincss/css/owl.carousel.min.css">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/logincss/css/bootstrap.min.css">

        <!-- Style -->
        <link rel="stylesheet" href="css/logincss/css/style.css">
        <link rel="shortcut icon" type="image/png" href="favicon/iconlogo.png"/>
        <title>Login</title>
    </head>
    <body>


        <div class="d-lg-flex half">
            <div class="bg order-1 order-md-2" style="background-image: url('img/m1.jpg');"></div>
            <div class="contents order-2 order-md-1">

                <div class="container">
                    <div class="row align-items-center justify-content-center">
                        <div class="col-md-7">
                            <div class="mb-4">
                                <h3 style="font-size: 50px">Sign Up</h3>
                                <p class="text-danger">${requestScope.message}</p>
                            </div>
                            <form action="#" method="post">
                                <div class="form-group last mb-3">
                                    <label for="username">Username</label>
                                    <input type="text" class="form-control" id="username" name="user">

                                </div>
                                <div class="form-group first">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" id="password" name="pass">

                                </div>
                                <div class="form-group last mb-3">
                                    <label for="password">Re-enter password</label>
                                    <input type="password" class="form-control" id="password" name="re-pass">

                                </div>
                                

                                <input type="submit" value="Sign up" class="btn btn-block btn-primary">
                                <br/><br/>
                                <a href="login">Already a member of us? Login now</a>
                                <br/><br/><br/><br/>
                                <span class="d-block text-center my-4 text-muted">&mdash; build with love by Hieu19 &mdash;</span>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


        </div>



        <script src="css/logincss/js/jquery-3.3.1.min.js"></script>
        <script src="css/logincss/js/popper.min.js"></script>
        <script src="css/logincss/js/bootstrap.min.js"></script>
        <script src="css/logincss/js/main.js"></script>
    </body>
</html>
