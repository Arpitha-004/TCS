import java.util.*;

public class rotate {
    public static void reverse(int[] nums,int s,int e){
        while(s<=e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
    public static void rightrot(int[] nums,int k){
        int n = nums.length;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k:");
        int k = sc.nextInt();
        rightrot(nums,k);
        System.out.print("[");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i!=nums.length-1)
            System.out.print(",");
        }
        System.out.print("]");
    }
}
