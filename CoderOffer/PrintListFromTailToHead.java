/**
 * Created by liuyang on 16/8/4.
 * 从尾到头打印链表
 *
 */

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList();
        if (listNode == null) {
            return list;
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode.next != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        stack.push(listNode.val);
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
