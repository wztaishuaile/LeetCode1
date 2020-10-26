//package JianZhiOffer;
//
//import List.ListNode;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Stack;
//
//
////    public class ListNode{
////        int val;
////        ListNode next;
////        ListNode(int x){val=x;}
////    }
//public class Offer06 {
//    //法一递归
//    ArrayList<Integer> a=new ArrayList<>();
//    public int[] reversePrint(ListNode head) {
//        rever(head);
//        int[] res=new int[a.size()];//这里得注意是size!还得注意数组大小是递归后才知道的
//        for (int i = 0; i <a.size(); i++) {
//            res[i]=a.get(i);//得到索引位置的值
//
//        }
//        return res;
//    }
//    void rever(ListNode node){
//        if(node==null)
//            return;
//        rever(node.next);
//        a.add(node.val);//不知到链表长度所以就是ArrayList
//    }
//
//    //法二用栈来实现Stack
//    public int[] reversePrint1(ListNode head){
//        Stack<Integer> stack=new Stack<Integer>();
//        while(head!=null){
//            stack.push(head.val);
//            head=head.next;
//        }
//        int[] res=new int[stack.size()];
//        //注意for循环里面的条件用的是res.length!
//        for (int i = 0; i <res.length ; i++) {
//            res[i]=stack.pop();
//        }
//        return res;
//    }
//    //栈 用LinkedList实现，更快内存消耗也少些注意方法addLast和removeLast
//    public int[] reversePrint2(ListNode head) {
//        LinkedList<Integer> stack = new LinkedList<Integer>();
//        while(head != null) {
//            stack.addLast(head.val);
//            head = head.next;
//        }
//        int[] res = new int[stack.size()];
//        for(int i = 0; i < res.length; i++)
//            res[i] = stack.removeLast();
//        return res;
//    }
//}
