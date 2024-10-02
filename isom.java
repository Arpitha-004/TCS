import java.util.*;

public class isom {
    public static boolean iso(String s, String t){
        int s_a[] = new int[128];
        int t_a[] = new int[128];
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(s_a[cs]==0)
                s_a[cs] = ct;
            if(t_a[ct]==0)
                t_a[ct] = cs;

            if(s_a[cs]!=ct || t_a[ct]!=cs)
                return false;
            
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("s = ");
        String s = sc.next();
        System.out.print("t = ");
        String t = sc.next();
        s = s.replace("\"","").trim();
        t = t.replace("\"","").trim();
        boolean val = iso(s,t);
        if(val){
            System.out.print("Is Isomorphic");
        }else{
            System.out.print("Not an Isomorphic");
        }
    }
}
