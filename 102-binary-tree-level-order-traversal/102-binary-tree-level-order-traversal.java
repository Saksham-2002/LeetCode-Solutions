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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result= new ArrayList<>();
        
        if(root==null)
        {
            return result;
        }
        
        Queue<TreeNode>queue= new LinkedList<>();
        
        queue.add(root);
        
        //we are maintainig the size of the queue as we fill run a for loop from 0 to size of queue and we will get all the child nodes of the current level, them we will add all the nodes in a list.
        while(!queue.isEmpty())
        {
            int count=queue.size();
            List<Integer>list= new ArrayList<>();
            for(int i=0; i<count; i++)
            {
               TreeNode curr= queue.poll();
                list.add(curr.val);
                
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}