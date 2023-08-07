class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer>set= new HashSet<>();
        
        for(int val:nums)
        {
            if(set.contains(val)==true)
            {
                return val;
            }
            set.add(val);
        }
        return -1;
    }
}