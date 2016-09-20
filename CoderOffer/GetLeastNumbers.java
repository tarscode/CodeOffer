import java.util.ArrayList;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: GetLeastNumbers
 * 作者: liuyang
 * 时间: 16/9/20 上午10:41
 * 题目: 最小的K个数
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 创建小顶堆排序
 */
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList list = new ArrayList();
        int len = input.length;
        if(k>len){
            return list;
        }
        int n = len;
        int[] B = new int[len + 1];
        //数组右移一位复制
        for (int p = 0; p < len; p++) {
            B[p + 1] = input[p];
        }
        //数组初始化小顶堆
        for (int i = len / 2; i >= 1; i--) {
            sink(B, i, len);
        }
        while(n>len-k){
            list.add(B[1]);
            exch(B, 1, n--);
            sink(B, 1, n);
        }
        return list;
    }
    //构建小顶堆
    private void sink(int[] A, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && A[j] > A[j + 1])
                j++;
            if (A[k] < A[j])
                break;
            exch(A, k, j);
            k = j;
        }
    }

    private void exch(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 4, 3, 1, 5};
        int n = arr.length;
        GetLeastNumbers t = new GetLeastNumbers();
        System.out.println(t.GetLeastNumbers_Solution(arr, 7));
    }
}