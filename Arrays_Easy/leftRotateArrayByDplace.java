package Arrays_Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class leftRotateArrayByDplace {
     static ArrayList<Integer> Reverse(ArrayList<Integer>arr,int start , int end){
        while(start<=end){
            int temp = arr.get(start);
            arr.set(start , arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
        return arr;

    }

    public static void main(String[] args) {
        
    
    // Reversal Algorithm TimeC:- O(n) and SpaceC :- O(1)
      Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  ArrayList<Integer> arr = new ArrayList<>();
  for(int i=0;i<n;i++) arr.add(sc.nextInt());
  int k = sc.nextInt();
  k=k%n;
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
        Reverse(arr,0,n-1);
        for(int ele : arr) System.out.print(ele+" ");
}}
