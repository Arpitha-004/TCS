import java.util.*;

public class anag {
    public static boolean anagram(String s,String t){
        if (s.length()!=t.length())
            return false;
        int[] c = new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for(int ch : c)
            if(ch!=0)
                return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s = ");
        String s = sc.next();
        System.out.print("t = ");
        String t = sc.next();
        s = s.replace("\"","").trim();
        t = t.replace("\"","").trim();
        boolean val = anagram(s,t);
        if(val){
            System.out.print("Is Anagram");
        }else{
            System.out.print("Not an Anagram");
        }
        
    }

}
