package algorithm.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > temp) {
                    result[j] ++;
                }
            }
        }
        return result;
    }
    public static int[] smallerNumbersThanCurrent2(int[] nums) {

        int[] cnt = new int[101];
        int[] result = new int[nums.length];
        //值频率
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }
        //统计小于值的次数
        for (int i = 0; i < cnt.length-1; i++) {
            cnt[i+1] +=cnt[i];
        }
        for (int i = 0; i < nums.length; i++) {
           result [i]=nums[i]==0?0:cnt[nums[i]-1];
        }
        return result;
    }
    public static int[] smallerNumbersThanCurrent3(int[] nums) {
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, n);
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(temp[0],0);
        for(int i = 1; i < n; i++){
            if(temp[i] > temp[i-1]){
                map.put(temp[i],i);
            }
        }
        for(int i = 0; i < n; i++){
            temp[i] = map.get(nums[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
//        int[] ints = smallerNumbersThanCurrent(new int[]{6, 5, 4, 8});
        int[] ints = smallerNumbersThanCurrent2(new int[]{8,1,2,2,3});
        System.out.println(Arrays.toString(ints));
    }
}
