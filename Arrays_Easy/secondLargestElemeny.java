package Arrays_Easy;

import java.util.*;


public class secondLargestElemeny {
    // Without sorting and  efficient for duplicate elements
//     public static int[] getSecondOrderElements(int n, int []arr) {
//         // Write your code here.
//     int largest = Integer.MIN_VALUE;
//     int sl = largest;
//     int smallest = Integer.MAX_VALUE;
//     int ss=smallest;
//     int arr2[] =new int[2];

//      for(int i=0;i<n;i++){
//         if(largest<arr[i]) {
//              sl=largest;
//             largest = arr[i];
//         }
//        else  if(sl<arr[i] && largest != arr[i]) sl = arr[i];
//         if (smallest>arr[i]){
//            ss=smallest;
//            smallest=arr[i];
//        }
//        else if(ss>arr[i] && smallest!=ss){
//            ss=arr[i];
//        }

//      }

//      arr2[0]=sl;
//      arr2[1]=ss;
  
//  return arr2;

//     }

public static void main(String []args){
    //  it will work only for non- duplicate elements
 Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
for(int i=0;i<n;i++) arr[i]=sc.nextInt();
Arrays.sort(arr);
System.out.println("Answer" + arr[n-2]+"   " +arr[1]);


}




}
