class Solution {
    public int findKthLargest(int[] nums, int k) {
        
       PriorityQueue<Integer>pq= new PriorityQueue<>();        
        for(int val:nums)
        {
            pq.add(val);
        }
        
        while(pq.size()!=k)
        {
            pq.poll();
        }
        return pq.peek();
    }
}