package org.example.java8;

import java.util.InputMismatchException;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int reversedInteger = reverse(964351);
		System.out.println(reversedInteger);
		
	}

	public static int reverse(int x) {

	    long reverse = 0;
	    while( x != 0 ) {
	       reverse = reverse * 10 + x % 10;
	       x = x/10;
	    }

	    if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
	        return 0;
	    } else {
	        return (int) reverse;
	    }
		       }

}
