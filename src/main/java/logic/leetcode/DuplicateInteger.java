package logic.leetcode;

import java.util.HashSet;

public class DuplicateInteger {
    /*
     *  Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
     *  Example 1: Input: nums = [1, 2, 3, 3]
     * Output: true
     * */

    public static boolean hasDuplicate(int[] nums) {

        //use single loop if the duplicate number are side by side
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i] == nums[i+1]) {
//                return true;
//            }
//        }

        //use two loops to compare single element with all in the list
//        for(int i = 0; i < nums.length-1; i++) {
//            for (int j = 0; j < nums.length-1; j++) {
//                if(!(i == j)) {
//                    if(nums[i] == nums[j]) {
//                        return true;
//                    }
//                }
//            }
//        }

        //using HashSet
        HashSet<Integer> hastSet = new HashSet<>();
        for (int num: nums) {
            if (hastSet.contains(num))
                return true;
            hastSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[]  = {1, 2, 4, 5, 9, 1};

        boolean result = hasDuplicate(nums);
        System.out.println("Contains duplicate values in array - "+result);
    }
}
