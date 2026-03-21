class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        int n = hand.length;
        Queue<Integer>pq = new PriorityQueue<>();
        for(int i = 0;i<n;i++){
            pq.offer(hand[i]);
        }
    while(!pq.isEmpty()){
        int s = pq.poll();
        for(int i = 1;i<groupSize;i++){
            int net = s+i;
            if(!pq.remove(net)) return false;
        }
    }
        return true;
    }
}