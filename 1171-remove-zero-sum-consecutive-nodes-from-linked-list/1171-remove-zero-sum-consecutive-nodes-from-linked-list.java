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
    public ListNode removeZeroSumSublists(ListNode head) {
        List<Integer> a = new ArrayList<>();
        ListNode cur = head;
        while ( cur != null){
            a.add(cur.val);
            cur = cur.next;
        }
        for (int i = 0; i < a.size(); ) {
            int sum = 0, j;
            for (j = i; j < a.size(); j++) {
                sum += a.get(j);
                if (sum == 0) break;
            }
            if (sum == 0) {
                for (int k = j; k >= i; k--) a.remove(k);
            } else i++;
        }
        ListNode dummy = new ListNode(0);
        ListNode cu = dummy;
        for (int v : a){
            cu = cu.next = new ListNode(v);
        }
        return dummy.next;
    }
}