import java.util.Scanner;

public class practice3 {

    public static void fib(int k){
        if(k==0){
            System.out.println(0);
            return;
        }
        else{
            int a=0;
            int b=1;
            System.out.println(a);
            System.out.println(b);
        for(int i=0;i<k-2;i++){

        int c=a+b;
        System.out.println(c);

        a=b;
        b=c;
        }
        }


    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Number fibonacci series: ");
        fib(a);
    }
}
