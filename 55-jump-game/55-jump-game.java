class Solution {
    public boolean canJump(int[] nums) {
        int li= nums.length-1;
        for(int i=nums.length-2; i>=0; i--)
        {
            if(nums[i]+i >=li)
            {
                li=i;
            }
          
        }
        return li==0;
    }
}