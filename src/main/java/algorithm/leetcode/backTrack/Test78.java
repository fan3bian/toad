package algorithm.leetcode.backTrack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test78 {
    //子集
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> subSets(int[] nums) {
        Deque<Integer> track = new LinkedList<>();
        dfs(track, 0, nums);
        return res;
    }

    private void dfs (Deque<Integer> track, int start, int[] nums) {
        res.add(new ArrayList(track));
        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            dfs(track, i + 1, nums);
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        Test78 test78 = new Test78();
        int[] nums = {1,2,3};
        test78.subSets(nums);
    }
}
