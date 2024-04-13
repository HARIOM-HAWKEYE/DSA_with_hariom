import java.util.Scanner;

class rearrangeArray {
    public static int[] rearrange(int[] nums) {
        int pos=0;
        int neg=1;
       int []ans =new int[nums.length];
       for(int i=0;i<nums.length;i++){
         if(nums[i]>0){
            ans[pos]=nums[i];
            pos+=2;
         }else{
            ans[neg]=nums[i];
            neg+=2;
         }

       }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++) arr[i]=sc.nextInt(); 
rearrange(arr);
for(int i=0;i<n;i++) System.out.println(arr[i]+" ");
    }

}
