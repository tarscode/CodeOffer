/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: NumberOf1Between1AndN
 * 作者: liuyang
 * 时间: 16/9/18 下午10:45
 * 题目: 整数中1出现的次数（从1到n整数中1出现的次数）
 * 内容:
 * 版本: V1.0
 * 运行时间: 59ms
 * 备注: 时间复杂度是O(n),采用数字转为字符的暴力求解方法,有更好的优化方法
 */
public class NumberOf1Between1AndN {

    public int NumberOf1Between1AndN_Solution(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            char[] arr = Integer.toString(i).toCharArray();
            for (char number : arr) {
                num = number == '1' ? ++num : num;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        NumberOf1Between1AndN t = new NumberOf1Between1AndN();
        System.out.println(t.NumberOf1Between1AndN_Solution(13));
    }
}