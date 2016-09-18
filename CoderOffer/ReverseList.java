
/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: ReverseList
 * 作者: liuyang
 * 时间: 16/9/18 下午3:45
 * 题目: 反转链表
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 未完成
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head!= null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ReverseList t = new ReverseList();
        System.out.println(t.ReverseList(head));
    }
}