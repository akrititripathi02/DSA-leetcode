class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int hash[]=new int[256];int max=0;int l=0;int r=0;
       for(int i=0;i<256;i++)
       {
        hash[i]=-1;
       }
       while(r<s.length())
       {
        if(hash[s.charAt(r)]!=-1)
        {
            if(hash[s.charAt(r)]>=l){
                l=hash[s.charAt(r)]+1;

            }}
            int len=r-l+1;
            max=Math.max(max,len);
            hash[s.charAt(r)]=r;
            r++;
        }
        return max;
       }}