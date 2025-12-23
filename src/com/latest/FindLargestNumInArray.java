package com.latest;

public class FindLargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arry[] = {1,3,45,6};
		
		
		int max = arry[0];
		int min = arry[0];
		
		for (int n : arry)
		{
			
			if(n>max)
			{
				
				max= n;
			}
			
			if (n<min);
			{
				
				min = n;
			}
			
		}
		
		System.out.println(max);
		System.out.println(min);

	}

}
