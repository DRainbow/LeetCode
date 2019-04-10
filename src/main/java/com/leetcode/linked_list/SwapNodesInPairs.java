package com.leetcode.linked_list;

import com.alibaba.fastjson.JSON;
import com.leetcode.linked_list.model.ListNode;

/**
 * <a href='https://leetcode-cn.com/problems/swap-nodes-in-pairs/'>两两交换链表中的节点</a>
 *
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 */
public class SwapNodesInPairs {

    public ListNode solution(ListNode head) {
        System.out.println("输入: " + JSON.toJSONString(head));

        ListNode prev = head;
        while (prev != null) {
            ListNode curr = prev.next;
            if (curr != null) {
                int temp = prev.val;
                prev.val = curr.val;
                curr.val = temp;
                prev = prev.next;
            }
            prev = prev.next;
        }

        System.out.println("输出: " + JSON.toJSONString(head));

        return head;
    }
}
