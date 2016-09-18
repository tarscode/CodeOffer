/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: FindNumsAppearOnce
 * 作者: liuyang
 * 时间: 16/9/18 下午7:59
 * 题目: 数组中只出现一次的数字
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 位运算
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int xor = 0;
        for (int arr : array) {
            xor ^= arr;
        }
        int tmp = xor & (~xor + 1);
        for (int cur : array) {
            if ((cur & tmp) != 0) {
                num1[0] ^= cur;
            }
        }
        num2[0] = xor ^ num1[0];
    }

    public static void main(String[] args) {
        FindNumsAppearOnce t = new FindNumsAppearOnce();
        System.out.println();
    }
}