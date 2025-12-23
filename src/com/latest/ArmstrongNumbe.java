package com.latest;

public class ArmstrongNumbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num =153;
		
		int orgnum = num;
		
		int sum=0;
		
		int rem;
		
		
		while(num>0)
		{
			
			rem = num%10;
			sum = sum + rem * rem * rem;
			num = num/10;
		}
		
		if(sum==orgnum)
		{
		System.out.println("given num is amrm");
		}
		else
		{
			System.out.println("given num is not amrm");
		}
	}

}
