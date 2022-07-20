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

 public class pair
    {
        TreeNode node;
        int index;
        
       public pair(TreeNode node, int index)
        {
            this.node=node;
            this.index=index;
        }
    }
class Solution {

    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<pair>q= new LinkedList<>();
        
        int max=0;
        q.addLast(new pair(root, 0));
        
        while(!q.isEmpty())
        {
            int size=q.size();
            int lm=q.getFirst().index;
            int rm=q.getFirst().index;
            
            for(int i=0; i<size; i++)
            {
                pair rp=q.removeFirst();
                rm=rp.index;
                
                if(rp.node.left!=null)
                {
                    q.addLast(new pair(rp.node.left, (rp.index*2+1)));
                }
                if(rp.node.right!=null)
                {
                    q.addLast(new pair(rp.node.right, (rp.index*2+2)));
                }
            }
            max= Math.max(max, rm-lm+1);
        }
        return max;
    }
}