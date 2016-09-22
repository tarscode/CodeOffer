import java.util.LinkedList;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: TreeDepth
 * 作者: liuyang
 * 时间: 16/9/22 下午7:17
 * 题目: 二叉树的深度
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 层次遍历二叉树
 */
public class TreeDepth {
    public int TreeDepth(TreeNode pRoot) {
        int depth = 0;
        if(pRoot==null){
            return depth;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();

        TreeNode flag = pRoot;
        TreeNode last = pRoot;
        queue.push(pRoot);
        while(!queue.isEmpty()){
            TreeNode top = queue.pollFirst();
            if(top.left!=null){
                queue.add(top.left);
                last = top.left;
            }
            if(top.right!=null){
                queue.add(top.right);
                last = top.right;
            }
            if(top.equals(flag)){
                flag = last;
                depth++;
            }
        }
        return depth;
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
        TreeDepth t = new TreeDepth();
        System.out.println(t.TreeDepth(root));
    }
}