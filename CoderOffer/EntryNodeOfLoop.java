/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: EntryNodeOfLoop
 * 【作者】: liuyang
 * 【时间】: 16/9/25 下午10:08
 * 【题目】: 链表中环的入口节点
 * 【内容】: 一个链表中包含环，请找出该链表的环的入口结点。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】: O(n)
 * 【空间复杂度】: O(1)
 * 【备注】:
 * 【思路】:
 * 首先,设置两个头结点head1,head2,初始化两个头结点等于pHead,head1每次移动一步,head2每次移动两步.
 * 然后,同时移动两个头结点,直到head1和head2移动到相同的节点.
 * 此时,重新赋值head2为pHead,并且head2此时每次移动一步,再次移动两个节点.
 * 最后,当两个节点再次移动到相同的节点时,输出此时的节点.
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        while(pHead==null||pHead.next==null){
            return null;
        }
        ListNode head1 = pHead.next;
        ListNode head2 = pHead.next.next;
        //第一次遍历相同至节点
        while (!head1.equals(head2)) {
            head1 = head1.next;
            head2 = head2.next.next;
        }
        head2 =pHead;
        //第二次遍历相同至节点
        while(!head1.equals(head2)){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;
        EntryNodeOfLoop t = new EntryNodeOfLoop();
        System.out.println(t.EntryNodeOfLoop(node1).val);
    }
}