class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer>map= new HashMap<>();
        int res=-1;
        for(int num:nums)
        {
            int sum=sumofdigits(num);
            
            if(map.containsKey(sum))
            {
                res=Math.max(res, map.get(sum)+num);
                map.put(sum, Math.max(map.get(sum), num));
            }
            else
            {
                map.put(sum, num);
            }
        }
        return res;
    }
    int  sumofdigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }
    
}