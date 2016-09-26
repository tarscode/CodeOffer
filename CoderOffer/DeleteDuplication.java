import java.util.Map;
import java.util.TreeMap;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: DeleteDuplication
 * 作者: liuyang
 * 时间: 16/9/22 上午10:26
 * 题目: 删除链表中重复的结点
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode cur = pHead;
        ListNode head = new ListNode(0);
        ListNode node = head;
        Map<Integer, Integer> map = new TreeMap();

        //建立map存储每一值出现的数量
        while (cur != null) {
            if (map.containsKey(cur.val)) {
                map.put(cur.val, map.get(cur.val) + 1);
            } else {
                map.put(cur.val, 1);
            }
            cur = cur.next;
        }
        //重新建立链表，只添加值出现一次的节点
        for (Integer key : map.keySet()) {
           if(map.get(key)==1){
               ListNode tmp = new ListNode(key);
               node.next = tmp;
               node = node.next;
           }
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode t1 = new ListNode(2);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(5);
        head.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        DeleteDuplication t = new DeleteDuplication();
        ListNode pHead = t.deleteDuplication(head);
        while (pHead != null) {
            System.out.println(pHead.val);
            pHead = pHead.next;
        }
    }
}