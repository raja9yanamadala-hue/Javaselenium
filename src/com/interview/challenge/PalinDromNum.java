package com.interview.challenge;

public class PalinDromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num = 121;
	        int originalNum = num; // Store original number for comparison
	        int rem, rev = 0;

	        while (num > 0) {
	            rem = num % 10;
	            rev = rev * 10 + rem;
	            num /= 10;
	        }

	        if (originalNum == rev) { // Compare original number with reversed number
	            System.out.println(originalNum + " is a palindrome.");
	        } else {
	            System.out.println(originalNum + " is not a palindrome.");
	        }
	}

}
