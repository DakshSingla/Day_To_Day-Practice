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
    private ListNode left;
     private boolean check(ListNode right) {
        if (right == null) return true;

        if (!check(right.next)) return false;

        if (left.val != right.val) return false;

        left = left.next;
        return true;
    }
    public boolean isPalindrome(ListNode head) {
           left = head;
        return check(head);
        // Stack<Integer> st = new Stack<>();
        // ListNode cur = head;
        // while(cur!=null){
        //     st.push(cur.val);
        //     cur=cur.next;
        // }
        // cur = head;
        // while(cur!=null){
        //     if(cur.val == st.peek()){
        //         st.pop();
        //         cur = cur.next;
        //         return true;
        //     }else break;
        // }
        // return false;
        // List<Integer> list = new ArrayList<>();
        // ListNode node = head;
        // while(node!= null) {
        //     list.add(node.val);
        //     node = node.next;
        // }
        // for(int i = 0;i<list.size()/2;i++){
        //     if(!list.get(i).equals(list.get(list.size()-1-i))) return false;
        // }
        // return true;
    }
    
}