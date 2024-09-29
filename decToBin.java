import java.util.*;
class decToBin {
    public static void decBin(int N){
        System.out.println("deci to bin: "+Integer.toString(N,2));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        decBin(N);
    }
}
