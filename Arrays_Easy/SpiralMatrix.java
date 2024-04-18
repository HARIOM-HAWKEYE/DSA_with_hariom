import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] arr) {
        int top=0;
        int left=0;
        int right=arr[0].length-1;
        int bottom=arr.length-1;
        List<Integer> mylist=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++) mylist.add(arr[top][i]);
            top++;
             for(int i=top;i<=bottom;i++) mylist.add(arr[i][right]);
             right--;
            if(top<=bottom) for(int i=right;i>=left;i--) mylist.add(arr[bottom][i]); 
             bottom--;
           if(left<=right)  for(int i=bottom;i>=top;i--) mylist.add(arr[i][left]); 
             left++;
             
        }
        return mylist;
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        List<Integer> ans = spiralOrder(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
    }

