public class DanialAli4 {
    public static void main(String[] args) {
        Time t1 = new Time(3, 13, 23);
        t1.showTime();
    }
}

class Time {
    private int hour, minute, seconds;

    public Time() {
    }

    public Time(int hour, int minute, int seconds) {
        if (hour > 24 || minute > 60 || seconds > 60)
            System.out.println("Invalid Time Stamps");
        else {
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
        }
    }

    public void showTime() {
        System.out.println(this.hour + " hour, " + this.minute + " minutes and " + this.seconds + " seconds");
    }
}