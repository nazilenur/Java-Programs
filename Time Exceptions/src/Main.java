import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Time time1 = new Time();
        System.out.println("Please enter the hour : ");
        int hour = scanner.nextInt();
        try {
            time1.setHour(hour);
            System.out.println("Please enter the minute : ");
            int minute = scanner.nextInt();
            time1.setMinute(minute);
            System.out.println("Please enter the seconds : ");
            int seconds = scanner.nextInt();
            time1.setSeconds(seconds);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        time1.showTime(time1);
    }
}



