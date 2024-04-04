package Arrays_Easy;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int num = sc.nextInt();
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    for(int j=0;j<n;j++){
        if(arr[j]==num){ System.out.println(j);
        return;}
    }
    System.out.println(-1);
}}
