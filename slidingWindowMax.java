import java.util.*;
public class slidingWindowMax {
    public static void slid(List<Integer> arr, int k){
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<=arr.size()-k;i++){
            int maxi = arr.get(i);
            for(int j=i;j<i+k;j++){
                maxi = Math.max(maxi,arr.get(j));
            }
            lst.add(maxi);
        }
        System.out.print("[");
        for(int a : lst){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1, str.length()-1);
        //System.out.print(str);
        String[] s = str.split(",");
        List<Integer> lst = new ArrayList<>();
        for(String i: s){
            lst.add(Integer.parseInt(i));
        }
        int k = sc.nextInt();
        slid(lst,k);
    }
}
