package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


public class JsonLoad {
	
	public static String jsonDataRead(String path,String searchArray,String searchKey,String searchValue) throws FileNotFoundException
	{
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		JSONTokener js = new JSONTokener(fi);
		JSONObject j = new JSONObject(js);
		System.out.println("JSON:-"+j.toString());
		
		JSONArray j1 = j.getJSONArray(searchArray);
		System.out.println("J1:-"+j1.getJSONObject(0));
		
		String r=null;
		 int l = j.length();
		 System.out.println("Length:-"+l);
		 
		 for(int i=0;i<=l;i++)
		 {
			 if(j1.getJSONObject(i).get(searchKey).equals(searchValue))
			 {
				 System.out.println("Value of I:-"+i);
				// System.out.println(searchValue);
				 r=j1.getJSONObject(i).get(searchKey).toString();
				 break;
			 }
		 }
		
		return r;
		
		
	}

}
