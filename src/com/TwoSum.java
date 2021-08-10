
package com;

import java.util.HashMap;

public class TwoSum {
    public static int[]twoSum(int[] nums, int target){
        HashMap<Integer,Integer>numsHm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numsHm.put(nums[i],i);
        }
        for(int i=0;i<numsHm.size();i++){
            int temp=target-nums[i];
            if(numsHm.containsKey(temp) && i!=numsHm.get(temp)){
                System.out.println(i+" "+numsHm.get(temp));
                return new int[]{i,numsHm.get(temp)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        twoSum(nums,target);

    }
}
