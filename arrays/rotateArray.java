package arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        int n = arr.length;
        // expected output 
        // 5 6 1 2 3 4
        k = k%n;
        int[] ans = new int[n];
        int z = 0;
        // first print n-k to n-1
        for (int i = n-k; i < n; i++) {
            ans[z] = arr[i];
            z++;
        }
        // secondly print 0 to n-k-1
        for (int i = 0; i < n-k; i++) {
            ans[z] = arr[i];
            z++;
        }
        // print ans array
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
}
