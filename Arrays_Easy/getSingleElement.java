import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class getSingleElement {
    // Navie Approach TimeC : O(n) SpaceC : O(1) Sorted
    // public static int getSingleElement(int []arr){
    //     int count=1;
    //     int res=arr[0];
    //      for(int i=1;i<arr.length;i++){
    //       if(arr[i]==res) count++;
    //       else{
    //           if(count==1) return res;
    //           count=1;
    //           res=arr[i];
 
    //       }}
    //    if(count==1)  return res ;
    //    return -1;
    //  }

     // Binary Search  TimeC : O(n) SpaceC : O(1) Sorted
    // public static int getSingleElement(int []arr){
    //     int low = 0;
    //     int high = arr.length-1;
    //  while (low <= high) {
    //     int mid = low + (high - low) / 2;

    //     if (mid % 2 == 0) {
    //         if (mid + 1 < arr.length && arr[mid] == arr[mid + 1]) {
    //             low = mid + 2;
    //         } else {
    //             high = mid - 1;
    //         }
    //     } else {
    //         if (mid - 1 >= 0 && arr[mid] == arr[mid - 1]) {
    //             low = mid + 1;
    //         } else {
    //             high = mid - 1;
    //         }
    //     }
    // }
    //     return arr[low];
    // }   
    
    // HashMap TimeC : O(n) SpaceC : O(n) WithOut Sorted
    public static int singleNumber(int[] arr) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for( int i=0;i<arr.length;i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
             
        } 
       for (Map.Entry<Integer, Integer> entry : hp.entrySet()) {
                if(entry.getValue()==1) return entry.getKey();
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++) arr[i]=sc.nextInt(); 
  System.out.println(singleNumber(arr));
        }

}