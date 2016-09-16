/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: ReConstructBinaryTree
 * 作者: liuyang
 * 时间: 16/9/16 下午1:10
 * 题目: 重建二叉树
 * 内容:
 * 版本:
 * 运行时间:
 * 备注:
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode head = new TreeNode(0);
        return head;
    }

    public static void main(String[] args) {
        ReConstructBinaryTree t = new ReConstructBinaryTree();
        System.out.println();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}