class Solution {
    public int differenceOfSums(int n, int m) {
        
        long num1=0;
        long num2=0;
        
        for(int i=1; i<=n; i++)
        {
            if((i%m)!=0)
            {
                num1+=i;
            }
        }
        
        for(int j=1; j<=n; j++)
        {
            if((j%m)==0)
            {
                num2+=j;
            }
        }
        //System.out.println(num1+" "+num2);
        return (int)(num1-num2);
    }
}