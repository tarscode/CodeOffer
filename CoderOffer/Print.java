import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Print
 * 作者: liuyang
 * 时间: 16/9/22 下午8:32
 * 题目: 把二叉树打印成多行
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class Print {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<TreeNode> quene = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        if (pRoot == null) {
            return arrList;
        }
        quene.add(pRoot);
        TreeNode last = pRoot;
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
                arrList.add(arr);
                arr = new ArrayList<>();
            }
        }
        return arrList;
    }

    public static void main(String[] args) {
        Print t = new Print();
        System.out.println();
    }
}