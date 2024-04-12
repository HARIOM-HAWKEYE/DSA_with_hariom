import java.util.Scanner;

public class StockBuyAndSell {

    public static int maxProfit(int[] prices) {
        int res=0;
        int min=Integer.MAX_VALUE;
       

        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            res=Math.max(res,prices[i]-min);
        }
        return res;
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    System.out.println(maxProfit(arr));
}
}