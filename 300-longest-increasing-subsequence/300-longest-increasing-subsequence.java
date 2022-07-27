class Solution {
    public int lengthOfLIS(int[] nums) {
        
        //Using Binary Serach
        // TC=nlogn.
        int tail[]= new int[nums.length];
        int length=1;
        
        tail[0]=nums[0];
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]>tail[length-1])
            {
                tail[length]=nums[i];
                length++;
            }
            else
            {
                int c=FindCeil(tail, 0, length-1, nums[i]);
                tail[c]=nums[i];
            }
        }
        return length;
        
    }
    public int FindCeil(int tail[], int low, int high, int value)
    {
         while(low<high)
         {
             int mid=(low+high)/2;
             
             if(tail[mid]>=value)
             {
                 high=mid;
             }
             else
             {
                 low=mid+1;
             }
         }
        return high;
    }
}