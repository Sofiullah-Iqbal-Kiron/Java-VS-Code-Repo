import java.util.Scanner;

public class URI_1369 {
    class file {
        public String name;
        public int kbSize;
    }

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int N = input.nextInt();
            if (N == 0)
                break;

            String T = input.next();
            int storage = convertToKb(T);
            while (N-- > 0) {
                String operation = input.nextLine();
                // May produce bug
                String[] operations = operation.split("\\s+");
                if (operations[0].equals("insere")) {

                } else if (operations[0].equals("remove")) {

                } else if (operations[0].equals("otimiza")) {

                }
            }
        }
    }

    private static int convertToKb(String T) {
        T = T.trim();
        int number = 0;
        String type = "";
        int i = 0;
        for (; Character.isDigit(T.charAt(i)); i++)
            number = (number * 10) + (T.charAt(i) - '0');
        for (; i < T.length(); i++)
            type += T.charAt(i);

        if (type.equals("Mb"))
            number *= 1024;
        else if (type.equals("Gb"))
            number *= 1048576;

        return number;
    }
}