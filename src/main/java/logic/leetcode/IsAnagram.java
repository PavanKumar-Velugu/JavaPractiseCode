package logic.leetcode;

import java.util.HashMap;

/**
 * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
 *
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 *
 * Example 1:
 *  Input: s = "racecar", t = "carrace"
 *  Output: true
 *
 * Example 2:
 *  Input: s = "jar", t = "jam"
 *  Output: false
 */

public class IsAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c: s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                return false;
            }

            hashMap.put(c, hashMap.get(c) - 1);

            if(hashMap.get(c) < 0) {
                return false;
            }

        }

        System.out.println(hashMap);

        return true;
    }

    public static void main(String[] args) {

        IsAnagram isAnagram = new IsAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram.isAnagram(s, t);
        System.out.println("provides strings are Anagram - " + result);
    }
}
