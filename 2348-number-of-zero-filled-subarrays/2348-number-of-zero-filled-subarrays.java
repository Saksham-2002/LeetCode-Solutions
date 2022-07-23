class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long rslt=0;
        long cnt=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                cnt=cnt+1;
            }
            else
            {
                rslt+=(cnt*(cnt+1))/2;
                cnt=0;
            }
        }
        rslt+=(cnt*(cnt+1))/2;
        return rslt;
    }
}