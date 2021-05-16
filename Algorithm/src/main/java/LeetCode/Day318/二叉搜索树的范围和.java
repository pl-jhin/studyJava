package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/range-sum-of-bst/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 14:45
 */
public class 二叉搜索树的范围和 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    // 题目条件是搜索二叉树，即已经排序好了
    public int rangeSumBST(TreeNode root, int L, int R) {
        // 边界条件
        if(root == null) return 0;
        // 找到合适区间
        if(root.val >= L && root.val <= R){
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }else if(root.val < L){
            return rangeSumBST(root.right, L, R);
        }else{
            return rangeSumBST(root.left, L, R);
        }
    }
}
