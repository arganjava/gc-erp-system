<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<html lang="en-us">
<head>
    <meta charset="utf-8">
    <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

    <title>G-Cloud Home </title>
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

    <!-- We recommend you use "your_style.css" to override SmartAdmin
    specific styles this will also ensure you retrain your customization
    with each SmartAdmin update.
    <link rel="stylesheet" type="text/css" media="screen" href="css/demo.css"> -->

    <!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
    <link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/bootstrap-resources/css/demo.css"/>">

    <!-- FAVICONS -->
    <link rel="shortcut icon" href="/bootstrap-resources/img/favicon/favicon.ico" type="image/x-icon">
    <link rel="icon" href="<c:url value="/bootstrap-resources/img/favicon/favicon.ico"/>" type="image/x-icon">

    <!-- GOOGLE FONT -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

    <!-- END SHORTCUT AREA -->

    <!--================================================== -->

    <!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
    <script data-pace-options='{ "restartOnRequestAfter": true }' src="<c:url value="/bootstrap-resources/js/plugin/pace/pace.min.js"/>"></script>

    <!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
    <script>
        if (!window.jQuery) {
            document.write('<script src="<c:url value="/bootstrap-resources/js/libs/jquery-2.0.2.min.js"/>"><\/script>');
        }
    </script>

    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
    <script>
        if (!window.jQuery.ui) {
            document.write('<script src="<c:url value="/bootstrap-resources/js/libs/jquery-ui-1.10.3.min.js"/>"><\/script>');
        }
    </script>

    <!-- JS TOUCH : include this plugin for mobile drag / drop touch events
    <script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> -->

    <!-- BOOTSTRAP JS -->
    <script src="<c:url value="/bootstrap-resources/js/bootstrap/bootstrap.min.js"/>"></script>

    <!-- CUSTOM NOTIFICATION -->
    <script src="<c:url value="/bootstrap-resources/js/notification/SmartNotification.min.js"/>"></script>

    <!-- JARVIS WIDGETS -->
    <script src="<c:url value="/bootstrap-resources/js/smartwidgets/jarvis.widget.min.js"/>"></script>

    <!-- EASY PIE CHARTS -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js"/>"></script>

    <!-- SPARKLINES -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/sparkline/jquery.sparkline.min.js"/>"></script>

    <!-- JQUERY VALIDATE -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/jquery-validate/jquery.validate.min.js"/>"></script>

    <!-- JQUERY MASKED INPUT -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/masked-input/jquery.maskedinput.min.js"/>"></script>

    <!-- JQUERY SELECT2 INPUT -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/select2/select2.min.js"/>"></script>

    <!-- JQUERY UI + Bootstrap Slider -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/bootstrap-slider/bootstrap-slider.min.js"/>"></script>

    <!-- browser msie issue fix -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/msie-fix/jquery.mb.browser.min.js"/>"></script>

    <!-- SmartClick: For mobile devices -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/smartclick/smartclick.js"/>"></script>

    <!--[if IE 7]>

    <h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

    <![endif]-->

    <!-- Demo purpose only -->
    <script src="<c:url value="/bootstrap-resources/js/demo.js"/>"></script>

    <!-- MAIN APP JS FILE -->
    <script src="<c:url value="/bootstrap-resources/js/app.js"/>"></script>

    <!-- PAGE RELATED PLUGIN(S) -->

    <!-- Flot Chart Plugin: Flot Engine, Flot Resizer, Flot Tooltip -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/flot/jquery.flot.cust.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/flot/jquery.flot.resize.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/flot/jquery.flot.tooltip.js"/>"></script>

    <!-- Vector Maps Plugin: Vectormap engine, Vectormap language -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/vectormap/jquery-jvectormap-1.2.2.min.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/vectormap/jquery-jvectormap-world-mill-en.js"/>"></script>

    <!-- Full Calendar -->
    <script src="<c:url value="/bootstrap-resources/js/plugin/fullcalendar/jquery.fullcalendar.min.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/datatables/jquery.dataTables-cust.min.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/datatables/ColReorder.min.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/datatables/FixedColumns.min.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/datatables/ColVis.min.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/datatables/ZeroClipboard.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/datatables/media/js/TableTools.min.js"/>"></script>
    <script src="<c:url value="/bootstrap-resources/js/plugin/datatables/DT_bootstrap.js"/>"></script>
    <%--
    <script src="${pageContext.request.contextPath}/bootstrap-resources/js/libs/jquery-2.1.0.min.js" ></script>
    --%>


    <script src="${pageContext.request.contextPath}/bootstrap-resources/js/libs/jquery-ui-1.10.3.min.js"></script>

</head>
<body>
<tiles:insertAttribute name="header"/>

<!-- Start Main Wrapper -->

<tiles:insertAttribute name="sidebar"/>
<!-- Inner Container Start -->

<tiles:insertAttribute name="body"/>
<!-- Inner Container End -->

<!-- Main Container End -->

<%-- start change password modal--%>
<!-- Modal -->
<%-- end change password modal--%>

<tiles:insertAttribute name="footer"/>



</body>
</html>

