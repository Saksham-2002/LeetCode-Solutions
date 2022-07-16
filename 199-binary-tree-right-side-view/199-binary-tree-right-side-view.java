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
    public List<Integer> rightSideView(TreeNode root) {
        return helper(root, 0);
    }
    
    
    //we are traversing in reverse preorder i.e Root->Right->Left and for 
    //ensuring that our list have only right side view nodes we are checking
    //that our list size is equal to level we are at.
    
    List<Integer>list= new ArrayList<>();
    public List<Integer> helper(TreeNode root, int level)
    {
        if(root!=null)
        {
            if(list.size()==level)
            {
                list.add(root.val);
            }
            helper(root.right, level+1);
            helper(root.left, level+1);
        }
        return list;
    }
}