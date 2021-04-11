// Accepted. Bugs in input a String.

import java.util.Scanner;

public class URI_1024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int loop = 0; loop < t; loop++) {
            String str = input.nextLine();
            while (str.isEmpty())
                str = input.nextLine();
            StringBuilder sb = new StringBuilder(str.trim());
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isLetter(sb.charAt(i)))
                    sb.setCharAt(i, shift3right(sb.charAt(i)));
            }
            sb = sb.reverse();
            for (int i = sb.length() / 2; i < sb.length(); i++)
                sb.setCharAt(i, shift1left(sb.charAt(i)));

            System.out.println(sb);
        }

        input.close();
    }

    private static String readLine(Scanner input) {
        String line = input.nextLine();
        while (line.isEmpty())
            line = input.nextLine();

        return line;
    }

    private static char shift3right(char c) {
        return c += 3;
    }

    private static char shift1left(char c) {
        return c -= 1;
    }
}