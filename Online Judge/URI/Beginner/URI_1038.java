// Accepted in first term

import java.util.*;

public class URI_1038 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int code = input.nextInt(), quantity = input.nextInt();
        switch (code) {
        case 1:
            System.out.println("Total: R$ " + String.format("%.2f", 4.00 * quantity));
            break;
        case 2:
            System.out.println("Total: R$ " + String.format("%.2f", 4.50 * quantity));
            break;
        case 3:
            System.out.println("Total: R$ " + String.format("%.2f", 5.00 * quantity));
            break;
        case 4:
            System.out.println("Total: R$ " + String.format("%.2f", 2.00 * quantity));
            break;
        case 5:
            System.out.println("Total: R$ " + String.format("%.2f", 1.50 * quantity));
            break;
        }
    }
}