/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: HasSubtree
 * 作者: liuyang
 * 时间: 16/9/22 下午8:38
 * 题目: 树的子结构
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:递归求解
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean res = false;
        //求两个叉数相同的节点
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) hasSubTree(root1, root2);
            if (!res) res = hasSubTree(root1.left, root2);
            if (!res) res = hasSubTree(root1.right, root2);
        }
        return res;
    }

    //判断两个二叉树是否有相同的子结构
    public boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val != root2.val) return false;
        return hasSubTree(root1.left, root2.left) && hasSubTree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        HasSubtree t = new HasSubtree();
        System.out.println();
    }
}