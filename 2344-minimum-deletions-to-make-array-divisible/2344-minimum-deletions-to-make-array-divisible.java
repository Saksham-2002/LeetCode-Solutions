class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        TreeMap<Integer, Integer>map= new TreeMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int count=0;
        for(int key:map.keySet())
        {
            if(divideAll(key,numsDivide)==false)
            {
                count+=map.get(key);
            }
            else
            {
              return count;
            }
        }
        if(count==nums.length)
        {
            return -1;
        }
        else
        {
        return count;
        }
    }
  public boolean divideAll(int val, int nums[])
  {
      for(int i=0; i<nums.length; i++)
      {
          if((nums[i]%val)!=0)
          {
              return false;
          }
      }
      return true;
  }
}