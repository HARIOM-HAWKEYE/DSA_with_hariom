import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hp =new HashMap<>();
        hp.put(0,1);
        int count=0;
        int psum=0;
        for (int i=0;i<nums.length;i++){
             psum+=nums[i];
             if(hp.containsKey(psum-k)) count+=hp.get(psum-k);
              
              hp.put(psum,hp.getOrDefault(psum,0)+1);
  
        }
        return count;
      }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(subarraySum(arr,sc.nextInt()));
    }
}
