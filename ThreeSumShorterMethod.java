package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSumShorterMethod {

	public static void main(String[] args) {

		int[] nums = { 5, -9, -11, 9, 9, -4, 14, 10, -11, 1, -13, 11, 10, 14, -3, -3, -4, 6, -15, 6, 6, -13, 7, -11,
				-15, 10, -8, 13, -14, -12, 12, 6, -6, 8, 0, 10, -11, -8, -2, -6, 8, 0, 12, 3, -9, -6, 8, 3, -15, 0, -6,
				-1, 3, 9, -5, -5, 4, 2, -15, -3, 5, 13, -11, 7, 6, -4, 2, 11, -5, 7, 12, -11, -15, 1, -1, -9, 10, -8, 1,
				2, 8, 11, -14, -4, -3, -12, -2, 8, 5, -1, -9, -4, -3, -13, -12, -12, -10, -3, 6, 1, 12, 3, -3, 12, 11,
				11, 10 };

		List<List<Integer>> ab = threesum(nums);
		// if (ab.size() != 0)
		// ab.stream().forEach(abc -> System.out.println(abc));
		// else
		// System.out.println("No match found!!");
		// System.out.println(ab.size());

	}

	private static List<List<Integer>> threesum(int[] nums) {

		Set<List<Integer>> list = new HashSet<>();
		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {

			int currentTarget = nums[i];

			List<List<Integer>> sets = otherTwo(currentTarget, nums, map, i);

			if (sets != null)
				list.addAll(sets);
		}

		list.forEach(a -> Collections.sort(a));
		// list.forEach(a->System.out.println(a));

		Set<List<Integer>> set = new LinkedHashSet<>(list);
		set.forEach(a -> System.out.println(a));
		System.out.println(set.size());

		List<List<Integer>> acb = new ArrayList<>();
		acb.addAll(list);

		return acb;
	}

	private static List<List<Integer>> otherTwo(int currentTarget, int[] nums, Map<Integer, Integer> map, int j) {

		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {

			if (i == j)
				continue;
			int complement = (currentTarget * -1) - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i && map.get(complement) != j) {
				List<Integer> l = new ArrayList<>();

				l.add(currentTarget);
				l.add(nums[i]);
				l.add(complement);
				Collections.sort(l);
				if (!list.contains(l))
					list.add(l);

			}
		}

		return list;
	}

}
