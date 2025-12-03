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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head== null) return null;
        ListNode check = head;
        for(int i =0;i<k; i++){
            if(check== null) return head;
            check = check.next;
        }
        ListNode newHead=reverse(head, check);
        head.next= reverseKGroup(check, k);
        return newHead;
    }

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = null, curr = start;
        while(curr!=end) {
            ListNode next= curr.next;
            curr.next =prev;
            prev= curr;
            curr =next;
        }
        return prev;
    }
}
