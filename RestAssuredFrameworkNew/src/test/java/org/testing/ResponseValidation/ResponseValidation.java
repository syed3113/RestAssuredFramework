package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidation {
	
	public static void responseStatusCodeValidation(Response res,int expectedStatusCode) //(Done in second class of API)
	{
		Assert.assertEquals(res.statusCode(),expectedStatusCode);
	}
	
public static void responseDataValidation(Response res,String expectedData,String path) // (Done in second class of API)
{
	String actual=res.jsonPath().get(path);
	
	System.out.println("Actual:-"+actual);
	
	Assert.assertEquals(actual, expectedData);
}
}
