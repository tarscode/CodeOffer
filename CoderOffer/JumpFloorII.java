/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: JumpFloorII
 * 作者: liuyang
 * 时间: 16/9/16 下午2:54
 * 题目: 变态跳台阶
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 公式法
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }

    public static void main(String[] args) {
        JumpFloorII t = new JumpFloorII();
        System.out.println();
    }
}