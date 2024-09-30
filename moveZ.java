import java.util.*;
class moveZ {
    public static void move(int[] nums){
        List<Integer> t = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0)
                t.add(nums[i]);
        }
        int nz = t.size();
        for(int i=0;i<t.size();i++){
            nums[i] = t.get(i);
        }
        for(int i=nz;i<n;i++){
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        move(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
