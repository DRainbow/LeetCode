package com.leetcode.linked_list;

import com.alibaba.fastjson.JSON;
import com.leetcode.linked_list.model.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href='https://leetcode-cn.com/problems/linked-list-cycle/'>环形链表</a>
 *
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * 示例 2：
 *
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 * 示例 3：
 *
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 *
 * 进阶：
 *
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 *
 */
public class LinkedListCycle {

    /**
     * set 去重
     * @param head
     * @return
     */
    public boolean solution(ListNode head) {
        System.out.println("输入: " + JSON.toJSONString(head));

        ListNode temp = head;
        Set<Integer> poor = new HashSet<Integer>();

        while (temp != null) {
            if (poor.contains(temp.hashCode())) {
                return true;
            }
            poor.add(temp.hashCode());
            temp = temp.next;
        }

        return false;
    }

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public boolean solution2(ListNode head) {
        System.out.println("输入: " + JSON.toJSONString(head));

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast != null && slow != null && fast == slow) {
                return true;
            }
        }

        return false;
    }
}