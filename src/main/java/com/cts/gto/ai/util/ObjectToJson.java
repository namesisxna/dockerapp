package com.cts.gto.ai.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectToJson {
	public static String getJsonString(Object o) {
		String jsonInString = "";
		ObjectMapper mapper = new ObjectMapper();

		try {
			jsonInString = mapper.writeValueAsString(o);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(o);
			// System.out.println(jsonInString);
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
		return jsonInString;

	}

}
