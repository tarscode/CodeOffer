import java.util.Stack;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: ReverseSentence
 * 作者: liuyang
 * 时间: 16/9/21 下午3:03
 * 题目: 翻转单词顺序列
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        int index = 0;
        Stack wordStack = new Stack();
        Stack strStack = new Stack();
        for (int i = 0; i < len; i++) {
            //以空格为分界用栈两次处理每一个单词
            if (arr[i] == ' ') {
                while (!wordStack.empty() && arr[i] == ' ') {
                    strStack.push(wordStack.pop());
                }
                strStack.push(arr[i]);
            } else {
                wordStack.push(arr[i]);

            }
            //处理最后一个单词
            if (i == len - 1) {
                while (!wordStack.empty()) {
                    strStack.push(wordStack.pop());
                }
            }
        }
        while (!strStack.empty()) {
            arr[index++] = (char) strStack.pop();
        }
        str = String.valueOf(arr);
        return str;
    }

    public static void main(String[] args) {
        String str = "Student. heu am I";
        ReverseSentence t = new ReverseSentence();
        System.out.println(t.ReverseSentence(str));
        System.out.println(str);
    }
}