package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test118 {
    //杨辉三角 二项式展开方程系数
    public List<List<Integer>> generate(int numRows) {
        //i row j column
        List<List<Integer>> lists =new ArrayList<>();
        for (int i = 0; i <numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < numRows; j++) {
                if (j==0 || j==i){
                    row.add(1);
                }else {
                    row.add(lists.get(i-1).get(j-1)+ lists.get(i-1).get(i));
                }
            }
        }
        return lists;
    }
    public String reverseWords(String s) {
        if (s.length() == 0) {
            return s;
        }
        String[] segments = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : segments) {
            sb.append(new StringBuilder(str).reverse());
        }
        sb.substring(0,sb.length()-1);
        return sb.toString();
    }
}
