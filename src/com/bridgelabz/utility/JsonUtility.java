package com.bridgelabz.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class JsonUtility {

 private static ObjectMapper mapper;
     
     static {
    	 mapper = new ObjectMapper();
     }
     
     public static String convertJavaToJson(Object object) {
    	 String jsonResult="";
    	 
    	 try {
			jsonResult = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return jsonResult;
     }
     
     public static <T> T convertJsonToJava(String jsonPath ,Class<T> cls)
     { {
    	 T readResult=null;
    	 try {
    	 readResult = mapper.readValue(jsonPath, cls);
    	 }catch (JsonParseException e) {
			// TODO: handle exception
		}catch (JsonMappingException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
        
    	 return readResult;
     }
     }
     public static<T>T WriteVlueFile(String jsonPath,Object person){
    	 {
    		 ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
    		 
        	 T readResult=null;
        	 try {
            writer.writeValue(new File(jsonPath), person);
        	 }catch (JsonParseException e) {
    			// TODO: handle exception
    		}catch (JsonMappingException e) {
    			// TODO: handle exception
    		}catch (IOException e) {
    			// TODO: handle exception
    		}  
        	 return readResult;
         }
     }
     
     public static Object readMapper(String path, Object object)throws JsonParseException, JsonMappingException, IOException {
 		return mapper.readValue(new File(path), object.getClass());

 	}
     public static String writeMapper(String path, Object object)
 			throws JsonParseException, JsonMappingException, IOException {
 		mapper.writeValue(new File(path), object);
 		
 		return "Success writing into file";

 	}
     
   
     
   /*  public static <T> void prettyPrint(File file,List<Stock> stockList) throws JsonGenerationException, JsonMappingException, IOException
 	{
 		ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
 		writer.writeValue((file), stockList);
 	}*/
     
}
