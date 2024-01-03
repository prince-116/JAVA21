package Threads;

import java.util.stream.IntStream;

public class VirtualThread {
    public static void main(String[] args) throws InterruptedException {
        var start = System.currentTimeMillis();

        var totalThread = 100000;
        var threads = IntStream.range(0, totalThread)
                .mapToObj(
                        thCount -> Thread.ofVirtual().unstarted(() -> {
                        })).toList();
        
        threads.forEach(Thread::start);

        for (Thread thread : threads) {
            thread.join();
        }
        var end = System.currentTimeMillis();
        System.out.println(STR."millis used to launch \{totalThread} vthreads: \{end - start}ms");
    }
}
