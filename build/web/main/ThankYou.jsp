<%-- 
    Document   : ThankYou
    Created on : Jan 6, 2019, 5:46:49 PM
    Author     : Josh0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>RP-Getaways</title>
        <meta charset="UTF-8">
        <link rel="icon" href="../imgs/logo/beach.png">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous">
    </head>
    <style>
        body {
            background-image: url(../imgs/thankyou_beach.jpg);
            background-repeat: no-repeat;
            width: 100%;
            background-repeat: no-repeat;
            background-size: 100%;
        }

        h2, h3, h4, h5 {
            font-family: 'Montserrat', sans-serif;
            color: grey;
        }

        p, h1 {
            color: grey;
        }
    </style>
    <body>
        <div class="sticky-top">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container">
                    <a class="navbar-brand" href="../index.html">
                        <img src="../imgs/logo/beach.png" style="width: 50px; height: 50px;"> RP-Getaways</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item active">
                                <a class="nav-link" href="../index.html">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../rooms-ppl/PPL_crown_villas_active.html">Rooms</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Pricing</a>
                            </li>
                        </ul>
                    </div>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </nav>
        </div>
        <div class="container">
            <div class="jumbotron" style="margin-top: 200px;">
                <h1 class="display-4">Hello ${firstName},</h1>
                <p class="lead">Thank you for considering RP-Getaways as your 
                    choice of accommodation. We have received your request 
                    successfully. We will proceed to review the information 
                    provided in order to provide you with the best possible 
                    option for your stay. We will contact you shortly to 
                    proceed.</p>
                <hr class="my-4">
                <p>Please continue to browse all our options or you may close 
                    this window if you are finished.</p>
                <a class="btn btn-primary btn-lg" href="../index.html" role="button">Return to Home</a>
                <a class="btn btn-primary btn-lg" href="../rooms-ppl/PPL_crown_villas_active.html" role="button">Browse Rooms</a>
            </div>
        </div>
    </body>
</html>