import java.util.*;

class prev1{
    public static int[] contig(int[] arr,int k,int N){
        int arrN[] = new int[N-k+1];
        for(int i=0;i<N-k+1;i++){
            int max = arr[i];
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max = arr[j];
                }
            }
            arrN[i] = max;
        }
        return arrN;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int arrN[] = contig(arr,k,N);
        for(int i : arrN){
            System.out.print(i+" ");
        }
    } 
}