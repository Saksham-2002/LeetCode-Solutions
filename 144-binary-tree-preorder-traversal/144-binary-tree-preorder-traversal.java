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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list= new ArrayList<>();
        Stack<TreeNode>st= new Stack<>();
        if(root==null)
        {
            return list;
        }
        
        TreeNode curr=root;
        
        //iterative solution we only push the right childes, we process the curr node we print it, then we add the right child of that that to stack and call for its left child.
        
        while(curr!=null || !st.isEmpty())
        {
            while(curr!=null)
            {
                list.add(curr.val);
                if(curr.right!=null)
                {
                    st.push(curr.right);
                }
                curr=curr.left;
            }
            if(!st.isEmpty())
            {
                curr=st.pop();
            }
        }
        return list;
    }
}