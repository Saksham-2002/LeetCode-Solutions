class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result= new ArrayList<>();
        List<Integer>list= new ArrayList<>();
        
        helper(0, candidates, target, result, list);
        return result;
        
        
    }
    public void helper(int index, int arr[], int target, List<List<Integer>>result, List<Integer>list)
    {
        // if our index becomes equal to arr length and target is also zero then add list to final list of list and return from here to find other combinations.
        if(index==arr.length)
        {
            if(target==0)
            {
            result.add(new ArrayList<>(list));
        }
            return;
        }
        //including the same element again and again and reducing the target
         //by target-arr[index] 
        if(arr[index]<=target)
        {
            list.add(arr[index]);
            helper(index, arr, target-arr[index], result, list);
            
            //removing the current element so that in next recursion call it will not be there
            list.remove(list.size()-1);
        }
        
        //excluding the current index and moving to index+
        helper(index+1, arr, target, result, list);
    }
}