public class practice4{
    public static int fact(int k){
        int a=1;
        if(k==0 || k==1){
            return 1;
        }
        else{
            a=k*fact(k-1);
        }
        return a;
    }
    public static void main(String[] args) {
        
        System.out.println(fact(5));

    }
}