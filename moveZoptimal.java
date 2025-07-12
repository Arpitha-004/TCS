import java.util.Scanner;

public class moveZoptimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int j=-1;
        for(int i=0;i<N;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            for(int i=0;i<N;i++)
                System.out.print(arr[i]+" ");
            return;
        }
        for(int i=j+1;i<N;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");
    }
}
