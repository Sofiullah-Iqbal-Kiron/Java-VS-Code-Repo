// Accepted at second attempt

import java.util.Scanner;

public class URI_1052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        System.out.println(months[no - 1]);
    }
}