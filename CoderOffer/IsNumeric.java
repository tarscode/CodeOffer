/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: IsNumeric
 * 【作者】: liuyang
 * 【时间】: 16/10/2 下午7:47
 * 【题目】: 表示数值的字符串
 * 【内容】: 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 需要二刷
 * 【思路】:
 */
public class IsNumeric {
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");

    }

    public static void main(String[] args) {
        IsNumeric t = new IsNumeric();
        System.out.println();
    }
}