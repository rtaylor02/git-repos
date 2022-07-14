package section.eleven;

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
}
