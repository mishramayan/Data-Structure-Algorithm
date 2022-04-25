import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Are brackets balanced? "+isBalanced("(()(){}[(dhkda k)]{()[]})()"));
    }

    public static Boolean isBalanced(String s){
        
        Stack<Character> st = new Stack<Character>();

        for(int idx=0; idx < s.length(); idx++){
            char c = s.charAt(idx);

            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else if(c == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(c == '}'){
                if(!st.isEmpty() && st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(!st.isEmpty() && st.peek() == '['){
                if(!st.isEmpty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }

            else{
                continue;
            }

        }


        return true;
    }

}
