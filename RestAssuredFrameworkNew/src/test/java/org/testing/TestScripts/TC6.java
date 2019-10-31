package org.testing.TestScripts;

import java.io.FileNotFoundException;

import org.testing.Utilities.JsonFetch;
import org.testng.annotations.Test;

public class TC6 {
	@Test
	public static void tc6() throws FileNotFoundException
	{
		 
		 JsonFetch.jsonFetchFromResponse("../RestAssuredFrameworkNew/data.json", "phoneNumbers", "type", "home", "deptt", "computer");
	}

}
