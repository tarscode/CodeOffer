/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: NumberOf1
 * 作者: liuyang
 * 时间: 16/9/16 下午3:43
 * 题目: 二进制中1的个数
 * 内容:
 * 版本: V1.0
 * 运行时间: 31ms
 * 备注: 将整数转化成二进制字符串，进行匹配统计
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        char[] arr = Integer.toBinaryString(n).toCharArray();
        int num = 0;
        for (char a : arr) {
            num = a == '1' ? ++num : num;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 5;
        NumberOf1 t = new NumberOf1();
        System.out.println(t.NumberOf1(n));
    }
}