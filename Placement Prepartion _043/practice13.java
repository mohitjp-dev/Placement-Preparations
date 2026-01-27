import java.util.Scanner;

public class practice13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter senetece: " );
        String str = (sc.nextLine()).toLowerCase();

        System.out.println("Enter word to find: " );
        String str1 = (sc.nextLine()).toLowerCase();

        if(str==null || str.isEmpty()){
            System.out.println("enter senetnce");
        }
            int index=0;
            int count=0;
            while((index = str.indexOf(str1, index)) != -1){
                count++;
                index += str1.length();
            }

            System.out.println(str1+" count is : "+count);
        
    }
}
