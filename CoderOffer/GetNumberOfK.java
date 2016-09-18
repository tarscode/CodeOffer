/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: GetNumberOfK
 * 作者: liuyang
 * 时间: 16/9/18 下午8:49
 * 题目: 数字在排序数组中出现的次数
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 二分查找
 */
public class GetNumberOfK {
    public int GetNumberOfK(int[] array, int k) {
        if(array==null||k==0){
            return 0;
        }
        int left = findPos(array, array.length, k);
        int num = 0;
        while (array[left] == k&&left<array.length) {
            num++;
            left++;
            if (left>=array.length||array[left] != k) {
                break;
            }
        }
        return num;
    }

    public int findPos(int[] arr, int n, int num) {
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] >= num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        GetNumberOfK t = new GetNumberOfK();
        System.out.println();
    }
}