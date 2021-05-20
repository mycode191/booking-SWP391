<%-- 
    Document   : cart
    Created on : Mar 2, 2021, 8:20:31 PM
    Author     : HIEU19
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href="favicon/iconlogo.png"/>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Create results</title>
    </head>
    <body>
        
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <a class="navbar-brand" href="dashboard">Doctor website</a>
            <button class="btn btn-link btn-sm order-1 order-lg-0" id="sidebarToggle" href="#"><i
                    class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
                <div class="input-group">

                    <div class="input-group-append" style="color: white; font-size: 30px;">
                        Department of Subclinical
                    </div>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ml-auto ml-md-0">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="userDropdown" href="#" role="button" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                        <a class="dropdown-item" href="home">Home Page</a>             
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="logout">Logout</a>
                    </div>
                </li>
            </ul>
        </nav>
        <br/><br/>

        <h1 style="text-align: center">Final Result</h1>
        <form action="create" method="post">
            <div class="form-group col-md-4">
                <label for="inputCity" style="font-weight: bolder">&nbsp;&nbsp;Results code</label>
                <input type="text" value="${sessionScope.create_code}" name="code"> &nbsp;&nbsp;  <a href="generate" class="btn btn-secondary btn-lg">
                    Generate
                </a>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputEmail4">&nbsp;&nbsp;Patient name</label>
                    <input type="text" class="form-control" id="inputEmail4" placeholder="Patient name" name="name">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPassword4">&nbsp;&nbsp;Phone number</label>
                    <input type="text" class="form-control" id="inputPassword4" placeholder="Phone number" name="phone">
                </div>
                
                <div class="form-group col-md-2">
                    <label for="inputPassword4">&nbsp;&nbsp;Age</label>
                    <input type="text" class="form-control" id="inputPassword4" placeholder="Age" name="age">
                </div>
                   <div class="form-group col-md-4">
                    <label for="inputPassword4">&nbsp;&nbsp;Email</label>
                    <input type="text" class="form-control" id="inputPassword4" placeholder="Email" name="email">
                </div> 
                
                <div class="form-group col-md-2" style="margin-left: 200px">
                    <br/>
                    <span style="font-size: 20px">Gender:</span>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" id="male" name="gender" value="male">
                    <label for="male"><span style="font-size: 20px">Male</span></label>
                    <input type="radio" id="female" name="gender" value="female">
                    <label for="female"><span style="font-size: 20px">Female</span></label>

                </div>

            </div>
            <div class="form-group">
                <label for="inputAddress">&nbsp;&nbsp;Address</label>
                <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St" name="address">
            </div>
            <div class="form-group col-md-4">
                <label for="inputState">Medical Option</label>
                <select id="inputState" class="form-control" name="option">
                    <option selected>Insurance</option>
                    <option >Non - Insurance</option>
                </select>
            </div>
            <div class="form-group">
                <label for="inputAddress2">&nbsp;&nbsp;Insurance code</label>
                <input type="text" class="form-control" id="inputAddress2" placeholder="XX - 13 digits code" name="option_code">
            </div>

            <div class="form-group">
                <label for="inputCity">&nbsp;&nbsp;Hepatobiliary</label>
                <input type="text" class="form-control" id="inputCity" name="hepa">
            </div>
            <div class="form-group">
                <label for="inputCity">&nbsp;&nbsp;Pancreas</label>
                <input type="text" class="form-control" id="inputCity" name="panc">
            </div>
            <div class="form-group">
                <label for="inputCity">&nbsp;&nbsp;Reins</label>
                <input type="text" class="form-control" id="inputCity" name="rein">
            </div>
            <div class="form-group">
                <label for="inputCity">&nbsp;&nbsp;Bladder</label>
                <input type="text" class="form-control" id="inputCity" name="blad">
            </div>
            <div class="form-group">
                <label for="inputCity">&nbsp;&nbsp;Other</label>
                <input type="text" class="form-control" id="inputCity" name="other">
            </div>
            <div class="form-group">
                <label for="inputCity" style="font-weight: bolder">&nbsp;&nbsp;Conclusion</label>
                <input type="text" class="form-control" id="inputCity" name="f">
            </div>
            <div class="row">
                <div class="form-group col-md-4">
                    <label for="inputState">Doctor in charge</label>
                    <select class="form-control" name="doc_id">
                        <c:forEach items="${requestScope.doctor}" var="doc">
                            <option value="${doc.id}">${doc.level} ${doc.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="inputCity">&nbsp;&nbsp;Date of examination</label>
                    <input type="text" class="form-control" id="inputCity" name="date" value="${requestScope.date}">
                </div>
            </div>

            <button type="submit" class="btn btn-primary btn-lg">Create</button>

            <a href="nga3.jsp" class="btn btn-primary btn-lg" style="float: right">
                Create another result
            </a>
        </form>

        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
