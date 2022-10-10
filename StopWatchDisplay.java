import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class StopWatchDisplay {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        sort(array);

        stopWatch.end();

        System.out.println(stopWatch.getElapsedTime());

    }

    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

class StopWatch {
    LocalTime startTime, endTime;

    StopWatch() {
    }

    StopWatch(LocalTime startTime, LocalTime endTime) {
        startTime = LocalTime.now();
        endTime = LocalTime.now();
    }

    public LocalTime start() {
        return this.startTime = LocalTime.now();
    }

    public LocalTime end() {
        return this.endTime = LocalTime.now();
    }

    public long getElapsedTime() {
        Duration duration = Duration.between(startTime,endTime);
        return duration.toMillis();
    }
}
