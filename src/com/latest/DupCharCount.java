package com.latest;

import java.util.HashMap;
import java.util.Map;

public class DupCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "programing";
		
		char[] chars = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
		
		for(char ch : chars)
		{
			
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			
			if(entry.getValue()>1)
			{
				
				 System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
			}
		
			
		}

	}

}
