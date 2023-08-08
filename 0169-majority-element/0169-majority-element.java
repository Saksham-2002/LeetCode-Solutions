class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer>map= new HashMap<>();
        
        for(int val:nums)
        {
            map.put(val, map.getOrDefault(val, 0)+1);
            int freq=map.get(val);
            
            if(freq>((nums.length)/2))
            {
                return val;
            }
        }
        return -1;
    }
}