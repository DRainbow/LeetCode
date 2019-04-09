package com.leetcode.linked_list.model;

import java.io.Serializable;

public class ListNode implements Cloneable, Serializable {

    public int val;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
