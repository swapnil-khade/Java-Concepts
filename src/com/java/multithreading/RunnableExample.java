package com.java.multithreading;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
    	MyRunnable runnableTask = new MyRunnable();

        Thread thread1 = new Thread(runnableTask, "Thread-1");
        Thread thread2 = new Thread(runnableTask, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
