import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: FindNumbersWithSum
 * 作者: liuyang
 * 时间: 16/9/20 下午8:38
 * 题目: 和为S的两个数字
 * 内容:
 * 版本: V1.0
 * 运行时间: 32ms
 * 备注: 建立Map，两趟搜索
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        Map map = new HashMap();
        ArrayList list = new ArrayList();
        for(int i=0;i<array.length;i++){
            map.put(array[i],i);
        }
        for(int i=0;i<array.length;i++){
            int target = sum - array[i];
            if(map.containsKey(target)){
                list.add(array[i]);
                list.add(target);
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