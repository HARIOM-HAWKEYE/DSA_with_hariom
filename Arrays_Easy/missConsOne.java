import java.util.Scanner;

public class missConsOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else{
                if(count>ans) ans=count;
                count=0;
            }
        }
         if(count>ans) ans=count;
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
       
        System.out.print(findMaxConsecutiveOnes(arr));
    }
}
