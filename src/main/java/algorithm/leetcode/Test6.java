package algorithm.leetcode;

import java.util.Map;

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
}
