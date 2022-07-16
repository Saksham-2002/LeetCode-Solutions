class Solution {
    public int thirdMax(int[] nums) {
        HashMap<Integer, Integer>map= new HashMap<>();
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int key:map.keySet())
        {
            max=Math.max(max, key);
            
            pq.add(key);
            
            if(pq.size()>3)
            {
                pq.remove();
            }
        }
        if(pq.size()<3)
        {
            return max;
        }
        else
        {
            return pq.peek();
        }
    }
}