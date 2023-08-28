import java.util.HashMap;

public class Fibonacci {
    static HashMap<Integer, Long> cache = new HashMap<Integer, Long>();
    
    public static void main(String[] args){
        for(int i = 0; i < 90; i++){
            System.out.println(i + " " + fibonacci(i));
        }
    }

    public static long fibonacci(int n) {
        if (n == 0)return 0;
        if (n == 1)return 1;
        if(cache.containsKey(n) == true)return cache.get(n);
        long newval = fibonacci(n-1) + fibonacci(n-2);
        cache.put(n, newval);
        return newval;
    }
}