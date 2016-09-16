/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: NumberOf1
 * 作者: liuyang
 * 时间: 16/9/16 下午3:43
 * 题目: 二进制中1的个数
 * 内容:
 * 版本: V1.1
 * 运行时间: 30ms
 * 备注: 移位方法
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int num = 0;
        while (n != 0) {
            num++;
            n = n & (n - 1);
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 5;
        NumberOf1 t = new NumberOf1();
        System.out.println(t.NumberOf1(n));
    }
}