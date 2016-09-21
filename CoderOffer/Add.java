/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Add
 * 作者: liuyang
 * 时间: 16/9/21 下午7:40
 * 题目: 不用加减乘除做加法
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 位运算
 */
public class Add {
    public int Add(int num1,int num2) {
        int sum = num1^num2;
        int carry = (num1&num2) << 1;
        while(num2!=0){
            sum = num1^num2;
            carry = (num1&num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }

    public static void main(String[] args) {
        Add t = new Add();
        System.out.println(t.Add(1,2));
    }
}