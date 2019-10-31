package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC1 {
	
	static String id=null; //(Done in second class of API)
	
	@Test
	public void tc1() throws IOException
	{
		
		JSONObject js = new JSONObject();
		js.put("fname","Syed");
		js.put("lname","Ali");
		js.put("id","21");
		System.out.println(js.toString());
		Properties pr=PropertiesFileLoad.property_load();
		HTTPMethods http = new HTTPMethods(pr);
	Response res=	http.postRequest(js.toString(),"QA_URI");  // Response =res (Done in second class of API)
	
	ResponseValidation.responseStatusCodeValidation(res, 201); // Response =res (Done in second class of API)
	
	ResponseValidation.responseDataValidation(res, "Syed", "fname");
	
	id = res.jsonPath().get("id");  // (Done in second class of API)
	
	System.out.println("Id:-"+id);
		
	}
	
	
	
	

}
