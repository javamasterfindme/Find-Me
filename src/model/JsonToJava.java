package model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class JsonToJava {
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		JsonToJava converter = new JsonToJava();
		String jsonInString = "{\"nom\":\"Amar\",\"pseudo\":\"Jose\",\"civilite\": \"HOMME\",\"compatibilite\":75}";
		converter.conversion(jsonInString);
	}
	
	
	public Object conversion(String json) throws JsonParseException, JsonMappingException, IOException{
			User user1 = new ObjectMapper().readValue(json, User.class);
			System.out.println(user1);
			return user1;		

	}
}