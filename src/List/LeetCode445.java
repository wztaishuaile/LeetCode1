package List;

import java.util.Stack;

/*
给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。
它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
你可以假设除了数字 0 之外，这两个数字都不会以零开头。

进阶：
如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
示例：
输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 8 -> 0 -> 7
 */
public class LeetCode445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> sl1=buildStack(l1);
        Stack<Integer> sl2=buildStack(l2);
        ListNode head=new ListNode(0);
        int c=0;
        while(!sl1.empty()||!sl2.empty()||c!=0){
            int x=sl1.empty()?0:sl1.pop();
            int y=sl2.empty()?0:sl2.pop();
            int sum=x+y+c;
            c=sum/10;
            sum=sum%10;
            ListNode n=new ListNode(sum);
            n.next=head.next;
            head.next=n;
        }
        return head.next;
    }
    private Stack<Integer> buildStack(ListNode node){
        Stack<Integer> s=new Stack<>();
        while(node!=null){
            s.push(node.val);
            node=node.next;
        }
        return s;
    }
}
