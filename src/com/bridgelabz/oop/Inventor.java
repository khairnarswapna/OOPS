package com.bridgelabz.oop;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.oops.Model.InventoryDetails;
import com.bridgelabz.utility.JsonUtility;

public class Inventor {

	public static void main(String[] args)throws IOException, IOException 
	{
	{
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		InventoryDetails details = new InventoryDetails();
		String path = "/home/admin-1/eclipse-workspace/oop/src/com/bridgelabz/json/inventory.json";
       
        InventoryDetails listOfDetails = (InventoryDetails) JsonUtility.readMapper(path, details);
	    
	    int total = 0 ,total1=0;
	    int choice;
	   
	    do
	    {
	    	System.out.println("Inventory Managements");
			System.out.println("1.Rice\n2.Pules\n3.Wheat\n4.Exit");
			System.out.println("Enter your choice");
			choice =scanner.nextInt(); 
			
			switch (choice) {
			case 1 :
		
				 total=0;
				    System.out.println("Rice information : ");
				    
				    for(int i=0;i<listOfDetails.getRice().size();i++) 
				    {
				    	String name = listOfDetails.getRice().get(i).getName();
				    	System.out.println("Name :"+name);
				    	int price = listOfDetails.getRice().get(i).getPrice();
				    	System.out.println("price : "+price);
				    	int weight = listOfDetails.getRice().get(i).getWeight();
				    	System.out.println("weight : "+weight);
				    	System.out.println("Total PRICE = "+(price*weight));
				    	total =total+(price*weight);
				    	System.out.println();
				    }
				    System.out.println("Total price of All Rice:"+total);
				    total1=total1+total;
				    System.out.println();

				      break;
			case 2:
				total=0;
				    System.out.println("Pulses information : ");
				    for(int i=0;i<listOfDetails.getPulses().size();i++) {
				    	String name = listOfDetails.getPulses().get(i).getName();
				    	System.out.println("name :"+name);
				    	int price = listOfDetails.getPulses().get(i).getPrice();
				    	System.out.println("price : "+price);
				    	int weight = listOfDetails.getPulses().get(i).getWeight();
				    	System.out.println("weight : "+weight);
				    	System.out.println("TOTAL PULSES = "+(price*weight));
				    	total =total+(price*weight);
				    	System.out.println();
				    }
				    System.out.println("Total price of All :"+total);
				    total1=total1+total;
				    System.out.println();
				    break;
			case 3:
				total=0;
				System.out.println("Wheat information : ");
			    for(int i=0;i<listOfDetails.getWheat().size();i++) {
			    	String name = listOfDetails.getWheat().get(i).getName();
			    	System.out.println("name :"+name);
			    	int price = listOfDetails.getWheat().get(i).getPrice();
			    	System.out.println("price : "+price);
			    	int weight = listOfDetails.getWheat().get(i).getWeight();
			    	System.out.println("weight : "+weight);
			    	System.out.println("TOTAL PRICE = "+(price*weight));
			    	total =total+(price*weight);
			    	System.out.println();
			    }
			    System.out.println("Total price of All Rice:"+total);
			    total1=total1+total;
			    System.out.println();
			    break;
			case 4:
				 System.out.println("Exit : ");
				 
				  System.out.println("All Inventory price : "+total1);
				 break;
			default:
				System.out.println("wrong choice : ");
				break;
			}
	    }while(choice!=5);
	    
	  
	}

	}
	 
}
