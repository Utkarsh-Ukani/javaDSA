package arrays;

public class equalSumPartiotion {
    public static void main(String[] args) {
        int[] arr = {5,3,2,6,3,1};
        System.out.println(equalSumPartiotion1(arr));
        
    }

    private static boolean equalSumPartiotion1(int[] arr) {
        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            int suffixSum = totalSum-prefixSum;
            if(suffixSum==prefixSum){
                return true;
            }
        }
        return false;

    }

    private static int findArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
