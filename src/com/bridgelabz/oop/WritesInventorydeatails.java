package com.bridgelabz.oop;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.Model.InventoryDetails;
import com.bridgelabz.oops.Model.Pulses;
import com.bridgelabz.oops.Model.Rice;
import com.bridgelabz.oops.Model.Wheat;
import com.bridgelabz.utility.JsonUtility;
 

public class WritesInventorydeatails 
{
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		 
		  
		    Scanner scanner=new  Scanner(System.in);
			InventoryDetails details = new InventoryDetails();
			String pathOfTransaction = "/home/admin-1/eclipse-workspace/oop/src/com/bridgelabz/json/inventory.json";
	      
	        List<Rice> listofRice = new ArrayList<Rice>(); 
	        List<Pulses> listofpulses = new ArrayList<Pulses>();
	        List<Wheat> listofwheat = new ArrayList<Wheat>();
	        
	        File file = new File(pathOfTransaction);
	        
			
			Rice rice1 = new Rice();
			
				if (file.length() != 0) {
					details = (InventoryDetails) JsonUtility.readMapper(pathOfTransaction, details);
				}
				
				if(file.length() != 0) {
					
				if (!details.getRice().isEmpty()) {
					listofRice.addAll(details.getRice());
				}
				if (!details.getPulses().isEmpty()) {
					listofpulses.addAll(details.getPulses());
				}
				if (!details.getWheat().isEmpty()) {
					listofwheat.addAll(details.getWheat());
				}
				}
				System.out.println("--------Enter rice details----");
				System.out.println("Enter rice name : ");
				String name =scanner.nextLine();
				rice1.setName(name);
				
				System.out.println("Enter rice price : ");
				int price =scanner.nextInt();
				rice1.setPrice(price);;
				
				System.out.println("Enter rice weight : ");
				int weight =scanner.nextInt();
				rice1.setWeight(weight);
				
				listofRice.add(rice1);
				
			
				
				List<Pulses> listofPulses = new ArrayList<Pulses>(); 
				Pulses pulses = new Pulses();
			
				System.out.println("--------Enter pulses details----");
				System.out.println("Enter pulses name : ");
			    name =scanner.next();
				pulses.setName(name);
				
				System.out.println("Enter pulses price : ");
			    price = scanner.nextInt();
				pulses.setPrice(price);;
				
				System.out.println("Enter pulses weight : ");
				 weight = scanner.nextInt();
				pulses.setWeight(weight);
			 	
				listofPulses.add(pulses);
			     
				
				
		

		        System.out.println("how much list enter : ");
				int number = scanner.nextInt();
				
			List<Wheat> listofWheat = new ArrayList<Wheat>(); 
			Wheat wheat = new Wheat();
			for(int index=0;index<number;index++) 
			{
				wheat= new Wheat();
				System.out.println("--------Enter Wheat details----");
				System.out.println("Enter wheat name : ");
				 name = scanner.next();
				wheat.setName(name);
				
				System.out.println("Enter wheat price : ");
				 price = scanner.nextInt();
				wheat.setPrice(price);;
				
				System.out.println("Enter wheat weight : ");
			    weight = scanner.nextInt();
				wheat.setWeight(weight);
				
				listofWheat.add(wheat);
			
			
			details.setRice(listofRice);
			details.setPulses(listofPulses);
			details.setWheat(listofWheat);
			details.setInventory("list");
			JsonUtility.writeMapper(pathOfTransaction, details);
			System.out.println("inserting..!!!");
		}
	}
}
