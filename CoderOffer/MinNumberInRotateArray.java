/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: MinNumberInRotateArray
 * 作者: liuyang
 * 时间: 16/9/16 下午2:20
 * 题目: 旋转数组的最小数字
 * 内容:
 * 版本: V1.0
 * 运行时间: 137 ms
 * 备注: 二分查找,时间复杂度(logn)
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length-1;
        if(array.length==0){
            return 0;
        }
        int mid = 0;
        while(left<right){
           mid = left + (right-left)/2;
            if(array[mid]>array[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return array[left];
    }
    public static void main(String[] args) {
        int[] array = {4,5,6,1,2,3};
        MinNumberInRotateArray t = new MinNumberInRotateArray();
        System.out.println(t.minNumberInRotateArray(array));
    }
}