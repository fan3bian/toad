package algorithm.leetcode;

import java.util.*;

public class Test6 {
    static class ZigZagConversion{
        public String convert(String s, int numRows) {
            int samePart = 2 * (numRows - 1);
            int fieldsA = 2 * (s.length() / samePart);
            int fieldsB = 0;
            int remainder = s.length() % samePart;
            if(remainder > 4){
                fieldsB =2;
            }else if( remainder > 0){
                fieldsB = 1;
            }else {
                fieldsB = 0;
            }
            int fields = fieldsA + fieldsB;
            int [][] arr = new  int[numRows][fields];

            return null;
        }
    }
    static int  reverse(int x){
        List<Integer> list = new ArrayList<>();
        while (x != 0){
            int temp = x /10 ;
            x = x % 10;

            if(temp > 0){
                list.add(temp);
            }else{
                list.add(x);
            }
        }
        int result = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            result += list.get(i) * 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int reverse = reverse(12);
        System.out.println(reverse);

    }
}
