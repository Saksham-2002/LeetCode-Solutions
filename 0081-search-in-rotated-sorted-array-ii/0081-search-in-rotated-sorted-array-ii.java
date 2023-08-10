class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h)
        {
            int mid= (l+h)/2;
            if(target==nums[mid])
            {
                return true;
            }
           if(nums[l]<nums[mid])
           {
               if(target>=nums[l] && target<nums[mid])
               {
                   h=mid-1;
               }
               else
               {
                   l=mid+1;
               }
           }
            else if(nums[mid]<nums[l])
            {
                if(target>nums[mid] && target<=nums[h])
                {
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }
            else
            {
                l++;
            }
    }
        return false;
}
}