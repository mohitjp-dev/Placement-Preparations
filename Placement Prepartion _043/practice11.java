// Q.2) To find the maximum sum of all subarrays of size K: 
// Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ 
// consecutive elements in the array. 
// Input  : arr[] = {100, 200, 300, 400}, k = 2 
// Output : 700 
public class practice11 {

    public static int findMaxSum(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            return -1; 
        }

        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            maxsum += arr[i];
        }

        int window_sum = maxsum;
        for (int i = k; i < arr.length; i++) {
            window_sum += arr[i] - arr[i - k];
            if (window_sum > maxsum) {
                maxsum = window_sum;
            }
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println("Maximum sum for k = " + k + ": " + findMaxSum(arr, k));
    }
}

