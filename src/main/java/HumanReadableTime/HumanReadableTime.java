package HumanReadableTime;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if (seconds == 0) {
            return "00:00:00";
        }

        int hours = seconds / 3600;
        int remainder = seconds % 3600;
        int minutes = remainder / 60;
        int secs = remainder % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }

}
