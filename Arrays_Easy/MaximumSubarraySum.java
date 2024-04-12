import java.util.Scanner;

public class MaximumSubarraySum {
    public static int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
         int sum=0;
         for(int i=0;i<nums.length;i++){
             sum+=nums[i];
             res=Math.max(res,sum);
             if(sum<0)sum=0;
         
         }
         return res; 
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(maxSubArray(arr));
    }
}
