package Threads;

import java.util.List;
import java.util.stream.IntStream;

public class PlatformThread{
    public static void main(String[] args) throws InterruptedException {
        var start = System.currentTimeMillis();

        var totalThread = 100000;
        List<Thread> threads = IntStream.range(0, totalThread)
                .mapToObj(
                        thCount -> Thread.ofPlatform().unstarted(() -> {
                        })
                ).toList();


        threads.forEach(Thread::start);

        for (Thread thread : threads) {
            thread.join();
        }

        var end = System.currentTimeMillis();
        System.out.println(STR."millis used to launch \{totalThread} PlatformThreads: \{end - start}ms");
    }
}
