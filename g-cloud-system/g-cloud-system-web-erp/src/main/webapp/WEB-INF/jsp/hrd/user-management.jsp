<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Argan
  Date: 25/04/14
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<div id="main" role="main">

<!-- RIBBON -->
<div id="ribbon">

    <span class="ribbon-button-alignment"> <span id="refresh" class="btn btn-ribbon" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true"><i class="fa fa-refresh"></i></span> </span>

    <!-- breadcrumb -->
    <ol class="breadcrumb">
        <li>Home</li><li>Dashboard</li>
    </ol>
    <!-- end breadcrumb -->

    <!-- You can also add more buttons to the
    ribbon for further usability

    Example below:

    <span class="ribbon-button-alignment pull-right">
    <span id="search" class="btn btn-ribbon hidden-xs" data-title="search"><i class="fa-grid"></i> Change Grid</span>
    <span id="add" class="btn btn-ribbon hidden-xs" data-title="add"><i class="fa-plus"></i> Add</span>
    <span id="search" class="btn btn-ribbon" data-title="search"><i class="fa-search"></i> <span class="hidden-mobile">Search</span></span>
    </span> -->

</div>
<!-- END RIBBON -->

<!-- MAIN CONTENT -->
<div id="content">

<!-- widget grid -->
<section id="widget-grid" class="">

<!-- row -->
<div class="row">
<article class="col-sm-12">
<!-- new widget -->
<div class="jarviswidget" id="wid-id-0" data-widget-togglebutton="false" data-widget-editbutton="false" data-widget-fullscreenbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false">

<header>
    <span class="widget-icon"> <i class="glyphicon glyphicon-stats txt-color-darken"></i> </span>
    <h2>User Management</h2>

    <ul class="nav nav-tabs pull-right in" id="myTab">
        <li class="active">
            <a data-toggle="tab" href="#s1"><i class="fa fa-edit"></i> <span class="hidden-mobile hidden-tablet">Form</span></a>
        </li>

        <li>
            <a data-toggle="tab" href="#s3"><i class="fa fa-list"></i> <span class="hidden-mobile hidden-tablet">List</span></a>
        </li>
    </ul>

</header>

<!-- widget div-->
<div class="no-padding">
    <!-- widget edit box -->
    <%--<div class="jarviswidget-editbox">

        test
    </div>--%>
    <!-- end widget edit box -->

    <div class="widget-body">
        <!-- content -->
        <div id="myTabContent" class="tab-content">
            <div class="tab-pane fade active in padding-10 no-padding-bottom" id="s1">
                <div class="row no-space">
                    <div class="modal-dialog modal-lg" style="width:800px !important">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                </button>
                                <h4 class="modal-title" id="myModalLabel"><strong>StarHub User Management</strong></h4>
                            </div>

                            <div class="modal-body">
                                <form id="userForm" class="smart-form" novalidate="novalidate"
                                      action="<c:url value="/starhub-user-management/save"/>" method="POST">

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-6">
                                                <label>Full Name:</label>
                                                <label class="input"> <i class="icon-prepend fa fa-user"></i>
                                                    <input type="text" name="fullname" placeholder="Enter Full Name"
                                                           id="txtfullname">
                                                </label>
                                            </section>

                                            <section class="col col-6">
                                                <label>Role Name:</label>
                                                <label class="input">
                                                    <select id="selectIdRoleStarhub" name="roleName" class="select2">
                                                        <option id="optionRole" style="padding-left: 30px" value=""></option>
                                                        <c:forEach items="${displayRoles}" var="role">
                                                            <option value="${role}">${role.replace('_',' ')}</option>
                                                        </c:forEach>
                                                    </select>
                                                </label>
                                            </section>
                                        </div>

                                        <div class="row">
                                            <section class="col col-6">
                                                <div class="form-group">
                                                    <label>User Name:</label>
                                                    <label class="input"> <i class="icon-prepend fa fa-envelope-o"></i>
                                                        <input type="email" name="username" placeholder="E-mail" id="Idtxtusername" autocomplete="off">
                                                        <input type="hidden" name="txtUsernameHidden" id="txtIdSHUser"  >
                                                        <input type="hidden" name="userManagementFormMode" id="userManagementFormMode"  >
                                                        <p id="pErrorUsername"
                                                           style="font-family: sans, arial;color: red;display: none; ">This username
                                                            already exist</p>
                                                    </label>
                                                </div>
                                            </section>
                                            <section class="col col-6">
                                                <div class="form-group">
                                                    <label>Mobile Number:</label>
                                                    <label class="input"> <i class="icon-prepend fa fa-phone"></i>
                                                        <input type="tel" name="mobileNumber" placeholder="Mobile-Number"
                                                               id="txtmobilenumber">
                                                    </label>
                                                </div>
                                            </section>
                                        </div>
                                        <div class="row" id="passwordDiv">

                                            <section class="col col-6">
                                                <div class="form-group">
                                                    <label>Password:</label>
                                                    <label class="input"> <i class="icon-prepend fa fa-lock"></i>
                                                        <input type="password" name="password" placeholder="User Password"
                                                               id="txtpassword">
                                                    </label>
                                                </div>
                                            </section>

                                            <section class="col col-6">
                                                <div class="form-group">
                                                    <label>Confirm Password</label>
                                                    <label class="input"> <i class="icon-prepend fa fa-lock"></i>
                                                        <input type="password" name="confirmPassword" placeholder="Confirm Password"
                                                               id="txtConfirmpassword">
                                                    </label>
                                                </div>
                                            </section>
                                        </div>

                                        <div class="row">
                                            <section class="col col-6">

                                                <label class="radio">
                                                    <input type="radio" name="enabled" value="true"  id="idEnable" checked="true" >
                                                    <i></i>Enable</label>
                                            </section>
                                            <section class="col col-6">

                                                <label class="radio">
                                                    <input type="radio" name="enabled" value="false" id="idDisable">
                                                    <i></i>Disable</label>
                                            </section>
                                        </div>
                                    </fieldset>

                                </form>

                            </div>

                            <!-- end widget content -->
                            <div class="modal-footer">
                                <button type="button" class="btn btn-warning" data-dismiss="modal">
                                    Close
                                </button>
                                <button type="button" id="userFormSubmitBtn" class="btn btn-success" data-action="save-corporate-user">
                                    Submit
                                </button>
                            </div>

                        </div>
                    </div>

                </div>


            </div>
            <!-- end s1 tab pane -->


            <!-- end s2 tab pane -->

            <div class="tab-pane fade" id="s3">


                <div class="btn-toolbar" style="padding : 10px 10px">
                    <button class="btn btn-success" id="btnAddNewUser"   data-target="#user-management-modal" data-toggle="modal">
                        <i class="fa fa-plus"></i> <span class="hidden-mobile">Add New</span>
                    </button>
                    <button class="btn btn-warning" id="btnAddNewUserv"   data-target="#user-management-modal" data-toggle="modal">
                        <i class="fa fa-search-plus"></i> <span class="hidden-mobile">Search</span>
                    </button>
                </div>

                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                <!-- Widget ID (each widget will need unique ID)-->
                <div >

                <!-- widget div-->
                <div>

                <!-- widget edit box -->
                <div class="jarviswidget-editbox">


                </div>
                <!-- end widget edit box -->

                <!-- widget content -->
                <div class="widget-body no-padding">
                <div class="widget-body-toolbar">

                </div>

                    <table id="dt_basic" class="table table-striped table-bordered table-hover">
                        <thead>
                        <tr>
                            <th>User Name</th>
                            <th>Role</th>
                            <th>Status</th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${userList}" var="user">
                            <tr>
                                <td>${user.username}</td>
                                <td>${user.role.description}</td>
                                <td>${user.enabled}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- end widget content -->

                </div>
                <!-- end widget div -->

                </div>

                <!-- end widget -->


                </article>



            </div>
            <!-- end s3 tab pane -->
        </div>

        <!-- end content -->
    </div>

