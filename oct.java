import java.util.*;
class oct{
    public static void ConvertToOct(int n){
        if(n==0)
            return;

        ConvertToOct(n/8);
        System.out.print(n%8);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deci = sc.nextInt();
        if(deci==0){
            System.out.print(0);
        }else{
            ConvertToOct(deci);
        }
    }
}