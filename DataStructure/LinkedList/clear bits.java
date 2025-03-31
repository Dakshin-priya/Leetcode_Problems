class Solution {
    public String clearDigits(String si) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < si.length(); i++) {
            char ch = si.charAt(i);
            
            if (isDigit(ch)) { 
                if (!s.isEmpty())  
                    s.pop();
            } else {
                s.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        
        return sb.reverse().toString();  
    }
     private boolean isDigit(char c) {
        return Character.isDigit(c);  
    }
}
   
