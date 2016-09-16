import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by liuyang on 16/7/27.
 * 滑动窗口的最大值
 */
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        int n = num.length;
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        if (num == null||n == 0||size==0){
            return arrayList;
        }
        LinkedList<Integer> window = new LinkedList<>();
        for(int i = 0;i<n;i++){
            while(!window.isEmpty()&&num[window.peekLast()]<num[i]){
                window.pollLast();
            }
            window.addLast(i);
            if(i-window.peekFirst()==size){
                window.pollFirst();
            }
            if(i>=size-1) {
                arrayList.add(num[window.peekFirst()]);
            }
        }
        return arrayList;
    }
}
