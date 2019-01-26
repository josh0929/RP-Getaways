<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>RP-Getaways</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous">
        <link rel="icon" href="../imgs/logo/beach.png">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <style>
            h2, h3, h4, h5 {
                font-family: 'Montserrat', sans-serif;
                color: grey;
            }

            p, h1 {
                color: grey;
            }
        </style>
    </head>

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

        <div class="container" style="margin-top: 50px;
             margin-bottom: 80px;">

            <h2 style="color: grey; text-align: center;">Reservation Form</h2>
            <hr class="my-4">
            <div class="row">

                <div class="col-md-6">
                    <h3>Customer Information:</h3>
                    <p>
                        <strong>First Name:</strong> ${name}<br>
                        <strong>Last Name: </strong>${last}<br>
                        <strong>Email: </strong>${email}<br>
                        <strong>Address: </strong>${city}, ${state}, ${zip}<br>
                        <strong>Phone: </strong>${phone}<br>
                    </p>
                </div>
                <div class="col-md-6">
                    <h3>Reservation Details:</h3>
                    <p>
                        <strong>Hotel: </strong>${room}<br>
                        <strong>Total Number of Guests: </strong>${totalGuests}<br>
                        <strong>Reservation Number: </strong> ${reservation} <br>
                        <strong>Arrival: </strong>${start}<br>
                        <strong>Departure:</strong> ${end}<br>
                        <strong>Total Days: </strong>${days}<br>

                    </p>


                </div>
            </div>
            <hr class="my-4">
            <div class="row">
                <div class="col-md-6">
                    <h3>Total Price:</h3>
                    <h3>$ ${price}</h3>
                </div>
            </div>
            <hr class="my-4">

            <div class="container">
                <div class="row">
                    <form method="POST" action="../admin/ReserveCont">
                        <input type="hidden" name="name" value="${name}">
                        <input type="hidden" name="last" value="${last}">
                        <input type="hidden" name="email" value="${email}">
                        <input type="hidden" name="city" value="${city}">
                        <input type="hidden" name="state" value="${state}">
                        <input type="hidden" name="zip" value="${zip}">
                        <input type="hidden" name="phone" value="${phone}">
                        <input type="hidden" name="start" value="${start}">
                        <input type="hidden" name="end" value="${end}">
                        <input type="hidden" name="totalGuests" value="${totalGuests}">
                        <input type="hidden" name="room" value="${room}">
                        <input type="hidden" name="reservation" value="${reservation}">
                        <input type="submit" class="btn btn-outline-primary" 
                               name="backConfirmButton" value="   Back   ">    
                    </form>
                    <form method="POST" action="../admin/ReserveCont">
                        <input type="hidden" name="name" value="${param.name}">
                        <input type="hidden" name="last" value="${param.last}">
                        <input type="hidden" name="email" value="${param.email}">
                        <input type="hidden" name="city" value="${param.city}">
                        <input type="hidden" name="state" value="${param.state}">
                        <input type="hidden" name="zip" value="${param.zip}">
                        <input type="hidden" name="phone" value="${param.phone}">
                        <input type="hidden" name="start" value="${param.start}">
                        <input type="hidden" name="end" value="${param.end}">
                        <input type="hidden" name="totalGuests" value="${param.totalGuests}">
                        <input type="hidden" name="room" value="${param.room}">
                        <input type="hidden" name="reservation" value="${param.reservation}">
                        <input type="submit" class="btn btn-primary" name="finalConfirmButton"
                               value="Confirm & Request Payment" style="margin-left: 10px;">    
                    </form>

                </div>
            </div>
        </div>
    </body>
</html>