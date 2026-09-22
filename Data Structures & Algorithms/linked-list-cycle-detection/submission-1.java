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
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode cur = head;
        ListNode curne = head;
        while( curne!=null&&curne.next!=null){
            cur = cur.next;
            curne = curne.next.next;
            if(cur==curne) return true;
        }
        return false;
    }
}
