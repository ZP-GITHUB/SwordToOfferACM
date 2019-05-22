package com.zp.SwordToOffer5;

import java.util.Stack;

/**
 * Created by ZP on 2019/5/22.
 * 用两个栈实现队列
 *
 */
public class SwordToOffer5 {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();
    //入栈
    public void push(int node) {
        in.push(node);
    }
    //两个栈模拟出队列
    public int pop() throws Exception {
        if (out.empty()) {
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        if (out.isEmpty())
            throw new Exception("queue is empty");

        return out.pop();
    }
}
