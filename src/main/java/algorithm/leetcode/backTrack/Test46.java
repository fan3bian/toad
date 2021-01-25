package algorithm.leetcode.backTrack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Deque<Integer> track = new LinkedList<>();
        backTrack(res, track, nums);
        return res;
    }

    private void backTrack(List<List<Integer>> res, Deque<Integer> track, int[] nums) {
        //base case
        if (track.size() == nums.length) {
            res.add(new LinkedList(track));
            return;
        }
        for (int num : nums) {
            //若已在路径中
            if (track.contains(num)) {
                continue;
            }
            track.add(num);
            backTrack(res, track, nums);
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        Test46 test46 = new Test46();
        int[] nums = {1,2,3};
        test46.permute(nums);
    }
}