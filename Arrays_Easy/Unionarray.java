import java.util.*;
public class Unionarray {
    // HashSet TimeC:- O(m+n+klogn) and SpaceC :- O(m+n)
    // public static List< Integer > sortedArray(int []a, int []b) {
    //     Set<Integer> myMap = new HashSet<>();
    //     ArrayList<Integer> mylist= new ArrayList<>();
    //     for(int i=0;i<a.length;i++) myMap.add(a[i]);
    //     for(int i=0;i<b.length;i++) myMap.add(b[i]);
    //    for(int ele :myMap) mylist.add(ele);
    //    Collections.sort(mylist);
    //     return mylist;
   
    //    }

    //  2 pointer TimeC:- O(n) and SpaceC :- O(n)
    public static List< Integer > sortedArray(int []a, int []b) {
   
     ArrayList<Integer> list= new ArrayList<>();
     int i=0,j=0;
     while(i<a.length && j<b.length){
         if(a[i]<=b[j] ){ 
             if(list.size()==0 || list.get(list.size()-1)!=a[i]) list.add(a[i]);
         i++;
         }
        
         else{
             if(list.size()==0 || list.get(list.size()-1)!=b[j]) list.add(b[j]);
             j++;
         }
     }
     while(i<a.length){
   if(list.size()==0 || list.get(list.size()-1)!=a[i]) list.add(a[i]);
  i++;

     }
     while(j<b.length){
  if(list.size()==0 || list.get(list.size()-1)!=b[j]) list.add(b[j]);
  j++;

     }
   return list;


    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++) arr2[i]=sc.nextInt();
        List<Integer> ans = sortedArray(arr, arr2);
        for(int ele : ans) System.out.print(ele+" ");
       }
}