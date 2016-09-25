import java.util.Arrays;
import java.util.Comparator;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: PrintMinNumber
 * 【作者】: liuyang
 * 【时间】: 16/9/24 上午10:21
 * 【题目】: 把数组排成最小的数
 * 【内容】: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:O(n2)
 * 【空间复杂度】:O(n)
 * 【备注】:
 * 【思路】:
 *  首先,建立String类型辅助数组arr,将int型numbers[i]转换成String,存储到arr[i]中.
 *  然后,对数组arr进行排序,重写sort方法,对于strA和strB的先后顺序的排序算法为:
 *       若strA+strB的字典序小于strB+strA的字典序,则strA位于strB前;否则,strB位于strA前.
 *  最后,遍历数组arr,将全部元素连接并输出.
 */
public class PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String strA, String strB) {
                return (strA+strB).compareTo(strB+strA);
            }
        });
        String str = "";
        for (int i = 0; i < numbers.length; i++) {
            str += arr[i];
        }
        return str;
    }

    public static void main(String[] args) {
        int[] num = {3334,3,3333332};
        PrintMinNumber t = new PrintMinNumber();
        System.out.println(t.PrintMinNumber(num));
    }
}