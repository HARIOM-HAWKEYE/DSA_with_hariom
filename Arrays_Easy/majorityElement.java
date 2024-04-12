import java.util.Scanner;

public class majorityElement {
    public static void majorityElement(int[] arr) {
        int ele = arr[0];
        int count=1;
            for(int i=1;i<arr.length;i++){
             if(count==0){
                ele=arr[i];
                count=1;
                 
             }else if(arr[i]==ele){
                 count++;
                 
             }else{
                 count--;
             } 
            }
            int freq =0;
            for(int t : arr ){
                if(ele==t) freq++;
                
            }
            if(freq>=arr.length/2) System.out.print(ele);
            else System.out.print("NO MAJORITY ELEMENT");
            
        }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    majorityElement(arr);
}
}
