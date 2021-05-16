package Solution;

import java.util.ArrayList;
import java.util.Iterator;

public class trimBST {
    private static ArrayList<Integer> list = new ArrayList<>();

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static TreeNode trimBST(TreeNode root,int L,int R){
        list= getTreeData(root);
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            if (i.next()<L){
                i.remove();

            }
            else if (i.next()>R){
                i.remove();
            }
        }
        TreeNode treeNode = new TreeNode(list.get(0));
        for (int j = 1;j<list.size();j++){
            insertVal(treeNode,list.get(j));
        }

        return treeNode;
    }
    public static TreeNode insertVal(TreeNode node ,int Data){
        if (node.val<Data){
            if (node.left==null) node.left = new TreeNode(Data);
            else insertVal(node.left,Data);
        }else {
            if (node.right==null) node.right = new TreeNode(Data);
            else insertVal(node.right,Data);
        }
        return node;
    }
    public static ArrayList<Integer> getTreeData(TreeNode treeNode){
        if (treeNode.left!=null){
            getTreeData(treeNode.left);
        }
        list.add(treeNode.val);
        if (treeNode.right!=null){
            getTreeData(treeNode.right);
        }
        return list;
    }
    public static void toTree(TreeNode treeNode){
        if (treeNode.left!=null){
            getTreeData(treeNode.left);
        }
        System.out.println(treeNode.val);
        if (treeNode.right!=null){
            getTreeData(treeNode.right);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(0);
        treeNode.left.right = new TreeNode(2);
        treeNode.left.right.left = new TreeNode(1);
        treeNode.right = new TreeNode(4);
        TreeNode node = trimBST(treeNode, 1, 3);
        toTree(node);
    }
}
