//https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1/#
class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        Queue<String> q=new LinkedList<>();
        ArrayList<String> ans=new ArrayList<>();
        q.add("1");
        for(int i=0;i<N;i++)
        {
            String top=q.poll();
            ans.add(top);
            q.add(top+"0");
            q.add(top+"1");
        }
        return ans;
    }
    
}
