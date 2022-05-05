class GfG
 {
	String encode(String str)
	{
          //Your code here
        StringBuilder sb=new StringBuilder("");
        int n=str.length();
        
        for(int i=0;i<n;i++)
        {
            int count=1;
            char currChar=str.charAt(i);
            
            while(i<n-1 && currChar==str.charAt(i+1))
            {
                count++;
                i++;
            }
           sb.append(currChar);
           sb.append(Integer.toString(count));
        }
        return sb.toString();
	}
	
 }