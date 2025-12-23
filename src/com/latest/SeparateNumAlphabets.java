package com.latest;

public class SeparateNumAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ghdjgd121csd";
		
		char[] chars = str.toCharArray();
		
		StringBuilder num = new StringBuilder();
		StringBuilder alp = new StringBuilder();
		
		
		for(char ch : chars)
		{
			
			if(Character.isAlphabetic(ch))
			{
				alp.append(ch);
				
			}
			else
			{
				num.append(ch);
			}
			
		}

	}

}
