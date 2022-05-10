class Solution
{
    static class Pair{
        int key;
        int value;
        Pair(int key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }
    
    public static class SortByValue implements Comparator<Pair>
    {
        public int compare(Pair a, Pair b)
        {
            return (b.value- a.value); 
        }
    }
    //Function to find maximum of each subarray of size k.
    
    static ArrayList <Integer> max_of_subarrays(int nums[], int n, int k)
    {
        // Your code here
        ArrayList <Integer> ans=new ArrayList<>();
        
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(n,new SortByValue());
        for(int i=0;i<k;i++)
        {
           Pair x=new Pair(i,nums[i]);
           pq.add(x);
        }
        int i=0;
        for(i=k;i<n;i++)
        {
            if(!pq.isEmpty())
            {
            Pair top=pq.peek();
             ans.add(top.value);   
            }
            while(!pq.isEmpty() && pq.peek().key<=i-k)
                pq.remove();
            Pair x=new Pair(i,nums[i]);
            pq.add(x); 
            
        }
        if(!pq.isEmpty())
            {
            Pair top=pq.peek();
            ans.add(top.value);   
            }
        return ans;
    }
}