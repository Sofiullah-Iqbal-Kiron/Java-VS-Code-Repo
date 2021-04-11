import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class URI_1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[3];
        for (int i = 0; i < 3; i++)
            arr[i] = input.nextDouble();
        Arrays.sort(arr);
        double a = arr[2], b = arr[1], c = arr[0];

        // output
        if (a >= b + c)
            System.out.println(" NAO FORMA TRIANGULO");
        else if (a * a == b * b + c * c)
            System.out.println("TRIANGULO RETANGULO");
        else if (a * a > b * b + c * c)
            System.out.println("TRIANGULO OBTUSANGULO");
        else (a * a < b * b + c * c)
            System.out.println("TRIANGULO ACUTANGULO");
        if (a == b && a == c && b == c)
            System.out.println("TRIANGULO EQUILATERO");
        if (a == b || b == c)
            System.out.println("TRIANGULO ISOSCELES");
    }
}