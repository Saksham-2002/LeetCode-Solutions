class Solution {
    int[][] offset = {{-1,0},{1,0},{0,1},{0,-1}};
    int mod = (int)(1e9+7);
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        Integer[][][] memo = new Integer[m][n][maxMove+1];
        return find(m, n, startRow, startColumn, maxMove, memo);
    }
    
    private int find(int m, int n, int row, int col, int max, Integer[][][] memo) {
        if(row<0||col<0||row>=m||col>=n) return 1;
        if(memo[row][col][max]!=null) return memo[row][col][max];
        if(max==0) return 0;
        
        int count = 0;
        for(int[] off: offset){
            int newRow = row+off[0];
            int newCol = col+off[1];
            count = count + find(m, n, newRow, newCol, max-1, memo);
            count%=mod;
        }
        memo[row][col][max] = count;
        return count;
    }
}