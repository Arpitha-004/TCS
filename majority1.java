import java.util.*;
class majority1{
    public static List<Integer> majorityEle(int[] nums){
        int el1 = -1,el2=-1,cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1 = 1;
                el1 = nums[i];
            }else if(cnt2==0 && nums[i]!=el1){
                cnt2 = 1;
                el2 = nums[i];
            }else if(el1 == nums[i]){
                cnt1++;
            }else if(el2 == nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;cnt2=0;
        int min = nums.length/3 + 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == el1){
                cnt1++;
            }
            else if(nums[i] == el2){
                cnt2++;
            }
        }
        List<Integer> lst = new ArrayList<>();
        if(cnt1>=min){
            lst.add(el1);
        }
        if(cnt2>=min){
            lst.add(el2);
        }
        Collections.sort(lst);
        return lst;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        List<Integer> lst = majorityEle(arr);
        for(int i=0;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }
        
    }
}