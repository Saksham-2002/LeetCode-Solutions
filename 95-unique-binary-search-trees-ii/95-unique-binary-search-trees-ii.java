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
    public List<TreeNode> generateTrees(int n) {
        
        return helper(1, n);
    }
    public List<TreeNode> helper(int start, int end)
    {
        List<TreeNode>list= new ArrayList<>();
        
        if(start>end)
        {
            list.add(null);
            return list;
        }
        if(start==end)
      {
          list.add(new TreeNode(start));
            return list;
        }
        
        for(int i=start; i<=end; i++)
        {
       List<TreeNode> leftpossible= helper(start, i-1);
        List<TreeNode> rightpossible= helper(i+1, end);
        
        for(TreeNode left: leftpossible)
        {
            for(TreeNode right: rightpossible)
            {
                TreeNode root= new TreeNode(i);
                root.left=left;
                root.right=right;
                list.add(root);
            }
        }
        }
        return list;
        
    }
}