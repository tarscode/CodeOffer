/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: StrToInt
 * 【作者】: liuyang
 * 【时间】: 16/9/26 上午11:04
 * 【题目】: 把字符串转换成整数
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class StrToInt {
    public int StrToInt(String str) {
        if (str == null||str.length()==0) {
            return 0;
        }
        long sum = 0;
        char[] arr = str.toCharArray();
        //判断第一个字符是否合法
        if (arr[0] != 45 && arr[0] != 43 && arr[0] > 57 && arr[0] < 49) {
            return 0;
        }
        //判断其他字符是否合法
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 57 || arr[i] < 48) {
                return 0;
            }
        }
        //转化成int
        for (int i = arr.length - 1; i > 0; i--) {
            sum += (arr[i] - 48) * Math.pow(10, arr.length - i - 1);
        }
        if (arr[0] == 45) {
            sum = 0 - sum;
        } else if (arr[0] == 43) {
        } else {
            sum += (arr[0] - 48) * Math.pow(10, arr.length - 1);
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        String str = "-2147483648";
        StrToInt t = new StrToInt();
        System.out.println(t.StrToInt(str));
    }
}