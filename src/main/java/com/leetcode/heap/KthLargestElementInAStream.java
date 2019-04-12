package com.leetcode.heap;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <a href='https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/'>数据流中的第K大元素</a>
 *
 * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
 *
 * 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
 *
 * 示例:
 *
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 * 说明:
 * 你可以假设 nums 的长度≥ k-1 且k ≥ 1。
 *
 */
public class KthLargestElementInAStream {

    private PriorityQueue<Integer> mQueue;

    private int mKth;

    public KthLargestElementInAStream(int k, int[] nums) {
        mQueue = new PriorityQueue<Integer>(k);
        mKth = k;
        for (int num : nums) {
            add2(num);
        }
        System.out.println("初始化优先队列: " + JSON.toJSONString(mQueue));
    }

    /**
     * set 存储 k max
     * @param val
     * @return
     */
    public int add(int val) {
        return 0;
    }

    /**
     * 优先队列，小顶堆，min heap
     * @param val
     * @return
     */
    public int add2(int val) {
        if (mQueue.size() < mKth) {
            mQueue.add(val);
        } else if (mQueue.peek() < val) {
            mQueue.poll();
            mQueue.add(val);
        }
        return mQueue.peek();
    }
}
