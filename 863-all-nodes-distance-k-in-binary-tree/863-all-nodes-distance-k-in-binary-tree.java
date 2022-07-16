/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<Integer>list= new ArrayList<>();
        HashSet<TreeNode>visited= new HashSet<>();
        Queue<TreeNode>queue= new LinkedList<>();
        HashMap<TreeNode, TreeNode>map= new HashMap<>();
        findParent(root, map);
        queue.add(target);
        
        while(!queue.isEmpty())
        {
            int size=queue.size();
            
            for(int i=0; i<size; i++)
            {
                TreeNode curr=queue.poll();
                visited.add(curr);
                if(k==0)
                {
                    list.add(curr.val);
                }
                
        if(map.containsKey(curr) && !visited.contains(map.get(curr)))
                {
                    queue.add(map.get(curr));
                }
                
                if(curr.left!=null && !visited.contains(curr.left))
                {
                    queue.add(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right))
                {
                    queue.add(curr.right);
                }
               
            }
            k--;
            if(k<0)
                {
                    break;
                }
        } 
        return list;
    }
    public static void findParent(TreeNode root, HashMap<TreeNode, TreeNode>map)
    {
        if(root==null)
        {
            return;
        }
        if(root.left!=null)
        {
            map.put(root.left, root);
        }
        if(root.right!=null)
        {
            map.put(root.right, root);
        }
        
        findParent(root.left, map);
        findParent(root.right, map);
    }
}