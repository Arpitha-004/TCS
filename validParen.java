import java.util.*;

class validParen {
    public static boolean valid(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c=='[' || c=='{'){
                st.push(c);
            }else{
                if(st.isEmpty())
                    return false;

                if(c==')' && st.peek()=='(' || c==']' && st.peek()=='[' || c=='}' && st.peek()=='{')
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ans = valid(s);
        System.out.println(ans);
    }
}
