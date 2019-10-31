package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC4 {
	
	@Test
	public void tc4() throws IOException
	{
		Properties pr = PropertiesFileLoad.property_load();
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.deleteRequest(TC1.id, "QA_URI");
		ResponseValidation.responseStatusCodeValidation(res,200);
		
	}

}
