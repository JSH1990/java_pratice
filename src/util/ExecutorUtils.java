package util;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import static util.MyLogger.log;
public class ExecutorUtils {
    public static void printState(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) {
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queued = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();
            log("[pool=" + pool + ", active=" + active + ", queuedTasks=" +
                    queued + ", completedTasks=" + completedTask + "]");
        } else {
            log(executorService);
        }
    }
    // 추가
    public static void printState(ExecutorService executorService, String
            taskName) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) {
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queued = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();
            log(taskName + " -> [pool=" + pool + ", active=" + active + ", queuedTasks=" + queued + ", completedTasks=" + completedTask + "]");
        } else {
            log(taskName + " -> " + executorService);
        }
    }
}
