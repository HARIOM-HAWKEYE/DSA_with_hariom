import java.util.* ;
import java.io.*; 

public class LargestElementInTheArray {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
      return max;
}
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[] = new int[n];
   for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  
   System.out.print(largestElement(arr, n));

}

}