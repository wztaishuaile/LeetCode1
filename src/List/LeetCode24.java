package List;
/*
给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

示例:
给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class LeetCode24 {

    public ListNode swapPairs(ListNode head) {
        ListNode node=new ListNode(-1);
        node.next=head;
        ListNode pre=node;
        while(pre.next!=null&&pre.next.next!=null){
            ListNode l1=pre.next,l2=pre.next.next;
            l1.next=l2.next;
            l2.next=l1;
            pre.next=l2;
            pre=l1;//变了呀这里
        }
        return node.next;
    }
}
