<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page autoFlush="true" buffer="1094kb"%>
    
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    
    <%@page import="bean.adminBean" %>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Update Admin | Reader's Heaven</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- favicon
		============================================ -->
    <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
    <!-- Google Fonts
		============================================ -->
    <link href="https://fonts.googleapis.com/css?family=Play:400,700" rel="stylesheet">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="./css/font-awesome.min.css">
    <!-- owl.carousel CSS
		============================================ -->
    <link rel="stylesheet" href="./css/owl.carousel.css">
    <link rel="stylesheet" href="./css/owl.theme.css">
    <link rel="stylesheet" href="./css/owl.transitions.css">
    <!-- animate CSS
		============================================ -->
    <link rel="stylesheet" href="./css/animate.css">
    <!-- normalize CSS
		============================================ -->
    <link rel="stylesheet" href="./css/normalize.css">
    <!-- meanmenu icon CSS
		============================================ -->
    <link rel="stylesheet" href="./css/meanmenu.min.css">
    <!-- main CSS
		============================================ -->
    <link rel="stylesheet" href="./css/main.css">
    <!-- morrisjs CSS
		============================================ -->
    <link rel="stylesheet" href="./css/morris./js/morris.css">
    <!-- mCustomScrollbar CSS
		============================================ -->
    <link rel="stylesheet" href="./css/scrollbar/jquery.mCustomScrollbar.min.css">
    <!-- metisMenu CSS
		============================================ -->
    <link rel="stylesheet" href="./css/metisMenu/metisMenu.min.css">
    <link rel="stylesheet" href="./css/metisMenu/metisMenu-vertical.css">
    <!-- calendar CSS
		============================================ -->
    <link rel="stylesheet" href="./css/calendar/fullcalendar.min.css">
    <link rel="stylesheet" href="./css/calendar/fullcalendar.print.min.css">
    <!-- modals CSS
		============================================ -->
    <link rel="stylesheet" href="./css/modals.css">
    <!-- forms CSS
		============================================ -->
    <link rel="stylesheet" href="./css/form/all-type-forms.css">
    <!-- style CSS
		============================================ -->
    <link rel="stylesheet" href="./css/style.css">
    <!-- responsive CSS
		============================================ -->
    <link rel="stylesheet" href="./css/responsive.css">
    <!-- modernizr JS
		============================================ -->
    <script src="./js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

    
    <!-- Start Welcome area -->
    <div class="all-content-wrapper">
        <div class="container-fluid">
            
        </div>
        
        <%@ include file="header.jsp"%>
                <!--  mobile menu patyu --> 
            <div class="breadcome-area">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="breadcome-list single-page-breadcome">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="breadcome-heading">
                                            
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <ul class="breadcome-menu">
                                            <li><a href="#">Home</a> <span class="bread-slash">/</span>
                                            </li>
                                            <li><span class="bread-blod">Update Admin</span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Basic Form Start -->
        <div class="basic-form-area mg-tb-15">
            <div class="container-fluid">
                <div class="row">
                   
                </div>
                <div class="row" style="margin-top:4%; margin-bottom:3%;">
                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12" style="margin-left:20%;">
                        <div class="sparkline10-list mt-b-30">
                            <div class="sparkline10-hd">
                                <div class="main-sparkline10-hd">
                                    <h1>Update admin details<span class="basic-ds-n"></span></h1>
                                </div>
                            </div>
                            <div class="sparkline10-graph">
                                <div class="basic-login-form-ad">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="basic-login-inner inline-basic-form">
                                             <%List<adminBean>b=(ArrayList)request.getAttribute("listAdmin");
							if(b==null){ %>
							 <jsp:forward page="/updateAdminServlet?action=updateadmin.jsp" />
		 					<% }else{
		 						b=(ArrayList)request.getAttribute("listAdmin");%>
		 				
		 						<% 
		 						for(int i=0;i<b.size();i++)
								{
									adminBean admin=b.get(i);
									System.out.println(admin.getPassword());
		 					
							%>
                                                <form action="./update1AdminServlet?id=<%=admin.getAdmin_id()%>" method="post">
                                               
                                                     <div class="form-group-inner">
                                                        <div class="row">
                                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                                                <label class="login2 pull-right pull-right-pro">Username</label>
                                                            </div>
                                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                                                                <input type="email" name="email" value="<%=admin.getEmail()%>" class="form-control" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <br/>
                                                    <div class="form-group-inner">
                                                        <div class="row">
                                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                                                <label class="login2 pull-right pull-right-pro">Password</label>
                                                            </div>
                                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                                                                <input type="password" name="password" value="<%=admin.getPassword()%>" class="form-control" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <br/>
                                                    <div class="form-group-inner">
                                                        <div class="row">
                                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                                                <label class="login2 pull-right pull-right-pro">Confirm Password</label>
                                                            </div>
                                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                                                                <input type="password" name="cpassword" value="<%=admin.getPassword()%>" class="form-control" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <br/>
                                                   
                                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12" style="margin-left:40%;">
                                                     <button class="btn btn-success btn-block loginbtn" value="Login">Update</button>
                                                     </div>
                                                    
                                                </form>
                                                 <% }
		 						} %>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                 </div>
            
            </div>
        </div>
        <!-- Basic Form End-->
        <div class="footer-copyright-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer-copy-right">
                             <p>Copyright by Reader's Heaven &copy; 2018 <a href="https://colorlib.com/wp/templates/"></a> .</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- jquery
		============================================ -->
    <script src="./js/vendor/jquery-1.11.3.min.js"></script>
    <!-- bootstrap JS
		============================================ -->
    <script src="./js/bootstrap.min.js"></script>
    <!-- wow JS
		============================================ -->
    <script src="./js/wow.min.js"></script>
    <!-- price-slider JS
		============================================ -->
    <script src="./js/jquery-price-slider.js"></script>
    <!-- meanmenu JS
		============================================ -->
    <script src="./js/jquery.meanmenu.js"></script>
    <!-- owl.carousel JS
		============================================ -->
    <script src="./js/owl.carousel.min.js"></script>
    <!-- sticky JS
		============================================ -->
    <script src="./js/jquery.sticky.js"></script>
    <!-- scrollUp JS
		============================================ -->
    <script src="./js/jquery.scrollUp.min.js"></script>
    <!-- mCustomScrollbar JS
		============================================ -->
    <script src="./js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="./js/scrollbar/mCustomScrollbar-active.js"></script>
    <!-- metisMenu JS
		============================================ -->
    <script src="./js/metisMenu/metisMenu.min.js"></script>
    <script src="./js/metisMenu/metisMenu-active.js"></script>
    <!-- tab JS
		============================================ -->
    <script src="./js/tab.js"></script>
    <!-- icheck JS
		============================================ -->
    <script src="./js/icheck/icheck.min.js"></script>
    <script src="./js/icheck/icheck-active.js"></script>
    <!-- plugins JS
		============================================ -->
    <script src="./js/plugins.js"></script>
    <!-- main JS
		============================================ -->
    <script src="./js/main.js"></script>
</body>

</html>