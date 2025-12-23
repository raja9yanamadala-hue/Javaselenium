package com.latest;

import java.util.HashSet;
import java.util.Set;

public class RemoreDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arry[] = {1,3,4,6,1,3};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int n: arry)
		{
			
			set.add(n);
			
		}
		
		System.out.println(set);
 
	}

}
