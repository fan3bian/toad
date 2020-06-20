package algorithm.leetcode.array;

public class Test14ThreeSum {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0) {
            return "";
        }
        String str = strs[0];
        StringBuilder stringBuilder =new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (String s : strs) {
                if(s.length() > i){
                    if (s.charAt(i)!=chars[i]) {
                        return stringBuilder.toString();
                    }
                }else {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(chars[i]);
            if (i==chars.length-1) {
                return stringBuilder.toString();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = longestCommonPrefix(new String []{"flower", "flow", "flight"});
        System.out.println(s);
    }
}
