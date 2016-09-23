/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: FindGreatestSumOfSubArray
 * 作者: liuyang
 * 时间: 16/9/23 下午4:25
 * 题目: 连续子数组的最大和
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 * 思路:
 * 首先，建立辅助数组arr,存储以array[i]结尾的连续子数组的最大和.
 * 然后，对于arr[i]:如果arr[i-1]小于0,arr[i]等于array[i];否则，arr[i]等于arr[i-1]与array[i]之和.
 * 同时，建立最大和变量max,如果arr[i]大于max的值,则更新max的值.
 * 最后，返回max,即为连续子数组的最大和.
 * 时间复杂度:O(n)
 * 空间复杂度:O(n)
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int[] arr = new int[array.length];
        arr[0] = array[0];
        int max = arr[0];
        for(int i=1;i<array.length;i++){
            arr[i] = arr[i-1]>0?array[i]+arr[i-1]:array[i];
            max = arr[i]>max?arr[i]:max;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,3,10,-4,7,2,-5};
        FindGreatestSumOfSubArray t = new FindGreatestSumOfSubArray();
        System.out.println(t.FindGreatestSumOfSubArray(arr));
    }
}