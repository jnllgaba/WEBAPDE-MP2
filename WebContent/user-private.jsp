<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                            <a href = "profile.html" class = "logout-row">
                                <i class = "fa fa-user-o"> </i>
                                <label class = "logout-label"> Profile </label>
                            </a>
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
             <div class = "menu-container">
                posts:
                 <a id = "public" class = "menu-button" href= "user-public.jsp"> <i class = "fa fa-globe fa-3x"> </i> public</a>
                 <div class = "divider"> </div>
                 <a id = "user-private" href = "photos.html" class = "menu-button menu-button-selected"> <i class = "fa fa-lock fa-3x"> </i> private </a>
             </div>
            <div class = "post-container">
                 <div class = "post">
                    <a class = "post-title-link" href="#"> <p class = "post-title"> This is a long title HAHA </p></a> 
                     <a class = "post-username-link" href="#"> <p class = "post-username"> @username </p> </a>
                    <p class = "post-desc"> Lorem ipsum bang bang </p>

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
                
                 <div class = "post">
                    <a class = "post-title-link" href="#"> <p class = "post-title"> This is a long title </p></a> 
                     <a class = "post-username-link" href="#"> <p class = "post-username"> @username </p> </a>
                    <p class = "post-desc"> Lorem ipsum bang bang </p>

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
                    <a class = "post-title-link" href="#"> <p class = "post-title"> This is a long title </p></a> 
                     <a class = "post-username-link" href="#"> <p class = "post-username"> @username </p> </a>
                    <p class = "post-desc"> Lorem ipsum bang bang </p>

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
                    <a class = "post-title-link" href="#"> <p class = "post-title"> This is a long title </p></a> 
                     <a class = "post-username-link" href="#"> <p class = "post-username"> @username </p> </a>
                    <p class = "post-desc"> Lorem ipsum bang bang </p>

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
                    <a class = "post-title-link" href="#"> <p class = "post-title"> This is a long title </p></a> 
                     <a class = "post-username-link" href="#"> <p class = "post-username"> @username </p> </a>
                    <p class = "post-desc"> Lorem ipsum bang bang </p>

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
                    View more public photos
                    <i class = "fa fa-arrow-down"></i>
                </p>
            </div>
        </div>
         <div class = "upload-container">
            <div class = "upload">
                <form class = "upload-form">
                    <label class = "upload-title"> upload photo </label>
                    <div class = "upload-row">
                        <label class = "upload-label">
                        choose file
                        </label>
                        <input name = "file" id = "file" class = "upload-pic-field" type=file accept=".jpeg, .jpg, .png, .tif, .tiff">
                        <label for="file"> <i class = "fa fa-image"> </i> .JPEG, .PNG, .TIFF files </label>  
                    </div>
                    <div class = "upload-row">
                        <label class = "upload-label">
                            title </label>
                        <input name = "title" class = "upload-field" type ="text">
                    </div>

                    <div class = "upload-row">
                        <label name = "description" class = "upload-label">
                        description </label>
                    <input placeholder = "optional" class = "upload-field" type ="text"> 
                    </div>
                    

                    <div class = "upload-row">
                        <label name = "description" class = "upload-label">
                        visibility </label>
                        <input name = "visible" value = "public" class = "upload-box" type = "checkbox">
                        public
                        <input name = "visible" value = "private" class = "upload-box" type = "checkbox">
                        private
                    </div>

                    <div class = "upload-row">
                        <label class = "upload-label">
                            add tag
                        </label>                        
                        <input id="tag-field" class = "upload-field" type ="text"> 
                        <button id = "add-tag" class = "upload-button" type = "button"> <i class = "fa fa-plus"> </i> </button>
                    </div>

                    <div class = "upload-row">
                        <label class = "upload-label"> tags </label>
                        <div class = "upload-tag-container"> 
                        </div>
                    </div>
                    
                    <button class = "upload-button" type = "submit" id = "upload"> <i class = "fa fa fa-upload"> </i> Upload </button>
                  </form>
             </div>
            <div class = "upload-bg">
             </div>
         </div>

        <div class = "add-container">
            <button class = "add-photo"> <i class = "fa fa-plus"> </i> </button>
        </div>
        </div>
    </body>
</html>
