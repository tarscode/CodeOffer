import java.util.Stack;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: IsPopOrder
 * 作者: liuyang
 * 时间: 16/9/20 下午9:16
 * 题目: 栈的压入、弹出序列
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注: popA与栈顶元素相等则出栈，移位，否则入栈。
 */
public class IsPopOrder {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        int index = 0;
        Stack stack = new Stack();
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while(!stack.empty()&&((int) stack.peek() == popA[index])) {
                stack.pop();
                index++;
            }
        }
        return index==popA.length?true:false;
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,5,1,2};
        IsPopOrder t = new IsPopOrder();
        System.out.println(t.IsPopOrder(pushA,popA));
    }
}