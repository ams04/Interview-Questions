package org.example.java8;

import java.util.HashMap;
import java.util.Map;

public class CompressionDecompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String compressed = compress("aaabbbbbbbbbb22222222222");
		
		System.out.println(compressed);
		String decompressed = decompress(compressed);
	}

	private static String decompress(String compressed) {

		String finalString = "";
		for (int i = 0; i < compressed.length(); i++) {

			int j = 0;
			char currentChar = compressed.charAt(i);

			int k = i + 1;
			int counter=0;
			do {
				k++;
				counter++;
			} while (compressed.charAt(k) != ',');

			int count = Integer.parseInt(compressed.substring(i+1, k));

			String temp = "";
			while (j < count) {
				temp += Character.toString(currentChar);
				j++;
			}
			finalString += temp;
			i += counter+1;
		}
		System.out.println(finalString);
		return null;
	}

	private static String compress(String string) {
		
		Map<Object, Integer> map = new HashMap<>();
		char[] str = string.toCharArray();
		
		for(int i=0;i<string.length();i++) {
			
		char currentChar = string.charAt(i);
		if(map.containsKey(currentChar)) {
			map.put(currentChar, map.get(currentChar)+1);
		}
		else
			map.put(currentChar, 1);
		}
		
		//map.forEach((a,b) -> System.out.println(a+":"+b));
	
		String compressed="";
		for(Map.Entry<Object, Integer> ab : map.entrySet()) {
			
			compressed += ab.getKey().toString()+ ab.getValue().toString()+",";
			
		}
		
		System.out.println(compressed);
		
		
		return compressed;
	}
	

}
