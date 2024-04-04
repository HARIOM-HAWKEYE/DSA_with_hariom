package Arrays_Easy;

import java.util.Scanner;

public class leftTheArrayByOne {
    static int[] rotating(int []arr ,int low , int high){
        while(low<=high){
        int temp =arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
   low++;
   high--;
        }
        return arr;
    }
    public static void main(String[] args) {
        // By Extra Space TimeC:- O(n) and SpaceC :- O(n)
    //     int res[] =new int[n];
    //   res[n-1]=arr[0];
    //   int j=0;
    //   for(int i=1;i<n;i++) res[j++]=arr[i];

    //  Optimal Approach TimeC:- O(n) and SpaceC :- O(1)
       Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    
    rotating(arr,1,n-1);
    rotating(arr,0,n-1);
    for(int ele : arr) System.out.print( ele);

    
    }
}
