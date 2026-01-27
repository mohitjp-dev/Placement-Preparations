import java.util.Scanner;

public class practice14 {

    public static boolean isPalindrome(String str){
        boolean flag = true;
        char[] ch = str.toCharArray();
        int l = str.length();
        int h=l/2;
        for(int i=0;i<h;i++){
            if(ch[i] != ch[l-1-i]){
                flag = false;
                break;
            }
        }
        return flag;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter word: " );
        String str1 = (sc.nextLine()).toLowerCase();

        System.out.println("Word is Plaindrome: "+isPalindrome(str1));
    }
}
