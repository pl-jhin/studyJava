package LeetCode.Day318;

import java.util.ArrayList;

/**
 * @ Description   :  https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 14:19
 */
public class 从尾到头打印链表 {
    static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
    // 使用类似栈的特性，正向遍历入栈，反向遍历出栈
    public static int[] reversePrint(ListNode head) {
        ArrayList list = new ArrayList<Integer>();
        // 正向遍历入栈
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] result = new int[list.size()];
        // 反向遍历出栈
        for (int i = list.size()-1 ,j =0;i>=0;i--,j++){
            result[j]= (int) list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        reversePrint(listNode);
    }

}
