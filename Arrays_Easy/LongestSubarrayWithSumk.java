import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSumk {
    public static int getLongestSubarray(int []nums, int k) {
		int preSum=0;
		int maxLen=0;
		HashMap<Integer,Integer>hp = new HashMap<>();
		for(int i=0;i<nums.length;i++){
       preSum+=nums[i];
	   if(preSum==k) maxLen=Math.max(maxLen,i+1);
       if(!hp.containsKey(preSum)) hp.put(preSum,i);
	   if(hp.containsKey(preSum-k)) maxLen=Math.max(maxLen,i-hp.get(preSum-k));

		}

		return maxLen;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(getLongestSubarray(arr , sc.nextInt()));
    }
    
}
