// Producing garbage in vs-code

import java.math.BigInteger;
import java.util.Scanner;

public class URI_1024 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int D = input.nextInt();
            BigInteger N = input.nextBigInteger();
            if (D == 0 && N.equals("0"))
                break;

            System.out.println(D + " " + N);
            // // Remove all D from N
            // String newN = "";
            // for (int i = 0; i < N.length(); i++)
            // if (N.charAt(i) != D)
            // newN += N.charAt(i);

            // System.out.println(newN);
            // // System.out.println(getNumber(newN));
        }
    }

    private static BigInteger getNumber(String s) {
        BigInteger number = BigInteger.ZERO;
        for (int i = 0; i < s.length(); i++)
            number = number.multiply(BigInteger.TEN).add(new BigInteger("" + s.charAt(i)));

        return number;
    }
}