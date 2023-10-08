class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        List<Integer>list= new ArrayList<>();
        
        int c=0;
        for(int i=nums.size()-1; i>=0; i--)
        {
                list.add(nums.get(i));
                c++;
            if(hasAll(list, k)==true)
            {
                return c;
            }
          
        }
        
        return c;
    }
    public boolean hasAll(List<Integer> list, int k)
    {
        for(int i=1; i<=k; i++)
        {
            if(list.contains(i)==false)
            {
                return false;
            }
        }
        return true;
    }
}