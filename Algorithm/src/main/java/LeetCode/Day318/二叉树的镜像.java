package LeetCode.Day318;

import LeetCode.TreeNode;

/**
 * @ Description   :  https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 19:53
 */
public class 二叉树的镜像 {
    // 用个临时node存放左节点
    // 递归完成。
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode node = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(node);
        return root;
    }
}
