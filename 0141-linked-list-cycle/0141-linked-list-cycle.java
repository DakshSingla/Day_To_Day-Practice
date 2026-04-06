/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        boolean flag = true;
        ListNode cur = head;
        Set<ListNode> set = new HashSet<>();
        while(cur != null){
            if(set.contains(cur)){
                flag = flag;
                break;
            }
            set.add(cur);
            cur = cur.next;
        }
        return flag;
    }
}