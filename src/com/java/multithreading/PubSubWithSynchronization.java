package com.java.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class PubSubWithSynchronization {
	
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        Semaphore semaphore = new Semaphore(1); // Controls publishing and consuming
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Publisher task
        Runnable publisher = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    semaphore.acquire(); // Wait for subscriber to consume
                    String message = "Message " + i;
                    Thread.sleep(500);
                    System.out.println("Publishing: " + message);
                    queue.put(message); // Add message to the queue
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
                	Thread.sleep(5000);
                    System.out.println("Consuming: " + message);
                    
                    semaphore.release(); // Allow publisher to publish next message
                }
                System.out.println("Subscriber finished.");
            } catch (InterruptedException e) {
                System.out.println("Subscriber interrupted: " + e.getMessage());
            }
        };

        // Execute tasks
        executor.execute(publisher);
        executor.execute(subscriber);

        // Shutdown executor
        executor.shutdown();
    }
}
