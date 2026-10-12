     import java.util.Stack;

    class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(ch);
            }
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char ch : st1) {
            sb1.append(ch);
        }

        for (char ch : st2) {
            sb2.append(ch);
        }

        return sb1.toString().equals(sb2.toString());
    }
} 
    