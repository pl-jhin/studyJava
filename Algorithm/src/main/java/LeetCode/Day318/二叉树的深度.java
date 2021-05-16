package LeetCode.Day318;

import LeetCode.TreeNode;

/**
 * @ Description   :  https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/submissions/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 19:52
 */
public class 二叉树的深度 {
    // 递归搞定。。看的评论。。。
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
