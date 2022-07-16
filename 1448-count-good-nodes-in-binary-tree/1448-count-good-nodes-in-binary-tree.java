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
    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }
    int count=0;
    public int helper(TreeNode root, int maxSoFar)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.val>=maxSoFar)
        {
            count++;
        }
        helper(root.left, Math.max(root.val, maxSoFar));
        helper(root.right, Math.max(root.val, maxSoFar));
        return count;
    }
}