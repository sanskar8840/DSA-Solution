class MedianFinder {

     PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
     PriorityQueue<Integer> pq2 = new PriorityQueue<>();
    public MedianFinder() {

    }

    public void addNum(int num) {


        if (pq1.size() == 0)
            pq1.add(num);
        else {
            if (num < pq1.peek()) {
                pq1.add(num);
            } else {
                pq2.add(num);
            }
            if (pq1.size() == pq2.size() + 2)
                pq2.add(pq1.remove());
            if (pq2.size()  == pq1.size()+2)
                pq1.add(pq2.remove());

        }
    }

    public double findMedian() {
        if (pq1.size() == pq2.size() + 1)
            return pq1.peek();
        else if (pq2.size() == pq1.size()+1)
            return pq2.peek();
        else {
            return (pq1.peek() + pq2.peek()) / 2.0;
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */