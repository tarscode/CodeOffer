
/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: IsSymmetrical
 * 作者: liuyang
 * 时间: 16/9/22 下午4:45
 * 题目: 对称的二叉树
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 二叉树的序列化方式计算
 */
public class IsSymmetrical {

    boolean isSymmetrical(TreeNode pRoot) {
        String strL = toStringLeft(pRoot);
        String strR = toStringRight(pRoot);
        System.out.println(strL);
        System.out.println(strR);
        return strL.equals(strR) ? true : false;
    }

    public String toStringLeft(TreeNode root) {
        if (root == null) {
            return "#!";
        }
        String res = root.val + "!";
        res += toStringLeft(root.left);
        res += toStringLeft(root.right);
        return res;
    }

    public String toStringRight(TreeNode root) {
        if (root == null) {
            return "#!";
        }
        String res = root.val + "!";
        res += toStringRight(root.right);
        res += toStringRight(root.left);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node3;
        node1.left = node2;
        node3.left = node4;
        IsSymmetrical t = new IsSymmetrical();
        System.out.println(t.isSymmetrical(root));
    }
}