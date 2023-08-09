class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer>list= new ArrayList<>();
        int val1=Integer.MIN_VALUE;
        int val2=Integer.MIN_VALUE;
        
        int count1=0;
        int count2=0;
        
        for(int num:nums)
        {
            if(count1==0 && val2!=num)
            {
                count1=1;
                val1=num;
            }
            else if(count2==0 && val1!=num)
            {
                count2=1;
                val2=num;
            }
            else if(num==val1)
            {
                count1++;
            }
            else if(num==val2)
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        for(int num:nums)
        {
            if(num==val1)
            {
                count1++;
            }
            if(num==val2)
            {
                count2++;
            }
        }
        
        if(count1>(nums.length/3))
        {
            list.add(val1);
        }
        if(count2>(nums.length/3))
        {
            list.add(val2);
        }
        return list;
    }
}