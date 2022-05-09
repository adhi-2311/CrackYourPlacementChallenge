class Solution
{
    static HashMap<Integer,String> hm=new HashMap<Integer,String>();
    
    public static void hashMap()
    {
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        
    }
    public static void recurr(int s[],int idx,StringBuilder comb,ArrayList<String> ans){
           if(idx>=s.length)
           {
               ans.add(comb.toString());
               return;
           }
           String curr=hm.get(s[idx]);
           //System.out.println(curr);
           for(int i=0;i<curr.length();i++)
           {
               comb=comb.append(curr.charAt(i));
               //System.out.println(comb);
               recurr(s,idx+1,comb,ans);
               comb=comb.deleteCharAt(comb.length()-1);
               //System.out.println(comb);
           }
    }
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        
        ArrayList<String> ans=new ArrayList<String>();
        hashMap();
        
        recurr(a,0,new StringBuilder(""),ans);
        return ans;
    }
}