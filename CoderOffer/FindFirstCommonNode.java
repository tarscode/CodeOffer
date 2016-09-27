/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: FindFirstCommonNode
 * 【作者】: liuyang
 * 【时间】: 16/9/27 下午9:26
 * 【题目】: 两个链表的第一个公共结点
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        int len1 = 0;
        int len2 = 0;
        //计算链表1的长度
        while(head1!=null){
            head1 = head1.next;
            len1++;
        }
        //计算链表2的长度
        while(head2!=null){
            head2 = head2.next;
            len2++;
        }
        //计算两个链表长度的差值,长的链表先走n步
        int step = len1-len2;
        if(step>0){
            while(step!=0){
                step--;
                pHead1 = pHead1.next;
            }
        }else{
            while(step!=0){
                step++;
                pHead2 = pHead2.next;
            }
        }
        //同时移动遍历两个链表
        while(pHead1!=null&&pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }

    public static void main(String[] args) {
        FindFirstCommonNode t = new FindFirstCommonNode();
        System.out.println();
    }
}