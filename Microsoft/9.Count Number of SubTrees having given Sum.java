class Tree
{
    public int helper(Node root,int X,int count[])
    {
        
        if(root==null)
        return 0;
        
        //int prev=root.data;
        
        int l=helper(root.left,X,count);
        int r=helper(root.right,X,count);
        int sum=l+r+root.data;
        if(sum==X)
        count[0]++;
        return root.data=sum;
        
    }
    //Function to count number of subtrees having sum equal to given sum.
    int countSubtreesWithSumX(Node root, int X)
    {
	//Add your code here.
	int count[]=new int[1];
	helper(root,X,count);
	return count[0];
    }
}