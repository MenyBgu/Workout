package com.company;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int counter = nums.length;
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            for (int j = i; j < nums.length - 1; j++) {
                if ((!flag) && temp == nums[j + 1] && temp!=-1000) {
                    flag = true;
                }
                if (flag) {
                    nums[j] = nums[j + 1];
                }
            }
            if (flag) {
                nums[counter-1] = -1000;
                counter--;
                i -= 1;
            }
            flag = false;
        }
        return counter;
    }


    public static void main(String[] args) {
        int nums[]={1,1,2,2};
        int length=removeDuplicates(nums);
        System.out.println(length);
        Arrays.stream(nums).forEach(x-> System.out.print(x+" ,"));

    }
}
