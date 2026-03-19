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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<lists.length;i++){
            ListNode cur = lists[i];
            while(cur != null){
                pq.offer(cur.val);
                cur = cur.next;
            }
        }
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return ans.next;
    }
}