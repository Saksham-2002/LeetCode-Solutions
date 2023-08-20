class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        StringBuilder sb= new StringBuilder();
        
        for(String str:words)
        {
            char ch=str.charAt(0);
            sb.append(ch);
        }
        
        return sb.toString().equals(s);
    }
}