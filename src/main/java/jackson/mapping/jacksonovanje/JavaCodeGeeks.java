package jackson.mapping.jacksonovanje;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

public class JavaCodeGeeks {

	private static final String jsonFilePath = "C:\\Users\\nikita\\Desktop\\json.json";

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		JavaMapping javaClass = null;

		try {

			FileReader fileReader = new FileReader(jsonFilePath);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			JsonNode rootNode = mapper.readTree(bufferedReader);

			JsonNode mapingNode = rootNode.path("glossary").path("GlossDiv").path("GlossList").path("GlossEntry");

			JsonNode domainNode = rootNode.path("glossary").path("GlossDiv").path("GlossList").path("GlossEntry")
					.path("GlossDef").get("GlossSeeAlso");

			for (JsonNode node : domainNode) {
				System.out.println("        " + node.asText());
			}

			javaClass = mapper.readValue(mapingNode, JavaMapping.class);
			System.out.println(javaClass.getSortAs() +
							   "_ ___ ____  __ __"	+
								javaClass.getAbbrev()+
								javaClass.getId() + javaClass.getGlossTerm());
		}

		catch (JsonGenerationException e) {

			e.printStackTrace();

		} catch (JsonMappingException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}