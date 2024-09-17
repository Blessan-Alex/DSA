import java.util.ArrayList;  
import java.util.List;  

public class Divisors {  
    public static void main(String[] args) {  
        int n = 4;  
        List<Integer> sum1 = new ArrayList<>();  
        for (int i = 1; i * i <= n; i++) {  
            if (n % i == 0) {  
                sum1.add(i);  
                if (n / i != i) {  
                    sum1.add(n / i);  
                }  
            }  
        }  
        for (Integer e : sum1) {  
            System.out.println(e);  
        }  
    }  
}  