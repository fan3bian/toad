package algorithm.some.tree;

import algorithm.leetcode.tree.TreeNode;

public class TestBinaryTree {
    //二叉树的遍历框架
    void traverse(TreeNode root) {
        //前序遍历 root.val
        traverse(root.left);
        //中序遍历 root.val
        traverse(root.right);
        //后序遍历 root.val

    }
}
