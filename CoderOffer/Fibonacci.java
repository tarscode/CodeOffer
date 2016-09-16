/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Fibonacci
 * 作者: liuyang
 * 时间: 16/9/16 下午1:35
 * 题目: 斐波那契数列
 * 内容:
 * 版本: V1.1
 * 运行时间: 35ms
 * 备注: 非递归和动态规划
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        int[] dp = new int[40];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Fibonacci t = new Fibonacci();
        System.out.println();
    }
}