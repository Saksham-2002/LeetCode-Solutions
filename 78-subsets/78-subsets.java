class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     
         List<List<Integer>>result= new ArrayList<>();
        List<Integer>list= new ArrayList<>();
        
        helper(0, nums, result, list);
        return result;
        
    }
    public void helper(int index, int arr[], List<List<Integer>> result, List<Integer>list)
    {
        if(index==arr.length)
        {
            result.add(new ArrayList(list));
            return;
        }
        
        //Inculding the ith element
        list.add(arr[index]);
        helper(index+1, arr, result, list);
        
        //Excluding the ith element
        list.remove(list.size()-1);
         helper(index+1, arr, result, list);
    }
}