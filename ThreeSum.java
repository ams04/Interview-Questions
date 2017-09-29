package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	public static void main(String a[]) {
		int[] nums = { 5, -9, -11, 9, 9, -4, 14, 10, -11, 1, -13, 11, 10, 14, -3, -3, -4, 6, -15, 6, 6, -13, 7, -11,
				-15, 10, -8, 13, -14, -12, 12, 6, -6, 8, 0, 10, -11, -8, -2, -6, 8, 0, 12, 3, -9, -6, 8, 3, -15, 0, -6,
				-1, 3, 9, -5, -5, 4, 2, -15, -3, 5, 13, -11, 7, 6, -4, 2, 11, -5, 7, 12, -11, -15, 1, -1, -9, 10, -8, 1,
				2, 8, 11, -14, -4, -3, -12, -2, 8, 5, -1, -9, -4, -3, -13, -12, -12, -10, -3, 6, 1, 12, 3, -3, 12, 11,
				11, 10 };

		List<List<Integer>> ab = twosum(nums);
		if (ab.size() != 0)
			ab.stream().forEach(abc -> System.out.println(abc));
		else
			System.out.println("No match found!!");
		System.out.println(ab.size());
	}

	private static List<List<Integer>> twosum(int[] nums) {

		List<List<Integer>> list = new ArrayList();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;
				else {
					for (int k = 0; k < nums.length; k++) {
						if (i == k || j == k)
							continue;
						else {
							int sum = nums[i] + nums[j] + nums[k];
							if (sum == 0) {
								List<Integer> numbers = new ArrayList();
								numbers.add(nums[i]);
								numbers.add(nums[j]);
								numbers.add(nums[k]);
								if (list.size() == 0)
									list.add(numbers);
								else {
									List<List<Integer>> al = new ArrayList(list);
									boolean flag = true;

									for (List<Integer> s : al) {

										List<Integer> temp = new ArrayList<>();
										temp.add(nums[i]);
										temp.add(nums[j]);
										temp.add(nums[k]);

										Collections.sort(s);
										Collections.sort(temp);
										if (s.equals(temp)) {
											flag = false;
											break;
										}

									}

									if (flag)

										list.add(numbers);
								}
							} else
								continue;

						}

					}

				}

			}
		}

		if (list.size() != 0)
			return list;
		else
			return new ArrayList<>();
	}

}
