class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String ch:operations)
        {
            if(ch.equals("+"))
            {
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);

            }
            else if(ch.equals("D"))
            st.push(st.peek()*2);
            else if(ch.equals("C"))
            st.pop();
            else
            st.push(Integer.parseInt(ch));
        }
        int s=0;
    while(!st.empty())
        {s=s+st.pop();

        }
        return s;
        
    }
}