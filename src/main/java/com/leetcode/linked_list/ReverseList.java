package com.leetcode.linked_list;

import com.alibaba.fastjson.JSON;
import com.leetcode.linked_list.model.ListNode;

/**
 * <a href='https://leetcode-cn.com/problems/reverse-linked-list/'>反转链表</a>
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 */
public class ReverseList {

    public ListNode solution(ListNode head) {
        System.out.println("输入: " + JSON.toJSONString(head));

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        System.out.println("输出: " + JSON.toJSONString(prev));

        return prev;
    }
}
