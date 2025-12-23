package com.stringexample.practice;

public class EachWordRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "raja gopal amp";
		
		String rev ="";
		String revWord =" ";
		
		String[] word = str.split(" ");
		
		for(int i=0;i<word.length;i++){
			
			String one = word[i];
			
			for( int j=one.length()-1;j>=0;j--)
			{
				
				 revWord+= one.charAt(j);	 
			}
			
			revWord= revWord+" " ;
			
		}
		
		rev+= revWord ;
		System.out.println(rev);

	}

}



