package LeetCode.Day318;

import LeetCode.TreeNode;

/**
 * @ Description   :  https://leetcode-cn.com/problems/merge-two-binary-trees/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 21:01
 */
public class 合并二叉树 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null)
            return t2;
        helper(t1,t2);
        return t1;
    }
    public void helper(TreeNode t1, TreeNode t2){
        if(t1!=null&&t2!=null){
            t1.val+=t2.val;
            //t1为null 但是t2不为null
            if(t1.left==null&&t2.left!=null)
                // 创建新的树
                t1.left=new TreeNode(0);
            // 反之
            if(t1.right==null&&t2.right!=null)
                t1.right=new TreeNode(0);
            helper(t1.left,t2.left);
            helper(t1.right,t2.right);
        }else if(t1==null&&t2==null){
            return;
        }
    }
}
