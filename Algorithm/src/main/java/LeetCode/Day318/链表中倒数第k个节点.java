package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 18:42
 */
public class 链表中倒数第k个节点 {
    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }
    // 快慢指针
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 获得链表
        ListNode fast = head;
        // 遍历
        while(fast!=null) {
            fast = fast.next;
            // 返回倒数第K个节点即返回K个节点
            // 如返回倒数第1个，就是直接遍历到最后一个节点
            // 返回倒数第二个，快指针排除前面两个节点，然后慢指针开始继续遍历，即返回的最后两位
            if(k==0) {
                head = head.next;
            }else {
                k--;
            }
        }
        return head;
    }
}
