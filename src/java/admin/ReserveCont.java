package admin;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.net.URL;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import main.EmailSender;

public class ReserveCont extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
		   throws ServletException, IOException {
		
		int totalDays = 0;
		double totalPrice = 0;

		String name = "";
		String last = "";
		String email = "";
		String city = "";
		String state = "";
		String zip = "";
		String phone = "";
		String totalGuests = "";
		String reservation = "";
		String room = "";
		Date start = new Date();
		Date end = new Date();
		
		//retreive total days of  reservation
		String startDateString = req.getParameter("start");
		String endDateString = req.getParameter("end");

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			start = formatter.parse(startDateString);
			end = formatter.parse(endDateString);

			long totalMs = end.getTime() - start.getTime();
			totalDays = ((((((int) totalMs) / 1000) / 60) / 60) / 24);

			//Get params
			name += req.getParameter("name");
			last = req.getParameter("last");
			email = req.getParameter("email");
			city = req.getParameter("city");
			state = req.getParameter("state");
			zip = req.getParameter("zip");
			phone = req.getParameter("phone");
			totalGuests = req.getParameter("totalGuests");
			reservation = req.getParameter("reservation");

			if (city == null) {
				city = "Not Specified";
			}

			if (state == null) {
				state = "Not Specified";
			}

			if (zip == null) {
				zip = "Not Specified";
			}

			//Retreive price
			room += req.getParameter("room");

			if (room.equalsIgnoreCase("Puerto Plata - The Crown Villas - "
				   + "3 Rooms") || room.equalsIgnoreCase("Puerto Plata - The "
						 + "Royal Suites - 1 Room") || room.equalsIgnoreCase("Puerto "
						 + "Plata - Presidential Suites - 1 Room")
				   || room.equalsIgnoreCase("Puerto Plata - Costa Esmeralda (The "
						 + "Cliff Villa) - 3 Room") || room.equalsIgnoreCase("Punta "
						 + "Cana - Presidential Suites - 1 Room")) {
				totalPrice = 120.00 * totalDays;
			}
			else if (room.equalsIgnoreCase("Puerto Plata - The Crown Villas - "
				   + "4 Rooms") || room.equalsIgnoreCase("Puerto Plata - Costa "
						 + "Esmeralda (The Cliff Villa) - 4 Room")) {
				totalPrice = 220.00 * totalDays;
			}
			else if (room.equalsIgnoreCase("Puerto Plata - The Crown Villas - "
				   + "5 Rooms") || room.equalsIgnoreCase("Puerto Plata - Costa "
						 + "Esmeralda (The Cliff Villa) - 5 Room")) {
				totalPrice = 240.00 * totalDays;
			}
			else if (room.equalsIgnoreCase("Puerto Plata - The Crown Villas - "
				   + "6 Rooms") || room.equalsIgnoreCase("Puerto Plata - Costa "
						 + "Esmeralda (The Cliff Villa) - 6 Room")) {
				totalPrice = 260.00 * totalDays;
			}
			else if (room.equalsIgnoreCase("Puerto Plata - The Crown Villas - "
				   + "7 Rooms") || room.equalsIgnoreCase("Puerto Plata - Costa "
						 + "Esmeralda (The Cliff Villa) - 7 Room")) {
				totalPrice = 280.00 * totalDays;
			}
			else if (room.equalsIgnoreCase("Puerto Plata - The Royal Suites - "
				   + "2 Room") || room.equalsIgnoreCase("Puerto Plata - "
						 + "Presidential Suites - 2 Room") || room.equalsIgnoreCase(""
						 + "Punta Cana - Presidential Suites - 2 Room")) {
				totalPrice = 160.00 * totalDays;
			}
			else if (room.equalsIgnoreCase("Puerto Plata - The Residence Suites "
				   + "- Studio") || room.equalsIgnoreCase("Puerto Plata - The "
						 + "Tropical - 1 Room")) {
				totalPrice = 50.20 * totalDays;
			}
			else if (room.equalsIgnoreCase("Puerto Plata - The Residence Suites "
				   + "- 1 Room") || room.equalsIgnoreCase("Puerto Plata - The "
						 + "Tropical - Studio") || room.equalsIgnoreCase("Mexico - Cancun"
						 + " - 1 Room") || room.equalsIgnoreCase("Mexico - Tulum - 1 "
						 + "Room") || room.equalsIgnoreCase("Mexico - Sens - 1 Room")
				   || room.equalsIgnoreCase("Mexico - Palm - 1 Room")) {
				totalPrice = 60.00 * totalDays;
			}
			else if (room.equalsIgnoreCase("Punta Cana - Presidential Suites - 3 Room")) {
				totalPrice = 200.00 * totalDays;
			}
			else if (room.equalsIgnoreCase("Punta Cana - The Dream Suites - "
				   + "Studio") || room.equalsIgnoreCase("Bavaro - The Dream Suites "
						 + "- Studio")) {
				totalPrice = 75.20 * totalDays;
			}
			else if (room.equalsIgnoreCase("Puerto Plata - The Residence Suites "
				   + "- 2 Room") || room.equalsIgnoreCase("Puerto Plata - The "
						 + "Tropical - 2 Room") || room.equalsIgnoreCase("Puerto Plata - "
						 + "Presidential Suites - Studio") || room.equalsIgnoreCase(""
						 + "Mexico - Cancun - 2 Room") || room.equalsIgnoreCase("Mexico "
						 + "- Tulum - 2 Room") || room.equalsIgnoreCase("Mexico - Sens "
						 + "- 2 Room") || room.equalsIgnoreCase("Mexico - Palm - 2 "
						 + "Room")) {
				totalPrice = 80.00 * totalDays;
			}

			//set new params
			req.getSession().setAttribute("days", totalDays);
			req.getSession().setAttribute("price", totalPrice);
			req.getSession().setAttribute("name", name);
			req.getSession().setAttribute("last", last);
			req.getSession().setAttribute("email", email);
			req.getSession().setAttribute("city", city);
			req.getSession().setAttribute("state", state);
			req.getSession().setAttribute("zip", zip);
			req.getSession().setAttribute("phone", phone);
			req.getSession().setAttribute("start", start);
			req.getSession().setAttribute("end", end);
			req.getSession().setAttribute("totalGuests", totalGuests);
			req.getSession().setAttribute("room", room);
			req.getSession().setAttribute("reservation", reservation);

		}
		catch (ParseException e) {
			; //must catch parse exception
		}

		if (req.getParameter("backConfirmButton") != null) {
			RequestDispatcher dispatch = req.getRequestDispatcher("Reservation.jsp");
			dispatch.forward(req, res);
		}
		else if (req.getParameter("finalConfirmButton") != null) {
			String message = "";
			
			
			URL url = new URL("http://RPGetaways.com/payment.jsp");
			
			//Construct Message =================================
			message += "**RESERVATION REQUEST - FINAL CONFIRMATION**\n\n"
				   + "Your information has been processed and your "
				   + "reservation has been confirmed. Please review "
				   + "information below and proceed to the link at the "
				   + "bottom to make a payment\n\n\n"
				   + "Customer Information\n"
				   + "===================================\n"
				   + "First Name: " + name + "\n"
				   + "Last Name: " + last + "\n"
				   + "Phone: " + phone + "\n"
				   + "Email: " + email + "\n\n"
				   + "City: " + city + "\n"
				   + "State: " + state + "\n"
				   + "Zip: " + zip + "\n\n"
				   + "===================================\n"
				   + "Hotel: " + room + "\n"
				   + "Estimated Arrival Date: " + start + "\n"
				   + "Estimated Departure Date: " + end + "\n"
				   + "Duration of stay: " + totalDays + " days\n"
				   + "Total number of guests: " + totalGuests + "\n"
				   + "Reservation Number: " + reservation + "\n"
				   + "===================================\n\n"
				   + "Total Price: " + totalPrice + "\n\n"
				   + "If all the information is correct, please click the "
				   + "following link to proceed with payment or you may "
				   + "reply back to this email for more information.\n"
				   + url;


			//Send Email to RP-Getaways
			EmailSender emailSender = new EmailSender();
			emailSender.sendEmail(email, message);
			
			RequestDispatcher dispatch = req.getRequestDispatcher("Final.jsp");
			dispatch.forward(req, res);
		}
		else if(req.getParameter("reservationFormButton") != null) {
			RequestDispatcher dispatch = req.getRequestDispatcher("Confirm.jsp");
			dispatch.forward(req, res);
		}
	}
}
