import java.util.*;

class str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder c = new StringBuilder();
        
        char[] ch = new char[256];
        for(int i=0;i<b.length();i++){
            ch[b.charAt(i)]++;
        }
        for(int j=0;j<a.length();j++){
            if(ch[a.charAt(j)] != 1){
                c.append(a.charAt(j));
            }
        }
        c.toString();
        for(int k=0;k<c.length();k++){
            System.out.print(c.charAt(k));
        }
    }
}
//TC O(m+n) : SC O(1)