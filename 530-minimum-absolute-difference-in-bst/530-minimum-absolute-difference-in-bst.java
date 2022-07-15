/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer>list= new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        if(root!=null)
        {
            getMinimumDifference(root.left);
            list.add(root.val);
             getMinimumDifference(root.right);
        }
        
        int min=Integer.MAX_VALUE;
        
        for(int i=1; i<list.size(); i++)
        {
            int diff=Math.abs(list.get(i)-list.get(i-1));
            min=Math.min(min, diff);
        }
        return min;
    }
}