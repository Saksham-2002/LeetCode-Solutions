class Solution {
    public int maxSum(int[] nums) {
        
        int arr[]=maxDigit(nums);
        
            HashMap<Integer, List<Integer>>map= new HashMap<>();
        
            for(int i=0; i<arr.length; i++)
            {
                if(map.get(arr[i])!=null)
                {
                    List<Integer>l=map.get(arr[i]);
                    l.add(nums[i]);
                    map.put(arr[i], l);
                }
                else
                {
                    List<Integer>list= new ArrayList<>();
                    list.add(nums[i]);
                    map.put(arr[i], list);
                } 
            }
        
            int msum=0;
          for(int key:map.keySet())
          {
              List<Integer>list=map.get(key);
              int sum=0;
              if(list.size()>1)
              {
                  Collections.sort(list);
                  sum+=list.get(list.size()-1);
                  sum+=list.get(list.size()-2);
                  msum=Math.max(sum, msum);
              }
          }
        
        if(msum>0)
        {
            return msum;
        }
        return -1;
    }
    public int[] maxDigit(int arr[])
    {
        int ans[]= new int[arr.length];
        
        int i=0;
        for(int val:arr)
        {
            int max=Integer.MIN_VALUE;
            while(val>0)
            {
                int rem=val%10;
                max=Math.max(max, rem);
                val=val/10;
            }
            ans[i]=max;
            i++;
        }
        return ans;
    }
}