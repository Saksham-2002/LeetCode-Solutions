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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return helper(preorder, 0, preorder.length-1, postorder, 0, postorder.length-1);
        
    }
 public TreeNode helper(int[] pre, int psi, int pei, int[] post, int posi, int poei)
    {
     if(psi>pei)
     {
         return null;
     }
        TreeNode root= new TreeNode(pre[psi]);
     if(psi==pei)
     {
         return root;
     }
          int index=posi;
     
         while(post[index]!=pre[psi+1])
         {
             index++;
         }
     int count=index-posi+1;
     root.left=helper(pre, psi+1, psi+count, post, posi, index);
     root.right=helper(pre, psi+count+1, pei, post, index+1, poei-1);
     return root;
    }
}