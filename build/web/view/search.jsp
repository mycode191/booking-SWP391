<html>
    <head>
        <title>Search your records</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="author" content="colorlib.com">
        <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet" />
        <link href="css/main.css" rel="stylesheet" />
        <link rel="shortcut icon" type="image/png" href="favicon/iconlogo.png"/>

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">

        <link rel="stylesheet" href="css/tooplate-style.css">
    </head>
    <body>
        <div id="navbar"><%@ include file="../components/navbar2.jsp" %></div>
        <div class="s01">
            <form action="search" method="post">
                <fieldset>
                    <legend>Enter the medical code which doctor gave you!</legend>
                </fieldset>
                <div class="inner-form">
                    <div class="input-field first-wrap">
                        <input id="search" name="code" type="text" placeholder="Enter code here" />
                    </div>
                    <div class="input-field third-wrap">
                        <button class="btn-search" type="submit">Search</button>
                    </div>
                </div>
            </form>
        </div>
    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
