<%-- 
    Document   : navbar
    Created on : Mar 14, 2021, 10:50:31 PM
    Author     : HIEU19
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<header>
    <div class="container">
        <div class="row">

            <div class="col-md-4 col-sm-5">
                <img src="favicon/iconlogo.png" style="width: 40px"> <a href="http://benhviendakhoanongnghiep.vn/" target="_blank" class="navbar-brand">General Hospital of Agriculture</a>
            </div>

            <div class="col-md-8 col-sm-7 text-align-right">
                <span class="phone-icon"><i class="fa fa-phone"></i> 096-778-1616</span>
                <span class="date-icon"><i class="fa fa-calendar-plus-o"></i> Open all the time (include holidays)</span>
                <span class="email-icon"><i class="fa fa-envelope-o"></i>benhviennongnghiep1@gmail.com</span>
            </div>

        </div>
    </div>
</header>
<section class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">

        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon icon-bar"></span>
                <span class="icon icon-bar"></span>
                <span class="icon icon-bar"></span>
            </button>

            <!-- lOGO TEXT HERE -->
            <h3>Welcome to Department of Subclinical</h3>
        </div>

        <!-- MENU LINKS -->
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#top" class="smoothScroll">Home</a></li>
                <!--                <li><a href="#about" class="smoothScroll">About Us</a></li>-->
                <li><a href="#team" class="smoothScroll">Doctors</a></li>
                <li><a href="#news" class="smoothScroll">News</a></li>
                
                <c:if test="${sessionScope.role == 2 || sessionScope.role == 3}">
                    <li class="appointment-btn btn-blue" style="border-radius: 5px"><a href="dashboard">Doctor site</a></li>
                    </c:if>
                    
                <c:if test="${sessionScope.role == 1}">
                   <li><a href="change-password" class="smoothScroll">Change password</a></li>
                    </c:if>
                
                
                <li class="appointment-btn btn-blue" style="border-radius: 5px"><a href="search">See medical records</a></li>

                <c:if test="${sessionScope.auth == null}">
                    <li class="appointment-btn btn-red" style="border-radius: 5px"><a href="login">Login</a></li>

                </c:if>

                <c:if test="${sessionScope.auth != null}">
                    <li class="appointment-btn btn-red" style="border-radius: 5px"><a href="logout">Log out</a></li>

                </c:if>
            </ul>
        </div>

    </div>
</section>
