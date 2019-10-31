package org.testing.TestScripts;

import java.io.IOException;



import org.testing.Utilities.JsonLoad;

import org.testng.annotations.Test;

public class TC5 {
	@Test
	public void tc5() throws IOException
	{
		/*
		 * Properties pr = PropertiesFileLoad.property_load(); HTTPMethods http = new
		 * HTTPMethods(pr);
		 */
		
		
		String value=JsonLoad.jsonDataRead("../RestAssuredFrameworkNew/data.json", "phoneNumbers", "type","iPhone");
		System.out.println(value);
		
	}

}
