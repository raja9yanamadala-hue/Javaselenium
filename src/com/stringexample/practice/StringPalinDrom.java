package com.stringexample.practice;

public class StringPalinDrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "lol";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			 rev = rev + str.charAt(i);
			 
		}
		
		System.out.println(rev);
		
		if(rev.equals(str))
		{
			System.out.println("String is amstorng...");
			
		}
		else
		{
			System.out.println("String is not a storng...");
		}
		

	}

}
