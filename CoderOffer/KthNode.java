import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: KthNode
 * 【作者】: liuyang
 * 【时间】: 16/9/25 下午11:35
 * 【题目】: 二叉搜索树的第k个结点
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:O(n)
 * 【空间复杂度】:O(n)
 * 【备注】:
 * 【思路】:
 *  首先,中序遍历二叉搜索树,并将结果存储到list中.
 *  然后,返回list的第k-1个元素.
 */
public class KthNode {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k < 1) {
            return null;
        }
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = pRoot;
        while (cur != null || !stack.empty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode top = stack.pop();
                list.add(top);
                cur = top.right;
            }
        }
        if (list.size() <= k - 1) {
            return null;
        }
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        KthNode t = new KthNode();
        System.out.println();
    }
}