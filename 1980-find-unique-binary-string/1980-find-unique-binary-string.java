class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
        List<String> list=listOfStrings(nums);
        
        List<String> q= Arrays.asList(nums);
        
        for(String s:list)
        {
            if(q.contains(s)==false)
            {
                return s;
            }
        }
        
        return " ";
        
    }
   public String toBinaryString(int num, int length)
    {
        StringBuilder sb = new StringBuilder();
        // Loop to append the binary digits to the
        // StringBuilder
        for (int i = length - 1; i >= 0; i--) {
            // Use bitwise AND operation to extract the
            // binary digit at position 'i'
            int bit = (num & (1 << i)) >> i;
            // Append the binary digit to the StringBuilder
            sb.append(bit);
        }
        return sb.toString();
    }
    public List<String> listOfStrings(String[] arr)
    {
        int n=arr[0].length();
        List<String> list= new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            // Convert the integer 'i' to a binary string
            // representation of length 32 using the BitSet
            // class Note: Java's BitSet class does not have
            // a direct to_string() method like C++, so
            // we'll convert it to a binary string
            // representation using a custom method
            String binaryString = toBinaryString(i, n);
            list.add(binaryString);
    }
         return list;
}
}