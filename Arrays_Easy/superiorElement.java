import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class superiorElement {
    
    public static List< Integer > superiorElements(int []a) {
        List<Integer> mylist = new ArrayList<>();
        int rightmax =-1;
        for(int i =a.length-1;i>=0;i--){
            if(a[i]>rightmax){
                mylist.add(a[i]);
                rightmax=a[i];
            }
        }
    
     Collections.sort(mylist);
     return mylist;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();
        
        for (int i : superiorElements(nums)) System.out.println(i+" ");
            
        
    }
}
