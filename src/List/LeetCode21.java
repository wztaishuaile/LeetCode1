package List;

public class LeetCode21 {
    //递归法
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }
    }
    //迭代法，增加一个头节点，返回.next即可
    public ListNode mergeTwoLists1(ListNode l1,ListNode l2){
        ListNode head=new ListNode(0);
        ListNode tail=head;
        while(l1!=null&&l2!=null){

            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
                tail=tail.next;
            }else{
                tail.next=l2;
                l2=l2.next;
                tail=tail.next;
            }
        }
        tail.next=l1==null?l2:l1;
        return head.next;
    }
}
//堆排序时间复杂度 O(NlogK)，空间复杂度 O(K)。
