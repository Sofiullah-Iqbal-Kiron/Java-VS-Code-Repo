public class Switch_Block_SE15 {

    public enum Day {
        SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    };

    public static void main(String[] args) {
        int numLetters = 0;
        Day day = Day.TUESDAY;

        // This type of switch statement is recommended by Oracle JavaSE docs center.
        // It's easy to forget to insert break statement when using case " L: label; ".
        // That's the why.
        switch (day) {
        case SUNDAY, MONDAY, FRIDAY -> numLetters = 6;
        case TUESDAY -> numLetters = 7;
        case SATURDAY, THURSDAY -> numLetters = 8;
        case WEDNESDAY -> numLetters = 9;
        default -> throw new IllegalStateException("Invalid day: " + day);
        }
        System.out.println(numLetters);
    }
}