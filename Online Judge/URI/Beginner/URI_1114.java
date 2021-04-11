// Accepted in first attempt
// Solved in c, cpp, java

import java.io.IOException;
import java.util.Scanner;

public class URI_1114 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int val;
        while (true) {
            val = input.nextInt();
            if (val == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else
                System.out.println("Senha Invalida");
        }
    }
}