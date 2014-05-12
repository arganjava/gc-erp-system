<%--
  Created by IntelliJ IDEA.
  User: Argan
  Date: 21/04/14
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<!DOCTYPE html>
<html lang="en-us">
<head>

    <meta charset="utf-8">
    <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

    <title> StarHub BOD Login Page </title>
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Use the correct meta names below for your web application
         Ref: http://davidbcalhoun.com/2010/viewport-metatag

    <meta name="HandheldFriendly" content="True">
    <meta name="MobileOptimized" content="320">-->

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <!-- Basic Styles -->
    <link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/bootstrap-resources/css/bootstrap.min.css"/>">
    <link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/bootstrap-resources/css/font-awesome.min.css"/>">

    <!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
    <link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/bootstrap-resources/css/smartadmin-production.css"/>">
    <link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/bootstrap-resources/css/smartadmin-skins.css"/>">

    <!-- SmartAdmin RTL Support is under construction
        <link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-rtl.css"> -->

    <!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
    <link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/bootstrap-resources/css/demo.css"/>">

    <!-- FAVICONS -->
    <%--<link rel="shortcut icon" href="img/favicon/favicon.ico" type="image/x-icon">
    <link rel="icon" href="img/favicon/favicon.ico" type="image/x-icon">--%>

    <!-- GOOGLE FONT -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

</head>
<body id="login" class="animated fadeInDown">
<!-- possible classes: minified, no-right-panel, fixed-ribbon, fixed-header, fixed-width-->
<header id="header">
    <!--<span id="logo"></span>-->

    <div id="logo-group">
        <span id="logo"> <%--<img src="img/logo.png" alt="SmartAdmin"> --%></span>

        <!-- END AJAX-DROPDOWN -->
    </div>

    <span id="login-header-space"> <span class="hidden-mobile">Need an account?</span> <a href="register.html" class="btn btn-danger">Creat account</a> </span>

</header>

<div id="main" role="main">

    <!-- MAIN CONTENT -->
    <div id="content" class="container">

        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-7 col-lg-8 hidden-xs hidden-sm">
                <h1 class="txt-color-red login-header-big">GC-ERP</h1>
                <div class="hero">

                    <div class="pull-left login-desc-box-l">
                        <h4 class="paragraph-header">It's Business Application To Meet The Needs Of Your Company</h4>
                        <div class="login-app-icons">
                            <a href="javascript:void(0);" class="btn btn-danger btn-sm">Frontend Template</a>
                            <a href="javascript:void(0);" class="btn btn-danger btn-sm">Find out more</a>
                        </div>
                    </div>

                  <%--  <img src="img/demo/iphoneview.png" class="pull-right display-image" alt="" style="width:210px">--%>

                </div>

                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                        <h5 class="about-heading">About SmartAdmin - Are you up to date?</h5>
                        <p>
                            Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa.
                        </p>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                        <h5 class="about-heading">Not just your average template!</h5>
                        <p>
                            Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi voluptatem accusantium!
                        </p>
                    </div>
                </div>

            </div>
            <div class="col-xs-12 col-sm-12 col-md-5 col-lg-4">
                <div class="well no-padding">
                    <form  action="<c:url value="/j_spring_security_check"/>" method="post" id="login-form" class="smart-form client-form">
                        <header>
                            Sign In
                        </header>

                        <fieldset>

                            <section>
                                <label class="label">Username</label>
                                <label class="input"> <i class="icon-append fa fa-user"></i>
                                    <input type="text" name="j_username" >
                                    <b class="tooltip tooltip-top-right"><i class="fa fa-user txt-color-teal"></i> Please enter email address</b></label>
                            </section>

                            <section>
                                <label class="label">Password</label>
                                <label class="input"> <i class="icon-append fa fa-lock"></i>
                                    <input type="password" name="j_password" >
                                    <c:if test="${not empty param.error}">
                                        <span id="error-login" style="color: red">The email or password you entered is incorrect.</span>
                                    </c:if>
                                    <c:if test="${not empty param.locked}">
                                        <span id="user-locked" style="color: red;">Your user account has been locked</span>
                                    </c:if>
                                    <b class="tooltip tooltip-top-right"><i class="fa fa-lock txt-color-teal"></i> Enter your password</b> </label>
                                <div class="note">
                                    <a href="#" id="forgot-password-link">Forgot password?</a>
                                </div>
                            </section>


                        </fieldset>
                        <footer>
                            <button type="submit" class="btn btn-success">
                                Sign in
                            </button>
                        </footer>
                    </form>

                    <form method="post" id="forgot-password-form" style="display: none;" class="smart-form client-form">
                        <header>
                            Forgot Password
                        </header>

                        <fieldset>

                            <section>
                                <label class="label">Enter your email address</label>
                                <label class="input"> <i class="icon-append fa fa-envelope"></i>
                                    <input type="email" name="email_address" id="email_address">
                                    <b class="tooltip tooltip-top-right"><i class="fa fa-envelope txt-color-teal"></i> Please enter email address for password reset</b></label>
                                <div class="note">
                                    <a href="#" id="remember-password-link">I remembered my password!</a>
                                </div>
                            </section>


                        </fieldset>
                        <footer>
                            <button type="submit" class="btn btn-success" id="reset-password-button">
                                <i class="fa fa-refresh"></i> Reset Password
                            </button>
                        </footer>
                    </form>

                </div>

            </div>
        </div>
    </div>

