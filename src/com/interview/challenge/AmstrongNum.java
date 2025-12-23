package com.interview.challenge;

public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =153;
		int originalnum =num;
		int rem;
		int sum = 0;
		
		while(num>0)
		{
			
			rem= num%10;
			
			sum = sum + rem*rem*rem;
			
			num=num/10;
		}
		
		if (sum==originalnum)
		{
			System.out.println("given number is amstrong ");
			
		}
		else
		{
			System.out.println("given num is not a amstrong");
		}

	}

}
