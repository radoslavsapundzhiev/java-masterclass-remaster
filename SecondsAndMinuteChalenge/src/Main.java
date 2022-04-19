public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(63, 59));
        System.out.println(getDurationString(3839));
    }
    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String hoursFormated = String.format("%02d", hours);
        String minutesFormated = String.format("%02d", remainingMinutes);
        String secondsFormated = String.format("%02d", seconds);
        return hoursFormated + "h " + minutesFormated + "m " + secondsFormated + "s";
    }
    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds);
    }
}
