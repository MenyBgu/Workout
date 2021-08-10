package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> cands=new HashSet<>();
        Arrays.stream(candidates).forEach(x->cands.add(x));

        List<Integer>element=new ArrayList<>();
        int temp=0;
        int index=0;

       /* while(true){
            temp=target-candidates[index];
            while()
        }*/
        return res;
    }

    public static void main(String[] args) {

    }
}
