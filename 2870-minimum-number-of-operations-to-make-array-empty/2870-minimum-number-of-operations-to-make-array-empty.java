class Solution {
    public int minOperations(int[] nums) {
        
        
        HashMap<Integer, Integer>map= new HashMap<>();
        
        for(int val:nums)
        {
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        
        int c=0;
        
        for(int key:map.keySet())
        {
            int val=map.get(key);
            System.out.println(key+" "+ val);
            
             while(val%3!=0 && val>=0)
              {
                    val-=2;
                    c+=1;
                    //System.out.println(val+" " +c);
                }
               if(val<0)
               {
                   return -1;
               }
                c+=val/3;
            
        
              
            
            
            /*if((val%2!=0) && (val%3!=0))
            {
                return -1;
            }
            
            if((val%2==0) && (val%3==0))
            {
                c+=val/3;
            }
            else if((val%2==0) && (val%3!=0))
            {
                if(val>=3)
                {
                while(val%3!=0)
                {
                    val-=2;
                    c+=1;
                    //System.out.println(val+" " +c);
                }
                c+=val/3;
                //System.out.println(val+" " +c);
              }
                else
                {
                    c+=val/2;
                }
            }
            else if((val%2!=0) && (val%3==0))
            {
                c+=val/3;
            }*/
            
        }
        return c;
    }
}