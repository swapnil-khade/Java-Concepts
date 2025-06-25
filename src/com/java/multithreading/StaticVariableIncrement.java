package com.java.multithreading;

public class StaticVariableIncrement {

    private static int counter = 0;

    // Static method to increment the counter
    public static synchronized void incrementCounter() {
        counter++;
      //  System.out.println(Thread.currentThread().getName() + " - Counter: " + counter);
    }

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                incrementCounter();
            }
        };

        // Create two threads
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Final Counter Value: " + counter);
    }
}
