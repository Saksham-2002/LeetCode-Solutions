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
    int result=0;
    public int height(TreeNode root)
    {
        //we just have to find max of leftheight+rightheight of all nodes and return that max
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        result=Math.max(result, lh+rh);
        return Math.max(lh, rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return result;
    }
}