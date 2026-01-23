// Q.1) Print unique sorted array Accept data in sorted order having duplicate value. You need 
// to print unique array using single loop . 
// Unique sorted array using 1 loop 
// Input 1  1  2  2  2 5    output1 2 5 

import java.util.Arrays;

public class practice10 {
    public static int[] printUniqueSortedArray(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        int[] uniqueElements = Arrays.copyOf(arr, i + 1);
        return uniqueElements;
    }
    public static void main(String[] args) {
     int[] arr = {1, 1, 2, 2, 2, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        int[] uniqueArr = printUniqueSortedArray(arr);
        
        System.out.println("Unique sorted array: ");
        
        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}
