import java.util.*;

class stocks {
    public static int best(int[] prices){
        int min = prices[0] , profit = 0,cost;
        for(int i=1;i<prices.length;i++){
            cost = prices[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int ans = best(prices);
        System.out.println(ans);
    }
}
