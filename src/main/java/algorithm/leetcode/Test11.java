package algorithm.leetcode;

import org.apache.logging.log4j.util.Strings;

public class Test11 {
    //violence
    public static int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                area = Math.max(area, (j - i) * Math.min(height[j], height[i]));
            }
        }
        return area;
    }

    // double pointer
    public static int maxArea2(int[] height) {
        int area = 0;
        int h = 0;
        int l= 0;
        int r = height.length -1;
        while (l < r){
            area = Math.max(area,(r-l)*Math.min(height[l],height[r]));
            if (height[l] > height[r]) {
                r--;
            }else{
                l++;
            }
        }
        return area;
    }
    static class Test14{
        //violence
        public String longestCommonPrefix(String[] strs) {
            String lcp = Strings.EMPTY;
            if (strs.length ==0) {
                return lcp;
            }
            String first = strs[0];
            for (char c : first.toCharArray()) {
                lcp += c;
                for (String str : strs) {
                    if(!str.startsWith(lcp)){
                        return lcp.substring(0,lcp.length()-1);
                    }
                }
            }
            return lcp;
        }
    }
}
