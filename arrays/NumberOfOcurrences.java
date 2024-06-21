package arrays;

public class NumberOfOcurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,1,2,3,2,2,2,5,6};
        int target = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
