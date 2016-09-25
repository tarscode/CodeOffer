import java.util.*;

/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: GetUglyNumber
 * 【作者】: liuyang
 * 【时间】: 16/9/25 下午7:11
 * 【题目】: 丑数
 * 【内容】: 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        Set set = new HashSet();
        set.add(1);
        List<Integer> list = new ArrayList<>();
        int[] arr = {2, 3, 5};
        list.add(1);
        int flag = 0;
        while (list.size() <= index) {
            for (int i = 0; i < arr.length && list.size() <= index; i++) {
                int value = list.get(flag) * arr[i];
                if (!set.contains(value)) {
                    set.add(value);
                    list.add(value);
                }
            }
            flag++;
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        return list.get(index-1);
    }

    public static void main(String[] args) {
        GetUglyNumber t = new GetUglyNumber();
        System.out.println(t.GetUglyNumber_Solution(10));
    }
}