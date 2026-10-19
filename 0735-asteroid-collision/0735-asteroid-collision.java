
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            boolean found = true;

            while (curr < 0 && !st.isEmpty() && st.peek() > 0) {
                if (st.peek() < -curr) {
                    st.pop();
                } 
                else if (st.peek() == -curr) {
                    st.pop();
                    found = false;
                    break;
                } 
                else {
                    found = false;
                    break;
                }
            }

            if (found) {
                st.push(curr);
            }
        }

        int[] arr = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            arr[i] = st.get(i);
        }

        return arr;
    }
}
