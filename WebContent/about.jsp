<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
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
                            <form action="profile.jsp">
                            <input type="submit" class = "logout-row" value="Profile">
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
                 <div class = "about-container">
                    <div class = "about-bg">
                 
                     </div>

                     <div class = "about-info">

                        <h1 class = "about-title">
                        About niche.
                         </h1>
                         <p class = "about-defn">  <b> niche (n.) </b>  a place, employment, status, or activity for which a person or thing is best fitted </p>
                         <p class = "about-desc" style="text-align:justify"> "niche." was developed in accordance to the specifications of the second Machine Problem for WEBAPDE. The group was tasked  
                         								to create a web application that allows its users to share images publicly and privately to a chosen set of users with the use
                         								of various web development tools such as HTML, CSS, JS, JSP EL, and Servlets.</p>
                         <p class = "about-passed"> Passed by: <br>
                         <label class = "about-member"> Paragas, Sean </label> <br>
                        <label class ="about-member"> Ticug, Jonal Ray </label> <br>
                         <label class ="about-member"> Gaba, Janelle Marie </label>
                        </p>
                     </div>

                 </div>

            </div>
        </div>
    </body>
</html>
