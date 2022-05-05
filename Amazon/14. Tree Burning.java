//https://practice.geeksforgeeks.org/problems/burning-tree/1/#
class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    public static void storeParent(Node node,HashMap<Node,Node> par,int target){
           if(node==null)
           return;
           if(node.data==target)
           targetNode=node;
           if(node.left!=null)
            par.put(node.left,node);
            if(node.right!=null)
            par.put(node.right,node);
            
            storeParent(node.left,par,target);
            storeParent(node.right,par,target);
            
    }
    
    static Node targetNode=null;
    public static int bfs(HashMap<Node,Node> par){
        Queue<Node> q=new LinkedList<>();
        int depth=0;
        
        q.add(targetNode);
        Set<Node> vis=new HashSet<>();
        while(!q.isEmpty())
        {
            int qsize=q.size();
            while(qsize-->0)
            {
            Node top=q.poll();
            //System.out.println(top.data);
            vis.add(top);
            
            if(top.left!=null && !vis.contains(top.left))
            q.add(top.left);
             if(top.right!=null && !vis.contains(top.right))
            q.add(top.right);
            if(par.containsKey(top) && !vis.contains(par.get(top)))
            q.add(par.get(top));
            }
            
            depth++;
        }
        return depth-1;
    }
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        HashMap<Node,Node> par=new HashMap<Node,Node>();
        storeParent(root,par,target);
        
        return bfs(par);
        
    }
}