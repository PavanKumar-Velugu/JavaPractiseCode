package logic.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        /**
         * Longest Substring Without Repeating Characters
         *
         * Given a string s, find the length of the longest substring without repeating characters.
         *
         * Example 1:
         *
         * Input: s = "abcabcbb"
         * Output: 3
         * Explanation: The answer is "abc", with the length of 3.
         */

        String str = "abcabcbb";
        int n = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(str);

        System.out.println("Max Count: " + n);

    }

    public int lengthOfLongestSubstring(String str) {

        int count = 0, left = 0;
        char[] stringArray = str.toCharArray();
        Set<Character> set = new HashSet<Character>();

        for(int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            count = Math.max(count, right - left + 1);
        }

        return count;
    }
}
