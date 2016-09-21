/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Sum
 * 作者: liuyang
 * 时间: 16/9/21 下午7:28
 * 题目: 求1+2+3+...+n
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 利用布尔运算短路计算实现递归
 */
public class Sum {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        Sum t = new Sum();
        System.out.println(t.Sum_Solution(100));
    }
}