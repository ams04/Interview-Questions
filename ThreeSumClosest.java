package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int ab = threesum(nums,1);
		System.out.println(ab);


	}

	private static int threesum(int[] nums, int target) {
		
		int currentSum=10000;
		Arrays.sort(nums);
		for(int i=0;i< nums.length-2;i++) {
			int j= i+1;
			int k=nums.length-1;
			while(j<k) {
				int tempSum = nums[i] + nums[j] + nums[k];
				if(currentSum == 10000 || Math.abs(target - tempSum) < Math.abs(target-currentSum))
					currentSum = tempSum;
				if(tempSum>target) 
					k--;
				else
					j++;
				}
			}
		
		return currentSum;
	}

}
