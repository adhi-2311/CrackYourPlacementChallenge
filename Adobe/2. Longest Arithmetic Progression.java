class Solution {
    
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        int ans=2;
        
        Map<Integer,Integer> dp[]=new HashMap[n];
        
        for(int i=0;i<n;i++)
        {
            dp[i]=new HashMap<>();
            for(int j=0;j<i;j++)
            {
                int diff=nums[i]-nums[j];
                if(!dp[j].containsKey(diff))
                    dp[i].put(diff,2);
                else
                    dp[i].put(diff,dp[j].get(diff)+1);
                
                ans=Math.max(ans,dp[i].get(diff));
            }
        }
        
        
        return ans;
    }
}