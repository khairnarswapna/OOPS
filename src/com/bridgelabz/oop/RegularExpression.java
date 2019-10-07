package com.bridgelabz.oop;

import com.bridgelabz.utility.Utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
 

public class RegularExpression {
	public static void main(String[] args) {
		String str = "Hello <<name>>, We have your full\n"
				+ "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		//System.out.println(str);
		String pattern = "[a-zA-Z]+";//string pattern for 
		System.out.println("Enter the name of ");
	 
	    String name=Utility.StringInput();
	
	
		System.out.println("Enter your fullname:-");
		String fullname = Utility.StringInput();
		Pattern r = Pattern.compile(pattern);
		if (Pattern.matches(pattern, name)) {
			str= str.replaceAll("<<name>>", name);
			str = str.replaceAll("<<full name>>", fullname);
		}
		System.out.println("Please Enter your Mobile Numbers");
		String numbers = Utility.StringInput();
		if (Pattern.matches("[789][0-9]{9}", numbers)) 
		{
			str = str.replaceAll("x{10}", numbers);
		}
	  String pattern1 = "MM/dd/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern1);
       java.util.Date today = Calendar.getInstance().getTime();        
	    String todayAsString = df.format(today);

		// Print it!
		System.out.println("Today is: " + todayAsString);
         
			str = str.replaceAll("01/01/2016", todayAsString);
			
			
		System.out.println("===================================");
		System.out.println(str);
		 
	}

}
