package com.api.demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.modelmapper.ModelMapper;

 
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiConnector {

	private final String urlString= "https://reqres.in/api/users?page=2";
	
	public List<User> getJSONArray() {
   	 List<User> listaUsuarios = new ArrayList();
	 
 	
   	 ObjectMapper mapper = new ObjectMapper();
       try {
           URL url = new URL(urlString);
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
           conn.setRequestMethod("GET");
           conn.connect();

           //Check if connect is made
           int responseCode = conn.getResponseCode();

           if (responseCode != 200) {
               throw new RuntimeException("HttpResponseCode: " + responseCode);
           } else {

               StringBuilder informationString = new StringBuilder();
               Scanner scanner = new Scanner(url.openStream());                
               while (scanner.hasNext()) {
                   informationString.append(scanner.nextLine());
               }
               scanner.close();               
               JSONObject obj = new JSONObject(informationString.toString());
               JSONArray jsonArray = obj.getJSONArray("data");                
              
               if (jsonArray != null) {
               for (int i=0;i<jsonArray.length();i++){
               	listaUsuarios.add(mapper.readValue(jsonArray.get(i).toString(), User.class));                   
               }                
               } 
           }               
                return listaUsuarios;
           
       }catch (Exception e) {
           e.printStackTrace();
       }
       return null;
	}

}
