import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: ZPrintTree
 * 作者: liuyang
 * 时间: 16/9/22 下午9:25
 * 题目: 按之字形顺序打印二叉树
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 算法原型按层次遍历二叉树
 */
public class ZPrintTree {
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
        int flag = 1;//判断打印顺序
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
                if(flag==0){
                    arrList.add(reverse(arr));
                }else{
                    arrList.add(arr);
                }
                arr = new ArrayList<>();
                flag = flag ^ 1;
            }
        }
        return arrList;
    }
    public ArrayList<Integer> reverse(List list){
        ArrayList arr = new ArrayList();
        for(int i=list.size()-1;i>=0;i--){
            arr.add(list.get(i));
        }
       return arr;
    }

    public static void main(String[] args) {
        ZPrintTree t = new ZPrintTree();
        System.out.println();
    }
}