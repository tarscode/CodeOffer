/**
 * 【工程】: CodeOffer 包名: PACKAGE_NAME 类名: RectCover
 * 【作者】: liuyang
 * 【时间】: 16/9/27 下午6:34
 * 【题目】: 矩形覆盖
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 斐波那契数列
 * 【思路】:
 */
public class RectCover {
    public int RectCover(int target) {
        if (target < 1) {
            return 0;
        }
        int[] res = new int[target + 1];
        res[0] = 1;
        for (int i = 1; i <= target; i++) {
            res[i] = res[i - 1] + (i < 2 ? 0 : res[i - 2]);
        }
        return res[target];
    }

    public static void main(String[] args) {
        RectCover t = new RectCover();
        System.out.println(t.RectCover(0));
    }
}