import sun.security.util.Length;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: VerifySquenceOfBST
 * 【作者】: liuyang
 * 【时间】: 16/9/27 下午11:28
 * 【题目】: 二叉搜索树的后序遍历序列
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        return verify(sequence,sequence.length);
    }
    public boolean verify(int[] sequence,int len){
        if (sequence == null || len <= 0) return false;
        int root = sequence[len - 1];
        //在二叉搜索树中左子树的节点小于根节点
        int i = 0;
        for (; i < len - 1; ++i) {
            if (sequence[i] > root) break;
        }
        //在二叉搜索树中右子树的节点小于根节点
        int j = i;
        for (; j < len - 1; ++j) {
            if (sequence[j] < root) {
                return false;
            }
        }
        //判断左子树是不是二叉树
        boolean left = true;
        if (i > 0) left = verify(sequence,i);

        //判断右子树是不是二叉树
        boolean right = true;
        if (i < len - 1) right = verify(sequence,len-i-1);
        return left && right;
    }

    public static void main(String[] args) {
        VerifySquenceOfBST t = new VerifySquenceOfBST();
        System.out.println();
    }
}