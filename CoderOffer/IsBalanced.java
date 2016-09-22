/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: IsBalanced
 * 作者: liuyang
 * 时间: 16/9/22 下午8:14
 * 题目: 平衡二叉树
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class IsBalanced {
    public boolean IsBalanced_Solution(TreeNode root) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(root,1,res);
        return res[0];

    }
    private int getHeight(TreeNode node,int level,boolean[] res){
        if(node == null){
            return level;
        }
        int lH = getHeight(node.left,level+1,res);
        if(!res[0]){
            return level;
        }
        int rH = getHeight(node.right,level+1,res);
        if(!res[0]){
            return level;
        }
        if(Math.abs(rH-lH)>1){
            res[0] = false;
        }
        return Math.max(rH,lH);
    }

    public static void main(String[] args) {
        IsBalanced t = new IsBalanced();
        System.out.println();
    }
}