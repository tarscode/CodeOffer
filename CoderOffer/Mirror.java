import java.util.Stack;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: Mirror
 * 【作者】: liuyang
 * 【时间】: 16/9/23 下午10:25
 * 【题目】: 二叉树的镜像
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:O(n)
 * 【空间复杂度】:O(n)
 * 【备注】:
 * 【思路】:
 *  首先,判断节点root是否为空,若为空则继续;否则,跳出不执行.
 *  其次,创建stack,先序遍历二叉树.
 *  同时,对于每一个节点,若为非叶子节点，则交换其左孩子和有孩子.
 *  最后,输出树.
 */
public class Mirror {
    public void Mirror(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack();
            stack.push(root);
            while (!stack.empty()) {
                TreeNode cur = stack.pop();
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                if (cur.left != null) {
                    stack.push(cur.left);
                }
                if (cur.left != null || cur.right != null) {
                    TreeNode tmp = cur.left;
                    cur.left = cur.right;
                    cur.right = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Mirror t = new Mirror();
        System.out.println();
    }
}