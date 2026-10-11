class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if((!st.empty())&&((Character.isLowerCase(st.peek())&&Character.isUpperCase(ch))||Character.isUpperCase(st.peek())&&Character.isLowerCase(ch))&&Character.toLowerCase(st.peek()) ==
Character.toLowerCase(ch))
            st.pop();
            else
            st.push(ch);

        }
        StringBuilder st1=new StringBuilder();
        while(!st.empty())
        {st1.append(st.pop());

        }
        return st1.reverse().toString();
        
    }
}