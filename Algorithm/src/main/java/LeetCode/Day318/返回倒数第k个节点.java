package LeetCode.Day318;

import java.util.ArrayList;

/**
 * @ Description   :  https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 18:39
 */
public class 返回倒数第k个节点 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    // 类似栈的特性。正向遍历入栈，反向遍历出栈
    public int kthToLast(ListNode head, int k) {
        ArrayList list = new ArrayList<Integer>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        return (int) list.get(list.size()-k);
    }
}
