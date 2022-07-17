class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        int arr[]= new int[2];
        
        HashMap<Integer, Integer>map= new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int count=0;
        int left=0;
        for(int key: map.keySet())
        {
            if(map.get(key)>=2)
            {
                count+=map.get(key)/2;
            }
            left+=map.get(key)%2;
        }
        arr[0]=count;
        arr[1]=left;
            return arr;
    }
}