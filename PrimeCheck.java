import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeUsingSieve(int n) {
        if (n <= 1)
            return false;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p)
                    isPrime[i] = false;
            }
        }
        return isPrime[n];
    }

    public static boolean isPrimeUsingWilson(int n) {
        if (n <= 1)
            return false;
        long fact = 1;
        for (int i = 2; i < n; i++) {
            fact = (fact * i) % n;
        }
        return (fact + 1) % n == 0;
    }

    public static boolean isPrimeBigInteger(String n) {     
        BigInteger bigInt = new BigInteger(n);
        return bigInt.isProbablePrime(1);
    }


    public static void main(String[] args)  throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        System.out.print("Enter an integer: ");
        
            if (isPrimeBigInteger(n)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        
        bufferedReader.close();
    }
}