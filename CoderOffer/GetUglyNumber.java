
/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: GetUglyNumber
 * 【作者】: liuyang
 * 【时间】: 16/9/25 下午7:11
 * 【题目】: 丑数
 * 【内容】: 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 【版本】: V1.1
 * 【运行时间】:
 * 【时间复杂度】:O(n)
 * 【空间复杂度】:O(n)
 * 【备注】:
 * 【思路】:
 */
public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        int arr[] = new int[index];
        arr[0] = 1;
        int i = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        while (i < index) {
            arr[i] = getMin(arr[index2] * 2, arr[index3] * 3, arr[index5] * 5);
            while (arr[index2] * 2 <= arr[i]) {
                ++index2;
            }
            while (arr[index3] * 3 <= arr[i]) {
                ++index3;
            }
            while (arr[index5] * 5 <= arr[i]) {
                ++index5;
            }
            i++;
        }
        return arr[index - 1];
    }

    public int getMin(int num1, int num2, int num3) {
        int min = num1 < num2 ? num1 : num2;
        min = min < num3 ? min : num3;
        return min;
    }

    public static void main(String[] args) {
        GetUglyNumber t = new GetUglyNumber();
        System.out.println(t.GetUglyNumber_Solution(10));
    }
}