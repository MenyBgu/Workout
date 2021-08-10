package com.company2;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int index = 0;
        for (int x : nums) {
            hm.put(x, index++);
        }
        for (int i = 0; i < hm.size(); i++) {
            int temp = target - nums[i];
            if (hm.containsKey(temp) && i != hm.get(temp)) {
                return new int[]{i, hm.get(temp)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] x = twoSum(new int[]{ 2, 7, 11, 15 }, 9);
        Arrays.stream(x).forEach(y -> System.out.print(y + ","));
    }
}
