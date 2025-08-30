
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class bigInteger {

    public static BigInteger add(BigInteger a, BigInteger b) {
        return a.add(b);
    }

     public static BigInteger multiply(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }

    public static void main(String[] args) throws Exception {
     
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger number = new BigInteger(reader.readLine());
        BigInteger number2 = new BigInteger(reader.readLine());
        
        System.out.println("Sum: " + add(number, number2));
        System.out.println("Multiply: " + add(number, number2));
        reader.close();
    }
    
}
