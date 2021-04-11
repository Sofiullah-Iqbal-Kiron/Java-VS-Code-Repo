// Accepted

import java.util.Scanner;

public class URI_1168 {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String token = input.next();
            int ans = 0;
            for (int i = 0; i < token.length(); i++)
                ans += token.charAt(i) == '0' ? 6 : numbers[(token.charAt(i) - '0') - 1];

            System.out.println(ans + " leds");
        }
    }
}