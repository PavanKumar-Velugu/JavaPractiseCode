package logic.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Anagram Groups
 *
 * Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 *
 * Example 1:
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 *
 */

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> anagram = new HashMap<>();

        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String keys = new String(chars);
            System.out.println(keys);
            anagram.putIfAbsent(keys, new ArrayList<>());
            anagram.get(keys).add(str);
        }

        return new ArrayList<>(anagram.values());
    }

    public static void main(String[] args) {

        GroupAnagram groupAnagram = new GroupAnagram();
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        //groupAnagram.groupAnagrams(strs);
        System.out.println(groupAnagram.groupAnagrams(strs));

    }
}
