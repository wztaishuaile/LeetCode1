package List;

public class LeetCode83 {
    //递归
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)//保证return的俩都有意义
            return head;
        head.next=deleteDuplicates(head.next);
        return head.val==head.next.val?head.next:head;
    }
    //迭代
    public ListNode deleteDuplicates1(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }


}
