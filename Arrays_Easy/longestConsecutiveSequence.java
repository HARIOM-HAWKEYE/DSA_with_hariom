import java.util.Arrays;
import java.util.Scanner;

public class longestConsecutiveSequence {
    // tc : O(2n) sc :O(1)
    // public int longestConsecutive(int[] nums) {
    //     HashSet<Integer>mySetting = new HashSet<>();
    //     int ans=0;
    //     for(int ele :nums) mySetting.add(ele);
    //          for(int ele:mySetting){
    //           if( !mySetting.contains(ele -1)){
    //            int count=1;
    //            while(mySetting.contains(ele+1)){
    //             count++;
    //             ele++;
    //            }
    //            ans=Math.max(count,ans);
    
    //           }
    
    //          }
    //          return ans;
    // }

    // tc : O(nlogn +n) sc :O(1)
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int max=0;
        int ls=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==ls) {
                count++;
                ls=nums[i];

            }
            else if(nums[i]!=ls){
              count=1;
              ls=nums[i];

            }
            max=Math.max(max,count);
        }
       return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  System.out.println(longestConsecutive(arr));
    }
}
