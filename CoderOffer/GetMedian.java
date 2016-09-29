import java.util.ArrayList;
import java.util.Arrays;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: GetMedian
 * 【作者】: liuyang
 * 【时间】: 16/9/26 上午12:04
 * 【题目】: 数据流中的中位数
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:可以优化
 * 【思路】:
 */
public class GetMedian {
    private ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        int len = list.size();
        if(len==0){
            return 0.0;
        }
        Object[] obj = list.toArray();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
           arr[i] = (int)obj[i];
        }
        Arrays.sort(arr);
        if(len%2==0){
            return (arr[len/2]+arr[len/2-1])/2.0;
        }else{
            return arr[len/2]*1.0;
        }
    }
    public static void main(String[] args) {
        GetMedian t = new GetMedian();
        t.Insert(1);
        System.out.println(t.GetMedian());
    }
}