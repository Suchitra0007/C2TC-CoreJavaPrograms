package Assignment5;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskScheduler ts = new TaskScheduler();

        // Scheduling three tasks using lambda expressions
        ts.scheduleTask(() -> System.out.println("Task 1 runs every 2s: " + LocalTime.now()), 2);
        ts.scheduleTask(() -> System.out.println("Task 2 runs every 3s: " + LocalTime.now()), 3);
        ts.scheduleTask(() -> System.out.println("Task 3 runs every 5s: " + LocalTime.now()), 5);

        // Let it run for 20 seconds
        Thread.sleep(20000);

        // Shutdown scheduler
        ts.shutdown();
        System.out.println("Scheduler stopped.");
    }
}
