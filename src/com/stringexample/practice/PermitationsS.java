package com.stringexample.practice;

import java.util.ArrayList;

public class PermitationsS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		
		ArrayList perm = new ArrayList();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				for(int k=0;k<str.length();k++)
				{
					
					perm.add(""+str.charAt(i)+""+str.charAt(j)+""+str.charAt(k));
				}
			}
		}
		
		System.out.println(perm);

	}

}
