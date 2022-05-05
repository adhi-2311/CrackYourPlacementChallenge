class Solution {
    
    public int countSubArrayProductLessThanK(long nums[], long n, long k)
    {
        
        if(k<=1)
            return 0;
        
        int l=0,r=0,ans=0;
        long prod=1l;
        for(r=0;r<n;r++){
           
            prod*=nums[r];
            
            while(prod>=k){
                //sequeeze the window
                long remove=nums[l++];
                prod/=remove;
               
            }
            
            ans+=(r-l+1);
        }
      
        return ans;
    }
}