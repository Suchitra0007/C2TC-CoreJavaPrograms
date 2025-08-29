package Assignment5;

import java.util.List;
import java.util.concurrent.*;

public class TaskScheduler {
    private final ScheduledExecutorService scheduler;
    private final List<ScheduledFuture<?>> scheduledFutures = new CopyOnWriteArrayList<>();

    // Constructor (thread pool with 3 threads)
    public TaskScheduler() {
        this.scheduler = Executors.newScheduledThreadPool(3);
    }

    // Method to schedule a task at fixed interval (in seconds)
    public void scheduleTask(Task task, int intervalSeconds) {
        ScheduledFuture<?> future = scheduler.scheduleAtFixedRate(() -> {
            try {
                task.execute();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, intervalSeconds, TimeUnit.SECONDS);

        scheduledFutures.add(future);
    }

    // Stop scheduler
    public void shutdown() {
        for (ScheduledFuture<?> f : scheduledFutures) {
            f.cancel(false);
        }
        scheduler.shutdown();
    }
}
