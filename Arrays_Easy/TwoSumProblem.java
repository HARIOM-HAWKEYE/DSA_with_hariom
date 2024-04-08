import java.util.HashMap;
import java.util.Scanner;

class TwoSumProblem {
    // two SUm TimeC : O(nlogn + n ) SpaceC O(1)
    //  Arrays.sort(book);
    //  int i=0;
    //  int j=n-1;
    //  while(i<j){
    //      if(book[i]+book[j]==target) {return "YES";
     
    //      }
    //      else if(book[i]+book[j]>target) j--;
    //        else if(book[i]+book[j]<target) i++;

    //  }
    //  return "NO";
    // }

    //Variation two SUm TimeC : O(n2) SpaceC O(1)
//     for(int i=0;i<n-1;i++){
         
//         for(int  j=i+1;j<n;j++){
//             if(book[i]+book[j]==target) return "YES";
            

//         }

//  }
//  return "NO";
// } 

    // Hashing TimeC : O(n) SpaceC O(1)
    public static int[] twoSum(int[] arr, int target) {
        int res[]=new int[2];
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
           int left = target-arr[i];
           if(hp.size()==0 || !hp.containsKey(left)){
            hp.put(arr[i],i);
           }
           else{
           res[0]=hp.get(left);
           res[1]=i;
           }

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  
  for(int ele :twoSum(arr, sc.nextInt())) System.out.print(ele+" ");
    
}}