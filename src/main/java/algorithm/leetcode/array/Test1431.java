package algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Test1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = candy > max ? candy : max;
        }
        List<Boolean> result = new ArrayList(candies.length);
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i]>=max-extraCandies);
        }
        return  result;
    }
}
