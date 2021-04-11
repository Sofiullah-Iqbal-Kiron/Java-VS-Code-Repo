// Accepted

import java.math.BigInteger;
import java.util.Scanner;

public class URI_1165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int x = input.nextInt();
            BigInteger num = new BigInteger(Integer.toString(x));
            if (num.isProbablePrime(10))
                System.out.println(x + " eh primo");
            else
                System.out.println(x + " nao eh primo");
        }
    }
}