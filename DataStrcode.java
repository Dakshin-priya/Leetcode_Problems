import java.util.Stack;
class Solution {
    private  boolean open(char c)
    {
        return c =='('||c=='['|| c=='{';
    }
    private boolean close(char c)
    {
        return c ==')'||c==']'|| c=='}';
    }
    private boolean isMatching(char a, char b)
    {
        return (a == '(' && b==')') || ( a=='{' && b=='}') || (a=='[' && b==']');
    }
    public boolean isValid(String st) {
        Stack<Character> s=new Stack<>();
        char[]h= st.toCharArray();
        for(char a: h)
        {

            if(open(a))
                s.push(a);
            else if(close(a))
            {
                if(s.isEmpty())
                    return false;
                else
                {
                    char top= s.peek();
                    if(! isMatching(top,a)) return false;
                    else s.pop();
                }
            }

        }
        return s.isEmpty();
    }
}
