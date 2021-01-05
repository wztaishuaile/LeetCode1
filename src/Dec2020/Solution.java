package Dec2020;


import List.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h1 = head,h2 = head;
        while(n-->0)h1=h1.next;
        if(h1==null){
            return head.next;
        }
        while(h1.next!=null) {
            h2=h2.next;
            h1=h1.next;
        }
        h1.next=h1.next.next;
        return head;
    }


}