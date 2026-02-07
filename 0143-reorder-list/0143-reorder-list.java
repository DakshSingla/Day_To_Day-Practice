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
    public void reorderList(ListNode head) {
        if(head ==null||head.next ==null) return;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2!= null&& p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        ListNode second = p1.next;
        p1.next = null;
        ListNode prev = null;
        ListNode curr = second;
        while(curr!= null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        second = prev;

        ListNode start = head;

        while(second != null) {
            ListNode t1 = start.next;
            ListNode t2 = second.next;

            start.next = second;
            second.next = t1;

            start = t1;
            second = t2;
        }
    }
}