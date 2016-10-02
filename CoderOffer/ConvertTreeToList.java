/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: ConvertTreeToList
 * 【作者】: liuyang
 * 【时间】: 16/9/27 下午10:47
 * 【题目】: 二叉搜索树与双向链表
 * 【内容】: 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class ConvertTreeToList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode pLastNodeInList = convertNode(pRootOfTree, null);
        while (pLastNodeInList != null && pLastNodeInList.left != null) {
            pLastNodeInList = pLastNodeInList.left;
        }
        return pLastNodeInList;
    }

    public TreeNode convertNode(TreeNode pNode, TreeNode pLastNodeInList) {
        if (pNode == null) {
            return null;
        }
        TreeNode cur = pNode;
        if (cur.left != null) pLastNodeInList = convertNode(cur.left, pLastNodeInList);
        cur.left = pLastNodeInList;
        if (pLastNodeInList != null) pLastNodeInList.right = cur;
        pLastNodeInList = cur;
        if (cur.right != null) pLastNodeInList = convertNode(cur.right, pLastNodeInList);
        return pLastNodeInList;
    }

    public static void main(String[] args) {
        ConvertTreeToList t = new ConvertTreeToList();
        System.out.println();
    }
}