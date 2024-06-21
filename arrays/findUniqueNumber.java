package arrays;

public class findUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,3};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
