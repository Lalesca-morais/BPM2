package EX3;
public class Fibonacci {
    public static long fibonacci(int n) {
        long fib1 = 0;
        long fib2 = 1;
        long fibN = 0;

        if (n <= 1) {
            return n;
        } else {
            for (int i = 2; i <= n; i++) {
                fibN = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibN;
            }
            return fibN;
        }
    }
}
