package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * <a href='https://leetcode-cn.com/problems/valid-parentheses/'>有效的括号</a>
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 */
public class ValidParentheses {

    public boolean solution(String s) {
        System.out.println("输入: " + s);

        if (s == null || s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();
        for (char temp : s.toCharArray()) {
            if (temp == '(' || temp == '[' || temp == '{') {
                stack.push(temp);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char m = stack.pop();
            if (m == '(' && temp != ')') {
                return false;
            }
            if (m == '[' && temp != ']') {
                return false;
            }
            if (m == '{' && temp != '}') {
                return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean solution2(String s) {
        System.out.println("输入: " + s);

        if (s == null || s.length() == 0) {
            return true;
        }

        Map<Character, Character> dic = new HashMap<Character, Character>();
        dic.put(')', '(');
        dic.put(']', '[');
        dic.put('}', '{');

        Stack<Character> stack = new Stack<Character>();

        for (char temp : s.toCharArray()) {
            if (!dic.containsKey(temp)) {
                stack.push(temp);
            } else if (stack == null || stack.isEmpty()) {
                return false;
            } else if (stack.pop() != dic.get(temp)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
