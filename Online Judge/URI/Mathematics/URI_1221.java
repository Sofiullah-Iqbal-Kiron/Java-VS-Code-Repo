// Accepted

import java.util.Scanner;

public class URI_1221 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int x = input.nextInt();
            if (isPrime(x))
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }

        input.close();
    }

    private static boolean isPrime(int x) {
        if (x == 0 || x == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0)
                return false;

        return true;
    }
}