package mylibrary;

public class Series {
    public static long fibonacci(int n) {
        if(n < 0) {
            return -1;
        } else if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            long nMinus1 = 1, nMinus2 = 0, fib = 0;
            for(int i = 1; i < n; i++) {
                fib = nMinus1 + nMinus2;
                nMinus2 = nMinus1;
                nMinus1 = fib;

            }
            return fib;
        }
    }

    public static int sum(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    public static long factorial(int n) {
        if(n < 0) {
            System.out.println("Error: n < 0");
            return -1;
        } else if((n == 0) || (n == 1)) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
        System.out.println(sum(7));
    }
}
