import java.util.HashMap;
import java.util.Map;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Duplicate
 * 作者: liuyang
 * 时间: 16/9/20 下午7:26
 * 题目: 数组中重复的数字
 * 内容:
 * 版本: V1.0
 * 运行时间: 35ms
 * 备注: 用map做的,空间复杂度(n),占用内存636K
 */
public class Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        Map map = new HashMap();
        for(int i=0;i<length;i++){
            if(map.containsKey(numbers[i])){
                duplication[0] = numbers[i];
                return true;
            }else{
                map.put(numbers[i],1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] dup = new int[1];
        int len = arr.length;
        Duplicate t = new Duplicate();
        System.out.println(t.duplicate(arr,len,dup));
    }
}