package com.stringexample.practice;

import java.util.HashSet;
import java.util.Set;

public class PermutationAndCombinations {
	

	    public static Set<String> getPermutations(String str) {
	        Set<String> permutations = new HashSet<>(); // Use a set to avoid duplicates

	        // Base case: If the string is empty, return a set with an empty string
	        if (str == null) {
	            return null;
	        } else if (str.length() == 0) {
	            permutations.add("");
	            return permutations;
	        }

	        char firstChar = str.charAt(0); // Get the first character
	        String remainingStr = str.substring(1); // Get the remaining substring

	        Set<String> words = getPermutations(remainingStr); // Recursive call

	        for (String word : words) {
	            for (int i = 0; i <= word.length(); i++) {
	                // Insert the first character at different positions
	                permutations.add(word.substring(0, i) + firstChar + word.substring(i));
	            }
	        }

	        return permutations;
	    }

	    public static void main(String[] args) {
	        String str = "ABC";
	        System.out.println("Permutations of " + str + ": " + getPermutations(str));
	    }
	}



