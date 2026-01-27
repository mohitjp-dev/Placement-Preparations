import java.util.Scanner;

public class practice12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"car","truck"};

        System.out.println("Enter senetence");
        String sen = sc.nextLine();

        String lowersen = sen.toLowerCase();
        for(String s:str){
            String s1 = s.toLowerCase();

            int index=0;
            int count=0;
            while((index = lowersen.indexOf(s, index)) != -1){
                count++;
                index += s.length();
            }

            System.out.println(s+" count is : "+count);
        }
    }
}