</div>
<!-- end widget div -->
</div>
<!-- end widget -->

</article>
</div>

<!-- end row -->

<!-- row -->


<!-- end row -->

</section>
<!-- end widget grid -->

</div>
<!-- END MAIN CONTENT -->

</div>
<!-- END MAIN PANEL -->

<!-- SHORTCUT AREA : With large tiles (activated via clicking user name tag)
Note: These tiles are completely responsive,
you can add as many as you like
-->
<div id="shortcut">
    <ul>
        <li>
            <a href="#inbox.html" class="jarvismetro-tile big-cubes bg-color-blue"> <span class="iconbox"> <i class="fa fa-envelope fa-4x"></i> <span>Mail <span class="label pull-right bg-color-darken">14</span></span> </span> </a>
        </li>
        <li>
            <a href="#calendar.html" class="jarvismetro-tile big-cubes bg-color-orangeDark"> <span class="iconbox"> <i class="fa fa-calendar fa-4x"></i> <span>Calendar</span> </span> </a>
        </li>
        <li>
            <a href="#gmap-xml.html" class="jarvismetro-tile big-cubes bg-color-purple"> <span class="iconbox"> <i class="fa fa-map-marker fa-4x"></i> <span>Maps</span> </span> </a>
        </li>
        <li>
            <a href="#invoice.html" class="jarvismetro-tile big-cubes bg-color-blueDark"> <span class="iconbox"> <i class="fa fa-book fa-4x"></i> <span>Invoice <span class="label pull-right bg-color-darken">99</span></span> </span> </a>
        </li>
        <li>
            <a href="#gallery.html" class="jarvismetro-tile big-cubes bg-color-greenLight"> <span class="iconbox"> <i class="fa fa-picture-o fa-4x"></i> <span>Gallery </span> </span> </a>
        </li>
        <li>
            <a href="javascript:void(0);" class="jarvismetro-tile big-cubes selected bg-color-pinkDark"> <span class="iconbox"> <i class="fa fa-user fa-4x"></i> <span>My Profile </span> </span> </a>
        </li>
    </ul>

</div>
    <script type="text/javascript">

        $(document).ready(function(){
            pageSetUp();
            $('#dt_basic').dataTable({
                "sPaginationType" : "bootstrap_full"
            });

            /*
             * BASIC
             */

        });

        /*  var _gaq = _gaq || [];
         _gaq.push(['_setAccount', 'UA-XXXXXXXX-X']);
         _gaq.push(['_trackPageview']);

         (function() {
         var ga = document.createElement('script');
         ga.type = 'text/javascript';
         ga.async = true;
         ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
         var s = document.getElementsByTagName('script')[0];
         s.parentNode.insertBefore(ga, s);
         })();*/

    </script>