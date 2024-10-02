import java.util.*;
class twoS{
/*  public static int[] sum(int[] nums,int target){
        Map<Integer,Integer> mpp = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int need = target - nums[i];
            if(mpp.containsKey(need)){
                ans[0] = mpp.get(need);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }*/
    public static int[] sum(int[] nums,int target){
        int[] temp = Arrays.copyOf(nums,nums.length);
        int[] ans = new int[2];
        Arrays.sort(temp);
        int i=0,j=nums.length-1;
        while(i<j){
            if(temp[i]+temp[j]>target){
                j--;
            }else if(temp[i]+temp[j]<target){
                i++;
            }else{
                break;
            }
        }
        int fst = temp[i],scd = temp[j];
        int ct = 0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==fst && ct==0){
                ans[0] = k;
                ct++;
            }else if(nums[k]==scd){
                ans[1] = k; 
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        in = in.replace("[","").replace("]","");
        String[] s = in.split(",");
        int nums[] = new int[s.length-1];
        int target = Integer.parseInt(s[s.length-1]);
        for(int i=0;i<s.length-1;i++){
            nums[i] = Integer.parseInt(s[i]);
        }

        int[] ans = sum(nums,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}