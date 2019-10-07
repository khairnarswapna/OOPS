package com.bridgelabz.oop;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String Path="/home/admin-1/eclipse-workspace/oop/src/com/bridgelabz/json/stock.json";
		 
		File file=new File(Path);
		ObjectMapper mapper=new ObjectMapper();
		try {
			//creating tree of properties
			JsonNode rootNode=mapper.readTree(file); 
			JsonNode stock=rootNode.get("Stock");
			//creating the node for sub properties
			System.out.println("***Stocks***");
			for(JsonNode node:stock) 
			{
				  
				String name=node.path("Stock_Name").asText();
				int  share=node.path("Number_of_shares").asInt();
				int price=node.path("Share_Prize").asInt();
//				int price=node.path("Share_Prize").asInt();

				System.out.println("Name:"+name+"\nPrice: "+price+"\nShare: "+share);
				System.out.println("Total: "+price*share+" Rs"+"\n");	
			}
		}catch(IOException e) {
			System.out.println(" "+e.getMessage());
			e.printStackTrace();
		}
		

	}
}
