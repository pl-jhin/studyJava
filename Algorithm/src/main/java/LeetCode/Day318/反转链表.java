package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 15:41
 */
public class 反转链表 {
    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }
    // 双指针完成
    // next是获得下一个节点
    // pre是获得当前节点
    // cur是通过next不断遍历
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head, next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
