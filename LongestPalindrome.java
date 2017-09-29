package org.example.java8;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String longest = longestPalindrome("jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel");
		System.out.println(longest);
		
	}
	
	
	public static String longestPalindrome(String s) {
		
		String largestpalindromicsubstring="";
		String reversed = new StringBuffer(s).reverse().toString();
		int start=0,end=0;
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j <= s.length(); j++) {

				String currentSubstring = s.substring(i, j);

				if (reversed.contains(currentSubstring)) {
					if (currentSubstring.length() > largestpalindromicsubstring.length()) {
						if (checkReal(currentSubstring)) {
							largestpalindromicsubstring = currentSubstring;
							start = i;
							end = j - 1;
						}
					}

				}
			}
		}

		String originalSubstring = s.substring(start,end+1);
		
		boolean isPalindrome = true;
		int i=0;
		int k=largestpalindromicsubstring.length()-1;
		
		while(i<originalSubstring.length() && k >=0)
		{
			if(originalSubstring.charAt(i) == largestpalindromicsubstring.charAt(k)){
				i++;
				k--;
				continue;
			}
			
			else{
				isPalindrome=false;
				break;
			}
		}
		
		
		
		System.out.println("Original substring:" +originalSubstring +" & " + "Reversed Palindromic: " +largestpalindromicsubstring);
		return largestpalindromicsubstring;
	}


	private static boolean checkReal(String currentSubstring) {
		
		boolean check=true;
		int i=0;
		int k=currentSubstring.length()-1;
		while(i<currentSubstring.length() && k>=0) {
			 if(currentSubstring.charAt(i) == currentSubstring.charAt(k)) {
				 i++;
				 k--;
			}
			 else {
				 check=false;
				 break;
			 }
		}
		
		return check;
	}
	}