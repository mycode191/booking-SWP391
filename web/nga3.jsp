<%-- 
    Document   : nga3.jsp
    Created on : Mar 25, 2021, 2:46:56 PM
    Author     : HIEU19
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Redirect</title>
        <link rel="shortcut icon" type="image/png" href="favicon/iconlogo.png"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <style>
            p{
                font-size: 50px;
            }
        </style>
    </head>
    <body>
        
        <div class="container" style="margin-top: 100px">
            <div class="row" style="text-align: center">
                <div class="col-md-4">
                    <a href="create" class="btn btn-primary btn-lg">
                        <p> Create final result</p>
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="create1" class="btn btn-primary btn-lg">

                        <p>Create biochemical record</p>
                    </a>    
                </div>
                <div class="col-md-4">
                    <a href="create2" class="btn btn-primary btn-lg">

                        <p> Create blood cells analysis</p>
                    </a>
                </div>
            </div>

        </div>
        <a href="dashboard" style="border: 1px solid black;">Return to home page</a>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>

    </body>
</html>
