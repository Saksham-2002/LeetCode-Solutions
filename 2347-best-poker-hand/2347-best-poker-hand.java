class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
         HashMap<Integer, Integer>map= new HashMap<>();
        boolean flag=true;
        
        for(int i=0; i<ranks.length; i++)
        {
            map.put(ranks[i], map.getOrDefault(ranks[i], 0)+1);
        }
        
     for(int i=0; i<suits.length-1; i++)
     {
         
         if(suits[i]!=suits[i+1])
         {
             flag=false;
             break;
         }
     }
        if(flag==true)
        {
            return "Flush";
        }
        
              int max=0;
            for(int key:map.keySet())
            {
                max=Math.max(max, map.get(key));
            }
       
        
        if(max>=3)
        {
            return "Three of a Kind";
        }
        else if(max==2)
        {
            return "Pair";
        }
        else
        {
            return "High Card";
        }
        
    }
}