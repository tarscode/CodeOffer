import java.util.ArrayList;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: FindNumbersWithSum
 * 作者: liuyang
 * 时间: 16/9/20 下午8:38
 * 题目: 和为S的两个数字
 * 内容:
 * 版本: V2.0
 * 运行时间: 39ms
 * 备注: 建立头尾指针，一趟搜索
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList list = new ArrayList();
        int left = 0;
        int right = array.length-1;
        while(left<right){
            if(array[left]+array[right]>sum){
                right--;
            }else if(array[left]+array[right]<sum){
                left++;
            }else{
                list.add(array[left]);
                list.add(array[right]);
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,11,15};
        int sum = 15;
        FindNumbersWithSum t = new FindNumbersWithSum();
        System.out.println(t.FindNumbersWithSum(arr,sum));
    }
}