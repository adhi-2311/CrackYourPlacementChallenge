class Solution {
    static class Pair{
        int val,idx;
        Pair(int _val,int _idx){
            val=_val;
            idx=_idx;
        }
    }
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(k>n)
        return ans;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(b.val-a.val));
        
        for(int i=0;i<k;i++)
        pq.add(new Pair(arr[i],i));
        
        for(int i=k;i<n;i++){
            
            if(!pq.isEmpty())
            {
            Pair top=pq.peek();
            ans.add(top.val);   
            }
            while(!pq.isEmpty() && pq.peek().idx<=i-k)
                {
                    //System.out.println(pq.peek().idx);
                    pq.remove();
                }
           
            pq.add(new Pair(arr[i],i)); 
        }
        if(!pq.isEmpty())
            {
            Pair top=pq.peek();
            ans.add(top.val);   
            }
        return ans;
        
    }
}