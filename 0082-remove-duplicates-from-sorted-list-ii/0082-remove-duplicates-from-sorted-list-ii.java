class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head1 = new ListNode(0);
        ListNode head_new = head1;
        ListNode curr = head;
        while(curr != null){
            if(curr.next == null){
            head_new.next  = curr;
            break;
            }
          if(curr.val != curr.next.val){
                head_new.next = curr;
                head_new = head_new.next;
                curr = curr.next;
                head_new.next = null;
          }
          else{
            while(curr.next != null &&curr.val == curr.next.val){
                curr = curr.next;
            }
            curr = curr.next;
          }
        }

        return head1.next;
    }
}
