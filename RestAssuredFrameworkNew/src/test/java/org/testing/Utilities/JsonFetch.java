package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class JsonFetch {
	@Test
	public static void jsonFetchFromResponse(String path,String searchArray,String searchKey,String searchValue,String type,String typeValue) throws FileNotFoundException
	{
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		JSONTokener j = new JSONTokener(fi);
		JSONObject js = new JSONObject(j);
		System.out.println(js.toString());
	
		JSONArray j1 = js.getJSONArray(searchArray);
		System.out.println(j1.toString());
		
		JSONObject j2 = j1.getJSONObject(0);
		System.out.println(j2.toString());
		
		int l = js.length();
		System.out.println("Length:-"+l);
		
		for(int i=0;i<l;i++)
		{
			if(j1.getJSONObject(i).get(searchKey).equals(searchValue))
			{
				System.out.println(searchValue);
				j1.getJSONObject(i).put(type,typeValue);
				System.out.println(js.toString());
				break;
				
			}
		}
		System.out.println("JSON:-"+js.toString());
		
	}

}
