public class practice6 {
    public static void main(String[] args) {
        //Q1 
        for(int i=3;i>=1;i--){
            for(int s=i-1;s>=1;s--){
                System.out.print(" ");
            }
            for(int j=3;j>=i;j--){
                System.out.print(j);
            }
            for(int k=i+1;k<=3;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=3;j>=i+1;j--){
                System.out.print(j);
            }
            for(int k=i+2;k<=3;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Q2 question
        // for(int i=3;i>=1;i--){
        //     for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
