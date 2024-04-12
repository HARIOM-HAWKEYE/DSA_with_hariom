import java.util.Scanner;

public class SortColor {
   static int[] swap(int[] nums,int i, int j){
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
       }
   static int[] solution(int [] nums){
    int low=0;
    int mid=0;
    int high=nums.length-1;
    while(mid<=high){
     if(nums[mid]==0){
     swap(nums,mid,low);
        low++;
        mid++;
     }
     else if(nums[mid]==2){
 swap(nums,mid,high);
        
      high --;
       
     }else mid++;

    }
    return nums;
   }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
   for (int i : solution(arr)) System.out.print(i+" ");
    
   
  }
    
   }

