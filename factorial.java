import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int fact = 1;
        while(in > 1){
            fact = fact * in;
            in--;
        }
        System.out.print(fact);
    }
}
