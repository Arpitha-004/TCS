import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

        int i=0,j=in.length()-1;
        while(i<=j){
            if(in.charAt(j)!=in.charAt(i)){
                System.out.print("NO");
                break;
            }
            i++;
            j--;
        }
        if(i>=j)
            System.out.print("YES");
        sc.close();
    }
}
