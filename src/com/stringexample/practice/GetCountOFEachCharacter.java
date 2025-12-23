package com.stringexample.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetCountOFEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Programing";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch :str.toCharArray())
		{
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		

	}

}
