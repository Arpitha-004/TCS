import java.util.*;
public class reverse {
    public static void strrev(char[] s){
        int st = 0;
        int en = s.length-1;
        while(st<=en){
            char t = s[st];
            s[st] = s[en];
            s[en] = t;
            st++;
            en--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        strrev(c);
        for(char i : c){
            System.out.print(i);
        }
    }
}
