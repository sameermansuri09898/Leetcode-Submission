import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("+")) {
                int first = st.pop(); // pop first peek for addition
                int second = st.peek(); // it became latest peek 
                st.push(first);
                st.push(first + second);
            } else if (op.equals("D")) {
                int peak = st.peek();
                st.push(peak * 2); // push into stack
            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int num : st) {
            sum += num;
        }
        return sum;
    }
}