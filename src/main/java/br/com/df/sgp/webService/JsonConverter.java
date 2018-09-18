package br.com.df.sgp.webService;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonConverter {

	
	 private final Gson gson;
	    
	    public JsonConverter() {
	        
	        gson = new GsonBuilder().create();
	    }

	    public String convertToJson(List<String> candidatos) {
	        
	        JsonArray jarray = gson.toJsonTree(candidatos).getAsJsonArray();
	        JsonObject jsonObject = new JsonObject();
	        jsonObject.add("dados", jarray);
	        return jsonObject.toString();
	    }
}
