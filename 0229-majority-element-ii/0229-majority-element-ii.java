class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer>list= new ArrayList<>();
        HashMap<Integer, Integer>map= new HashMap<>();
        
        for(int val:nums)
        {
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        
        for(int key:map.keySet())
        {
            int val=map.get(key);
            
            if(val>(nums.length/3))
            {
                list.add(key);
            }
        }
        return list;
    }
}