import java.util.*;

class conOnes{
    public static int find(int[] nums){
        int maxi=Integer.MIN_VALUE,cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
                if(cnt>maxi){
                    maxi = cnt;
                }
            }else{
                cnt = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("[","").replace("]", "");
        String[] n = s.split(",");
        int[] nums = new int[n.length];
        for (int i=0;i<n.length;i++)
        {
            nums[i] = Integer.parseInt(n[i].trim());
        }
        int val = find(nums);
        System.out.print(val);
    }
}