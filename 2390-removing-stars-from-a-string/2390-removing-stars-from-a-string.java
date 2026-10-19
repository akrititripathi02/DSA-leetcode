class Solution {
    public String removeStars(String s) {
     Stack<Character>st=new Stack<>();
     for(int i=0;i<s.length();i++)
     {
        char ch=s.charAt(i);
        if(ch=='*')
        st.pop();
        else
        st.push(ch);
     }
     StringBuilder st1=new StringBuilder();
     for(int i=0;i<st.size();i++)
     {
        st1.append(st.get(i));
     }
     return st1.toString();
     
    }
}