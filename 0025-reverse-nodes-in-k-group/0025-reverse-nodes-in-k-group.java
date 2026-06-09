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
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while(head != null){
           list.add(head);
           head = head.next;
           if(list.size()== k){
            for(int i = k-1;i>=0;i--){
                cur.next = list.get(i);
                cur = cur.next;
            }
            cur.next = null;
            list.clear();
           }
        }
        if(list.size()>0){
            for(int i = 0;i<list.size();i++){
                cur.next = list.get(i);
                cur = cur.next;

            }
        }
        return ans.next;
    }
}