package com.brianeno.features;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Demonstrates virtual threads
 */
public class VirtualThreadFeature {

    /**
     * Creating a thread.
     */
    public void runFeature() {
        try {
            Thread.Builder builder = Thread.ofVirtual().name("TheThread");
            Runnable task = () -> {
                System.out.println("Running a thread");
            };
            Thread t = builder.start(task);
            System.out.println("Thread name is: " + t.getName());
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
    Demonstrates creating large number of virtual threads.
     */
    public void runFeatureExecutor() {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int j = 0; j < 100000; j++) {
                executor.submit(
                        () -> {
                            for (int i = 0; i < 10; i++) {
                                System.out.println("Hello, I am " + Thread.currentThread());
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    return;
                                }
                            }
                        });
            }
        }
    }


}
