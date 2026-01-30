import java.util.HashMap;
import java.util.Map;

public class practice16{
    public static void main(String[] args) {
        // int count =0;
        String[] arr = {"A","B","C","D","E","F","G","A"};
        // for(String a : arr){
        //     if(a.equalsIgnoreCase("A")){
        //         count++;
        //     }
        // }
        
        Map<String,Integer> f = new HashMap<>();
        for(String s:arr){
            f.put(s, f.getOrDefault(s,0)+1);
        }
        
        int countA=f.getOrDefault("A", 0);
        
        System.out.println(countA);
    }
}