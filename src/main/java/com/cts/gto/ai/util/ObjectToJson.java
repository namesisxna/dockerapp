package com.cts.gto.ai.util;

import java.io.IOException;

import org.apache.commons.lang.StringEscapeUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

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
	
	public static JSONObject getJsonObject(String input){
		if(input.startsWith("\"") && input.endsWith("\"")){
			input.substring(1,input.length()-1);
		}
		String data=StringEscapeUtils.escapeJava(input);
	    data=data.replace(", ", ",");
	    data=StringEscapeUtils.unescapeJava(data);
	    System.out.println("JSONDATA----->"+data);
	    JSONObject Obj = null;
		try {
			Obj = new JSONObject(data);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Obj;
	}

}
