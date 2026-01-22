import java.util.Arrays;
import java.util.Scanner;

public class practice9 {

    public static boolean search(int a,int[] arr){
        boolean flag = false;
        for(int b: arr){
            if(a==b){
                flag = true;
            }
        }
        return flag;
    }

    public static boolean binarysearch(int a,int[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if (arr[mid] == a) {
                return true; 
            } else if (arr[mid] < a) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }
        return false;
    }
    s
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter number to be serach");

        int a = sc.nextInt();

        System.out.println(search(a,arr));
        System.out.println(binarysearch(a,arr));
        
    }
}
