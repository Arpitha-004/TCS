import java.util.*;
class prev2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = N;
        for(int i=2;i<=10;i++){
            sum += N*i;
        }
        System.out.println(sum);   
    }
}