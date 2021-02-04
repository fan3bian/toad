package algorithm.leetcode.backTrack;

import java.util.*;

/**
 * N皇后
 */
public class Test52 {

    List<List<String>> res = new ArrayList<>();

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        dfs(0,board);
        return res.size();
    }

    public void dfs(int row, char[][] board) {
        if (row == board.length) {
            res.add(arr2List(board));
        }
        int n = board[row].length - 1;
        for (int col = 0; col <= n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            board[row][col] = 'Q';
            dfs(row + 1, board);
            board[row][col] = '.';
        }

    }

    private boolean isValid(char[][] board, int row, int col) {
        int len = board.length;
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[row].length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return false;
    }

    private List<String> arr2List(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] c : board) {
            String str = new String(c);
            list.add(str);
        }
        return list;
    }

    public static void main(String[] args) {

    }

    public static class Test46 {
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            int len = nums.length;
            if (len == 0) {
                return new ArrayList<>();
            }
            Deque<Integer> path = new ArrayDeque<Integer>();
            boolean used[] =new boolean[len];
            dfs(nums,0,path,used,res);

            return res;
        }

        /**
         *
         * @param nums
         * @param depth
         * @param path 从根节点到任意节点的列表
         * @param used
         */
        private static void dfs(int[] nums,  int depth, Deque<Integer> path, boolean[] used,List<List<Integer>> res){
            if (depth == nums.length) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if(used[i]){
                    continue;
                }
                path.addLast(nums[i]);
                used[i] = true;
                dfs(nums,depth+1,path,used,res);
                path.removeLast();
                used[i]= false;
            }
        }
    }
}
