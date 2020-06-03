package algorithm.leetcode;

import java.util.Arrays;

public class Test121 {
    public static int maxProfit(int[] prices) {
        int a = 0;
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        return a;
    }

    //
    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = 0; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
//        maxProfit(new int[]{1, 2, 49, 2});
        System.out.println(maxProfit2(new int[]{10, 2, 10, 3,15}));
    }

}
