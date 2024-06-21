package arrays;


public class squareArray {
    public static void main(String[] args) {
        int[] arr = {-10,-3,-2,1,4,5};
        int st = 0;
        int n = arr.length;
        int end = n-1;
        int[] ans = new int[n];
        int k = 0;
        while(st<=end){
            if(Math.abs(arr[st])>Math.abs(arr[end])){
                ans[k++] = arr[st]*arr[st];
                st++;
            }else{
                ans[k++] = arr[end]*arr[end];
                end--;
            }
        }

        st = 0;
        end = n-1;
        while(st<end){
            int temp = ans[st];
            ans[st]  = ans[end];
            ans[end] = temp;
            st++;
            end--;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
