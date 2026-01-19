import java.util.Scanner;

public class practice2 {

    public static boolean isPlaindrome(int k){
        int b =0;
        int a=k;
        while(k!=0){

            int temp = k%10;
            b = (b*10)+temp;
            k=k/10;
        }
        if(a==b){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Number is Palindrome: "+isPlaindrome(a));
    }
}
