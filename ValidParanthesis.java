package org.example.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		
		boolean val = isValid("{}}");
		System.out.println(val);

	}

	 public static boolean isValid(String s) {
	        
		 Stack<Character> stack = new Stack();
		 Map<Character,Character> map = new HashMap<>();
		 
		 	map.put('(', ')');
			map.put('[', ']');
			map.put('{', '}');
		 
		 for(int i=0;i<s.length();i++) {
			 if(map.keySet().contains(s.charAt(i))) {
				 stack.push(s.charAt(i));
			 }
			 else if(map.values().contains(s.charAt(i))) {
				 if(!stack.isEmpty() && map.get(stack.peek()) == s.charAt(i) ) {
					 stack.pop();
				 }
				 else
					 return false;
				 
			 }
		 }
		 
		 if(stack.isEmpty())
			 return true;
		 return false;
	    }
}
