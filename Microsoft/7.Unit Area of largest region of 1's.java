class Solution
{
    //Function to find unit area of the largest region of 1s.
    int dir[][]={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
    public void dfs(int grid[][],int i,int j,int r,int c,int count[])
    {
        if(i<0||j<0||i>=r||j>=c||grid[i][j]!=1)
        return;
        
        grid[i][j]=-1;
        count[0]++;
        
        for(int eachDir[]:dir)
        dfs(grid,i+eachDir[0],j+eachDir[1],r,c,count);
        
    }
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int count[]=new int[1];
        int max=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]!=-1 && grid[i][j]!=0)
                {
                    dfs(grid,i,j,r,c,count);
                    max=Math.max(max,count[0]);
                    count[0]=0;
                }
            }
        }
        return max;
    }
}