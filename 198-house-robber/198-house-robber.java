class Solution {
    public int rob(int[] nums) {
        
        int include=nums[0];
        int exclude=0;
        
        for(int i=1; i<nums.length; i++)
        {
            int newinclude=exclude+nums[i];
            int newexclude=Math.max(include, exclude);
            
            include=newinclude;
            exclude=newexclude;
        }
        int result=Math.max(include, exclude);
        return result;
    }
}