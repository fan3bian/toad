package algorithm.leetcode.stack;

import java.util.Stack;

//easy
public class Test20 {
    //成对的组合优先考虑栈
    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        char[] chars = s.toCharArray();
        if (chars.length % 2 !=0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            }
            if (chars[i] == ')') {
                if (stack.size() == 0 || stack.pop() != '(') {
                    return false;
                }
            }
            if (chars[i] == ']') {
                if (stack.size() == 0 || stack.pop() != '[') {
                    return false;
                }
            }
            if (chars[i] == '}') {
                if (stack.size() == 0 || stack.pop() != '{') {
                    return false;
                }
            }
        }
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }
}
