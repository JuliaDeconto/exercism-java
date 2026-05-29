import java.util.Arrays;

public class BirdWatcher2 {
    private final int[] birdsPerDay;

    public BirdWatcher2(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {

        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};

        return lastWeek;
    }

    public int getToday() {

        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {

        birdsPerDay[birdsPerDay.length -1]++;
    }

    public boolean hasDayWithoutBirds() {

        return Arrays.stream(birdsPerDay).anyMatch(birds -> birds == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {

        final int days = Math.min(numberOfDays, birdsPerDay.length);

        return Arrays.stream(birdsPerDay).limit(days).sum();
    }

    public int getBusyDays() {

        return ((int) Arrays.stream(birdsPerDay).filter(busyDays -> busyDays >= 5).count());
    }
}
