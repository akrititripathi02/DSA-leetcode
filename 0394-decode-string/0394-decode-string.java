
import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> s1 = new Stack<>();

        String curr = "";
        int nums = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                nums = nums * 10 + (ch - '0');
            }
            else if (ch == '[') {
                num.push(nums);
                s1.push(curr);

                nums = 0;
                curr = "";
            }
            else if (ch == ']') {
                int repeat = num.pop();
                String prev = s1.pop();

                StringBuilder st2 = new StringBuilder(prev);

                for (int j = 0; j < repeat; j++) {
                    st2.append(curr);
                }

                curr = st2.toString();
            }
            else {
                curr += ch;
            }
        }

        return curr;
    }
}

