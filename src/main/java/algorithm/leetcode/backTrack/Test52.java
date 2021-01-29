package algorithm.leetcode.backTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
