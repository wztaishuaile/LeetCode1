package List;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=head,cur=head;
        while(n-->0){
            pre=pre.next;
        }
        if(pre==null)
            return head.next;
        while(pre.next!=null){
            pre=pre.next;
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}
