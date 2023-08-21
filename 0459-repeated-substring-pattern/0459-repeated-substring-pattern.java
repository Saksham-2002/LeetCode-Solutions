class Solution {
    public boolean repeatedSubstringPattern(String s) 
    {
        int len = s.length();
        int div=2;
        while(div<=len)
        {
            if(len%div==0)
            {
                int windowSize = len/div;
                // window size is equal to the factor
                String firstSubString = s.substring(0,windowSize);
                int start = windowSize;
                boolean substringRepeated = false;
                // Loop through all the remaining substrings
                while(start<len)
                {
                    String nextSubString = s.substring(start,start+windowSize);
                    start += windowSize;
                    if(firstSubString.equals(nextSubString)==false)
                    {
                        substringRepeated = false;
                        break;
                    }
                    substringRepeated = true;
                }
                if(substringRepeated)
                {
                    return true;
                }
            }
            div++;
        }
        return false;
    }
}