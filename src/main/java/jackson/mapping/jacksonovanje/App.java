package jackson.mapping.jacksonovanje;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	ObjectMapper mapper = new ObjectMapper();
    	String jsonString = "{\"name\":\"Mahesh Kumar\",\"age\":21,\"verified\":false,\"marks\": [100,90,85]}";
    	
		JsonNode rootNode = mapper.readTree(jsonString);

    	
    	JsonNode nameNode = rootNode.path("name");
    	System.out.println("Name: "+ nameNode);

    	JsonNode marksNode = rootNode.path("marks");
        Iterator<JsonNode> iterator = marksNode.iterator();
        
        System.out.print("Marks: [ ");
		
        while (iterator.hasNext()) {
           JsonNode marks = iterator.next();
           System.out.print(marks.asText()); 
        }
			
        System.out.println("]");
     

    	//Iterator iterator = marksNode.iterator();

    }
}
