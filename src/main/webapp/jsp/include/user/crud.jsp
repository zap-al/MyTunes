<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->



<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Sufee Admin - HTML5 Admin Template</title>
    <meta name="description" content="Sufee Admin - HTML5 Admin Template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="../site/apple-icon.png">
    <link rel="shortcut icon" href="../../../site/favicon.ico">


    <link rel="stylesheet" href="../../../site/vendors/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../site/vendors/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../../../site/vendors/themify-icons/css/themify-icons.css">
    <link rel="stylesheet" href="../../../site/vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="../../../site/vendors/selectFX/css/cs-skin-elastic.css">

    <link rel="stylesheet" href="../../../site/assets/css/style.css">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>



</head>

<body>
    <!-- Left Panel -->

    <aside id="left-panel" class="left-panel">
        <nav class="navbar navbar-expand-sm navbar-default">

            <div class="navbar-header">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main-menu" aria-controls="main-menu" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="../../../site"><img src="${pageContext.request.contextPath}/site/images/logo.png" alt="Logo"></a>
                <a class="navbar-brand hidden" href="../../../site"><img src="${pageContext.request.contextPath}/site/images/logo2.png" alt="Logo"></a>
            </div>

            <div id="main-menu" class="main-menu collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="../../../index.jsp"> <i class="menu-icon fa fa-dashboard"></i>Dashboard </a>
                    </li>
                    <h3 class="menu-title">UI elements</h3><!-- /.menu-title -->
                    <li class="menu-item-has-children dropdown">
                        <a href="../../../site#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-laptop"></i>Components</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="fa fa-puzzle-piece"></i><a href="../../../site/ui-buttons.html">Buttons</a></li>
                            <li><i class="fa fa-id-badge"></i><a href="../../../site/ui-badges.html">Badges</a></li>
                            <li><i class="fa fa-bars"></i><a href="../../../site/ui-tabs.html">Tabs</a></li>
                            <li><i class="fa fa-share-square-o"></i><a href="../../../site/ui-social-buttons.html">Social Buttons</a></li>
                            <li><i class="fa fa-id-card-o"></i><a href="../../../site/ui-cards.html">Cards</a></li>
                            <li><i class="fa fa-exclamation-triangle"></i><a href="../../../site/ui-alerts.html">Alerts</a></li>
                            <li><i class="fa fa-spinner"></i><a href="../../../site/ui-progressbar.html">Progress Bars</a></li>
                            <li><i class="fa fa-fire"></i><a href="../../../site/ui-modals.html">Modals</a></li>
                            <li><i class="fa fa-book"></i><a href="../../../site/ui-switches.html">Switches</a></li>
                            <li><i class="fa fa-th"></i><a href="../../../site/ui-grids.html">Grids</a></li>
                            <li><i class="fa fa-file-word-o"></i><a href="../../../site/ui-typgraphy.html">Typography</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children dropdown">
                        <a href="../../../site#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Tables</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="fa fa-table"></i><a href="../../../site/tables-basic.html">Basic Table</a></li>
                            <li><i class="fa fa-table"></i><a href="../../../site/tables-data.html">Data Table</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children active dropdown">
                        <a href="../../../site#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-th"></i>Forms</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-th"></i><a href="../../../site/forms-basic.html">Basic Form</a></li>
                            <li><i class="menu-icon fa fa-th"></i><a href="../../../site/forms-advanced.html">Advanced Form</a></li>
                        </ul>
                    </li>

                    <h3 class="menu-title">Icons</h3><!-- /.menu-title -->

                    <li class="menu-item-has-children dropdown">
                        <a href="../../../site#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-tasks"></i>Icons</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-fort-awesome"></i><a href="../../../site/font-fontawesome.html">Font Awesome</a></li>
                            <li><i class="menu-icon ti-themify-logo"></i><a href="../../../site/font-themify.html">Themefy Icons</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="../../../site/widgets.html"> <i class="menu-icon ti-email"></i>Widgets </a>
                    </li>
                    <li class="menu-item-has-children dropdown">
                        <a href="../../../site#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-bar-chart"></i>Charts</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-line-chart"></i><a href="../../../site/charts-chartjs.html">Chart JS</a></li>
                            <li><i class="menu-icon fa fa-area-chart"></i><a href="../../../site/charts-flot.html">Flot Chart</a></li>
                            <li><i class="menu-icon fa fa-pie-chart"></i><a href="../../../site/charts-peity.html">Peity Chart</a></li>
                        </ul>
                    </li>

                    <li class="menu-item-has-children dropdown">
                        <a href="../../../site#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-area-chart"></i>Maps</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-map-o"></i><a href="../../../site/maps-gmap.html">Google Maps</a></li>
                            <li><i class="menu-icon fa fa-street-view"></i><a href="../../../site/maps-vector.html">Vector Maps</a></li>
                        </ul>
                    </li>
                    <h3 class="menu-title">Extras</h3><!-- /.menu-title -->
                    <li class="menu-item-has-children dropdown">
                        <a href="../../../site#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-glass"></i>Pages</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-sign-in"></i><a href="../../../site/page-login.html">Login</a></li>
                            <li><i class="menu-icon fa fa-sign-in"></i><a href="../../../site/page-register.html">Register</a></li>
                            <li><i class="menu-icon fa fa-paper-plane"></i><a href="../../../site/pages-forget.html">Forget Pass</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </aside><!-- /#left-panel -->

    <!-- Left Panel -->

    <!-- Right Panel -->

    <div id="right-panel" class="right-panel">

        <!-- Header-->
        <header id="header" class="header">

            <div class="header-menu">

                <div class="col-sm-7">
                    <a id="menuToggle" class="menutoggle pull-left"><i class="fa fa fa-tasks"></i></a>
                    <div class="header-left">
                        <button class="search-trigger"><i class="fa fa-search"></i></button>
                        <div class="form-inline">
                            <form class="search-form">
                                <input class="form-control mr-sm-2" type="text" placeholder="Search ..." aria-label="Search">
                                <button class="search-close" type="submit"><i class="fa fa-close"></i></button>
                            </form>
                        </div>

                        <div class="dropdown for-notification">
                            <button class="btn btn-secondary dropdown-toggle" type="button" id="notification" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fa fa-bell"></i>
                                <span class="count bg-danger">5</span>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="notification">
                                <p class="red">You have 3 Notification</p>
                                <a class="dropdown-item media bg-flat-color-1" href="../../../site#">
                                <i class="fa fa-check"></i>
                                <p>Server #1 overloaded.</p>
                            </a>
                                <a class="dropdown-item media bg-flat-color-4" href="../../../site#">
                                <i class="fa fa-info"></i>
                                <p>Server #2 overloaded.</p>
                            </a>
                                <a class="dropdown-item media bg-flat-color-5" href="../../../site#">
                                <i class="fa fa-warning"></i>
                                <p>Server #3 overloaded.</p>
                            </a>
                            </div>
                        </div>

                        <div class="dropdown for-message">
                            <button class="btn btn-secondary dropdown-toggle" type="button"
                                id="message"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="ti-email"></i>
                                <span class="count bg-primary">9</span>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="message">
                                <p class="red">You have 4 Mails</p>
                                <a class="dropdown-item media bg-flat-color-1" href="../../../site#">
                                <span class="photo media-left"><img alt="avatar" src="${pageContext.request.contextPath}/site/images/avatar/1.jpg"></span>
                                <span class="message media-body">
                                    <span class="name float-left">Jonathan Smith</span>
                                    <span class="time float-right">Just now</span>
                                        <p>Hello, this is an example msg</p>
                                </span>
                            </a>
                                <a class="dropdown-item media bg-flat-color-4" href="../../../site#">
                                <span class="photo media-left"><img alt="avatar" src="${pageContext.request.contextPath}/site/images/avatar/2.jpg"></span>
                                <span class="message media-body">
                                    <span class="name float-left">Jack Sanders</span>
                                    <span class="time float-right">5 minutes ago</span>
                                        <p>Lorem ipsum dolor sit amet, consectetur</p>
                                </span>
                            </a>
                                <a class="dropdown-item media bg-flat-color-5" href="../../../site#">
                                <span class="photo media-left"><img alt="avatar" src="${pageContext.request.contextPath}/site/images/avatar/3.jpg"></span>
                                <span class="message media-body">
                                    <span class="name float-left">Cheryl Wheeler</span>
                                    <span class="time float-right">10 minutes ago</span>
                                        <p>Hello, this is an example msg</p>
                                </span>
                            </a>
                                <a class="dropdown-item media bg-flat-color-3" href="../../../site#">
                                <span class="photo media-left"><img alt="avatar" src="${pageContext.request.contextPath}/site/images/avatar/4.jpg"></span>
                                <span class="message media-body">
                                    <span class="name float-left">Rachel Santos</span>
                                    <span class="time float-right">15 minutes ago</span>
                                        <p>Lorem ipsum dolor sit amet, consectetur</p>
                                </span>
                            </a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-sm-5">
                    <div class="user-area dropdown float-right">
                        <a href="../../../site#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <img class="user-avatar rounded-circle" src="${pageContext.request.contextPath}/site/images/admin.jpg" alt="User Avatar">
                        </a>

                        <div class="user-menu dropdown-menu">
                            <a class="nav-link" href="../../../site#"><i class="fa fa-user"></i> My Profile</a>

                            <a class="nav-link" href="../../../site#"><i class="fa fa-user"></i> Notifications <span class="count">13</span></a>

                            <a class="nav-link" href="../../../site#"><i class="fa fa-cog"></i> Settings</a>

                            <a class="nav-link" href="../../../site#"><i class="fa fa-power-off"></i> Logout</a>
                        </div>
                    </div>

                    <div class="language-select dropdown" id="language-select">
                        <a class="dropdown-toggle" href="../../../site#" data-toggle="dropdown" id="language" aria-haspopup="true" aria-expanded="true">
                            <i class="flag-icon flag-icon-us"></i>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="language">
                            <div class="dropdown-item">
                                <span class="flag-icon flag-icon-fr"></span>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-es"></i>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-us"></i>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-it"></i>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

        </header><!-- /header -->
        <!-- Header-->

        <div class="breadcrumbs">
            <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>Dashboard</h1>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="page-header float-right">
                    <div class="page-title">
                        <ol class="breadcrumb text-right">
                            <li><a href="../../../site#">Dashboard</a></li>
                            <li><a href="../../../site#">Forms</a></li>
                            <li class="active">Basic</li>
                        </ol>
                    </div>
                </div>
            </div>
        </div>

        <div class="content mt-3">
            <div class="animated fadeIn">
                <div class="row">

                    <div class="col-lg-6">
                        <div class="card">
                            <div class="card-header">
                                <strong>Insert</strong> user
                            </div>
                            <div class="card-body card-block">

                                <form action="${pageContext.request.contextPath}/crud" id="userInsert" method="post" class="form-horizontal">
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">Login</label>
                                        <input type="text" id="userLogin" name="login" placeholder="1-10" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">Password</label>
                                        <input type="text" id="userPassword" name="password" placeholder="1-10" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">First name</label>
                                        <input type="text" id="userFirstName" name="firstName" placeholder="1-10" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">Second name</label>
                                        <input type="text" id="userSecondName" name="secondName" placeholder="1-10" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">Email</label>
                                        <input type="text" id="userEmail" name="email" placeholder="1-10" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">Balance</label>
                                        <input type="text" id="userBalance" name="balance" placeholder="1-10" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">Sale</label>
                                        <input type="text" id="userSale" name="sale" placeholder="1-10" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">Role id</label>
                                        <select name="roleId" id="sd2" form="userInsert" class="form-control">
                                            <option value="0">Please select</option>
                                            <option value="1">Administrator</option>
                                            <option value="2">Client</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">Status id</label>
                                        <label for="statusId">Snite</label>
                                        <select name="statusId" id="statusId" class="form-control">
                                            <option value="0">Please select</option>
                                            <option value="1">Activated</option>
                                            <option value="2">Deactivated</option>
                                            <option value="3">Deleted</option>
                                        </select>
                                    </div>
                                    <input type="hidden" name="command" value="userInsert"/>
                                </form>
                            </div>


                            <div class="card-footer">

                                <button type="submit" form="userInsert" class="btn btn-primary btn-sm">
                                    <i class="fa fa-dot-circle-o"></i> Submit
                                </button>

                                <button type="reset" class="btn btn-danger btn-sm">
                                    <i class="fa fa-ban"></i> Reset
                                </button>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-6">
                        <div class="card">
                            <div class="card-header">
                                <strong>Get</strong> by id
                            </div>
                                <div class="card-body card-block">
                                    <form action="${pageContext.request.contextPath}/crud" method="post" id="userGetById" class="form-horizontal">

                                        <div class="form-group">
                                            <label class="pr-1  form-control-label">User id</label>
                                            <input type="text" id="getUserById" name="id" placeholder="1-10" class="form-control">
                                        </div>
                                        <input type="hidden" name="command" value="userGetById"/>

                                    </form>
                                </div>
                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary btn-sm" form="userGetById">
                                    <i class="fa fa-dot-circle-o"></i> Submit
                                </button>

                                <button type="reset" class="btn btn-danger btn-sm">
                                    <i class="fa fa-ban"></i> Reset
                                </button>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header">
                                <strong>Show all</strong> users
                            </div>
                            <form action="${pageContext.request.contextPath}/crud" method="post" id="userGetAllForm" class="form-horizontal">
                                <input type="hidden" name="command" value="userGetAll"/>
                            </form>
                            <div class="card-footer">
                                <button type="submit" form="userGetAllForm" class="btn btn-primary btn-sm">
                                    <i class="fa fa-dot-circle-o"></i> Submit
                                </button>

                                <button type="reset" class="btn btn-danger btn-sm">
                                    <i class="fa fa-ban"></i> Reset
                                </button>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header">
                                <strong>Delete</strong> by id
                            </div>
                            <div class="card-body card-block">
                                <form action="${pageContext.request.contextPath}/crud" method="post" id="userDelete" class="form-horizontal">

                                    <div class="form-group">
                                        <label class="pr-1  form-control-label">User id</label>
                                        <input type="text" id="userDeleteInput" name="id" placeholder="1-10" class="form-control">
                                    </div>
                                    <input type="hidden" name="command" value="userDelete"/>

                                </form>
                            </div>
                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary btn-sm" form="userDelete">
                                    <i class="fa fa-dot-circle-o"></i> Submit
                                </button>

                                <button type="reset" class="btn btn-danger btn-sm">
                                    <i class="fa fa-ban"></i> Reset
                                </button>
                            </div>
                        </div>
                    </div>

                </div>
            </div><!-- .animated -->

        </div><!-- .content -->




    </div><!-- /#right-panel -->
    <!-- Right Panel -->


    <script src="${pageContext.request.contextPath}/site/vendors/jquery/dist/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/site/vendors/popper.js/dist/umd/popper.min.js"></script>

    <script src="${pageContext.request.contextPath}/site/vendors/jquery-validation/dist/jquery.validate.min.js"></script>
    <script src="${pageContext.request.contextPath}/site/vendors/jquery-validation-unobtrusive/dist/jquery.validate.unobtrusive.min.js"></script>

    <script src="${pageContext.request.contextPath}/site/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/site/assets/js/main.js"></script>
</body>
</html>
