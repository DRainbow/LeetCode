import com.leetcode.linked_list.ReverseList;
import com.leetcode.linked_list.SwapNodesInPairs;
import com.leetcode.linked_list.model.ListNode;

public class Main {

    public static void main(String[] args) {

        /* <a href='https://leetcode-cn.com/problems/reverse-linked-list/'>反转链表</a> */
//        ListNode temp = new ListNode(1);
//        temp.next = new ListNode(2);
//        temp.next.next = new ListNode(3);
//        temp.next.next.next = new ListNode(4);
//        temp.next.next.next.next = new ListNode(5);
//        new ReverseList().solution(temp);


        ListNode temp = new ListNode(1);
        temp.next = new ListNode(2);
        temp.next.next = new ListNode(3);
        temp.next.next.next = new ListNode(4);
        temp.next.next.next.next = new ListNode(5);
        new SwapNodesInPairs().solution(temp);
    }
}
