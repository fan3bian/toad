package algorithm.leetcode.backTrack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test51 {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new LinkedList<>();
        Deque<String> track = new LinkedList<>();
        backTrack(res, track, n);
        return res;
    }
    private void backTrack(List<List<String>> res, Deque<String> track, int row) {
        //base case
        if (track.size() == row) {
            res.add(new LinkedList<>(track));
            return;
        }



    }
}
