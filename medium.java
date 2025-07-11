import java.util.*;

class medium{
    public static boolean check(int[] nums){
        int n = nums.length;
        int cnt1=0,sum1=0,avg1=0;
        
        for(int i=0;i<n;i++) 
        {
            cnt1++;
            sum1+=nums[i];
            avg1=sum1/cnt1;
            int cnt2=0,sum2=0,avg2=0;
            if(cnt1==n)
                return false;
            for(int j=cnt1;j<n;j++)
            {
                cnt2++;
                sum2+=nums[j];
                avg2=sum2/cnt2;
                if((avg1==avg2) && ((cnt1+cnt2) == n))
                    return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st[] = s.split(",");
        int[] nums = new int[st.length];
        for(int i=0;i<st.length;i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        boolean ans = check(nums);
        if(ans){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}