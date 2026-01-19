import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        // if(a%3==0){
        //     System.out.print("fun");
        // }
        // if(a%7==0){
        //     System.out.print(" buzz");
        // }

        if(a%3==0 && a%7==0){
            System.out.println("fun buzz");
        }
        else if(a%3==0){
            System.out.println("fun ");
        }
        else if(a%7==0){
            System.out.println("buzz");
        }
        
    }
}