package com.java.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PubSubExample {
	
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Publisher task
        Runnable publisher = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    String message = "Message " + i;
                    System.out.println("Publishing: " + message);
                    queue.put(message); // Add message to the queue
                    Thread.sleep(500); // Simulate delay
                }
                queue.put("END"); // Signal end of publishing
            } catch (InterruptedException e) {
                System.out.println("Publisher interrupted: " + e.getMessage());
            }
        };

        // Subscriber task
        Runnable subscriber = () -> {
            try {
                String message;
                while (!(message = queue.take()).equals("END")) { // Consume messages until "END"
                    System.out.println("Consuming: " + message);
                    Thread.sleep(500); // Simulate processing delay
                }
                System.out.println("Subscriber finished.");
            } catch (InterruptedException e) {
                System.out.println("Subscriber interrupted: " + e.getMessage());
            }
        };

        // Execute tasks
        executor.submit(publisher);
        executor.execute(subscriber);

        // Shutdown executor
        executor.shutdown();
    }
}
