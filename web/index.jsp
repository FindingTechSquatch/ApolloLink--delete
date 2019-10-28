<%-- 
    Document   : index
    Created on : Oct 5, 2019, 12:20:50 AM
    Author     : tyleryork
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<String> er = (ArrayList) session.getAttribute("er");
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>ApolloLink</title>
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
                    <div class="topcorner">
                        <a style="border-radius: 0px 0px 0px 4px;" href="#login">Event Manager Log In</a>
                    </div>
                    <div class="row w-100 topspace">
                        <div class="col-lg-4 mx-auto">
                            <div class="auto-form-wrapper form">

                                <ul class="tab-group">
                                    <li class="tab active"><a style="border-radius: 4px 0px 0px 4px;" href="#login">Log In</a></li>
                                    <li class="tab"><a style="border-radius: 0px 4px 4px 0px;" href="#signup">Sign Up</a></li>
                                </ul>

                                <div class="tab-content">
                                    <div id="login">
                                        <img src="assets/images/logo/grad/White_Grad_Vertical2.png" alt="logo" />
                                        <h1>Welcome Back!</h1>
                                        <div class="alert" ${hd}>
                                            <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span>
                                            <ul>
                                                <% for (String e : er) {%>
                                                <li>
                                                    <%=e%>
                                                </li>
                                                <% }%>
                                            </ul>
                                        </div>
                                        <form action="loginCont" method="post">
                                            <input type="hidden" name="act" value="lg">
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


                                    <div id="signup">
                                        <img src="assets/images/logo/grad/Black_Grad_Vertical2.png" alt="logo" />
                                        <h1>Sign Up</h1>
                                        <div class="alert">
                                            <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span>
                                            <ul>
                                                <li>Username Was Super Bad</li>
                                                <li>Password Was Also Freaking Horrible</li>
                                            </ul>
                                        </div>
                                        <form action="loginCont" method="post">
                                            <input type="hidden" name="action" value="n">
                                            <div class="two-row">
                                                <div class="field-wrap">
                                                    <label>
                                                        First Name<span class="req">*</span>
                                                    </label>
                                                    <input class="loginInput" type="text"  name="fn" autocomplete="on" />
                                                </div>

                                                <div class="field-wrap">
                                                    <label>
                                                        Last Name<span class="req">*</span>
                                                    </label>
                                                    <input class="loginInput" type="text" name="ln" autocomplete="off"/>
                                                </div>

                                            </div>
                                            <div class="field-wrap">
                                                <label>
                                                    Phone Number<span class="req">*</span>
                                                </label>
                                                <input class="loginInput" type="text" name="ph" maxlength=10 autocomplete="off"/>
                                            </div>
                                            <div class="field-wrap">
                                                <label>
                                                    Email Address<span class="req">*</span>
                                                </label>
                                                <input class="loginInput" type="text" name="em" autocomplete="off"/>
                                            </div>

                                            <div class="field-wrap">
                                                <label>
                                                    Password<span class="req">*</span>
                                                </label>
                                                <input class="loginInput" type="password" name="pw" autocomplete="off"/>
                                            </div>
                                            <div class="field-wrap">
                                                <label>
                                                    Re-Enter Password<span class="req">*</span>
                                                </label>
                                                <input class="loginInput" type="password" name="rpw" autocomplete="off"/>
                                            </div>
                                            <div class="field-wrap">

                                                <label>
                                                    School<span class="req">*</span>
                                                </label>
                                                <input class="loginInput" type="text" list="schools" name="sl" autocomplete="on" />

                                                <datalist id="schools">
                                                    <option value="Alabama"><option value="Alaska"><option value="Arizona">
                                                    <option value="Arkansas"><option value="California"><option value="Colorado">
                                                    <option value="Connecticut"><option value="Delaware"><option value="District of Columbia">
                                                    <option value="Florida"><option value="Georgia"><option value="Hawaii">
                                                    <option value="Idaho"><option value="Illinois"><option value="Indiana">
                                                    <option value="Iowa"><option value="Kansas"><option value="Kentucky">
                                                    <option value="Louisiana"><option value="Maine"><option value="Maryland">
                                                    <option value="Massachusetts"><option value="Michigan"><option value="Minnesota">
                                                    <option value="Mississippi"><option value="Missouri"><option value="Montana">
                                                    <option value="Nebraska"><option value="Nevada"><option value="New Hampshire">
                                                    <option value="New Jersey"><option value="New Mexico"><option value="New York">
                                                    <option value="North Carolina"><option value="North Dakota"><option value="Ohio">
                                                    <option value="Oklahoma"><option value="Oregon"><option value="Pennsylvania">
                                                    <option value="Rhode Island"><option value="South Carolina"><option value="South Dakota">
                                                    <option value="Tennessee"><option value="Texas"><option value="Utah">
                                                    <option value="Vermont"><option value="Virginia"><option value="Washington">
                                                    <option value="West Virginia"><option value="Wisconsin"><option value="Wyoming">
                                                    <option value="My School is Not Listed">
                                                </datalist>
                                            </div>
                                            <button type="submit" disabled="true" class="button button-block"/>Get Started</button>

                                        </form>

                                    </div>

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
