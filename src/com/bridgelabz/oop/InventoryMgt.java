package com.bridgelabz.oop;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryMgt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Path="/home/admin-1/eclipse-workspace/oop/src/com/bridgelabz/json/inventory.json";
		File file=new File(Path);
		
		
		//Getting input of Inventory 
		ObjectMapper mapper=new ObjectMapper();
		try {
			JsonNode rootNode=mapper.readTree(file);
			System.out.println("Enter the Iventory:-");
			String Iventory=sc.next();
			JsonNode inventory=rootNode.get(Iventory);
		 
			
			for(JsonNode node:inventory)
			{
			 
				String name=node.path("name").asText();
				int price=node.path("price").asInt();
				int weight=node.path("weight").asInt();
				
				System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
				System.out.println("total: "+price*weight+"\n");
			}

		}
		catch (IOException e) 
		{
			System.out.println(""+e.getMessage());		
			e.printStackTrace();
		}
	
}
}
