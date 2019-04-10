package com.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    private Queue<Integer> mQueue1 = new LinkedList<Integer>();
    private Queue<Integer> mQueue2 = new LinkedList<Integer>();

    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        mQueue1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int result = mQueue1.poll();
        while (!mQueue1.isEmpty()) {
            if (!mQueue1.isEmpty()) {
                mQueue2.add(result);
            }
            result = mQueue1.poll();
        }
        while (!mQueue2.isEmpty()) {
            mQueue1.add(mQueue2.poll());
        }
        return result;
    }

    /** Get the top element. */
    public int top() {
        int result = mQueue1.poll();
        while (!mQueue1.isEmpty()) {
            if (!mQueue1.isEmpty()) {
                mQueue2.add(result);
            }
            result = mQueue1.poll();
        }
        mQueue2.add(result);
        while (!mQueue2.isEmpty()) {
            mQueue1.add(mQueue2.poll());
        }
        return result;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return mQueue1.isEmpty();
    }
}
