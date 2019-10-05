<%-- 
    Document   : index
    Created on : Oct 5, 2019, 12:20:50 AM
    Author     : tyleryork
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Star Admin Premium Bootstrap Admin Dashboard Template</title>

        <link rel="stylesheet" href="assets/iconfonts/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="assets/iconfonts/ionicons/css/ionicons.css">
        <link rel="stylesheet" href="assets/iconfonts/typicons/src/font/typicons.css">
        <link rel="stylesheet" href="assets/iconfonts/flag-icon-css/css/flag-icon.min.css">
        <link rel="stylesheet" href="assets/css/vendor/vendor.bundle.base.css">
        <link rel="stylesheet" href="assets/css/vendor/vendor.bundle.addons.css">
        <link rel="stylesheet" href="assets/css/vendor/style2.css">
        <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel="stylesheet" href="assets/css/start.css">
        <link rel="shortcut icon" href="assets/images/favicon.png" />
    </head>
    <body>
        <div class="container-scroller">
            <div class="container-fluid page-body-wrapper full-page-wrapper">
                <div class="content-wrapper d-flex align-items-center auth auth-bg-1 theme-one">
                    <div class="row w-100">
                        <div class="col-lg-4 mx-auto">
                            <div class="auto-form-wrapper">
                                <div class="form">

                                    <ul class="tab-group">
                                        <li class="tab active"><a style="border-radius: 4px 0px 0px 4px;" href="#login">Log In</a></li>
                                        <li class="tab"><a style="border-radius: 0px 4px 4px 0px;" href="#signup">Sign Up</a></li>
                                    </ul>

                                    <div class="tab-content">
                                        <div id="login">
                                            <h1>Welcome Back!</h1>

                                            <form action="/" method="post">

                                                <div class="field-wrap">
                                                    <label>
                                                        Username<span class="req">*</span>
                                                    </label>
                                                    <input type="email" autocomplete="off"/>
                                                </div>

                                                <div class="field-wrap">
                                                    <label>
                                                        Password<span class="req">*</span>
                                                    </label>
                                                    <input type="password" autocomplete="off"/>
                                                </div>

                                                <p class="forgot"><a href="#">Forgot Password?</a></p>

                                                <button class="button button-block"/>Log In</button>

                                            </form>

                                        </div>


                                        <div id="signup">
                                            <h1>Sign Up</h1>

                                            <form action="Init" method="post">
                                                <input type="hidden" name="action" value="n">
                                                <div class="field-wrap">
                                                    <label>
                                                        Username<span class="req">*</span>
                                                    </label>
                                                    <input type="text" name="un" autocomplete="off"/>
                                                </div>
                                                <div class="field-wrap">
                                                    <label>
                                                        Password<span class="req">*</span>
                                                    </label>
                                                    <input type="password" name="pw" autocomplete="off"/>
                                                </div>
                                                <div class="two-row">
                                                    <div class="field-wrap">
                                                        <label>
                                                            First Name<span class="req">*</span>
                                                        </label>
                                                        <input type="text"  name="fn" autocomplete="on" />
                                                    </div>

                                                    <div class="field-wrap">
                                                        <label>
                                                            Last Name<span class="req">*</span>
                                                        </label>
                                                        <input type="text" name="ln" autocomplete="off"/>
                                                    </div>

                                                </div>

                                                <div class="field-wrap">
                                                    <label>
                                                        Email Address<span class="req">*</span>
                                                    </label>
                                                    <input type="text" name="em" autocomplete="off"/>
                                                </div>


                                                <div class="field-wrap">
                                                    <label>
                                                        Phone Number<span class="req">*</span>
                                                    </label>
                                                    <input type="text" maxlength="10" name="ph" autocomplete="off"/>
                                                </div>



                                                <div class="field-wrap">
                                                    <label>
                                                        Address Line 1<span class="req">*</span>
                                                    </label>
                                                    <input type="text" name="a1" autocomplete="off"/>
                                                </div>
                                                <div class="field-wrap">
                                                    <label>
                                                        Address Line 2<span class="req">*</span>
                                                    </label>
                                                    <input type="text" name="a2" autocomplete="off"/>
                                                </div>
                                                <div class="field-wrap">
                                                    <label>
                                                        City<span class="req">*</span>
                                                    </label>
                                                    <input type="text" name="ct" autocomplete="off"/>
                                                </div>

                                                <div class="two-rowl">
                                                    <div class="field-wrap">

                                                        <label>
                                                            State<span class="req">*</span>
                                                        </label>
                                                        <input type="text" list="states" name="st" autocomplete="on" />

                                                        <datalist id="states">
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
                                                        </datalist>
                                                    </div>

                                                    <div class="field-wrap">
                                                        <label>
                                                            Zip Code<span class="req">*</span>
                                                        </label>
                                                        <input type="text" name="zp" autocomplete="off"/>
                                                    </div>

                                                </div>
                                                <div class="field-wrap">
                                                    <label class="active highlight">
                                                        Date of Birth (mm/dd/yyyy)<span class="req">*</span>
                                                    </label>
                                                    <input type="date" name="bt" autocomplete="off" maxlength="10"/>
                                                </div>

                                                <button type="submit" class="button button-block"/>Get Started</button>

                                            </form>

                                        </div>



                                    </div><!-- tab-content -->

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
                            </ul>
                            <p class="footer-text text-center">copyright © 2018 Bootstrapdash. All rights reserved.</p>
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
        <script  src="assets/js/start.js"></script>
        <!-- endinject -->
    </body>
