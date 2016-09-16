/**
 * Created by liuyang on 16/9/2.
 */
public class InversePairs {
    public int InversePairs(int [] array) {
        int num = 0;
        int len = array.length;
        for(int i=0;i<len;i++){
           for(int j=i+1;j<len;j++){
               if(array[i]>array[j]){
                   num++;
               }
           }
        }
        return num%1000000007;
    }
}
