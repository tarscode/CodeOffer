import java.util.LinkedList;
import java.util.Queue;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: SerializeTree
 * 作者: liuyang
 * 时间: 16/9/23 上午10:39
 * 题目: 序列化二叉树
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 * 思路:
 */
public class SerializeTree {

    //先序序列化二叉树
    String Serialize(TreeNode root) {
        if (root == null) {
            return "#!";
        }
        String res = root.val + "!";
        res += Serialize(root.left);
        res += Serialize(root.right);
        return res;
    }

    TreeNode Deserialize(String str) {
        String[] values = str.split("!");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i != values.length; i++) {
            queue.offer(values[i]);
        }
        return preOrder(queue);
    }

    //反序列化二叉树
    public TreeNode preOrder(Queue<String> queue) {
        String value = queue.poll();
        if (value.equals("#")) {
            return null;
        }
        TreeNode head = new TreeNode(Integer.valueOf(value));
        head.left = preOrder(queue);
        head.right = preOrder(queue);
        return head;
    }

    public static void main(String[] args) {
        String str = "8!6!5!#!#!7!#!#!10!9!#!#!11!#!#!";
        SerializeTree t = new SerializeTree();
        System.out.println(t.Deserialize(str));
    }
}