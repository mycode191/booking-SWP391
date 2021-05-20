<!DOCTYPE html>
<html lang="en">
    <head>

        <title>Health - Medical Website Template</title>
        <!--
        
        Template 2098 Health
        
        http://www.tooplate.com/view/2098-health
        
        -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <meta name="author" content="Tooplate">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link rel="shortcut icon" type="image/png" href="favicon/iconlogo.png"/>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">

        <!-- MAIN CSS -->
        <link rel="stylesheet" href="css/tooplate-style.css">

    </head>
    <body id="top" data-spy="scroll" data-target=".navbar-collapse" data-offset="50">

        <!-- PRE LOADER -->
        <section class="preloader">
            <div class="spinner">

                <span class="spinner-rotate"></span>

            </div>
        </section>



        <div id="navbar"><%@ include file="../components/navbar.jsp" %></div>



        <!-- MAKE AN APPOINTMENT -->
        <section id="appointment" data-stellar-background-ratio="3">
            <div class="container">
                <div class="row">

                    <div class="col-md-6 col-sm-6">
                        <img src="img/appointment-image.jpg" class="img-responsive" alt="">
                    </div>

                    <div class="col-md-6 col-sm-6">
                        <!-- CONTACT FORM HERE -->
                        <form id="appointment-form" role="form" method="post" action="#">

                            <!-- SECTION TITLE -->
                            <div class="section-title wow fadeInUp" data-wow-delay="0.4s">
                                <h2>Make an appointment</h2>
                            </div>

                            <div class="wow fadeInUp" data-wow-delay="0.8s">
                                <div class="col-md-6 col-sm-6">
                                    <label for="name">Name</label>
                                    <input type="text" class="form-control" id="name" name="name" placeholder="Full Name">
                                </div>

                                <div class="col-md-6 col-sm-6">
                                    <label for="email">Email</label>
                                    <input type="email" class="form-control" id="email" name="email" placeholder="Your Email">
                                </div>

                                <div class="col-md-6 col-sm-6">
                                    <label for="date">Select Date</label>
                                    <input type="date" name="date" value="" class="form-control">
                                </div>

                                <div class="col-md-6 col-sm-6">
                                    <label for="select">Select Department</label>
                                    <select class="form-control">
                                        <option>General Health</option>
                                        <option>Cardiology</option>
                                        <option>Dental</option>
                                        <option>Medical Research</option>
                                    </select>
                                </div>

                                <div class="col-md-12 col-sm-12">
                                    <label for="telephone">Phone Number</label>
                                    <input type="tel" class="form-control" id="phone" name="phone" placeholder="Phone">
                                    <label for="Message">Additional Message</label>
                                    <textarea class="form-control" rows="5" id="message" name="message" placeholder="Message"></textarea>
                                    <button type="submit" class="form-control" id="cf-submit" name="submit">Submit Button</button>
                                </div>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </section>




        <!-- FOOTER -->
        <footer data-stellar-background-ratio="5" id="footer">
            <div class="container">
                <div class="row">

                    <div class="col-md-4 col-sm-4">
                        <div class="footer-thumb"> 
                            <h4 class="wow fadeInUp" data-wow-delay="0.4s">Contact Info</h4>
                            <p>General Hospital of Agriculture<br/><br/>
                                Address I: Km13+500 1A Highway - Ngoc Hoi - Thanh Tri - Hanoi<br/><br/>
                                Address II: No. 16 Lane 183 - Dang Tien Dong - Dong Da - Hanoi</p>

                            <div class="contact-info">
                                <p><i class="fa fa-phone"></i>04 3.861.5320</p>
                                <p><i class="fa fa-envelope-o"></i>benhviennongnghiep1@gmail.com</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 col-sm-4"> 
                        <div class="footer-thumb"> 
                            <h4 class="wow fadeInUp" data-wow-delay="0.4s">Latest News</h4>
                            <div class="latest-stories">
                                <div class="stories-image">
                                    <a href="http://benhviendakhoanongnghiep.vn/ap-dung-3-cong-nghe-cao-tren-cung-1-ca-benh-soi-mat-tai-phat/" target="_blank"><img src="img/news-image.jpg" class="img-responsive" alt=""></a>
                                </div>
                                <div class="stories-info">
                                    <a href="http://benhviendakhoanongnghiep.vn/ap-dung-3-cong-nghe-cao-tren-cung-1-ca-benh-soi-mat-tai-phat/" target="_blank"><h5>Amazing Technology</h5></a>
                                    <span>March 13, 2021</span>
                                </div>
                            </div>

                            <div class="latest-stories">
                                <div class="stories-image">
                                    <a href="http://benhviendakhoanongnghiep.vn/hieu-ro-hon-ve-vac-xin/" target="_blank"><img src="img/vaccine1.jpg" class="img-responsive" alt=""></a>
                                </div>
                                <div class="stories-info">
                                    <a href="http://benhviendakhoanongnghiep.vn/hieu-ro-hon-ve-vac-xin/" target="_blank"><h5>Knowledge about vaccine</h5></a>
                                    <span>June 08, 2020</span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 col-sm-4"> 
                        <div class="footer-thumb">
                            <div class="opening-hours">
                                <h4 class="wow fadeInUp" data-wow-delay="0.4s">Opening Hours</h4>
                                <p>Open all the time (include holidays)</p>
                            </div> 

                            <ul class="social-icon">
                                <li><a class="fa fa-facebook-square" attr="facebook icon"></a></li>
                                <li><a  class="fa fa-twitter"></a></li>
                                <li><a class="fa fa-instagram"></a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="col-md-12 col-sm-12 border-top">
                        <div class="col-md-4 col-sm-6">
                            <div class="copyright-text"> 
                                <p>Copyright &copy; 2021 &nbsp |&nbsp Design: Hieu19</p>
                                <p><a class="fa fa-envelope-o"></a> hieu19.developer@gmail.com</p>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6">
                            <div class="footer-link"> 
                                <a href="http://benhviendakhoanongnghiep.vn/" target="_blank">Laboratory Tests</a>
                                <a href="http://benhviendakhoanongnghiep.vn/" target="_blank">Departments</a>
                                <a href="http://benhviendakhoanongnghiep.vn/" target="_blank">Insurance Policy</a>
                                <a href="http://benhviendakhoanongnghiep.vn/" target="_blank">Careers</a>
                            </div>
                        </div>
                        <div class="col-md-2 col-sm-2 text-align-center">
                            <div class="angle-up-btn"> 
                                <a href="#top" class="smoothScroll wow fadeInUp" data-wow-delay="1.2s"><i class="fa fa-angle-up"></i></a>
                            </div>
                        </div>   
                    </div>

                </div>
            </div>
        </footer>

        <!-- SCRIPTS -->
        <script src="css/home/jquery.js"></script>
        <script src="css/home/bootstrap.min.js"></script>
        <script src="css/home/jquery.sticky.js"></script>
        <script src="css/home/jquery.stellar.min.js"></script>
        <script src="css/home/wow.min.js"></script>
        <script src="css/home/smoothscroll.js"></script>
        <script src="css/home/owl.carousel.min.js"></script>
        <script src="css/home/custom.js"></script>

    </body>
</html>