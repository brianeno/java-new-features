package com.brianeno.features;

/*
    Demonstrates virtual threads
 */
public class VirtualThreadFeature {

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
}
