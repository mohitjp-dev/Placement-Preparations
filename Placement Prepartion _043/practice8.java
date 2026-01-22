import java.util.Arrays;

public class practice8 {
    public static void main(String[] args) {
        // set1
        
        int[] arr = {19, -13, 15, -12, -18, -16, 1, 3};
        int s=0;
        int e=arr.length-1;

        while(s<e){
            if(arr[s]<0){
                s++;
            }
            if(arr[e]>0){
                e--;
            }
            else{
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
