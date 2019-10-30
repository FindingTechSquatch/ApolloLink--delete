<%-- 
    Document   : evtlgn
    Created on : Oct 5, 2019, 12:20:50 AM
    Author     : tyleryork
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<String> er1 = (ArrayList) session.getAttribute("er1");
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>ApolloLink Log In/Sign Up</title>
        <!--Style Block-->
        <link rel="stylesheet" href="assets/iconfonts/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="assets/iconfonts/ionicons/css/ionicons.css">
        <link rel="stylesheet" href="assets/iconfonts/typicons/src/font/typicons.css">
        <link rel="stylesheet" href="assets/iconfonts/flag-icon-css/css/flag-icon.min.css">
        <link rel="stylesheet" href="assets/css/vendor/vendor.bundle.base.css">
        <link rel="stylesheet" href="assets/css/vendor/vendor.bundle.addons.css">
        <link rel="stylesheet" href="assets/css/vendor/style2.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel="stylesheet" href="assets/css/start.css">
        <link rel="stylesheet" href="assets/css/card.css">
        <link rel="stylesheet" href="assets/css/buttons.css">
        <!--End Style Block-->
        <link rel="shortcut icon" href="assets/images/logo/grad/Black_Grad_Logo2.png" />
        
    </head>
    <body>
        <div class="container-scroller">
            <div class="container-fluid page-body-wrapper full-page-wrapper">
                <div class="content-wrapper d-flex align-items-center auth auth-bg-1 theme-one">
                    <div class="row w-100 topspace">
                        <div class="col-lg-4 mx-auto">
                            <div class="auto-form-wrapper form">

                                <!--<ul class="tab-group">
                                    <li class="tab active"><a style="border-radius: 4px 4px 4px 4px; width: 100%;" href="#login">Event Manager Login</a></li>
                                </ul>-->
                                    <div id="login">
                                        <img src="assets/images/logo/grad/White_Grad_Vertical2.png" alt="logo" />
                                        <h1>Event Manager Login</h1>
                                        <div class="alert" ${hd1}>
                                            <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span>
                                            <ul>
                                                <% for (String e : er1) {%>
                                                <li>
                                                    <%=e%>
                                                </li>
                                                <% }%>
                                            </ul>
                                        </div>
                                        <form action="loginCont" method="post">
                                            <input type="hidden" name="act" value="elg">
                                            <div class="field-wrap">
                                                <label>
                                                    Email<span class="req">*</span>
                                                </label>
                                                <input class="loginInput" name="us" type="text" autocomplete="off"/>
                                            </div>
                                            <div class="field-wrap">
                                                <label>
                                                    Password<span class="req">*</span>
                                                </label>
                                                <input class="loginInput" name="pw" type="password" autocomplete="off"/>
                                            </div>
                                            <!--TODO
                                            <p class="forgot"><a href="#">Forgot Password?</a></p>
                                            --><br><br>
                                            <button type="submit" class="button button-block"/>Log In</button>
                                        </form>
                                    </div> 
                               
                            </div>
                            <ul class="auth-footer">
                                <li>
                                    <a href="#">Conditions</a>
                                </li>
                                <li>
                                    <a href="#">Help</a>
                                </li>
                                <li>
                                    <a href="#">Terms</a>
                                </li>
                                <li>
                                    <a href="#">About</a>
                                </li>
                            </ul>
                            <p class="footer-text text-center">&#169 2019 FindingTechSquatch. A division of The TRYHard Lab. All rights reserved.</p>
                        </div>
                                            
                    </div>
                </div>
                <!-- content-wrapper ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>
        <!-- container-scroller -->
        <!-- plugins:js -->
        <script src="assets/js/vendor/vendor.bundle.base.js"></script>
        <script src="assets/js/vendor/vendor.bundle.addons.js"></script>
        <!-- endinject -->
        <!-- inject:js -->
        <script src="assets/js/vendor/off-canvas.js"></script>
        <script src="assets/js/vendor/misc.js"></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src="assets/js/start.js"></script>

        <!-- endinject -->
    </body>