package org.testing.TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testing.Utilities.VariableReplacement;

public class TC7 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("../RestAssuredFrameworkNew/body1.json");
		FileInputStream fi = new FileInputStream(f);
		JSONTokener js = new JSONTokener(fi);
		JSONObject j = new JSONObject(js);
		System.out.println(j.toString());
		//VariableReplacement.var_replace(j.toString(), "id", "1");
		
		String body = VariableReplacement.multivar_replace(j.toString(),"id", "2");
		body = VariableReplacement.multivar_replace(body, "firstname","Ahtisham");
		body =VariableReplacement.multivar_replace(body, "lastname", "Ali");
		System.out.println(body);
		
	}

}
