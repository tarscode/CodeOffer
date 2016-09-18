import java.util.HashMap;
import java.util.Map;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: MoreThanHalfNum
 * 作者: liuyang
 * 时间: 16/9/18 下午10:17
 * 题目: 数组中出现次数超过一半的数字
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 用map辅助
 */
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int len = array.length;
        int max = array[0];
        Map map = new HashMap();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int value = (int) map.get(array[i]);
                map.put(array[i], ++value);
            }
            max = (int) map.get(max) > (int) map.get(array[i]) ? max : array[i];
            if ((int)map.get(max) > len / 2) {
                return max;
            }
            if (((int) map.get(max) + len - i) < len / 2) {
                return 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        MoreThanHalfNum t = new MoreThanHalfNum();
        System.out.println(t.MoreThanHalfNum_Solution(array));
    }
}