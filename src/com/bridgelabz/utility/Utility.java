package com.bridgelabz.utility;
import java.util.*;

public class Utility 
{
	
	 /**
     * purpose : create function to Accept the String values from user
     * 
     * @return : value return String value
     */
	 public static Scanner scanner=new Scanner(System.in);
	 

	    public static int IntInput() 
	    {
	      int value = scanner.nextInt();
		return value;
		}

    
    public static String StringInput() 
    {
    	String value = scanner.next();
    	return value;
    }
    
    /**
     * purpose : create function to Accept the String values from user
     * 
     * @return : value return String value
     */
    
    public static String scanStringLine() {
    	String value = scanner.nextLine();
    	return value;
    }
}
