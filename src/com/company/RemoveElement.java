package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;

        //Arrays.asList(nums).stream().filter(x->x!=val).collect(Collectors.toList()).forEach(x->System.out.print(x+", "));
        //Arrays.asList(nums).stream().filter(x->x!=val).forEach(x->System.out.print(x+", "));


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {

                for (int j = i; j < nums.length-1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[length-1] = -1;
                length -= 1;
                i-=1;
            }

        }
        return length;
    }

    public static void main(String[] args) {
        int x[] = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8};
        int val = 2;

        int k = removeElement(x, val); // Calls your implementation

        Arrays.stream(x).forEach(y-> System.out.print(y+ ","));


        /*assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < actualLength; i++) {
            assert nums[i] == expectedNums[i];
        }*/
    }
}
