class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static void dfs( ArrayList<ArrayList<Integer>> adj,int src,int vis[]){
        vis[src]=1;
        for(Integer child:adj.get(src)){
             if(vis[child]==0){
                 dfs(adj,child,vis);
             }
        }
    }
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        int vis[]=new int[V+1];
        int cc_initial=0,cc_final=0;
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {
                cc_initial++;
                dfs(adj,i,vis);
            }
        }
        Arrays.fill(vis,0);
        
        adj.get(c).remove(new Integer(d));
        adj.get(d).remove(new Integer(c));
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {
                cc_final++;
                dfs(adj,i,vis);
            }
        }
        
        //System.out.println(cc_initial+" "+cc_final);
        
        if(cc_initial+1==cc_final)
        return 1;
        return 0;
    }
}