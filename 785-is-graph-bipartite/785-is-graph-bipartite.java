class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]= new int[n];
        Arrays.fill(color, -1);
        
        Queue<Integer>q= new LinkedList<>();
        
        for(int i=0; i<n; i++)
        {
            if(color[i]==-1)
            {
                q.add(i);
                color[i]=1;
            }
            
            while(!q.isEmpty())
            {
                int vertex=q.poll();
                
                for(int adjnode:graph[vertex])
                {
                    if(color[adjnode]==-1)
                    {
                        color[adjnode]=1-color[vertex];
                        q.add(adjnode);
                    }
                    else if(color[adjnode]==color[vertex])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
}