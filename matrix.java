import java.util.*;
class matrix{
    public static int diff(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int sum1 = 0,sum2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==j)
                sum1+=arr[i][j];
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=i;j--){
                if(i==0 || j==0 || i==j)
                sum2+=arr[i][j];
            }
        }
        return sum1-sum2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = diff(arr);
        System.out.print(ans);
    }
}