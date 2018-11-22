<%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="bean.addbookBean" %>
      <%@page autoFlush="true" buffer="1094kb"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>View book | Reader's Heaven</title>
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
                                            <li><span class="bread-blod">View Book</span>
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
        <div class="basic-form-area mg-tb-15">
            <div class="container-fluid">
                <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="product-status-wrap">
                            <h4>Book List</h4>
                            <div class="add-product">
                                <a href="addbook.jsp">Add Book</a>
                            </div>
                            <table>
                                <tr>
                                    
                                    <th>Book Title</th>
                                    <th>author</th>
                                    <th>edition</th>
                                    <th>publisher</th>
                                    <th>isbn</th>
                                    <th>pages</th>
                                    <th>mrp</th>
                                    <th>photo</th>
                                    <th>category</th>
                                    <th>description</th>
                                    <th>publish Year</th>
                                    <th>Book Language</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                               <%List<addbookBean>b=(ArrayList)request.getAttribute("book");
							if(b==null){ %>
							 <jsp:forward page="/viewbookservlet?action=viewbook.jsp" />
		 					<% }else{
		 						b=(ArrayList)request.getAttribute("book");
		 						for(int i=0;i<b.size();i++)
								{
									addbookBean book=b.get(i);%>
									
									<tr>
									
									<td><%= book.getBook_title() %></td>
									<td><%=book.getAuthor() %></td>
									<td><%=book.getEdition() %></td>
									<td><%=book.getPublisher() %></td>
									<td><%=book.getIsbn() %></td>
									<td><%=book.getPages() %></td>
									<td><%=book.getMrp() %></td>
									<td><img src="<%=book.getPhoto() %>" alt="book"></img></td>
									<td><%=book.getCategory_name() %></td>
									<td><%=book.getDescription() %></td>
									<td><%=book.getPublish_year() %></td>
									<td><%=book.getBook_language() %></td>
									 <td>
                                       <a href="./updatebook.jsp?id=<%=book.getBook_id()%>"> <button data-toggle="tooltip" title="Edit" class="pd-setting-ed"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></button></a></td>
                                      <td> <a href="./deletebookservlet?id=<%=book.getBook_id()%>"> <button data-toggle="tooltip" title="Delete" class="pd-setting-ed"><i class="fa fa-trash-o" aria-hidden="true"></i></button></a></td> 
                                    
									
									
                                    </tr>
									  <% } } %> 
                                </table>
                          </div>
                         </div>
                   
                </div>
               </div>
          </div>
               
                <div class="footer-copyright-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer-copy-right">
                            <p>Copyright © 2018 <a href="#">Reader'sHeaven</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    
                                                    
                                                    
		 <!-- jquery ============================================ -->
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
                
