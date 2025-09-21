/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dum = new ListNode(0);
        dum.next=head;
        ListNode cur = dum;
        while(cur.next != null && cur.next.next != null){
            ListNode num1 = cur.next;
            ListNode num2 = cur.next.next;
            num1.next = num2.next;
            num2.next = num1;
            cur.next = num2;
            cur = num1;

        }
        return dum.next;
    }
}