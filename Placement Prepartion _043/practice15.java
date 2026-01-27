import java.util.Scanner;

public class practice15 {

    public static int count(String str1){
        if(str1 == null || str1.isEmpty()){
            return 0;
        }

        int count=0;
        boolean flag=false;
        int eof = str1.length()-1;

        char[] ch = str1.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i]) && i!= eof){
                flag = true;
            }
            else if(!Character.isLetter(ch[i]) && flag){
                count++;
                flag = false;
            }
            else if(Character.isLetter(ch[i]) && i == eof){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter sentence: " );
        String str1 = sc.nextLine();

        System.out.println("Count of words : "+count(str1));
    }
}
