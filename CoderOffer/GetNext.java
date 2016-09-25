import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: GetNext
 * 【作者】: liuyang
 * 【时间】: 16/9/25 下午10:41
 * 【题目】: 二叉树的下一个结点
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:O(n)
 * 【空间复杂度】:O(n)
 * 【备注】:应该可以优化
 * 【思路】:
 *  首先,根据pNode找到二叉树的头节点记为pHead.
 *  然后,中序遍历二叉树,并将遍历结果保存到queue中.
 *  最后,遍历queue,找到pNode,并返回pNode的下个节点.
 */
public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return pNode;
        }
        TreeLinkNode pHead = pNode;
        //获取头结点
        while (pHead.next != null) {
            pHead = pHead.next;
        }
        //中序遍历二叉树
        TreeLinkNode node = pHead;
        Stack<TreeLinkNode> stack = new Stack<>();
        List<TreeLinkNode> quene = new ArrayList<>();
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        while (!stack.empty() && node == null) {
            TreeLinkNode cur = stack.pop();
            quene.add(cur);
            cur = cur.right;
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
        }
        //查找pNode节点
        int index = 0;
        TreeLinkNode cur = quene.get(index);
        while(!cur.equals(pNode)){
           cur = quene.get(++index);
        }
        return ++index==quene.size()?null:quene.get(index);
    }

    public static void main(String[] args) {
        TreeLinkNode t1 = new TreeLinkNode(1);
        TreeLinkNode t2 = new TreeLinkNode(2);
        TreeLinkNode t3 = new TreeLinkNode(3);
        TreeLinkNode t4 = new TreeLinkNode(4);
        TreeLinkNode t5 = new TreeLinkNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t2.next = t1;
        t3.next = t1;
        t4.next = t2;
        t5.next = t2;
        GetNext t = new GetNext();
        System.out.println(t.GetNext(t5).val);
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}