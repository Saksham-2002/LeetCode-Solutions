class Solution {
    public int[][] merge(int[][] intervals) {
        
       List<int[]>result= new ArrayList<>();
       Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        int first=intervals[0][0];
        int second=intervals[0][1];
            
        
        for(int i=0; i<intervals.length; i++)
        {
            if(intervals[i][0]<=second)
            {
                second=Math.max(second, intervals[i][1]);
            }
            else
            {
                result.add(new int[]{first, second});
                first=intervals[i][0];
                second=intervals[i][1];
            }
        }
        result.add(new int[]{first, second});
        return result.toArray(new int[0][]);
    }
}