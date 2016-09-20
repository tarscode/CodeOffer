import java.util.ArrayList;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: PrintMatrix
 * 作者: liuyang
 * 时间: 16/9/19 下午8:31
 * 题目: 顺时针打印矩阵
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 按照题目移动四个指针,终止条件是list数组长度等于矩阵长度
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int num = row * col;
        int top = 0;
        int down = row - 1;
        int left = 0;
        int right = col - 1;
        ArrayList list = new ArrayList<>();
        while (list.size() < num) {
            if (list.size() < num) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
            }
            if (list.size() < num) {
                for (int j = top; j <= down; j++) {
                    list.add(matrix[j][right]);
                }
                right--;
            }
            if (list.size() < num) {
                for (int k = right; k >= left; k--) {
                    list.add(matrix[down][k]);
                }
                down--;
            }
            if (list.size() < num) {
                for (int l = down; l >= top; l--) {
                    list.add(matrix[l][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        PrintMatrix t = new PrintMatrix();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(t.printMatrix(matrix));
    }
}