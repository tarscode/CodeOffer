import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: FindPath
 * 【作者】: liuyang
 * 【时间】: 16/9/27 下午6:49
 * 【题目】: 二叉树中和为某一值的路径
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        FindPath(root, target, 0, stack, lists);
        return lists;
    }

    public void FindPath(TreeNode root, int target, int sum, Stack<TreeNode> stack, ArrayList<ArrayList<Integer>> lists) {
        if (root == null) {
            return;
        }
        sum += root.val;
        stack.push(root);
        //遍历至叶子节点,计算路径和
        if (root.left == null && root.right == null && sum == target) {
            Iterator<TreeNode> iterator = stack.iterator();
            ArrayList<Integer> list = new ArrayList<>();
            while (iterator.hasNext()) {
                TreeNode node = iterator.next();
                list.add(node.val);
            }
            lists.add(list);
        }
        if (root.left != null)
            FindPath(root.left, target, sum, stack, lists);
        if (root.right != null)
            FindPath(root.right, target, sum, stack, lists);
        stack.pop();
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        FindPath t = new FindPath();
        System.out.println(t.FindPath(t1, 8));
    }
}