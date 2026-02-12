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
        if(head==null||head.next==null){
            return false;
        }
        boolean f = false;
        Set<Integer> set = new HashSet<>();
        while(head!=null&&head.next!=null){
            if(set.contains(head.val)){
                f=true;
                break;
            }else
            set.add(head.val);
            head = head.next;
        }
        return f;
    }
}