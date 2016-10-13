/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: LeftRotateString
 * 作者: liuyang
 * 时间: 16/9/21 上午11:05
 * 题目: 左旋转字符串
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class LeftRotateString {
    //三步翻转
    public String LeftRotateString(String str, int n) {
        if (n < 0 || n > str.length()) {
            return "";
        }
        char[] arr = str.toCharArray();
        reverse(arr, 0, n - 1);
        reverse(arr, n, str.length() - 1);
        reverse(arr, 0, str.length() - 1);
        return String.valueOf(arr);
    }

    public void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    /*
    暴力移位
    public String LeftRotateString(String str, int n) {
        char[] arr = str.toCharArray();
        char[] res = str.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            res[i] = arr[(i + n) % len];
        }
        str = String.valueOf(res);
        return str;
    }
    */

    public static void main(String[] args) {
        String str = "helloworld";
        int n = 3;
        LeftRotateString t = new LeftRotateString();
        System.out.println(t.LeftRotateString(str, n));
    }
}