class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        for (int val : list) {
            temp.val = val;
            temp = temp.next;
        }
        return head;
    }
}
