package Arrays_Easy;

import java.util.Scanner;

public class moveZeroAtTheEnd {
    public static void main(String[] args) {
    //   Navie Approach TimeC:- O(n) and SpaceC :- O(n)
        // int res [] = new int[n];
        // int count=0;
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0) count++;
        //     else{
        //         res[j++]=arr[i];
        //     }
        // }
        // for(int i=0;i<count;i++) res[j++]=0;

        // 2 Pointer Approach TimeC:- O(n) and SpaceC :- O(1)
         Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[] = new int[n];
   for(int i=0;i<n;i++) arr[i]=sc.nextInt();
  
        int i=0;
        int j=0;
       while(j<n){
            if(arr[i]==0 && arr[j]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++; 
            }else if( arr[i]!=0 && arr[j]!=0){
                i++;
                j++;
    
            }else if(arr[j]==0) j++;
        }
         for(int ele : arr) System.out.print(ele+" ");
        }
    }

