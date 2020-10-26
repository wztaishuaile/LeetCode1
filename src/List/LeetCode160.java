package List;

public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA==null||headB==null)
            return null;
        ListNode lA=headA,lB=headB;
        //跑两圈找差距
        while(lA!=lB){
            lA=lA==null?headB:lA.next;
            lB=lB==null?headA:lB.next;
        }
        return lA;
    }
}
