import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: PrintFromTopToBottom
 * 作者: liuyang
 * 时间: 16/9/22 下午8:24
 * 题目: 从上往下打印二叉树
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 算法原型按层次遍历二叉树
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        LinkedList<TreeNode> quene = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        quene.add(root);
        TreeNode last = root;
        TreeNode nlast = null;
        while (!quene.isEmpty()) {
            TreeNode cur = quene.poll();
            if (cur.left != null) {
                quene.add(cur.left);
                nlast = cur.left;
            }
            if (cur.right != null) {
                quene.add(cur.right);
                nlast = cur.right;
            }
            arr.add(cur.val);
            if (cur.equals(last)) {
                last = nlast;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        PrintFromTopToBottom t = new PrintFromTopToBottom();
        System.out.println();
    }
}