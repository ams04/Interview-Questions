package org.example.java8;

public class RemoveAllOccuranceOfAnElemenetFromArray {

	public static void main(String[] args) {
		
		int [] ars = {3,2,2,3,2};
		int length  =  removeElement(ars, 3);
//		System.out.println(ars.length);
		System.out.println(length);

	}
	
	public static int removeElement(int[] nums, int val) {

		int counter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val){
				nums[counter] = nums[i];
				counter++;
			}
		}

        System.out.println(nums.length - counter);
		return counter;
	}

}
