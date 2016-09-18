/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Merge
 * 作者: liuyang
 * 时间: 16/9/18 下午6:05
 * 题目: 合并两个排序的链表
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class Merge {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        ListNode node1 = null;
        ListNode node2 = null;
        while (list1 != null || list2 != null) {
            if(list1==null){
                System.out.println("list1break");
                cur.next = list2;
                break;
            }
            if(list2==null){
                System.out.println("list2break");
                cur.next = list1;
                break;
            }
            if (list1.val < list2.val) {
                node1 = list1;
                cur.next = node1;
                list1 = list1.next;
            } else {
                node2 = list2;
                cur.next = node2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);

        ListNode head2 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        head2.next = node4;
        node4.next = node5;
        node5.next = node6;
        Merge t = new Merge();
        System.out.println(t.Merge(head, head2));
    }
    //打印函数
    public void printList(ListNode head){
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}