package algorithm.leetcode.backTrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test17 {
    List<String> res = new ArrayList<>();
    Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        char[] chars = digits.toCharArray();
        StringBuilder sb = new StringBuilder();
        dfs(sb,0,chars);
        return res;
    }

    public void dfs(StringBuilder sb, int start, char[] chars) {
        if (sb.length() == chars.length) {
            res.add(sb.toString());
            return;
        }
        char c = chars[start];
        String s = phoneMap.get(c);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            dfs(sb, start + 1, chars);
            sb = sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Test17 test17 = new Test17();
        List<String> list = test17.letterCombinations("23");
        System.out.println(list);
    }
}