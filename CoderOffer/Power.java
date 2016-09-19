
/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: Power
 * 作者: liuyang
 * 时间: 16/9/16 下午4:18
 * 题目: 数值的整数次方
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: 递归求解优化
 */
public class Power {
    public double Power(double base, int exponent) {
        if(base<0.000001&&base>-0.000001){
            return 0.0;
        }
        if(exponent<0){
            return 1/PowerExponent(base,-exponent);
        }
        return PowerExponent(base,exponent);
    }
    public double PowerExponent(double base,int exponent){
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double res = PowerExponent(base, exponent >> 1);//右移代替除2
        res *= res;
        //位运算判奇偶
        if ((exponent & 1) == 1) {
            res *= base;
        }
        return res;
    }

    public static void main(String[] args) {
        Power t = new Power();
        System.out.println(t.Power(2,-4));
    }
}