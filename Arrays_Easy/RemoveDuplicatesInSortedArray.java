package Arrays_Easy;

import java.util.Scanner;

public class RemoveDuplicatesInSortedArray {
    public static int removeDuplicates(int[] arr,int n) {
        int i=1;
        int j=2;
       int  count=1;
       if (n==2){
         if(arr[0]!=arr[1]) count++;
         
       } else{
    while(j<n){
    if(arr[i-1]!=arr[j]){
    
        arr[i]=arr[j];
        
        count++;
        i++;
    }
    j++;
    
         }
       }
        
         return count;
       }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
System.out.println(removeDuplicates(arr, n));
    }
}
