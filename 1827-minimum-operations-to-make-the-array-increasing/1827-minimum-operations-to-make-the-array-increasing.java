class Solution {
    public int minOperations(int[] nums) {
        
        int i=0; 
        int count=0;
        
        while(i<nums.length-1)
        {
            if(nums[i]<nums[i+1])
            {
                i++;
            }
            else
            {
                nums[i+1]+=1;
                count++;
            }
        }
        return count;
    }
}