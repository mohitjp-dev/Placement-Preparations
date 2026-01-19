import java.util.Scanner;

public class practice1{
    public static boolean isOdd(int k){
        if(k%2==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
    
        // boolean c=isOdd(a);
        // if(c==false){
        //     a=a+1;
        //     for(int i=a;i<b;i=i+2){
        //         System.out.println(i);
        //     }
        // }

        for(int i=a+1;i<b;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        
    }
}