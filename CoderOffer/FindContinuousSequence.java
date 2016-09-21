import java.util.ArrayList;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: FindContinuousSequence
 * 作者: liuyang
 * 时间: 16/9/21 上午9:57
 * 题目: 和为S的连续正数序列
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList nums = new ArrayList();
        ArrayList num = null;
        int left = 1;
        int right = 2;
        int curSum = left+right;
        while(left<=sum/2){
            if(curSum<sum){
                curSum+=++right;
            }else if(curSum>sum){
                curSum-=left++;
            }else{
                num = new ArrayList();
                for(int i=left;i<=right;i++){
                    num.add(i);
                }
                nums.add(num);
                curSum-=left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        FindContinuousSequence t = new FindContinuousSequence();
        System.out.println(t.FindContinuousSequence(15));
    }
}