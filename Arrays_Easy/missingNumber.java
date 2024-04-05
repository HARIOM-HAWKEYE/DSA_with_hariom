import java.util.Scanner;

public class missingNumber {
    // Sorting  TimeC:- O(n + nlogn) and SpaceC :- O(1) 
    // public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++) {
//             if(i!=nums[i]) return i;
//         }
//    return nums.length;

    //  Hashing TimeC:- O(n) and SpaceC :- O(n)
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //    int frq[] = new int[n+1];
    //    for(int i=0;i<n;i++) frq[nums[i]]++;
    //    for(int i=0;i<frq.length;i++) if(frq[i]==0) return i;
    //    return -1;

    // Summation Approach TimeC:- O(n) and SpaceC :- O(1)   
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=n*(n+1)/2;
        int res=0;
        for(int i=0;i<n;i++) res+=nums[i];
        return sum-res;
  } 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
   
    System.out.print(missingNumber(arr));
  }
}
