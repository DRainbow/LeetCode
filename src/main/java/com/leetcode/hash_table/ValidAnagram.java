package com.leetcode.hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href='https://leetcode-cn.com/problems/valid-anagram/'>有效的字母异位词</a>
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 */
public class ValidAnagram {

    /**
     * sort
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return String.valueOf(charS).equals(String.valueOf(charT));
    }

    /**
     * hash table
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        Map<Character, Integer> temp = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            if (temp.containsKey(c)) {
                temp.put(c, temp.get(c) + 1);
            } else {
                temp.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (temp.containsKey(c)) {
                int count = temp.get(c);
                count--;
                if (count <= 0) {
                    temp.remove(c);
                } else {
                    temp.put(c, count);
                }
            } else {
                return false;
            }
        }

        return temp.isEmpty();
    }
}
