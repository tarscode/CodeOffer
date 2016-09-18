import java.util.List;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: FindKthToTail
 * 作者: liuyang
 * 时间: 16/9/18 下午3:34
 * 题目: 链表中倒数第k个结点
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        int len = 0;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }
        len = len - k;
        if (len < 0) {
            return null;
        }
        while (len > 0) {
            len--;
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        FindKthToTail t = new FindKthToTail();
        System.out.println();
    }
}