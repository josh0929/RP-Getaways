<%-- 
    Document   : process
    Created on : Jan 20, 2019, 1:22:38 PM
    Author     : Josh0
--%>

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
                                <a class="nav-link" href="../pricing.html">Pricing</a>
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

            <form method="POST" action="../admin/ReserveCont" name="reservationForm">
                <div class="form-row">
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">First name</label>
                        <input type="text" class="form-control"  name="name" 
                               id="validationCustom01" value="${name}" required>
                        <div class="valid-feedback">
                            Looks good!
                        </div>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom02">Last name</label>
                        <input type="text" class="form-control" name="last" 
                               id="validationCustom02" placeholder="Last Name" 
                               value="${last}" required>
                        <div class="valid-feedback">
                            Looks good!
                        </div>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="inputEmail4">Email</label>
                        <input type="email" class="form-control" name="email" 
                               id="inputEmail4" value="${email}" required>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-3 mb-3">
                        <label for="validationCustom03">City (Optional)</label>
                        <input type="text" class="form-control" name="city"  
                               id="validationCustom03" value="${city}">
                        <div class="invalid-feedback">
                            Please provide a valid city.
                        </div>
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="validationCustom04">State (Optional)</label>
                        <input type="text" class="form-control" name="state"  
                               id="validationCustom04" value="${state}">
                        <div class="invalid-feedback">
                            Please provide a valid state.
                        </div>
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="validationCustom05">Zip (Optional)</label>
                        <input type="text" class="form-control" name="zip" 
                               id="validationCustom05" value="${zip}">
                        <div class="invalid-feedback">
                            Please provide a valid zip.
                        </div>
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="validationCustom03">Phone (Format 1112223333)</label>
                        <input type="tel" class="form-control" name="phone"  
                               id="validationCustom03" value="${phone}"
                               pattern="[0-9]{3}[0-9]{3}[0-9]{4}" required>
                        <div class="invalid-feedback">
                            Please match the requested format.
                        </div>
                    </div>

                </div>
                <div class="form-row">
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom06">Select start date:</label>
                        <input type="date" class="form-control" 
                               id="validationCustom06" name="start" 
                               value="${start}" required>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom07">Select end date:</label>
                        <input type="date" class="form-control" 
                               id="validationCustom07" name="end" 
                               value="${end}" required>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="FormControlSelect2">Total amount of guests:</label>
                        <select class="form-control" id="FormControlSelect2" 
                                name="totalGuests" value="${totalGuests}" required>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                            <option>13</option>
                            <option>14</option>
                            <option>15</option>
                        </select>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="FormControlSelect1">Hotel - Room</label>
                        <select class="form-control" id="FormControlSelect1" 
                                name="room" selected="${room}" required>
                            <option>Select One</option>
                            <option>Puerto Plata - The Crown Suites</option>

                            <option>Puerto Plata - The Royal Suites</option>

                            <option>Puerto Plata - The Crown Villas - 3 Rooms</option>
                            <option>Puerto Plata - The Crown Villas - 4 Rooms</option>
                            <option>Puerto Plata - The Crown Villas - 5 Rooms</option>
                            <option>Puerto Plata - The Crown Villas - 6 Rooms</option>
                            <option>Puerto Plata - The Crown Villas - 7 Rooms</option>

                            <option>Puerto Plata - The Royal Suites - 1 Room</option>
                            <option>Puerto Plata - The Royal Suites - 2 Room</option>
                            
                            <option>Puerto Plata - The Residence Suites - Studio</option>
                            <option>Puerto Plata - The Residence Suites - 1 Room</option>
                            <option>Puerto Plata - The Residence Suites - 2 Room</option>

                            <option>Puerto Plata - The Tropical - Studio</option>
                            <option>Puerto Plata - The Tropical - 1 Room</option>
                            <option>Puerto Plata - The Tropical - 2 Room</option>

                            <option>Puerto Plata - Presidential Suites - 1 Room</option>
                            <option>Puerto Plata - Presidential Suites - 2 Room</option>
                            <option>Puerto Plata - Presidential Suites - 3 Room</option>

                            <option>Puerto Plata - Costa Esmeralda (The Cliff Villa) - 3 Room</option>
                            <option>Puerto Plata - Costa Esmeralda (The Cliff Villa) - 4 Room</option>
                            <option>Puerto Plata - Costa Esmeralda (The Cliff Villa) - 5 Room</option>
                            <option>Puerto Plata - Costa Esmeralda (The Cliff Villa) - 6 Room</option>
                            <option>Puerto Plata - Costa Esmeralda (The Cliff Villa) - 7 Room</option>

                            <option>Punta Cana - Presidential Suites - Junior Suite</option>
                            <option>Punta Cana - Presidential Suites - 1 Room</option>
                            <option>Punta Cana - Presidential Suites - 2 Room</option>

                            <option>Punta Cana - The Dream Suites - Studio</option>

                            <option>Bavaro - The Dream Suites - Studio</option>                        

                            <option>Mexico - Cancun - 1 Room</option>
                            <option>Mexico - Cancun - 2 Room</option>

                            <option>Mexico - Tulum - 1 Room</option>
                            <option>Mexico - Tulum - 2 Room</option>

                            <option>Mexico - Sens - 1 Room</option>
                            <option>Mexico - Sens - 2 Room</option>

                            <option>Mexico - Palm - 1 Room</option>
                            <option>Mexico - Palm - 2 Room</option>
                        </select>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="validationCustom01">Reservation Number</label>
                        <input type="text" class="form-control"  name="reservation" 
                               id="validationCustom01" value="${reservation}" required>
                        <div class="valid-feedback">
                            Looks good!
                        </div>
                    </div>
                </div>
                <hr class="my-4">
                <a class="btn btn-outline-primary" href="../index.html" role="button">Cancel</a>

                <input class="btn btn-primary" type="submit" value="Next"
                       name="reservationFormButton">

            </form>
        </div>
    </body>
</html>