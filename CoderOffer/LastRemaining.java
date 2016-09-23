/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: LastRemaining
 * 【作者】: liuyang
 * 【时间】: 16/9/23 下午10:12
 * 【题目】: 圆圈中最后剩下的数
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:递推公式
 * 【思路】:
 */
public class LastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 0) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        return last;
    }

    public static void main(String[] args) {
        LastRemaining t = new LastRemaining();
        System.out.println();
    }
}