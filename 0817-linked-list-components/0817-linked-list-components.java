class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n :nums) set.add(n);

        int count = 0;
        ListNode temp = head;

        while (temp !=null) {
            if (set.contains(temp.val)) {
                while (temp !=null && set.contains(temp.val)) {
                    temp =temp.next;
                }
                count++;
            } else {
                temp =temp.next;
            }
        }

        return count;
    }
}
