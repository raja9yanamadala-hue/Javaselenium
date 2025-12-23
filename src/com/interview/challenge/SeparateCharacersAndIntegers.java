package com.interview.challenge;

public class SeparateCharacersAndIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="gopal123dsfosp";
		
		StringBuilder sb1 = new StringBuilder();
		
		StringBuilder sb2 = new StringBuilder();
		
		char[] charray = str.toCharArray();
		
		for(char ch : charray)
		{
			
			if(Character.isDigit(ch))
			{
			   	sb1.append(ch);
			}
			
			else
			{
				sb2.append(ch);
			}
		}
		
		System.out.println("Digits->"+sb1);
		System.out.println("Alphabets->"+ sb2);

	}

}
