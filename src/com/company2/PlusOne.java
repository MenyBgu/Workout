package com.company2;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=0){
                digits[i]++;
                return digits;
            }
            else{
                if(i==0 && digits[i]==9){
                    int[]newDigits=new int[digits.length+1];
                    newDigits[0]=1;
                    return newDigits;
                }
                digits[i]=0;
            }
        }
        return digits;
    }
}
