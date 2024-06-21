package arrays;

public class lastOcurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,3,2,2};
        int target = 2;
        int lastOcurrence = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                lastOcurrence = i;
            }
        }
        System.out.println(lastOcurrence);
    }
}
