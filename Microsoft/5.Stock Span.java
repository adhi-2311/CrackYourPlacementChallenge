class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        // next greater left
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        st.push(0);
        ans[0]=1;
        
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && price[st.peek()]<=price[i])
            st.pop();
            
            if(!st.isEmpty())
            ans[i]=i-st.peek();
            else
            ans[i]=i+1;
            st.push(i);
        }
        return ans;
    }
    
}