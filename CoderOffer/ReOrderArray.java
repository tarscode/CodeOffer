import java.util.LinkedList;
import java.util.List;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: ReOrderArray
 * 作者: liuyang
 * 时间: 16/9/17 下午3:14
 * 题目: 调整数组顺序使奇数位于偶数前面
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 两个栈，一个存储奇数，一个存储偶数
 */
public class ReOrderArray {
    public void reOrderArray(int[] array) {
        List<Integer> eve = new LinkedList<>();//偶数
        List<Integer> odd = new LinkedList<>();//奇数
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                odd.add(array[i]);
            }else{
                eve.add(array[i]);
            }
        }
        for(int j=0;j<odd.size();j++){
           array[j]=odd.get(j);
        }
        for(int k=0;k<eve.size();k++){
            array[odd.size()+k]=eve.get(k);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,7};
        ReOrderArray t = new ReOrderArray();
        t.reOrderArray(array);
        System.out.println();
    }
}