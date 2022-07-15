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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list= new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        
        
      //we are using a stack here because we need to process the right child of every node, we push all the let node in stack then pop it and print it and then add the right child of the same node.
        
        Stack<TreeNode>st= new Stack<>();
         TreeNode curr=root;
        
        while(curr!=null || !st.isEmpty())
        {
            while(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            list.add(curr.val);
            curr=curr.right;
        }
        return list;
    }
}