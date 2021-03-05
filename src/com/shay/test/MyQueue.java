package com.shay.test;

import java.util.Deque;
import java.util.LinkedList;

class MyQueue {
    //入队
    Deque<Integer> aStack;
    //出队使用
    Deque<Integer> bStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        //使用linkedlist初始化堆栈，stack类已经弃用
        aStack = new LinkedList<Integer>();
        bStack = new LinkedList<Integer>();
    }


    /** Push element x to the back of queue. */
    public void push(Integer x) {
        aStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public Integer pop() {
        if(empty()){
            return -1;
        }
        swtichStack();
        return bStack.pop();
    }

    /** Get the front element. */
    public Integer peek() {
        if(empty()){
            return -1;
        }
        swtichStack();
        return bStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return bStack.isEmpty() && aStack.isEmpty();
    }

    //倒腾一次，把入队伍的倒腾到出队堆栈中，
    //也就是把先入栈的数据放到了栈顶
    private void swtichStack(){
        //检查出队的堆栈是否已经空了，否则不倒腾，
        // 这时倒腾会导致队头成为新进入的队列的队头。
        // 空能保证刚入队的栈底倒腾到b中时是队头
        if(bStack.isEmpty()){
            while(!aStack.isEmpty()){
                bStack.push(aStack.pop());
            }
        }

    }
}