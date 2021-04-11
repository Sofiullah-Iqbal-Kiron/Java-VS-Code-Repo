// Accepted in first term.
// +3.7

import java.util.Scanner;

public class URI_1049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String att1 = input.next(), att2 = input.next(), att3 = input.next();

        if (att1.equals("vertebrado")) {
            if (att2.equals("ave")) {
                if (att3.equals("carnivoro"))
                    System.out.println("aguia");
                else if (att3.equals("onivoro"))
                    System.out.println("pomba");
            } else if (att2.equals("mamifero")) {
                if (att3.equals("onivoro"))
                    System.out.println("homem");
                else if (att3.equals("herbivoro"))
                    System.out.println("vaca");
            }
        } else if (att1.equals("invertebrado")) {
            if (att2.equals("inseto")) {
                if (att3.equals("hematofago"))
                    System.out.println("pulga");
                else if (att3.equals("herbivoro"))
                    System.out.println("lagarta");
            } else if (att2.equals("anelideo")) {
                if (att3.equals("hematofago"))
                    System.out.println("sanguessuga");
                else if (att3.equals("onivoro"))
                    System.out.println("minhoca");
            }
        }
    }
}
