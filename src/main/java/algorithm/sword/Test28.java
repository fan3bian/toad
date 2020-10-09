package algorithm.sword;

import algorithm.leetcode.tree.TreeNode;

public class Test28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recu(root.left,root.right);
    }
    private boolean recu(TreeNode left, TreeNode right){
        if (left == null && right == null) {
            return  true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return recu(left.right,right.left) && recu(left.left,right.right);
    }
}
