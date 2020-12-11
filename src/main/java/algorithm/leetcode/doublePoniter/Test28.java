package algorithm.leetcode.doublePoniter;

public class Test28 {
    public static int strStr(String haystack, String needle) {
        if ( needle == null || needle.length() == 0) {
            return 0;
        }
        if (needle.length() > haystack.length()){
            return -1;
        }
        char[] chars = haystack.toCharArray();
        char[] targetChars = needle.toCharArray();
        char first = targetChars[0];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == first) {
                int j;
                for (j = 0; j < targetChars.length; j++) {
                    if (i < chars.length - j && chars[i + j] != targetChars[j]) {
                        break;
                    }
                }
                if (j == targetChars.length) {
                    return i;
                }
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }
}