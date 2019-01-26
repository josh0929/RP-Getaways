/*
 * 
 * Description:
 * 
 * 
 * @author Joshua Suarez
 * 
 * Course: COP3337 Computer Programming II
 * and open the template in the editor.
 * Instructor: Greg Shaw
 * File name:
 * Assignment: 
 * Panther ID: 6041323
 */
package main;

import java.util.Date;

/**
 *
 * @author Josh0
 */
public class test
{
	public static void main(String [] args)
	{
//		String message = "Hello this is a test message";
//		String from = "joshua0@gmail.com";
//		
//		EmailSender email = new EmailSender(from, message);
		
		Date start = new Date(2019, 1, 10);
		Date end = new Date(2019, 1, 31);
		
		long totalMs = end.getTime() - start.getTime();
		int totalDays = ((((((int)totalMs)/1000)/60)/60)/24);
		
		System.out.println(totalDays);
		System.out.println(totalMs);
	}
}
