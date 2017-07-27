<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	PROFILE <br>
	Saya mo, ${sessionScope.sessionuser}. <br>
	
	<br> <a href="logout">Log out</a>
	<%@ include file="index.html" %>
</body>
</html> --%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> niche </title>
<link href="styles/styles.css" rel="stylesheet" type="text/css">
<link href="lib/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<script src = "lib/jquery-min.js"> </script>
<script src = "lib/jQueryRotate.js"> </script>
<script src = "script/index.js"> </script>

</head>
<body>
    <div id = "background">    
    </div>
    <div id = "overlay"> 
    </div>
    
    <div id = "viewport">
        <div class = "nav-bg"> </div>
        <nav class = "nav-bar">
            <div class = "nav-left">
                <a class = "nav-home" href = "index.html">
                    <img class = "nav-main-icon" src ="res/icon.png"> 
                    <span class = "nav-item nav-title"> niche </span>

                </a>
            </div>
            
            <div class = "nav-center-wrapper">
                <div class = "nav-center"> 
                    <input class = "nav-item nav-field" type = "text" placeHolder = "Search by tags">
                    <button id="search">
                        <i class="nav-item nav-icon fa fa-search fa-21"> </i> 
                    </button>
                </div>
            </div>
            
            <div class = "nav-right">
                <div class = "nav-login">
                    <div id = "logout" class = "nav-item nav-link"> 
                        ${sessionScope.sessionuser}
                        <i class="nav-icon fa fa-user-circle fa-1x"> </i> 
                    </div>
                    <div class = "logout-form-wrapper"> 
                            <div class = "logout-form">
                            <form action="user-public.jsp">
                            <input type="submit" class = "logout-row" value="Feed">
                                <i class = "fa fa-user-o"> </i>
                             <!--    <label class = "logout-label"> Feed </label> -->
                            </form>
                            <a href = "index.html" class = 'logout-row'>
                                <i class = "fa fa-sign-out"></i>
                                <label class = "logout-label"> Logout </label>
                            </a>
                        </div>
                    </div>
                </div>
                <div id = "about" class = "nav-item nav-link">
                    <i class="nav-icon fa fa-question-circle-o"></i>
                </div>
            </div>
        </nav>
         <div class = "main-content-container">
             <div class = "profile-info-container">
                 <p class = "profile-label profile-username-label">
                    @username
                 </p>
                 
                 <p class = "profile-label profile-description-label">
                    description
                 </p>
             </div>
             <div class = "profile-post-container">
                    <div class = "profile-posts post-container">
                    <div class = "post">
                        <a class = "post-title-link" href="#"> <p class = "post-title"> This is a long title it takes up almost two lines </p></a> 
                         <a class = "post-username-link" href="#"> <p class = "post-username"> @username </p> </a>
                        <p class = "post-desc"> Hello, world! </p>

                        <img class = "post-image" src ="res/dummy/300.png"/>

                        <div class = "tag-container">
                            tags:
                            <div class = "tag">
                            random
                            </div>

                            <div class = "tag">
                            scifi
                            </div>
                            <div class = "tag">
                            scifi
                            </div>
                        </div>         
                    </div>
                        
                    <div class = "post">
                        <a class = "post-title-link" href="#"> <p class = "post-title"> This is a long title it takes up almost two lines </p></a> 
                         <a class = "post-username-link" href="#"> <p class = "post-username"> @username </p> </a>
                        <p class = "post-desc"> Hello, world! </p>

                        <img class = "post-image" src ="res/dummy/300.png"/>

                        <div class = "tag-container">
                            tags:
                            <div class = "tag">
                            random
                            </div>

                            <div class = "tag">
                            scifi
                            </div>
                            <div class = "tag">
                            scifi
                            </div>
                        </div>
                    </div>
                </div>
                <div class = "more-container">
                    <p class = "more-message">
                        View more photos
                        <i class = "fa fa-arrow-down"></i>
                    </p>
                </div>
             </div>
        </div>  
        </div>
    </body>
</html>
