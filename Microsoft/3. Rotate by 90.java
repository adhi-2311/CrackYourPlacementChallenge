class GFG
{ 
    public static void transpose(int arr[][]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
             int temp=arr[i][j];
             arr[i][j]=arr[j][i];
             arr[j][i]=temp;
            }
        }
    }
    

    static void rotate(int arr[][]) 
    {
        // Code Here
         int n=arr.length;
       
       transpose(arr); 
       for(int i=0;i<n;i++){
           int top=0,down=n-1;
           while(top<=down){
               int temp=arr[top][i];
               arr[top][i]=arr[down][i];
               arr[down][i]=temp;
               top++;
               down--;
           }
       }
    }
}