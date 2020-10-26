package List;
/*
 反转链表    输入: 1->2->3->4->5->NULL
            输出: 5->4->3->2->1->NULL
 */
public class LeetCode206 {
    //递归解法
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        ListNode newHead=reverseList(next);
        next.next=head;
        head.next=null;
        return newHead;
    }

    //头插法

}
