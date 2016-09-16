/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Find
 * 作者: liuyang
 * 时间: 16/9/15 下午10:19
 * 题目: 二维数组中的查找
 * 内容:
 * 版本:
 * 运行时间:
 * 备注:
 */
public class Find {
    public boolean Find(int[][] array, int target) {
        int row = array.length;
        for (int i = 0; i < row; i++) {
            int col = array[i].length;
            for (int j = col - 1; j >= 0; j--) {
                if (target == array[i][j]) {
                    return true;
                } else if (target > array[i][j]) {
                    break;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 10;
        Find t = new Find();
        System.out.println(t.Find(array, target));
    }
}