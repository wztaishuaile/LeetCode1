package JianZhiOffer;

import List.ListNode;

public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;
        ListNode l2=headB;
        while(l1!=l2){
            //若是无交点，则死循环了，故判断应修改为l1=(l1==null)?headB:l1.next;这样就避免了死循环吧，不想交也可以都是null出循环
            l1=(l1.next==null)?headB:l1.next;
            l2=(l2.next==null)?headA:l2.next;
        }
        return l1;
    }
}
