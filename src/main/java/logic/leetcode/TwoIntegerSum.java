package logic.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
 *
 * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 *
 * Return the answer with the smaller index first.
 * Example 1:
 *
 * Input:
 * nums = [3,4,5,6], target = 7
 *
 * Output: [0,1]
 */

public class TwoIntegerSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if(hashMap.containsKey(remainder)) {
                return new int[] {hashMap.get(remainder), i};
            }

            hashMap.put(nums[i], i);
        }

        return new int[] {};

//        int sum[] = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(i != j) {
//                    if(nums[i] + nums[j] == target) {
//                        sum[0] = i;
//                        sum[1] = j;
//                        return sum;
//                    }
//                }
//            }
//
//        }
//        return sum;
    }

    public static void main(String[] args) {
        TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
        int[] nums = {3,4,5,6};
        int target = 7;

        int[] result = twoIntegerSum.twoSum(nums, target);
        System.out.println("{ " + result[0] + " ," +result[1] + " }");
    }
}
