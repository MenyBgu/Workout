package com.company;

import java.util.Arrays;

public class RemoveElementSolution {
    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int x[] = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8};
        int val = 2;

        int k = removeElement(x, val); // Calls your implementation

        Arrays.stream(x).forEach(y-> System.out.print(y+ ","));
    }
}
