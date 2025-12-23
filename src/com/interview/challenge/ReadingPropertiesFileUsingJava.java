package com.interview.challenge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ReadingPropertiesFileUsingJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream finp = new FileInputStream("D:\\intprop.properties");
			
			Properties pro = new Properties();
			
			pro.load(finp);
			
			HashMap<String,String> map = new HashMap<String,String>();
			for(String str:pro.stringPropertyNames())
			{
				
				String value=pro.getProperty("uname");
				String pass = pro.getProperty("password");
				map.put(value,pass);
				
			}
			
			System.out.println(map);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Actual Properties file is not available in resource , please assign a proper file ");
			e.printStackTrace();
		}
		
		finally
		{
			
			// need to close any connections like open files
		}

	}

}
