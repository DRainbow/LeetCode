import com.leetcode.heap.KthLargestElementInAStream;
import com.leetcode.linked_list.ReverseList;
import com.leetcode.linked_list.SwapNodesInPairs;
import com.leetcode.linked_list.model.ListNode;
import com.leetcode.stack.ImplementQueueUsingStacks;
import com.leetcode.stack.ImplementStackUsingQueues;
import com.leetcode.string.ValidParentheses;

public class Main {

    public static void main(String[] args) {

        /* <a href='https://leetcode-cn.com/problems/reverse-linked-list/'>反转链表</a> */
//        ListNode temp = new ListNode(1);
//        temp.next = new ListNode(2);
//        temp.next.next = new ListNode(3);
//        temp.next.next.next = new ListNode(4);
//        temp.next.next.next.next = new ListNode(5);
//        new ReverseList().solution(temp);


//        ListNode temp = new ListNode(1);
//        temp.next = new ListNode(2);
//        temp.next.next = new ListNode(3);
//        temp.next.next.next = new ListNode(4);
//        temp.next.next.next.next = new ListNode(5);
//        new SwapNodesInPairs().solution(temp);

//        new ValidParentheses().solution2("]");

//        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
//        queue.push(1);
//        queue.push(2);
//        System.out.println(queue.peek());
//        System.out.println(queue.pop());
//        System.out.println(queue.empty());

//        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
//        stack.push(1);
//        stack.push(2);
//        System.out.println(stack.top());
//        System.out.println(stack.pop());
//        System.out.println(stack.empty());

        int k = 3;
        int[] arr = new int[]{4, 5, 8, 2};
        KthLargestElementInAStream kthLargest = new KthLargestElementInAStream(3, arr);
        System.out.println(kthLargest.add2(3));
        System.out.println(kthLargest.add2(5));
        System.out.println(kthLargest.add2(10));
        System.out.println(kthLargest.add2(9));
        System.out.println(kthLargest.add2(4));
    }
}
