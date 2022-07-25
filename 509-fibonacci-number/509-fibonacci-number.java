class Solution {
    public int fib(int n) {
        
        //Using Recursion
        
        if(n<2)
        {
            return n;
        }
        
        return fib(n-2)+fib(n-1);
    }
}