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
    public ListNode deleteMiddle(ListNode head) {
        ListNode cur = head;
        ListNode ruc = cur.next;
        int count = 0;
        if(cur.next==null) return null;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        int cal = count /2;
        cur=head;
        for (int i = 0; i < cal - 1; i++) {
            cur = cur.next;
        }
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
        return head;
        

    }
}