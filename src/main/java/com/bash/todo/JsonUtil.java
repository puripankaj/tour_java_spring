/**
 * 
 */
package com.bash.todo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author purip
 *
 */
public class JsonUtil {
	
	public static String convertJavaToJson(Object o) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(o);
		return jsonString;
	}
	
	public static Object convertJsonToJava(String jsonString, Class c) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Object object = mapper.readValue(jsonString, c);
		return object;
		
	}

}
