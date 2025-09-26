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
        HashSet <ListNode> set = new HashSet<>();
        boolean flag = false;
        while(head != null && head.next!=null){
            if(set.contains(head)){
                flag = true;
                break;
            }
            else
            set.add(head);
            head =head.next;        
        } 
        return flag;
    }
}