import java.util.*;

class BalancedBrackets{

	public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] a = s.toCharArray();
        for(char b: a){
            if(b == '(' || b== '{' || b == '['){
                st.push(b);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                
                char topElement = st.pop();
                
                if(b==')' && topElement !='(' || b == '}' && topElement != '{'  || b == ']' && topElement != '['){
                    return false;
                }
            }
        }
        
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "()(())";

        if (isBalanced(str))
            System.out.println("True");
        else
            System.out.println("False");
    }

}