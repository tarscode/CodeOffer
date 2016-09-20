import java.util.HashMap;
import java.util.Map;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Duplicate
 * 作者: liuyang
 * 时间: 16/9/20 下午7:26
 * 题目: 数组中重复的数字
 * 内容:
 * 版本: V2.0
 * 运行时间: 40ms
 * 备注: 数组中指针与原位比较，无额外空间,占用内存528k
 */
public class Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int index;
        for(int i=0;i<length;i++){
            while(numbers[i]!=i){
                index = numbers[i];
                numbers[i] = numbers[index];
                if(numbers[index]==index){
                    duplication[0]=index;
                    return true;
                }
                numbers[index] = index;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,0};
        int[] dup = new int[1];
        int len = arr.length;
        Duplicate t = new Duplicate();
        System.out.println(t.duplicate(arr,len,dup));
    }
}