package main;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.net.URL;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller class that will implement the logic needed to navigate throughout
 * the multiple pages of the application depending on which button was pressed.
 * Controller will accept HTTP GET requests from all forms of the web
 * application, extract and analyze parameters and provide response back to
 * browser containing the page requested.
 *
 * @author Joshua Suarez
 */
public class FormServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
		   throws ServletException, IOException
	{

		//form fields to be inserted into email to be sent
		String name, last, email, city, state, zip, areaOfInterst, start, end,
			   totalGuests, description;
		String message = "";
		String messageToClient = "";

		//Form is coming from home page and no specific room details 
		//have been specified
		if (req.getParameter("mainFormButton") != null)
		{
			name = req.getParameter("name");
			last = req.getParameter("last");
			email = req.getParameter("email");

			//Optional form fields =================================
			if (req.getParameter("city") != null)
				city = req.getParameter("city");
			else
				city = "Not Specified";

			if (req.getParameter("state") != "")
				state = req.getParameter("state");
			else
				state = "Not Specified";

			if (req.getParameter("zip") != "")
				zip = req.getParameter("zip");
			else
				zip = "Not Specified";

			if (req.getParameter("areaOfInterest") != null)
				areaOfInterst = req.getParameter("areaOfInterest");
			else
				areaOfInterst = "Not specified";

			//===================================================

			start = req.getParameter("start");
			end = req.getParameter("end");
			totalGuests = req.getParameter("totalGuests");
			description = req.getParameter("description");

			//Construct Message =================================
			message += "**CUSTOMER INFORMATION REQUEST**\n\n"
				   + "Customer Information\n"
				   + "=====================================\n"
				   + "First Name: " + name + "\n"
				   + "Last Name: " + last + "\n"
				   + "Email: " + email + "\n\n"
				   + "City: " + city + "\n"
				   + "State: " + state + "\n"
				   + "Zip: " + zip + "\n\n"
				   + "=====================================\n"
				   + "Area of Interest: " + areaOfInterst + "\n"
				   + "Estimated Arrival Date: " + start + "\n"
				   + "Estimated Departure Date: " + end + "\n"
				   + "Total number of guests: " + totalGuests + "\n"
				   + "=====================================\n\n"
				   + "Description: \n" + description + "\n\n";
			
			//Construct message to client
			messageToClient += "Thank you for considering RP-Getaways as "
				   + "your choice of accommodation. We have received your "
				   + "request successfully. We will proceed to review the "
				   + "information provided in order to provide you with the "
				   + "best possible option for your stay. We will contact "
				   + "you shortly to proceed.\n\n"
				   + "**CUSTOMER INFORMATION REQUEST**\n\n"
				   + "Customer Information\n"
				   + "=====================================\n"
				   + "First Name: " + name + "\n"
				   + "Last Name: " + last + "\n"
				   + "Email: " + email + "\n\n"
				   + "City: " + city + "\n"
				   + "State: " + state + "\n"
				   + "Zip: " + zip + "\n\n"
				   + "=====================================\n"
				   + "Area of Interest: " + areaOfInterst + "\n"
				   + "Estimated Arrival Date: " + start + "\n"
				   + "Estimated Departure Date: " + end + "\n"
				   + "Total number of guests: " + totalGuests + "\n"
				   + "=====================================\n\n"
				   + "Description: \n" + description + "\n\n";

			//Send Email to RP-Getaways admin
			EmailSender emailSender = new EmailSender();
			emailSender.sendEmail("Rp-getaways.lifestyle@hotmail.com", message);
			
			//Send email to client
			EmailSender toClient = new EmailSender();
			toClient.sendEmail(email, messageToClient);

			//place info in the session
			req.getSession().setAttribute("firstName", name);
		}
		else
		{
			areaOfInterst = "";
			if(req.getParameter("crownVillaFormButton") != null)
				areaOfInterst += "The Crown Villas";
			else if(req.getParameter("crownSuitesFormButton") != null)
				areaOfInterst += "The Crown Suites";
			else if(req.getParameter("royalSuitesFormButton") != null)
				areaOfInterst += "The Royal Suites";
			else if(req.getParameter("residenceSuitesFormButton") != null)
				areaOfInterst += "The Residence Suites";
			else if(req.getParameter("tropicalFormButton") != null)
				areaOfInterst += "The Tropical";
			else if(req.getParameter("presidentialSuitesFormButton") != null)
				areaOfInterst += "The Presidential Suites";
			else if(req.getParameter("costaEsmeraldaFormButton") != null)
				areaOfInterst += "Costa Esmeralda";
			else if(req.getParameter("presidentialSuitesPCAFormButton") != null)
				areaOfInterst += "Presidential Suites | Punta Cana";
			else if(req.getParameter("dreamSuitesFormButton") != null)
				areaOfInterst += "The Dream Suites";
			else if(req.getParameter("dreamSuitesBavFormButton") != null)
				areaOfInterst += "The Dream Suites | Bavaro";
			else if(req.getParameter("cancunFormButton") != null)
				areaOfInterst += "TGL Cancun";			
			else if(req.getParameter("tulumFormButton") != null)
				areaOfInterst += "TGL Tulum";
			else if(req.getParameter("palmFormButton") != null)
				areaOfInterst += "TGL Palm";
			else if(req.getParameter("sensFormButton") != null)
				areaOfInterst += "TGL Sens";
			
			
			name = req.getParameter("name");
			last = req.getParameter("last");
			email = req.getParameter("email");

			//Optional form fields =================================
			if (req.getParameter("city") != null)
				city = req.getParameter("city");
			else
				city = "Not Specified";

			if (req.getParameter("state") != "")
				state = req.getParameter("state");
			else
				state = "Not Specified";

			if (req.getParameter("zip") != "")
				zip = req.getParameter("zip");
			else
				zip = "Not Specified";

			

			//===================================================

			start = req.getParameter("start");
			end = req.getParameter("end");
			totalGuests = req.getParameter("totalGuests");
			description = req.getParameter("description");
			URL url = new URL("http://RPGetaways.com/process.jsp");

			//Construct Message =================================
			message += "**" + areaOfInterst.toUpperCase() + " - RESERVATION REQUEST**\n\n"
				   + "Customer Information\n"
				   + "=====================================\n"
				   + "First Name: " + name + "\n"
				   + "Last Name: " + last + "\n"
				   + "Email: " + email + "\n\n"
				   + "City: " + city + "\n"
				   + "State: " + state + "\n"
				   + "Zip: " + zip + "\n\n"
				   + "=====================================\n"
				   + "Hotel of Interest: " + areaOfInterst + "\n"
				   + "Estimated Arrival Date: " + start + "\n"
				   + "Estimated Departure Date: " + end + "\n"
				   + "Total number of guests: " + totalGuests + "\n"
				   + "=====================================\n\n"
				   + "Description: \n" + description + "\n\n"
				   + "Click the following link to create this reservation:\n"
				   + url;
			
			messageToClient += "Thank you for considering RP-Getaways as "
				   + "your choice of accommodation. We have received your "
				   + "request successfully. We will proceed to review the "
				   + "information provided in order to provide you with the "
				   + "best possible option for your stay. We will contact "
				   + "you shortly to proceed.\n\n"
				   +"**" + areaOfInterst.toUpperCase() + " - RESERVATION REQUEST**\n\n"
				   + "Customer Information\n"
				   + "=====================================\n"
				   + "First Name: " + name + "\n"
				   + "Last Name: " + last + "\n"
				   + "Email: " + email + "\n\n"
				   + "City: " + city + "\n"
				   + "State: " + state + "\n"
				   + "Zip: " + zip + "\n\n"
				   + "=====================================\n"
				   + "Hotel of Interest: " + areaOfInterst + "\n"
				   + "Estimated Arrival Date: " + start + "\n"
				   + "Estimated Departure Date: " + end + "\n"
				   + "Total number of guests: " + totalGuests + "\n"
				   + "=====================================\n\n"
				   + "Description: \n" + description + "\n\n";

			//Send Email to RP-Getaways
			EmailSender emailSender = new EmailSender();
			emailSender.sendEmail("Rp-getaways.lifestyle@hotmail.com", message);
			
			//Send email to client
			EmailSender toClient = new EmailSender();
			toClient.sendEmail(email, messageToClient);
			
			//place info in the session
			req.getSession().setAttribute("firstName", name);
			
		}
		
		RequestDispatcher dispatch = req.getRequestDispatcher("ThankYou.jsp");
		dispatch.forward(req, res);
	}
}
