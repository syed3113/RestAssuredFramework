package org.testing.Utilities;

import java.util.regex.Pattern;

public class VariableReplacement {
	
	public static void var_replace(String body,String variablename,String variablevalue)
	{
		body=body.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);
		System.out.println(body);
	}

	
	public static String multivar_replace(String body,String variablename,String variablevalue)
	{
		body=body.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);
		return body;
	}
}
