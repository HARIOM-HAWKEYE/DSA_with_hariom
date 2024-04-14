import java.util.Scanner;

public class nextPremutation {
    static int [] reverse( int [] nums ,int start ,int end){
        while (start<=end){
           int temp =nums[start];
             nums[start]=nums[end];
             nums[end]=temp; 
             start++;
             end--;
        }  return nums;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int nums[] = new int[n];
  for(int i=0;i<n;i++) nums[i]=sc.nextInt();
  int brkpt=-1;
  // to find break point
  for(int i=nums.length-2;i>=0;i--){
     if(nums[i]<nums[i+1]) {brkpt=i;
     break;}
  }
  if(brkpt==-1){
    reverse(nums , 0 ,nums.length-1);
    for(int i=0;i<n;i++) System.out.println( nums[i]+" ");
  return;
  }
  // swap brkpt index with next grt element
   for(int i=nums.length-1;i>=brkpt;i--){
     if(nums[i]>nums[brkpt]) {
       int temp =nums[i];
       nums[i]=nums[brkpt];
       nums[brkpt]=temp;
       break;
     }}
      // sort right from brkpt+1-->n-1;
      reverse(nums , brkpt+1,nums.length-1);
      for(int i=0;i<n;i++) System.out.println( nums[i]+" ");
    }
}
