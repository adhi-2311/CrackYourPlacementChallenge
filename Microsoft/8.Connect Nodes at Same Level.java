class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
       
        if(root==null)
        return;
        
         Queue<Node> q=new LinkedList<>();
         
         q.add(root);
         
         while(!q.isEmpty())
         {
             int qsize=q.size();
             Node prev=null;
             while(qsize-->0)
             {
                 Node top=q.poll();
                 if(prev!=null)
                 prev.nextRight=top;
                 
                 if(top.left!=null)
                 q.add(top.left);
                 
                 if(top.right!=null)
                 q.add(top.right);
                 
                 prev=top;
                 top.nextRight=null;
                 
             }
         }
    }
}