class MedianFinder {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        maxheap.add(num);
        minheap.add(maxheap.poll());
        if(minheap.size() > maxheap.size())maxheap.add(minheap.poll());
    }
    
    public double findMedian() {
        if(maxheap.size()>minheap.size())return maxheap.peek();
        return (double)(maxheap.peek()+minheap.peek())/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */