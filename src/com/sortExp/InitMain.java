package com.sortExp;

import java.util.Arrays;

public class InitMain {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i<nums.length; i++) {
            nums[i] = (int) (Math.random()*1000);
        }

        for (int i=0; i<nums.length; i++) {
            for (int j = 0; j<nums.length - 1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
