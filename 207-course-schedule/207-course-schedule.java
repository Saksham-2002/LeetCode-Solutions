class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int inorder[]= new int[numCourses];
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0; i<numCourses; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
       
        for(int i=0; i<prerequisites.length; i++)
        {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
           inorder[prerequisites[i][0]]++;
        }  
        Queue<Integer>q= new LinkedList<>();
        for(int i=0; i<inorder.length; i++)
        {
            if(inorder[i]==0)
            {
                q.add(i);
            }
        }
        
        int index=0;
        
        while(!q.isEmpty())
        {
            int node=q.poll();
            index++;
            
            for(int anode:adj.get(node))
            {
                inorder[anode]--;
                
                if(inorder[anode]==0)
                {
                    q.add(anode);
                }
            }
        }
        return index==numCourses;
    }
}