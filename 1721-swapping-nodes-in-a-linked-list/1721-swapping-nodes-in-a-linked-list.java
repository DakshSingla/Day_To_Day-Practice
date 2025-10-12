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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur = head;
        for ( int i = 1;i<k;i++){
            cur=cur.next;
        }
        ListNode a = cur;
        ListNode b = head;
        while (cur != null&&cur.next!= null){
            cur=cur.next;
            b = b.next;
        } 
        int temp = a.val;
        a.val = b.val;
        b.val=temp;
        return head;
    }
}