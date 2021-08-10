package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateSolution {
    private Map<Integer, List<Integer>> sumIndexes;

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,2};
        List<Integer>list=new ArrayList<>();
        list.contains
        int length=removeDuplicates(nums);
        System.out.println(length);
        Arrays.stream(nums).forEach(x-> System.out.print(x+" ,"));

        System.out.println();

    }
}
