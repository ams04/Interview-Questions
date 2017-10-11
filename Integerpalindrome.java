package org.example.java8;

public class Integerpalindrome {

	public static void main(String[] args) {
		
		boolean isPalindrome = checkPalindrome(-2147447412);
		System.out.println(isPalindrome);

	}

	private static boolean checkPalindrome(int i) {
		
		Long reverse=0l;
		Long l = new Long(i);
		
		while(i!=0) {
			reverse = reverse*10 + i%10;
			i=i/10;
		}
		
		System.out.println(reverse);
		System.out.println(l);
	
		if (l.compareTo(reverse) == 0)
			return true;

		return false;
	}

}
