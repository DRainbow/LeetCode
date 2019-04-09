import com.leetcode.linked_list.ReverseList;
import com.leetcode.linked_list.model.ListNode;

public class Main {

    public static void main(String[] args) {

        ListNode temp = new ListNode(1);
        temp.next = new ListNode(2);
        temp.next.next = new ListNode(3);
        temp.next.next.next = new ListNode(4);
        temp.next.next.next.next = new ListNode(5);
        new ReverseList().solution(temp);
    }
}
