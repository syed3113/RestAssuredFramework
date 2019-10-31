package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2 {
	@Test
	public void tc2() throws IOException  // (Done in Second class of API)
	{
		Properties pr = PropertiesFileLoad.property_load();
		HTTPMethods http = new HTTPMethods(pr);
		Response res =http.getRequest(TC1.id,"QA_URI");
		System.out.println("TC.ID:-"+TC1.id);
		System.out.println("***************************");
		System.out.println("Get Request:-"+res.asString());
		ResponseValidation.responseStatusCodeValidation(res,200);
		
	}

}
