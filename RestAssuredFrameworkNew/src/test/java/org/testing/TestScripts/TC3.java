package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3 {
	 @Test
	public void tc3() throws IOException
	{
		JSONObject js = new JSONObject();
		js.put("fname","Ahtisham");
		js.put("lname","Ali");
		js.put("id","16");
		System.out.println(js.toString());
		
		Properties pr = PropertiesFileLoad.property_load();
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.updateRequest(js.toString(), "QA_URI",TC1.id);
		ResponseValidation.responseStatusCodeValidation(res, 200);
		ResponseValidation.responseDataValidation(res,"Ahtisham","fname");
		
	}

}
