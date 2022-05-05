/*

https://leetcode.com/problems/minimum-size-subarray-sum/

*/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0,sum=0;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            while(sum>=target)
            {
            int remove=nums[i];
            
            min=Math.min(min,j-i+1);
            sum-=remove;
            i++;
            }
        }
        if(min==Integer.MAX_VALUE)
        return 0;
        return min;
        
    }
}