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
    int c=1; int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
        {
            return ans;
        }
        
        kthSmallest(root.left, k);
        if(c==k)
        {
            ans=root.val;
        }
        c++;
        kthSmallest(root.right, k);
            return ans;
    }
}