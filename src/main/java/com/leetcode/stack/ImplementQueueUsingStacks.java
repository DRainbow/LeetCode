package com.leetcode.stack;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    private Stack<Integer> mInStack = new Stack<Integer>();

    private Stack<Integer> mOutStack = new Stack<Integer>();

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        mInStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (mOutStack.empty()) {
            while (!mInStack.empty()) {
                mOutStack.push(mInStack.pop());
            }
        }
        return mOutStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (mOutStack.empty()) {
            while (!mInStack.empty()) {
                mOutStack.push(mInStack.pop());
            }
        }
        return mOutStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return mOutStack.empty() && mInStack.empty();
    }
}
