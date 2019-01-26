
package main;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender
{

	private static final String host = "smtp.gmail.com";
	private static final String smtpPort = "587";
	private static String to;
	final String username = "suarezjoshua0@gmail.com";
	final String password = "s092989je";
	private String from;

	public EmailSender()
	{
		this.from = "suarezjoshua0@gmail.com"; // Sender's email
	}

	public void sendEmail(String to, String body)
	{
		this.to = to;
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", smtpPort);

		// Set the Session object.
		Session session = Session.getInstance(props,
			   new javax.mail.Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(username, password);
			}
		});

		try
		{
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO,
				   InternetAddress.parse(to));

			// Set Subject: header field
			message.setSubject("Testing Subject");

			// Set the actual message
			message.setText(body);

			// Send message
			Transport.send(message);

			//System.out.println("Sent message successfully....");

		} 
		catch (MessagingException e)
		{
			throw new RuntimeException(e);
		}
	}
}
