public class practice5 {
    
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                int next = n1 + n2;
                System.out.print(next + " ");
                n1 = n2;
                n2 = next;
            }
            System.out.println();
        }
}
}
