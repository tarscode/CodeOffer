/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: Multiply
 * 【作者】: liuyang
 * 【时间】: 16/9/26 下午11:39
 * 【题目】: 构建乘积数组
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:找出规律
 * 【思路】:
 */
public class Multiply {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        int[] begin = new int[len];
        int[] end = new int[len];
        if (len == 0) {
            return B;
        }
        //正序求出数组A在位置的连乘积
        begin[0] = A[0];
        for (int i = 1; i < len; i++) {
            begin[i] = begin[i - 1] * A[i];
        }
        //逆序求出数组A在位置的连乘积
        end[len - 1] = A[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            end[i] = end[i + 1] * A[i];
        }
        //求数组B
        B[0] = end[1];
        B[len - 1] = begin[len - 2];
        for (int i = 1; i < len - 1; i++) {
            B[i] = begin[i - 1] * end[i + 1];
        }

        return B;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 0, 4, 5};
        Multiply t = new Multiply();
        System.out.println(t.multiply(A));
    }
}