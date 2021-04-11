// Accepted after long time and much attempts
// First attempt: 4 December, 2019
// Accepted: 27 March, 2021

package Beginner;

import java.util.Scanner;

public class URI_1047 {
    public static void main(String[] args) {
        int ih, im, fh, fm, h = 0, m = 0;
        Scanner input = new Scanner(System.in);

        // Taking input from console
        ih = input.nextInt();
        im = input.nextInt();
        fh = input.nextInt();
        fm = input.nextInt();

        m = fm - im;
        if (ih < fh)
            h = fh - ih;
        else if (ih == fh && im == fm)
            h = 24;
        else if (m < 0 && ih == fh)
            h = 24;
        else if (ih > fh)
            h = (24 - ih) + fh;

        if (m < 0) {
            h--;
            m = 60 + m;
        }

        input.close();

        // Console output
        System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
    }
}