</div>
<!--================================================== -->

<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)
<script data-pace-options='{ "restartOnRequestAfter": true }' src="js/plugin/pace/pace.min.js"></script>-->

<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
<script> if (!window.jQuery) { document.write('<script src="/bootstrap-resources/js/libs/jquery-2.0.2.min.js"><\/script>');} </script>

<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
<script> if (!window.jQuery.ui) { document.write('<script src="/bootstrap-resources/js/libs/jquery-ui-1.10.3.min.js"><\/script>');} </script>

<!-- JS TOUCH : include this plugin for mobile drag / drop touch events
<script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> -->

<!-- BOOTSTRAP JS -->
<script src="/bootstrap-resources/js/bootstrap/bootstrap.min.js"></script>

<!-- CUSTOM NOTIFICATION -->
<script src="/bootstrap-resources/js/notification/SmartNotification.min.js"></script>

<!-- JARVIS WIDGETS -->
<script src="/bootstrap-resources/js/smartwidgets/jarvis.widget.min.js"></script>

<!-- EASY PIE CHARTS -->
<script src="/bootstrap-resources/js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js"></script>

<!-- SPARKLINES -->
<script src="/bootstrap-resources/js/plugin/sparkline/jquery.sparkline.min.js"></script>

<!-- JQUERY VALIDATE -->
<script src="/bootstrap-resources/js/plugin/jquery-validate/jquery.validate.min.js"></script>

<!-- JQUERY MASKED INPUT -->
<script src="/bootstrap-resources/js/plugin/masked-input/jquery.maskedinput.min.js"></script>

<!-- JQUERY SELECT2 INPUT -->
<script src="/bootstrap-resources/js/plugin/select2/select2.min.js"></script>

<!-- JQUERY UI + Bootstrap Slider -->
<script src="/bootstrap-resources/js/plugin/bootstrap-slider/bootstrap-slider.min.js"></script>

<!-- browser msie issue fix -->
<script src="/bootstrap-resources/js/plugin/msie-fix/jquery.mb.browser.min.js"></script>

<!-- SmartClick: For mobile devices -->
<script src="/bootstrap-resources/js/plugin/smartclick/smartclick.js"></script>

<!--[if IE 7]>

<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

<![endif]-->

<!-- MAIN APP JS FILE -->
<script src="/bootstrap-resources/js/app.js"></script>

<script type="text/javascript">
    runAllForms();
    $(function() {
        // Validation
        $("#login-form").validate({
            // Rules for form validation
            rules : {
                j_username : {
                    required : true,
                    email : true
                },
                j_password : {
                    required : true,
                    minlength : 3,
                    maxlength : 20
                }
            },

            // Messages for form validation
            messages : {
                j_username : {
                    required : 'Please enter your email address',
                    email : 'Please enter a VALID email address'
                },
                j_password : {
                    required : 'Please enter your password'
                }
            },

            // Do not change code below
            errorPlacement : function(error, element) {
                error.insertAfter(element.parent());
            }
        });
    });

    $(document).ready(function(){


    });
</script>

</body>
</html>