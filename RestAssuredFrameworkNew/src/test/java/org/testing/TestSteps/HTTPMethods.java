package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
	 
	
	  Properties pr;
	  
	 public HTTPMethods(Properties pr)
	 { 
		 this.pr =pr; 
	 }
	 
	
	public Response postRequest(String body,String uri)  // Remove void from method use Response(Done in second class of API)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(uri));
		
        System.out.println("Status Code:-"+res.statusCode());
		
		System.out.println("Data:-"+res.asString());
		return res;
			
	}
	
	
	
	public Response getRequest(String endpoint,String geturi) // Done class second of API Class
	{
		String uri=pr.getProperty(geturi)+"/" + endpoint;
		System.out.println("URI is:-"+uri);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;
	}
	
	public Response deleteRequest(String endpoint, String deleteuri) // Done class third of API Class
	{
		String uri= pr.getProperty(deleteuri)+"/" + endpoint;
		System.out.println("Delete URI:-"+uri);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		
		return res;
	}
	
	public Response updateRequest(String body,String updateuri,String endpoint)  // Remove void from method use Response(Done in second class of API)
	{
		String uri=pr.getProperty(updateuri)+"/"+endpoint;
		System.out.println("Update URI;-"+uri);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.put(uri);
		
        System.out.println("Status Code:-"+res.statusCode());
		
		System.out.println("Data:-"+res.asString());
		return res;
			
	}
	

}
