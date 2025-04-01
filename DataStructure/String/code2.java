import java.util.*;

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1; // 1 for positive, -1 for negative
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If it's a digit, form the number
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }

            // If we reach an operator or parentheses, process the previous number
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                result += sign * number;
                number = 0; // Reset number
                
                if (c == '+') {
                    sign = 1;
                } else if (c == '-') {
                    sign = -1;
                } else if (c == '(') {
                    // Push current result and sign to stack, reset result
                    stack.push(result);
                    stack.push(sign);
                    result = 0;
                    sign = 1;
                } else if (c == ')') {
                    // Complete expression inside parentheses
                    result = stack.pop() * result + stack.pop();
                }
            }
        }
        return result;
    }
}
