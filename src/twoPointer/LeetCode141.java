package twoPointer;

import List.ListNode;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
       if(head==null)
           return false;
        ListNode q=head,p=head.next;
        while(q!=null&&p!=null&&p.next!=null){
            if(q==p)
                return true;
            q=q.next;
            p=p.next.next;
        }
        return false;
    }
}
