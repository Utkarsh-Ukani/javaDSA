package arrays;

public class totalNumberOfPairs {
    public static void main(String[] args) {
        int arr[] = {1,2,1,4,2};
        int target = 3;
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
