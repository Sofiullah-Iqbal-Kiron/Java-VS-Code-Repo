import java.util.Scanner;

public class DanialAli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length, line;
        System.out.print("Enter each pattern line length: ");
        length = input.nextInt();
        System.out.print("Enter number of line for a full pattern: ");
        line = input.nextInt();

        String pattern1 = "";
        for (int i = 0; i < length; i++)
            pattern1 += "*";
        String pattern2 = " " + pattern1;

        for (int i = 0; i < line; i += 2) {
            System.out.println(pattern1);
            System.out.println(pattern2);
        }

        input.close();
    }
}
