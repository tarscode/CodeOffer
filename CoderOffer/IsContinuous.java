import java.util.Arrays;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: IsContinuous
 * 作者: liuyang
 * 时间: 16/9/21 下午4:50
 * 题目: 扑克牌顺子
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class IsContinuous {
    public boolean isContinuous(int[] numbers) {
        int len = numbers.length;
        if (numbers == null || len != 5) {
            return false;
        }
        int king = 0;
        int block = 0;
        for (int i = 0; i < len; i++) {
            king = numbers[i] == 0 ? ++king : king;//记录王牌数量
        }
        Arrays.sort(numbers);
        for (int i = king + 1; i < len; i++) {
            if(numbers[i]==numbers[i-1]){
                return false;
            }
            block += numbers[i] - numbers[i - 1] - 1;//记录相差的数字和

        }
        return block <= king ? true : false;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,1,6,4};
        IsContinuous t = new IsContinuous();
        System.out.println(t.isContinuous(arr));
    }
}