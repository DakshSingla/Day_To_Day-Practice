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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode cur = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(cur!=null){
            arr.add(cur.val);
            cur= cur.next;
        }
        int n = arr.size();
        k = k%n;
        if(k==0) return head;
        int[] rotated = new int[n];
        int index = 0;
        for(int i = n-k;i<n;i++){
            int val = arr.get(i);
            rotated[index]= val;
            index++;
        }
        for(int i = 0;i<n-k;i++){
            int val = arr.get(i);
            rotated[index]= val;
            index++;
        }
        ListNode newHead = new ListNode(rotated[0]);
        ListNode temp = newHead;
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(rotated[i]);
            temp = temp.next;
        }
        return newHead;
    }
}