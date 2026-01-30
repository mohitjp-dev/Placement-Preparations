public class practice17{

    public static void removeDuplicates(int[] a,int n){
        int index=0;

        int[] duplicate = new int[n];
        int dupIndex=0;

        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<index;j++){
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                a[index]=a[i];
                index++;
            }
            else{
                duplicate[dupIndex++] = a[i];
            }
        }

        for(int i=0;i<dupIndex;i++){
            a[index++] = duplicate[i];
        }
    }
    public static void main(String[] args) {
        int[] a = {58,26,91,26,70,70,91,58,58,58,66};
        int n = a.length;

        removeDuplicates(a, n);

        System.out.print("Revised array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}