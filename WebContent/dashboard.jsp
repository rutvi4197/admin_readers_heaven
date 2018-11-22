<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page autoFlush="true" buffer="1094kb"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="bean.categoryBean" %>
    <%@page import="bean.dashboard_adminBean" %>   
    <!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Dashboard | Reader's Heaven</title>
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
    <div class="breadcome-area">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="breadcome-list">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <div class="breadcome-heading">
                                           
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                        <ul class="breadcome-menu">
                                            <li ><a href="#"><span style="color:white !important;">Home</span></a> <span class="bread-slash">/</span>
                                            </li>
                                            <li><span class="bread-blod">Dashboard</span>
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
            
            <%List<dashboard_adminBean>b=(ArrayList)request.getAttribute("listOfLibrary");
							if(b==null){ %>
							 <jsp:forward page="/dashboardServlet?action=dashboard.jsp" />
		 					<% }else{
		 						b=(ArrayList)request.getAttribute("listOfLibrary");
		 						dashboard_adminBean book=b.get(0);
		 						%>
        <div class="section-admin container-fluid">
            <div class="row admin text-center">
                <div class="col-md-12">
                    <div class="row">
                     <a href="#">   <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="admin-content analysis-progrebar-ctn res-mg-t-15">
                                <h4 class="text-left text-uppercase"><b>Yearly Sales</b></h4>
                                <div class="row vertical-center-box vertical-center-box-tablet">
                                    <div class="col-xs-3 mar-bot-15 text-left">
                                       
                                    </div>
                                    <div class="col-xs-9 cus-gh-hd-pro">
                                        <h2 class="text-right no-margin"><%= book.getYearly_sale() %></h2>
                                    </div>
                                </div>
                                <div class="progress progress-mini">
                                    <div style="width: 100%;" class="progress-bar bg-green"></div>
                                </div>
                            </div>
                        </div></a>
                      <a href="#">  <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12" style="margin-bottom:1px;">
                            <div class="admin-content analysis-progrebar-ctn res-mg-t-30">
                                <h4 class="text-left text-uppercase"><b>Monthly Sales</b></h4>
                                <div class="row vertical-center-box vertical-center-box-tablet">
                                    <div class="text-left col-xs-3 mar-bot-15">
                                       
                                    </div>
                                    <div class="col-xs-9 cus-gh-hd-pro">
                                        <h2 class="text-right no-margin"><%= book.getMonthly_sale() %></h2>
                                    </div>
                                </div>
                                <div class="progress progress-mini">
                                    <div style="width: 100%;" class="progress-bar progress-bar-danger bg-red"></div>
                                </div>
                            </div>
                        </div></a>
                     <a href="#">    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="admin-content analysis-progrebar-ctn res-mg-t-30">
                                <h4 class="text-left text-uppercase"><b>Daily Sales</b></h4>
                                <div class="row vertical-center-box vertical-center-box-tablet">
                                    <div class="text-left col-xs-3 mar-bot-15">
                                        <!--  <label class="label bg-blue">50% <i class="fa fa-level-up" aria-hidden="true"></i></label>-->
                                   <!--   <label class="label bg-blue"> </label>-->
                                    </div>
                                    <div class="col-xs-9 cus-gh-hd-pro">
                                        <h2 class="text-right no-margin"><%= book.getWeekly_sale() %></h2>
                                    </div>
                                </div>
                                <div class="progress progress-mini">
                                    <div style="width: 100%;" class="progress-bar bg-blue"></div>
                                    
                                </div>
                            </div>
                        </div></a>
                         
                       <a href="libraryApproval.jsp">  <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                            <div class="admin-content analysis-progrebar-ctn res-mg-t-30">
                                <h4 class="text-left text-uppercase"><b>Pending Approval</b></h4>
                                <div class="row vertical-center-box vertical-center-box-tablet">
                                    <div class="text-left col-xs-3 mar-bot-15">
                                       
                                    </div>
                                    <div class="col-xs-9 cus-gh-hd-pro">
                                        <h2 class="text-right no-margin"><%=  book.getApproved_lib() %></h2>
                                    </div>
                                </div>
                                <div class="progress progress-mini">
                                    <div style="width: 100%;" class="progress-bar bg-purple"></div>
                                </div>
                            </div>
                        </div></a><% }
		 					 %>
                    </div>
                </div>
            </div>
        </div>
        <div class="product-sales-area mg-tb-30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                        <div class="product-sales-chart">
                            <div class="portlet-title">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="caption pro-sl-hd">
                                            <span class="caption-subject text-uppercase"><b>Total Sales</b></span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="actions graph-rp">
                                            <div class="btn-group" data-toggle="buttons">
                                               </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <ul class="list-inline cus-product-sl-rp">
                                <li>
                                    <h5><i class="fa fa-circle" style="color: #33ffff;"></i>Books</h5>
                                </li>
                                <li>
                                    <h5><i class="fa fa-circle" style="color: #000066;"></i>Rent</h5>
                                </li>
                                
                            </ul>
                            <div id="morris-area-chart" style="height: 356px;"></div>
                        </div>
                    </div>
                    
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"> 
                    <% 
		 						b=(ArrayList)request.getAttribute("listOfLibrary");
		 						dashboard_adminBean book=b.get(0);
		 						%>
                       <a href="libraryDisApproval.jsp"> <div class="white-box analytics-info-cs mg-b-10 res-mg-t-30">
                            <h3 class="box-title">Disapproved Library</h3>
                            <ul class="list-inline two-part-sp">
                                <li>
                                    <div id="sparklinedash"></div>
                                </li>
                                <li class="text-right sp-cn-r"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-success"><%=  book.getDisapproved_lib() %></span></li>
                            </ul>
                        </div></a>
                        <a href="library.jsp"> <div class="white-box analytics-info-cs mg-b-10">
                            <h3 class="box-title">Total Library</h3>
                            <ul class="list-inline two-part-sp">
                                <li>
                                    <div id="sparklinedash2"></div>
                                </li>
                                <li class="text-right"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-purple"><%=  book.getTotal_lib() %></span></li>
                            </ul>
                        </div></a>
                       <a href="viewbook.jsp"> <div class="white-box analytics-info-cs mg-b-10">
                            <h3 class="box-title">Total Book</h3>
                            <ul class="list-inline two-part-sp">
                                <li>
                                    <div id="sparklinedash3"></div>
                                </li>
                                <li class="text-right"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-info"><%= book.getTotal_book() %></span></li>
                            </ul>
                        </div></a>
                       <a href="#"> <div class="white-box analytics-info-cs">
                            <h3 class="box-title">New Arrivals</h3>
                            <ul class="list-inline two-part-sp">
                                <li>
                                    <div id="sparklinedash4"></div>
                                </li>
                                <li class="text-right"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="text-danger"><%= book.getNew_arrival() %></span></li>
                            </ul>
                        </div></a>
                    </div>
                </div>
            </div>
        </div>
     	  
        <div class="calender-area mg-tb-30">
           
        </div>
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
    <!-- morrisjs JS
		============================================ -->
    <script src="./js/morrisjs/raphael-min.js"></script>
    <script src="./js/morrisjs/morris.js"></script>
    <script src="./js/morrisjs/morris-active.js"></script>
    <!-- morrisjs JS
		============================================ -->
    <script src="./js/sparkline/jquery.sparkline.min.js"></script>
    <script src="./js/sparkline/jquery.charts-sparkline.js"></script>
    <!-- calendar JS
		============================================ -->
    <script src="./js/calendar/moment.min.js"></script>
    <script src="./js/calendar/fullcalendar.min.js"></script>
    <script src="./js/calendar/fullcalendar-active.js"></script>
    <!-- plugins JS
		============================================ -->
    <script src="./js/plugins.js"></script>
    <!-- main JS
		============================================ -->
    <script src="./js/main.js"></script>
</body>

</html>