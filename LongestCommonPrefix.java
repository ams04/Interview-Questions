package org.example.java8;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] arr = {"c","acc","ccc"};
		String temp = longestCommonPrefix(arr);

		System.out.println(temp);

	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs.length > 0) {
			String current = strs[0];
			for (int i = 1; i < strs.length; i++) {

				while (!strs[i].startsWith(current)) {

					current = current.substring(0, current.length() - 1);
				}
			}

			return current;
		}

		else
			return "";
	}
}
