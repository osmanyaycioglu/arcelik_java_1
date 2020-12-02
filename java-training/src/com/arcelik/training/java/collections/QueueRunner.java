package com.arcelik.training.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class QueueRunner {

    public static void main(final String[] args) {
        ExecutorService newFixedThreadPoolLoc = Executors.newFixedThreadPool(10);
        newFixedThreadPoolLoc.execute(new Runnable() {

            @Override
            public void run() {
                System.out.println("test");
            }
        });

        Queue<String> myQ = new ArrayBlockingQueue<>(1_000);
        myQ.add("1");
        String pollLoc = myQ.poll();

        BlockingQueue<String> myBQ = new ArrayBlockingQueue<>(1_000);
        myBQ.add("1");
        String pollLoc1 = myBQ.poll();
        try {
            String takeLoc = myBQ.take();
            String poll2Loc = myBQ.poll(10,
                                        TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Queue<Delayed> myDelyedQ = new DelayQueue<>();
        // Queue<String> myDelyedQ = new PriorityBlockingQueue<>();


        Deque<String> myDQ = new ArrayDeque<>();
    }
}
