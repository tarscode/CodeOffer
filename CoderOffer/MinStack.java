/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: MinStack
 * 作者: liuyang
 * 时间: 16/9/18 下午7:16
 * 题目: 包含min函数的栈
 * 内容:
 * 版本: V1.0
 * 运行时间:
 * 备注:
 */

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        stack.push(Integer.valueOf(node));
        if (minStack.empty() || stack.peek() < minStack.peek()) {
            minStack.push(Integer.valueOf(node));
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}