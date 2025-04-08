import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        // Create a Stack to hold characters and a StringBuilder for the result
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        // Loop through each character of the string
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                // If '*' is encountered, pop the last character added to the stack (i.e., remove it)
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Otherwise, add the character to the stack
                stack.push(ch);
            }
        }
        // Build the result string from the characters left in the stack
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        // Since we added characters to StringBuilder in reverse order, reverse the string
        return sb.reverse().toString();
    }
}

