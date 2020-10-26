package List;

import java.util.Stack;

/*
请判断一个链表是否为回文链表。
示例 1:
输入: 1->2
输出: false

示例 2:
输入: 1->2->2->1
输出: true
 */
public class LeetCode234 {
    public boolean isPalindrom(ListNode head){
        if(head==null||head.next==null){
            return true;
        }
        Stack<Integer> stack = new Stack<Integer>();
        ListNode q=head,p=head;
        while(p!=null&&p.next!=null){
            stack.push(q.val);
            q=q.next;
            p=p.next.next;
        }
        if(p!=null){
            while(q.next!=null){
                if(stack.pop()!=q.next.val)
                    return false;
            }
        }
        else{
            while(q!=null){
                if (stack.pop()!=q.val)
                    return false;
            }
        }
        return true;
    }
}
