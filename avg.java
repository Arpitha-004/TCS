import java.util.*;
public class avg {
    public static double unionMid(int[] arr1,int[] arr2,int n,int m){
        int i=0,j=0;
        List<Integer> uni = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(uni.size()==0 || uni.get(uni.size()-1)!=arr1[i])
                    uni.add(arr1[i]);

                i++;
            }else{
                if(uni.size()==0 || uni.get(uni.size()-1)!=arr2[j])
                    uni.add(arr2[j]);

                j++;
            }
        }
        while(i<n){
            if(uni.get(uni.size()-1)!=arr1[i])
                uni.add(arr1[i]);

            i++;
        }
        while(j<m){
            if(uni.get(uni.size()-1)!=arr2[j])
                uni.add(arr2[j]);

            j++;
        }
        double ans;
        int len = uni.size();
        if(len%2 == 0){
            double val1 = uni.get(len/2-1);
            double val2 = uni.get(len/2);
            ans = (val1+val2)/2;
        }else{
            ans = uni.get(len/2);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        for(int i=0;i<n;i++)  
        {
            a1[i] = sc.nextInt();
        }
        for(int j=0;j<m;j++){
            a2[j] = sc.nextInt();
        }
        double res = unionMid(a1,a2,n,m);
        System.out.print(res);
    }
}