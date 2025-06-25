package com.java.multithreading;

public class ThreadLambdaExample {
    public static void main(String[] args) {
        // Creating a thread using a lambda expression
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Value: " + i);
                try {
                    Thread.sleep(500); // Pause for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Value: " + i);
                try {
                    Thread.sleep(500); // Pause for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        });

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();
    }
}
