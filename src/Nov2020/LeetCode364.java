package Nov2020;

public class LeetCode364 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0),pre;
        dummy.next=head;
        while(head!=null&&head.next!=null){
            if(head.val<=head.next.val){
                head=head.next;
                continue;
            }
            pre=dummy;
            while(pre.next.val<head.next.val) pre=pre.next;
            ListNode cur=head.next;
            head.next=cur.next;
            cur.next=pre.next;
            pre.next=cur;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }






    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
