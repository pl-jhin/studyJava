package LeetCode.Day818;

import LeetCode.ListNode;
import LeetCode.TreeNode;

public class 有序链表转换二叉搜索树 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null) return null;
        if (head.next==null) return new TreeNode(head.val);
        ListNode tail = head;
        while (tail!=null){
            tail = tail.next;
        }
        return creatTree(head,tail);
    }

    public TreeNode creatTree(ListNode head,ListNode tail){
        if(head==tail){
            return null;
        }
        ListNode node = getMid(head,tail);
        TreeNode root=new TreeNode(node.val);
        root.left = creatTree(head,node);
        root.right = creatTree(node.next,tail);
        return root;
    }
    public ListNode getMid(ListNode head,ListNode tail){
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=tail&&fast.next!=tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
