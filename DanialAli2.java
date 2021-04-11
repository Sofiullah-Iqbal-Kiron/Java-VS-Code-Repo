// Code for Danial Ali
// Author: Sofiullah Iqbal Kiron
// Date: 20 March, 2021
// Time: 10:46 PM

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DanialAli2 {
    public static final Scanner input = new Scanner(System.in);

    public static final char COLON;
    public static final char WHITE_SPACE;

    static {
        COLON = '\u003A';
        WHITE_SPACE = '\u0020';
    }

    public static void main(String[] args) {
        System.out.print("Write down your test string here: ");
        String testString = input.nextLine();
        int counter = 0;
        Pattern p = Pattern.compile("o");
        Matcher m = p.matcher(testString);
        while (m.find())
            counter++;

        System.out.println("Number of occurrence of 'o'" + COLON + WHITE_SPACE + counter);
    }
}