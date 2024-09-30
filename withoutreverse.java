import java.util.*;

public class withoutreverse {
    public static void rightrot(int[] nums,int k){
        int n = nums.length;
        int[] temp = new int[k];

        for(int i=n-k;i<n;i++){
            temp[i-(n-k)] = nums[i];
        }
        for(int i=n-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }

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
