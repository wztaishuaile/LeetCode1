package Nov2020;

import List.ListNode;

public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        if(head.next==null||head.next.next==null){
            return null;
        }
        ListNode fast=head.next.next,slow=head.next;
        while(fast.next!=null&&fast.next.next!=null){
            if(fast==slow){
                return help(slow,head);
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return null;
    }
    public ListNode help(ListNode n1, ListNode n2){
        while(n1!=null&&n2!=null){
            if(n1==n2)
                return n1;
            n1=n1.next;
            n2=n2.next;
        }
        return null;
    }
}
