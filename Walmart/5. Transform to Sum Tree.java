class Solution{
    public int helper(Node root)
    {
        
        if(root==null)
        return 0;
        
        int prev=root.data;
        
        if(root.left==null && root.right==null){
            int x=root.data;
            root.data=0;
            return x;
        }
        
        int l=helper(root.left);
        int r=helper(root.right);
       /// System.out.println(l+" "+r+" "+root.data);
        root.data=l+r;
        return root.data+prev;
    }
    public void toSumTree(Node root){
         //add code here.
         helper(root);
    }
}