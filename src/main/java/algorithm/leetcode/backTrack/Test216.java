package algorithm.leetcode.backTrack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test216 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        //len = 9 depth = k
        Deque<Integer> track = new LinkedList<>();
        dfs(track, n, k, 1, 0);
        return res;
    }

    private void dfs(Deque<Integer> track, int target, int depth, int start, int sum) {
        if (track.size() == depth) {
            if (sum == target) {
                res.add(new LinkedList(track));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            track.add(i);
            sum +=i;
            dfs(track, target, depth, i + 1, sum);
            sum -=i;
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        Test216 test216 = new Test216();
        test216.combinationSum3(3,7);
    }
}
