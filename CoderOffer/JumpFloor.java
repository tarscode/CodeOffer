/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: JumpFloor
 * 作者: liuyang
 * 时间: 16/9/16 下午2:33
 * 题目: 跳台阶
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            dp[i] = (i >= 1 ? dp[i - 1] : 0) + (i >= 2 ? dp[i - 2] : 0);
        }
        return dp[target];
    }

    public static void main(String[] args) {
        JumpFloor t = new JumpFloor();
        System.out.println();
    }
}