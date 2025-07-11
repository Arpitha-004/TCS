import java.util.*;
public class countVC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().toLowerCase();
        int v=0,c=0;
        for(char ch : in.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    v++;
                }else{
                    c++;
                }
            }
        }
        System.out.print(v+" "+c);
        sc.close();
    }
}
